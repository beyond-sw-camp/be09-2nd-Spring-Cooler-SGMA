package com.springcooler.sgma.filter;

import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Set;

/* 설명. API 게이트웨이의 요청을 처리하기 전에 JWT를 검증하는 역할 수행 필터(커스텀 필터) */
@Component
@Slf4j
public class AuthorizationHeaderFilter extends AbstractGatewayFilterFactory<AuthorizationHeaderFilter.Config> {

    Environment env;

    public AuthorizationHeaderFilter(Environment env) {
        super(Config.class);
        this.env = env;
    }

    public static class Config {
    }

    /* 설명. GatewayFilter를 반환하며, exchanger와 chain객체를 사용하여 요청과 응답 처리 및 다음 필터 실행 */
    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {           // exchange는 request와 response가 캡슐화 된 하나의 객체

            ServerHttpRequest request = exchange.getRequest();

            if(!request.getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                return onError(exchange, "No authorization header", HttpStatus.UNAUTHORIZED);
            }

            HttpHeaders headers = request.getHeaders();     // apache 패키지 말고 다른 spring 것으로 import
            Set<String> keys = headers.keySet();
            log.info(">>>");
            keys.stream().forEach(v -> {
                log.info(v + "=" + request.getHeaders().get(v));
            });
            log.info("<<<");

            /* 설명. "Authorization"이라는 키 값으로 request header에 담긴 것 추출(사용자가 요청할 때 온 JWT 토큰) */
            String BearerToken = request.getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
//            String jwt = BearerToken.substring(7);
            String jwt = BearerToken.replace("Bearer ", "");

            /* 설명. JWT 검증 후 실패한다면 */
            if(!isJwtValid(jwt)) {
                return onError(exchange, "JWT token is not valid", HttpStatus.UNAUTHORIZED);
            }

            return chain.filter(exchange);
        };
    }

    /* 설명. Mono는 0 또는 1개의 객체를 비동기적으로 처리할 때 사용(비동기 작업이 성공 또는 실패했는지를 나타내기 위한 반환 타입) */
    private Mono<Void> onError(ServerWebExchange exchange, String errorMessage, HttpStatus httpStatus) {
        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(httpStatus);
        log.info("에러 메시지: " + errorMessage);

        return response.setComplete();
    }

    private boolean isJwtValid(String jwt) {
        boolean returnValue = true;

        String subject = null;
        try {
            subject = Jwts.parser()
                    .setSigningKey(env.getProperty("token.secret"))
                    .parseClaimsJws(jwt)
                    .getBody()
                    .getSubject();
        } catch (Exception e) {
            e.printStackTrace();
            returnValue = false;
        }

        if(subject == null || subject.isEmpty()) {
            returnValue = false;
        }

        return returnValue;
    }


}