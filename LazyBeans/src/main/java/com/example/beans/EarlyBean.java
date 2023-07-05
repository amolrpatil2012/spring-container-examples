package com.example.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class EarlyBean {

    private  String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public EarlyBean()
    {
        System.out.println("Early Bean Created");
    }
}
