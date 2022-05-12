package com.example.messageincontroller.service;

import com.example.webhook.entity.MessageIn;
import lombok.AllArgsConstructor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageInService {

    private JmsTemplate jmsTemplate;

    public void postMessage(MessageIn messageIn) {
        jmsTemplate.convertAndSend("message_in", messageIn);
//        System.out.println(messageIn.getTrx_id());
//        System.out.println(messageIn.getClient_webhook_url());
    }

    @JmsListener(destination="message_in")
    public void listen(MessageIn messageIn) {
        System.out.println("Listening");
        System.out.println(messageIn.getTrx_id());
        System.out.println(messageIn.getClient_webhook_url());
    }
}
