package com.example.application;

import com.example.beans.Emp;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Emp emp = context.getBean(Emp.class);
        emp.setEmpId(1);
        emp.setName("Rohit");
        System.out.println(emp);
    }
}
