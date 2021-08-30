package com.sterbensq.myblog.dao;

public class ResponseMessage {
    public Object data;
    public String message;
    public Integer code;

    public ResponseMessage(){
        super();
    }
    public ResponseMessage(Integer code,String message,Object data){
        super();
        this.data=data;
        this.message=message;
        this.code=code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
