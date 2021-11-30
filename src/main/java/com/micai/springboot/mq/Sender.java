package com.micai.springboot.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 描述：消息生产者
 * <p>
 * Date: 2021年4月12日16:12:41
 */
@Component
public class Sender extends BaseConfig{

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        // 在该生产者，我们会产生一个字符串，并发送到名为hello的队列中
        String context = "Hello " + "Rabbit MQ！" + i;
        System.out.println("发送MQ消息 : " + context);
        this.rabbitTemplate.convertAndSend(QUEUE_KEY, context);
    }

}
