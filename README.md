# SGMA

![image](https://github.com/user-attachments/assets/551a2c5d-d3f6-4fd8-846f-fa80557d841e)

# 목차
1. [팀 소개](#팀-소개)
2. [기술 스택](#기술-스택)
   - [Backend](#1-backend)
   - [Database](#2-database)
   - [Tool](#3-tool)
3. [프로젝트 개요](#프로젝트-개요)
   - [배경](#1-배경)
   - [서비스 목표](#2-서비스-목표)
   - [차별점](#3-차별점)
   - [핵심 기능](#4-핵심-기능)
   - [기대 효과](#5-기대-효과)
4. [설계 문서](#설계-문서)
   - [System Architecture](#system-architecture)
   - [요구사항 정의서](#요구사항-정의서)
   - [WBS](#wbs)
   - [주요 기능 FLOW CHART](#주요-기능-flow-chart)
   - [DDD](#ddd)
     - [Event Storming](#1-event-storming)
     - [Bounded Context](#2-bounded-context)
   - [DB 모델링](#db-모델링)
     - [개념 모델링](#1-개념-모델링)
     - [논리 모델링](#2-논리-모델링)
     - [물리 모델링](#3-물리-모델링)
5. [산출물](#산출물)

- [동료 평가](#동료평가)

---

## Team _Spring-Cooler_<a id="팀-소개"></a>
> 스프링을 더 멋지게

[<img src="https://img.shields.io/badge/Notion-Link-333333?logo=Notion">](https://amber-vise-de0.notion.site/3-_-1da69b5acbe84d79be8e57bbf7cd7cee)

| <img src="https://github.com/user-attachments/assets/00ef7243-5ac8-4f3a-8b43-2271ee79665c" height=100/>  | <img src="https://github.com/user-attachments/assets/018f5c1c-7b3e-4767-a8b7-415c871e1e63" height=100/> | <img src="https://github.com/3-Minutes-Query/choleeTest/assets/102345450/1046b24a-5d40-4dc1-a747-cb65f20dc764" height=100/> | <img src="https://github.com/user-attachments/assets/3459263f-3864-4d69-a427-1578eaa984ce" height=100 width=100/> | <img src="https://github.com/user-attachments/assets/8bdf1acd-d774-426f-8257-d28bd1e37056" height=100/> |
| -------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| 조창욱                                                                                                      | 김서현                                                                                                     | 김민석                                                                                                                         | 전기범                                                                                                               | 김소리                                                                                                     |
| [<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/Chochanguk) | [<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/1etterh)   | [<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/minseokKim6823)                | [<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/woodart8)            | [<img src="https://img.shields.io/badge/Github-Link-181717?logo=Github">](https://github.com/sorrri)    |
| ESTJ                                                                                                     | ISTP                                                                                                    | ESTP                                                                                                                        | INFJ                                                                                                              | ESTJ                                                                                                    |

---
# 기술 스택 <a id="기술-스택"></a>

## 1. Backend <a id="1-backend"></a>

| Java 17                                                                           | Spring Boot                                                                                              | Spring Data JPA                                                                                   | MyBatis                                                                                                 | Hibernate                                                                       | Spring Security                                                                                                   | JWT                                                                                      | Gradle                                                                 | JUnit5                                                                                             | Spring Batch                                                           |
| --------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| ![Java](https://img.shields.io/badge/Java-17-007396.svg?&logo=java&color=red)| ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3-6DB33F.svg?&logo=spring-boot&color=lightgreen) | ![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F.svg?&logo=spring-data-JPA) | ![MyBatis](https://img.shields.io/badge/MyBatis-FE6602.svg?&logo=mybatis5&logoColor=white&color=FE6602) | ![Hibernate](https://img.shields.io/badge/Hibernate-59666C.svg?&logo=hibernate) | ![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F.svg?&logo=spring-security&logoColor=white) | ![JWT](https://img.shields.io/badge/JWT-F60055.svg?&logo=json-web-token&logoColor=white) | ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?&logo=gradle) | ![JUnit5](https://img.shields.io/badge/JUnit5-25A162.svg?&logo=junit5&logoColor=white&color=green) |![Spring Batch](https://img.shields.io/badge/Spring_Batch-6CB33E?style=flat&logo=springbatch&logoColor=white)  |




## 2. Database <a id="2-database"></a>

| MariaDB                                                                   | Redis                                                                               | AWS S3 Bucket                                                                                              |
| ------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| ![MariaDB](https://img.shields.io/badge/MariaDB-003545.svg?&logo=mariadb) | ![Redis](https://img.shields.io/badge/Redis-DC382D.svg?&logo=redis&logoColor=white) | ![AWS](https://img.shields.io/badge/AWS_S3-569A31?style=flat&logo=amazons3&logoColor=white)|

## 3. Tool <a id="3-tool"></a>

| <img src="https://img.shields.io/badge/GitHub-181717?style=flat&logo=GitHub&logoColor=white"> &nbsp; | <img src="https://img.shields.io/badge/DA%23-0B6121.svg?style=flat&logo=draw.io&logoColor=white"> &nbsp; | ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=flat&logo=intellij-idea&logoColor=white) | ![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=flat&logo=visual-studio-code&logoColor=white) |
| ----------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |

# 프로젝트 개요 <a id="프로젝트-개요"></a>
---
## 1. 배경 <a id="1-배경"></a>
1. 팀 스터디의 효율성을 향상시킬 수 있는 도구가 필요함
2. 일정 관리, 학습 진도 파악 등 스터디의 정보를 한 곳에서 모아볼 수 있는 서비스가 없음
## 2. 서비스 목표 <a id="2-서비스-목표"></a>
> 팀 스터디의 모든 과정을 쉽게 관리 및 각 멤버가 자신의 학습 목표를 달성할 수 있도록 도움

## 3. 차별점 <a id="3-차별점"></a>
|         | 팀원모집 | 일정관리 | 문제 출제 | 일정관리 |
| ------- | ---- | ---- | ----- | ---- |
| Studyin | ㅇ    | ㅇ    |       | ㅇ    |
| 맞추다     |      |      | ㅇ     |      |
| 공작소     | ㅇ    | ㅇ    |       | ㅇ    |
| SGMA    | ㅇ    | ㅇ    | ㅇ     | ㅇ    |

## 4. 핵심 기능 <a id="4-핵심-기능"></a>
1. 스터디 그룹 생성 및 모집
2. 학습 내용 확인 및 공유
3. 학습 성취도 시각화
## 5. 기대 효과 <a id="5-기대-효과"></a>
> 단순한 학습의 장을 넘어, 체계적이고 효과적인 학습 플랫폼으로 발전할 수 있을 것으로 기대


# 설계 문서 <a id="설계-문서"></a>
---

### System Architecture <a id="system-architecture"></a>
![image](https://github.com/user-attachments/assets/88199112-1940-4cba-96ea-cd7031117c78)


### 요구사항 정의서 <a id="요구사항-정의서"></a>
[요구사항 정의서 바로가기](https://docs.google.com/spreadsheets/d/1XVX6lAse2VZzDybUvryL8GyeM3-PO_EZMFG10hMVJSk/edit?gid=0#gid=0)

![image](https://github.com/user-attachments/assets/ad2a9474-3dd2-4e5c-bdf4-fa0e48cb4d55)

## WBS <a id="wbs"></a>
[WBS 바로가기](https://docs.google.com/spreadsheets/d/1XVX6lAse2VZzDybUvryL8GyeM3-PO_EZMFG10hMVJSk/edit?gid=1079017783#gid=1079017783)

![image](https://github.com/user-attachments/assets/a5f97514-d78e-476b-a472-b76dd4a22eee)


## 주요 기능 FLOW CHART <a id="주요-기능-flow-chart"></a>
![문제관련 drawio (1)](https://github.com/user-attachments/assets/59625632-7ce8-4300-b085-945d176620f8)

## DDD <a id="ddd"></a>
### 1. Event Storming <a id="1-event-storming"></a>
![image](https://github.com/user-attachments/assets/b11ddb78-7874-4dfd-a8c0-ebfdbd41e238)
### 2. Bounded Context <a id="2-bounded-context"></a>
![image](https://github.com/user-attachments/assets/3efdd6c0-09bb-4ac0-ae83-d0e399f39ccd)
## DB 모델링 <a id="db-모델링"></a>
### 1. 개념 모델링 <a id="1-개념-모델링"></a>
![image](https://github.com/user-attachments/assets/e6dea257-6429-4be1-91f4-fa653914148e)
### 2. 논리 모델링 <a id="2-논리-모델링"></a>
![image](https://github.com/user-attachments/assets/398562df-4355-4f4b-b6ed-cfd6b9fc3f19)
### 3. 물리 모델링 <a id="3-물리-모델링"></a>
![image](https://github.com/user-attachments/assets/8a79a240-e42b-4341-a202-77a251d1a636)


### 산출물<a id="산출물"></a>

<details>
  <summary>회원가입을 위한 이메일 인증</summary>

  ![image](https://github.com/user-attachments/assets/64cdbec0-460d-48c4-9e9c-f30296c8c677)
  ![image](https://github.com/user-attachments/assets/2e39b1ac-1af6-46d4-b132-be6ca4f2b9ef)

</details>

<details>
  <summary>Redis를 이용한 이메일 인증번호 저장</summary>

  ![image](https://github.com/user-attachments/assets/918c81ea-5664-45ea-ba57-fbaff65a7d4f)

</details>

<details>
  <summary>로그인 후 토큰 발급</summary>

  ![image](https://github.com/user-attachments/assets/c64aa1df-a63f-4210-b8bb-bc6e4938e567)

</details>

<details>
  <summary>회원정보 수정 및 S3를 이용한 파일 저장</summary>

  ![image](https://github.com/user-attachments/assets/22b5047e-fee1-4a8b-8c5a-7ec17d13576e)
  ![image](https://github.com/user-attachments/assets/6d46b6fa-6d98-4ead-bb10-b5b1dd843449)

</details>

<details>
  <summary>Spring Batch와 Scheduling을 이용한 게시글 활성화 여부 관리</summary>

  ![image](https://github.com/user-attachments/assets/c15026df-42f4-4397-9500-312cb759cf5e)

</details>


### 📜 동료평가 <a id="동료평가"></a>


|Team Member| 조창욱 동료평가 |
| :--------------------------------------: | ------ |
|  김서현  | 모든 부분에 있어서 열정적으로 임해주셨고, 이러한 열정 덕분에 팀원들이 더욱 프로젝트에 임할 수 있었습니다. 그리고 새로운 아이디어나 의견 충돌시 여러가지 경우의 수를 생각하며, 의견을 제시해주어 원할하게 소통할 수 있었습니다. 추가적으로 저희 팀의 핵심 서비스인 문제 출제 및 채점 서비스를 훌륭히 수행하신게 인상 깊었습니다. |
|  전기범  | 프로젝트의 아이디어나 기획에 있어서 여러 상황들을 가정하시고, 그 상황속에서 최선의 정답을 찾도록 노력하시는 모습이 인상 깊었습니다. 개발적인면에서도 소화해야할 양도 많고, 기능 구현이 어려움에도 불구하고, 정해진 시간 내에 본인이 맡은 파트는 반드시 끝내며, 리팩토링 까지 완벽하게 하셨습니다. 이러한 모습들 덕분에 프로젝트를 성공적으로 이끌 수 있었습니다.  |
|  김민석  | 스터디 모집글의 마감시각에 따라 모집글의 상태가 변하는 로직이 있었는데, 이를 스프링 배치로 구현함으로써 프로젝트에서 난이도가 높은 부분을 훌륭히 해결하셨습니다. |
|  김소리  | 소리님께서는 이번이 백엔드 개발이 처음이라 많이 미숙하실 줄 알았는데 수업 내용을 꼼꼼히 들어 단기간내에 가장 많이 성장한 팀원으로 보였습니다. 이러한 장점을 통해 맡으신 업무는 반드시 제 시간내에 하시고, 꼼꼼하게 잘 해내셨습니다. |


|Team Member| 김서현 동료평가 |
| :--------------------------------------: | ------ |
|  조창욱  | 추진력과 실력을 겸비한 분인 것 같습니다. 못하는 게 없다는 느낌을 받았습니다. 로그인의 GOAT |
|  전기범  | 코드 장인이라는 느낌을 받았습니다. 저희팀 깃허브 커밋 압도적 1위... 그저 GOAT |
|  김민석  | 조용히 잘하는 숨은 고수라는 느낌을 받았습니다. 스프링 배치 GOAT |
|  김소리  | 평균, 표준편차 구하는 게 어려웠을 텐데 짧은 시간 안에 구현해내신 것이 진짜 대단하다고 생각합니다. 통계자료 GOAT |


|Team Member| 전기범 동료평가 |
| :--------------------------------------: | ------ |
|  조창욱  | 회원 기능을 보안성과 관련 법률을 고려하며 구현하는 점이 인상 깊었습니다.회원가입 기능과 프로필 사진 변경 기능이 단기간에 구현하기 까다로웠음에도 SMTP와 Redis, 또 AWS S3를 이용하여 완벽하게 구현하셨다는 것이 대단하다고 생각합니다. |
|  김서현  | 문제를 저장할 때 선지까지 저장하는 트랜잭션과 참가자가 제출한 답안을 채점하는 트랜잭션이 저희 서비스의 핵심 기능이었는데 이 부분을 정말 잘 구현해주신것 같습니다. 덕분에 프로젝트 시연도 잘 마칠 수 있었습니다. 고생하셨습니다. |
|  김민석  | 모집글의 모집 종료 기능을 Spring Batch를 통해 구현하셨는데, 사용해보지 않았던 기술이고, 또 Deprecated된 코드 예제가 많았음에도 독학으로 구현하셨다는 것이 대단하다고 생각합니다. |
|  김소리  | 시험이 있는 일정에서 시험이 종료된 후, 일정 참가자들의 점수를 계산하고, 시험 평균과 표준편차를 구하는 로직이 복잡했을텐데 처음 해보는 것이었음에도 잘 구현해주셔서 프로젝트를 성공적으로 마무리할 수 있었습니다. 감사합니다. |


|Team Member| 김민석 동료평가 |
| :--------------------------------------: | ------ |
|  조창욱  | 프로젝트를 진행하면서 지속적으로 개선하려는 노력이 인상적이었고, 복잡한 기능임에도 불구하고 이를 거의 완벽하게 구현하는 모습을 보며 높은 책임감을 느꼈습니다. |
|  김서현  |  아이디어 뱅크 그 자체로, 항상 새로운 아이디어를 제시하며 프로젝트에 활력을 불어넣었습니다. 특히 핵심 기능을 성공적으로 구현해 팀의 목표 달성에 중요한 역할을 했습니다. 창의성과 실행력이 돋보였고, 이를 통해 프로젝트가 더욱 완성도 있게 마무리될 수 있었습니다. |
|  전기범  | 프로젝트를 진행하면서 지속적으로 개선하려는 노력이 인상적이었으며, 팀을 위한 이타적인 태도가 특히 돋보였습니다. 그가 보여준 협력과 배려가 프로젝트의 성공에 큰 도움이 되었다고 생각합니다. |
|  김소리  | 맡은 일을 매우 잘 수행했으며, 마치 방점을 찍는 듯한 중요한 역할을 했다는 점이 특히 인상적이었습니다. 프로젝트의 핵심적인 부분을 책임지고, 이를 성공적으로 완수하면서 팀 전체에 긍정적인 영향을 미쳤습니다. 철저한 준비와 문제 해결 능력이 팀의 목표 달성에 큰 기여를 했다고 생각합니다. |


|Team Member| 김소리 동료평가 |
| :--------------------------------------: | ------ |
|  조창욱  | 프로젝트를 주도적으로 진행해주어 덕분에 큰 차질없이 잘 마무리된 것 같습니다. 작은 일에도 팀원들을 잘 다독여주시고 멘탈케어를 잘하시는 것 같습니다. 회원 부분에 추가적인 기능도 있고 여러가지 신경쓸 부분도 많으셨을텐데 꼼꼼하게 신경써서 개발을 잘 하시는 것 같습니다.  |
|  김서현  | 프로젝트 기획 때 아이디어나 문제될 것 같은 부분을 바로바로 잘 얘기해주셔서 기획에 시간을 잡아먹지 않고 빠르게 진행할 수 있었습니다. 본인 일 이외에 추가적으로 더 해야 할 일을 잘 찾아서 빠르게 해결하시는 것 같습니다. README와 같은 문서작업을 깔끔하게 잘 만드시는 것 같습니다. |
|  전기범  | 코딩 능력이 대단하신 것 같습니다. 본인이 맡은 부분의 개발을 빠르게 마치고 지속적으로 개선하시면서 추가적으로 해야 할 부분을 빠르게 해주셨습니다. 개발할 때 많은 참고가 되었습니다 |
|  김민석  | 묵묵하게 본인의 할 일을 정말 잘 하시는 것 같습니다. spring 마스터라고 처음에 들었었는데 들은대로 정말 잘 하시는 것 같습니다. 그리고 가만히만 있어도 웃깁니다. 재밌으신분,, |
