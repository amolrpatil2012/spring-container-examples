package example.config;


import example.beans.Mobile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class ProjectConfig {


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
