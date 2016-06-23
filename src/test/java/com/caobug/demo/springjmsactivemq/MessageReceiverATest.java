package com.caobug.demo.springjmsactivemq;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Created by caobug on 16/6/23.
 *
 * @author caobug
 */
public class MessageReceiverATest {

    @Test
    public void receiverA() throws Exception {
        new ClassPathXmlApplicationContext("spring-receiver.xml");

        TimeUnit.DAYS.sleep(Integer.MAX_VALUE);
    }
}