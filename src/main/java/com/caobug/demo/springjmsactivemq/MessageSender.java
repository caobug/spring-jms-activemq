package com.caobug.demo.springjmsactivemq;

import org.springframework.jms.core.JmsTemplate;

import java.util.Map;

/**
 * Created by caobug on 16/6/23.
 *
 * @author caobug
 */
public class MessageSender {

    private final JmsTemplate jmsTemplate;

    public MessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sender(final Map<String, Object> map) {
        jmsTemplate.convertAndSend(map);
    }
}