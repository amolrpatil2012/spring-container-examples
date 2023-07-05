package example.beans;

import org.springframework.stereotype.Component;

@Component("Twitter")
public class TwitterService implements MessageService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending Message Using Twitter");
    }
}
