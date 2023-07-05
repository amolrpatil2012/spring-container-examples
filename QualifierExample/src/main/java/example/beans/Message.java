package example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Message {


    @Autowired
    @Qualifier("Twitter")
    MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

   public Message(MessageService messageService) {
        this.messageService = messageService;
    }

   public Message(){}
}
