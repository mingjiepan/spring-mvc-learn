package com.mjie.common;

/**
 * @author panmingjie
 * @date 2021/4/2 10:05
 */
public class BaseResp {
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
