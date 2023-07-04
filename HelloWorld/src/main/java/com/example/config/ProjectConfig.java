package com.example.config;

import com.example.beans.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public HelloWorld helloWorld()
    {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World");
        return helloWorld;
    }
}
