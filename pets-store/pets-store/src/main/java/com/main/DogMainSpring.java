package com.main;

import com.model.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogMainSpring {
    public static void main(String[] args) {
        //Create Spring container
        //src/main/resources
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dogs.xml");
        Dog dog=(Dog)applicationContext.getBean("dog");
        dog.cry();
        dog=null;
        dog=(Dog)applicationContext.getBean("dog");
        System.out.println(dog);
    }
}
