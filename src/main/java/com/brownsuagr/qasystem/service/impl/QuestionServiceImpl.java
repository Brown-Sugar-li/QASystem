package com.brownsuagr.qasystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.brownsuagr.qasystem.entity.Question;
import com.brownsuagr.qasystem.entity.ToEmail;
import com.brownsuagr.qasystem.mapper.QuestionMapper;
import com.brownsuagr.qasystem.mapper.QuestionModelMapper;
import com.brownsuagr.qasystem.service.QuestionService;
import com.brownsuagr.qasystem.utils.TimeFormat;
import com.brownsuagr.qasystem.utils.htmlEmail;
import com.brownsuagr.qasystem.utils.htmlTemplate;
import com.brownsuagr.qasystem.vo.QuestionModelVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private QuestionModelMapper questionModelMapper;
    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;



    /**
     * 描述：获取问题列表
     * 1、question、answer、model、keyword、
     */
    @Override
    public List<Question> loadQuestionList() {
        return questionMapper.getQuestionList();
    }

    /**
     * 描述：随机获取一条数据
     * @return
     */
    @Override
    public List<QuestionModelVO> oneDataRandom() {
        return questionModelMapper.getOneDataRandom();
    }

    @Override
    public int[] questionArray(Integer modelId) {
        QueryWrapper<Question> queryWrapper = new QueryWrapper();
        //System.out.println("ID"+modelId);
        queryWrapper.eq("mode_id",modelId);
        List<Question> list = questionMapper.selectList(queryWrapper);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i).getId();
            //System.out.println("结果："+list.get(i).toString());
        }
        return result;
    }

    /**
     * 描述：从模块获取数据
     * @param questionId
     * @return
     */
    @Override
    public List<QuestionModelVO> fromModelQuestion(Integer questionId) {
        return questionModelMapper.getOneDataFromModel(questionId);
    }

    /**
     * 描述：发送提交者邮件
     * @param question
     * @return
     * @throws MessagingException
     */

    @Override
    public String sendMail(Question question) throws MessagingException {
        String content =
                new htmlTemplate().mailCardTemplateTwo(
                        question.getQuestion(),
                        question.getAnswer(),question.getKeyword(),
                        question.getCreatedUser(),
                        new TimeFormat().TimeFormat());
        //创建一个MINE消息
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper mineHelper = new MimeMessageHelper(message, true);
        mineHelper.setFrom(from);
        mineHelper.setTo(new String[]{question.getEmail()});
        //邮件主题
        mineHelper.setSubject("问题提交");
        //邮件内容   true 表示带有附件或html
        mineHelper.setText(content, true);
        try {
            mailSender.send(message);
        } catch (MailException e) {
            e.printStackTrace();
        }
        return content;
    }

}
