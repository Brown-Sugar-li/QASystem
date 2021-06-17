package com.brownsuagr.qasystem.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResultObject<T> implements Serializable {

    private T data;
    private String code;
    private String msg;

    /**
     * 若没有数据返回，默认状态码为1，提示信息为：操作成功！
     */
    public JsonResultObject() {
        this.code = "1";
        this.msg = "操作成功！";
    }

    /**
     * 若没有数据返回，可以人为指定状态码和提示信息
     * @param code
     * @param msg
     */
    public JsonResultObject(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 有数据返回时，状态码为1，默认提示信息为：操作成功！
     * @param data
     */
    public JsonResultObject(T data) {
        this.data = data;
        this.code = "1";
        this.msg = "操作成功！";
    }

    /**
     * 有数据返回，状态码为1，人为指定提示信息
     * @param data
     * @param msg
     */
    public JsonResultObject(T data, String msg) {
        this.data = data;
        this.code = "1";
        this.msg = msg;
    }
    // 省略get和set方法
}