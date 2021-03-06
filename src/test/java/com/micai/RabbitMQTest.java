package com.micai;

import com.micai.springboot.Application;
import com.micai.springboot.mq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 描述：
 * <p>
 * Author: 贾志伟
 * Date: 2020/11/3 17:21
 */
@SpringBootTest(classes=Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RabbitMQTest {

    @Autowired
    private Sender sender;

    @Test
    public void send () {
        for (int i=0; i< 1000;i++) {
            sender.send(i);
        }
    }

}
