package com.example.application;

import com.example.beans.Mobile;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Mobile m1=  context.getBean("samsung",Mobile.class);
        System.out.println(m1);

        // Will Retrieve Primary Bean
        Mobile m2=  context.getBean(Mobile.class);
        System.out.println(m2);
    }
}
