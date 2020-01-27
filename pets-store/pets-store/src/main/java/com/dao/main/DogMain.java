package com.dao.main;

import com.dao.DogDaoImpl;
import com.dao.PDog;
import com.model.Dog;
import com.service.DogService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class DogMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dog-service-dao.xml");
        DogService dogService=(DogService)applicationContext.getBean("dogServiceImpl");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name");
        String name=scanner.next();
        System.out.println("Enter color");
        String color=scanner.next();
        System.out.println("Enter price");
        int price=scanner.nextInt();
        PDog dog=new PDog(0,name,color,price,new Timestamp(new Date().getTime()));
        dogService.save(dog);
        List<PDog> pDogs =dogService.findDogs();
        pDogs.forEach(System.out::println);
    }
}
