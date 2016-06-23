package com.caobug.demo.springjmsactivemq;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by caobug on 16/6/23.
 *
 * @author caobug
 */
public class MessageSenderTest {

    @Test
    public void sender() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-sender.xml");
        MessageSender messageSender = ctx.getBean("messageSender", MessageSender.class);
        for (int i = 0; i < 148; i++) {
            Map<String, Object> content = new HashMap<>();
            content.put("name", "caobug");
            content.put("age", i);
            content.put("will", "say hello");
            messageSender.sender(content);
            TimeUnit.SECONDS.sleep(1);
        }
    }

    // 1357, 2468,{10万结果} 张三
}