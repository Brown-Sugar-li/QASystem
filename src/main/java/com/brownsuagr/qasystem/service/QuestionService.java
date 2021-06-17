package com.brownsuagr.qasystem.service;
import com.brownsuagr.qasystem.entity.Question;
import com.brownsuagr.qasystem.vo.QuestionModelVO;

import javax.mail.MessagingException;
import java.util.List;

public interface QuestionService {

    List<Question> loadQuestionList();

    List<QuestionModelVO> oneDataRandom();

    int[] questionArray(Integer modelId);

    List<QuestionModelVO> fromModelQuestion(Integer questionId);

    String sendMail(Question question) throws MessagingException;
}
