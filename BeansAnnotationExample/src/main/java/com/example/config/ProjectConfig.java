package com.example.config;

import com.example.beans.Mobile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// class used to define beans

@Configuration
public class ProjectConfig {

    // @Bean is a method level annotation
    // providing names to bean using different property options
    // We use @Primary annotation to give higher preference to a bean when there are multiple beans of the same type.

    @Bean("samsung")
    public Mobile samsung()
    {
        Mobile mobile = new Mobile();
        mobile.setBrandName("Samsung");
        mobile.setPrice(20000);
        return  mobile;

    }
    @Bean(name = "redmi")
    public Mobile redmi()
    {
        Mobile mobile = new Mobile();
        mobile.setBrandName("Redmi");
        mobile.setPrice(10000);
        return  mobile;

    }
    @Primary
    @Bean(value = "apple")
    public Mobile apple()
    {
        Mobile mobile = new Mobile();
        mobile.setBrandName("Apple");
        mobile.setPrice(50000);
        return  mobile;

    }





}
