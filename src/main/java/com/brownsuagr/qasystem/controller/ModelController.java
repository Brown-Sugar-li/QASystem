package com.brownsuagr.qasystem.controller;

import com.brownsuagr.qasystem.service.ModelService;
import com.brownsuagr.qasystem.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/model")
public class ModelController {

    @Autowired
    private ModelService modelService;
    /**
     * 描述：获取对应模块名称和数量
     * SQL：SELECT temp.name AS category,SUM(temp.mode_id) AS sum
     *      FROM
     * 	        ( SELECT q.mode_id,m.name
     * 		    FROM question q
     * 		    RIGHT JOIN model m
     * 		    ON q.mode_id = m.id) AS temp
     *      GROUP BY temp.name
     */
    @RequestMapping("/getModelSumList")
    @ResponseBody
    public JsonResult modelSumList(){
        try {
            return new JsonResult(modelService.loadModelSumList());
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0,"资源走丢了！");
        }
    }

    @RequestMapping("/getModelList")
    @ResponseBody
    public JsonResult modelList(){
        try {
            return new JsonResult(modelService.loadModelList());
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0,"资源走丢了！");
        }
    }

}
