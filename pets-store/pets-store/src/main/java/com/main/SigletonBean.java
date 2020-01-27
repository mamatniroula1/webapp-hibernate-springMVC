package com.main;

import com.model.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SigletonBean {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dogs.xml");
        Dog dog1=(Dog)applicationContext.getBean("dog");
        Dog dog2=(Dog)applicationContext.getBean("dog");
        Dog dog3=(Dog)applicationContext.getBean("dog");
        if(dog1==dog2){
            System.out.println("Hey this is singelton");
        }
        if(dog2==dog3){
            System.out.println("Hey this is singelton");
        }
    }
}
