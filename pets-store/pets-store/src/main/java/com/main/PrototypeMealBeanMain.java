package com.main;

import com.model.Dog;
import com.model.Meal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeMealBeanMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("prototype-meal.xml");
        Meal meal2=(Meal)applicationContext.getBean("www.cubicko.com");
        Meal meal3=(Meal)applicationContext.getBean("www.cubicko.com");
        Meal meal4=(Meal)applicationContext.getBean("www.cubicko.com");
        if(meal2!=meal3){
            System.out.println("Hey this is prototype");
        }
        if(meal2!=meal4){
            System.out.println("Hey this is prototype");
        }
    }
}
