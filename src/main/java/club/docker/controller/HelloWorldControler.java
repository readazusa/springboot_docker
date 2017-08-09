package club.docker.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 念梓  on 2017/8/9.
 * Email:sunmch@163.com
 * author: 念梓
 * des:
 */
@RestController
@RequestMapping("helloworld")
public class HelloWorldControler {

    private static final Logger log = LogManager.getLogger(HelloWorldControler.class);

    @RequestMapping("hello")
    public String hello(){
        log.info("请求helloworld的hello");
        return "hello";
    }
}
