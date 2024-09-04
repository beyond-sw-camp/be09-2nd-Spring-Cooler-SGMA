package com.springcooler.sgma.submittedanswer.command.application.service;

import com.springcooler.sgma.studyscheduleparticipant.command.domain.aggregate.StudyScheduleParticipant;
import com.springcooler.sgma.studyscheduleparticipant.query.dto.StudyScheduleParticipantDTO;
import com.springcooler.sgma.submittedanswer.command.application.dto.SubmittedAnswerDTO;
import com.springcooler.sgma.submittedanswer.command.domain.aggregate.SubmittedAnswer;

import java.util.List;

public interface AppSubmittedAnswerService {
    void registSubmittedAnswer(List<SubmittedAnswerDTO> submittedAnswers);

    SubmittedAnswer modifySubmittedAnswer(SubmittedAnswerDTO modifySubmittedAnswer);

    SubmittedAnswer findSubmittedAnswerByProblemIdAndParticipantId(long problemId, long participantId);

    double gradeSubmittedAnswersByParticipantId(long scheduleId, long participantId);

//    void gradeSubmittedAnswersByParticipantId(long participantId);

}
