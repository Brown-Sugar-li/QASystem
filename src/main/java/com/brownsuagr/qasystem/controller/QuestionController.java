package com.brownsuagr.qasystem.controller;

import com.brownsuagr.qasystem.entity.Question;
import com.brownsuagr.qasystem.entity.ToEmail;
import com.brownsuagr.qasystem.service.QuestionService;
import com.brownsuagr.qasystem.utils.htmlEmail;
import com.brownsuagr.qasystem.utils.htmlTemplate;
import com.brownsuagr.qasystem.vo.JsonResult;
import com.brownsuagr.qasystem.vo.JsonResultFlag;
import com.brownsuagr.qasystem.vo.QuestionModelVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    /**
     * 描述：主页面
     * @return
     */
    @RequestMapping("question")
    public String doQuestionUI(){
        return "views/question";
    }
    /**
     * 描述：问题列表
     * @return
     */
    @RequestMapping("question/modelList")
    public String doQuestionListUI(){
        return "views/list";
    }

    /**
     * 描述：提交问题
     * @return
     */
    @RequestMapping("question/submit")
    public String doQuestionSubmitUI(){
        return "views/submitQuestion";
    }

    /**
     * 前台展示数据：
     *  1、提问问题
     *  2、问题答案
     *  3、上一个问题、下一个问题
     *  4、模块名，每个模块包含问题数量
     */
    @RequestMapping("question/totalList")
    @ResponseBody
    public JsonResult questionJsonResult(){
        List<Question> questionList = questionService.loadQuestionList();
        if(questionList != null){
            return new JsonResult(questionList);
        }else{
            return new JsonResult(0,"问题不存在！");
        }
    }

    /**
     * 描述：随机获取一条数据
     * SQL：select * from users order by rand() LIMIT 1
     * @return
     */
    @RequestMapping("question/random")
    @ResponseBody
    public JsonResult getOneDataRandom(){
        List<QuestionModelVO> oneData = questionService.oneDataRandom();
        if(oneData != null){
            return new JsonResult(oneData);
        }else{
            return new JsonResult(0,"模块走丢了！");
        }
    }

    /**
     * 描述：获取模块对应模块ID数组
     * SQL：
     * @return
     */
    @RequestMapping("question/getQuestionArray")
    @ResponseBody
    public JsonResult getQuestionArray(Integer modelId){
        if(modelId == null){
            return new JsonResult(0,"模块不存在！");
        }
        int[] qa = questionService.questionArray(modelId);
        if(qa.length > 0){
            return new JsonResult(qa);
        }
        return new JsonResult(0,"该模块内无数据！");
    }

    @RequestMapping("question/getOneQuestion")
    @ResponseBody
    public JsonResult getOneQuestion(Integer questionId,Integer flag){
        //随机返沪一条
        if(flag == 0){
            return new JsonResult(questionService.oneDataRandom());
        }
        //模块返回
        List<QuestionModelVO> fmq = questionService.fromModelQuestion(questionId);
        if(flag == 1 && fmq != null){
            return new JsonResult(fmq);
        }
        return new JsonResult(0,"数据不存在！");
    }

    /**
     * 描述：发送邮件
     * @param question
     * @return
     */
    @RequestMapping("question/doSaveQuestion")
    @ResponseBody
    public JsonResult getQuestionToMail(Question question) {
        if(question != null){
            new JsonResult(0,"提交数据为空！");
        }
        try{
            return new JsonResult(1,"发送成功！",questionService.sendMail(question));
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0,"发送失败！");
        }

    }







}
