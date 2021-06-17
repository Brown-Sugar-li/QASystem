package com.brownsuagr.qasystem.vo;

import java.io.Serializable;

/**
 * Copyright: Copyright (c) 2020 Brown Sugar
 *
 * @ClassName: com.libnet.util.JsonResult
 * @Description: 封装用户数据结果对象
 * @Author: 黑糖
 * @Date: 2020-09-15 13:38
 */
public class JsonResult implements Serializable {

    /**
     * 1、封装用户的状态码：1/0 成功/失败
     * 2、封装用户的状态信息
     * 3、封装业务返回数据
     * 4、生成无参、独参、异常参数构造方法、getter、setter方法
     **/
    private static final long serialVersionUID = -6317007836352613443L;
    private int state = 1;
    private String message = "ok";
    private Object data;

    public JsonResult(int state, String message, Object data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public JsonResult(int state, String message) {
        this.state = state;
        this.message = message;
    }

    public JsonResult() {

    }

    public JsonResult(String message) {
        this.message = message;
    }

    public JsonResult(Object data) {
        this.data = data;
    }
    public JsonResult(String message, Object data) {
        this.data = data;
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public JsonResult(Throwable t){
        this.state=0;
        this.message=t.getMessage();
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
