package com.brownsuagr.qasystem.controller;

import com.brownsuagr.qasystem.utils.LogUtils;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

    /**
     * 描述：根页面
     * @return
     */
    @RequestMapping("index")
    public String doIndexUI(){

//        Logger log = LogUtils.getExceptionLogger();
//        Logger log1 = LogUtils.getBussinessLogger();
//        Logger log2 = LogUtils.getDBLogger();
//        log.error("getExceptionLogger===日志测试");
//        log1.info("getBussinessLogger===日志测试");
//        log2.debug("getDBLogger===日志测试");
        return "index";
    }


}
