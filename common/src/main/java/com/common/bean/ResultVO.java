package com.common.bean;

public class ResultVO<T> {


    public ResultVO() {
    }

    public ResultVO(String msg, int status, T data) {
        this.msg = msg;
        this.status = status;
        this.data = data;
    }

    private String msg ;

    private int status ;

    private T data ;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "msg='" + msg + '\'' +
                ", status=" + status +
                ", data=" + data +
                '}';
    }
}
