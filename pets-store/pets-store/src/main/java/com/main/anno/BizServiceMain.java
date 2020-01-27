package com.main.anno;

import com.service.BizService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BizServiceMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("biz-service.xml");
        BizService bizService=(BizService)applicationContext.getBean(BizService.class);
        bizService.show();
        bizService.foo();
    }
}
