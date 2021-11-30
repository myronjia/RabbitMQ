package com.micai.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoxinguo on 2017/8/21.
 */
@RestController //提供实现了REST API，可以服务JSON,XML或者其他。这里是以String的形式渲染出结果。
public class HelloWorldController {

    @RequestMapping("/") //提供路由信息，”/“路径的HTTP Request都会被映射到sayHello方法进行处理。
    public String sayHello(){

        return "Hello,World!";

    }

}
