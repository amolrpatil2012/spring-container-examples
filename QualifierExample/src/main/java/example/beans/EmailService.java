package example.beans;

import org.springframework.stereotype.Component;

@Component("Email")
public class EmailService implements MessageService{

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending Message Using Mail");
    }
}
