package com.brownsuagr.qasystem.controller;

import com.brownsuagr.qasystem.utils.LogUtils;
import com.brownsuagr.qasystem.vo.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.brownsuagr.qasystem.utils.AddressUtils;
import java.net.URLDecoder;

@Controller
@RequestMapping("/log")
public class LogController {

    @RequestMapping("/getLog")
    @ResponseBody
    public JsonResult getLog(String log){
        try {
            //对get请求串解码，防止中文乱码
            String qs = URLDecoder.decode(log, "utf-8");
            //请求串中各指标以&符号分割
            String []  attrs = qs.split("\\&");
            StringBuffer buf = new StringBuffer();
            for(String attr : attrs){
                //每个指标以kv形式存在，中间用=分割
                String [] kv = attr.split("=");
                String key = kv[0];		//指标名称
                String val = kv.length == 2 ? kv[1] : "";		//指标值
                buf.append(val + "|");							//指标以|分割
            }
            AddressUtils as = new AddressUtils();
            LogUtils.getPlatformLogger().info("IP地址："+as.getAddresses("ip=" +  as.getIpAddr(), "utf-8"));
            //增加服务器端IP地址指标
            buf.append(as.getAddresses("ip=" +  as.getIpAddr(), "utf-8"));
            String logInfo = buf.toString();
            LogUtils.getPlatformLogger().info("输出日志"+logInfo);
            return new JsonResult(1,"日志获取成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0,"日志获取错误！");
        }
    }
}
