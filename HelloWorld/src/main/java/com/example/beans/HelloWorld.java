package com.example.beans;

import org.springframework.context.annotation.Bean;


public class HelloWorld {

    private  String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
