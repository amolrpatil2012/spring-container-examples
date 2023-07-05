package com.example.app;

import com.example.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}
