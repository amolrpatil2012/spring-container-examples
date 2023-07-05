package com.example.application;

import com.example.beans.EarlyBean;
import com.example.beans.LazyBean;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        System.out.println("Starting Container");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Started Container");

        EarlyBean earlyBean = context.getBean(EarlyBean.class);
        LazyBean lazyBean = context.getBean(LazyBean.class);
    }
}
