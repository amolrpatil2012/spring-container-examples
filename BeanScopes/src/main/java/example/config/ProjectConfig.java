package example.config;


import example.beans.Mobile;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan ("example.beans")
public class ProjectConfig {



    @Primary
    @Scope("singleton")
    @Bean(value = "apple")
    public Mobile apple()
    {
        Mobile mobile = new Mobile();
        mobile.setBrandName("Apple");
        mobile.setPrice(50000);
        return  mobile;

    }





}
