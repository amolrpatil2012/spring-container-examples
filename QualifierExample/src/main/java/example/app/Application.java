package example.app;


import example.beans.Message;
import example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Message message = context.getBean(Message.class);
        message.getMessageService().sendMessage("Hello");

    }
}
