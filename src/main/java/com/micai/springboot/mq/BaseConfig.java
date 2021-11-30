package com.micai.springboot.mq;

/**
 * 描述：
 * <p>
 * Author: jzw
 * Date: 2021年4月12日16:12:55
 */
public class BaseConfig {

    /**
     * 声明队列名称时，需要先在RabbitConfig 中创建bean
     */
    protected static final String QUEUE_KEY = "hello";


}
