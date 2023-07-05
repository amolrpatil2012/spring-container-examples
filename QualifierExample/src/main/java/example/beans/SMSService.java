package example.beans;

import org.springframework.stereotype.Component;

@Component("SMS")

public class SMSService implements MessageService{

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending Message Using SMS");
    }
}
