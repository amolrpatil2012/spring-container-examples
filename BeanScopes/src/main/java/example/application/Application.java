package example.application;


import example.beans.Emp;
import example.beans.Mobile;
import example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);




        Mobile mobile1=  context.getBean(Mobile.class);
        Emp emp1 = context.getBean(Emp.class);

        Mobile mobile2=  context.getBean(Mobile.class);
        Emp emp2 = context.getBean(Emp.class);

        System.out.println(mobile1.hashCode());
        System.out.println(mobile2.hashCode());

        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        context.close();
    }
}
