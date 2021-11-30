package com.micai.springboot.mq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

/**
 * 描述：RabbitMQ的配置类
 * <p>
 * Author: 贾志伟
 * Date: 2020/11/3 16:16
 */
@Configuration
public class RabbitConfig extends BaseConfig{

    /**
     * @return 队列
     * 在Rabbit 中创建队列
     */
    @Bean
    public Queue helloQueue() {
        return new Queue(QUEUE_KEY);
    }
}
