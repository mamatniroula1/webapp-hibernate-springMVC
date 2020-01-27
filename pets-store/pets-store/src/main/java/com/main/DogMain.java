package com.main;

import com.model.Dog;

/**
 * @Author Nagendra
 */
public class DogMain {
    public static void main(String[] args) {
        Dog dog=new Dog();//Who  is creating instance of Dog ? P
        dog.setAge(12); //Who  is setting initial states of the object ? P
        dog.setColor("Yellow");
        dog.setName("Paul!!!");
        dog.cry();////Who  is calling cry ? P
        System.out.println(dog);
        dog=null;////Who  is managing the life cycle of the Dog ? P
        //Now dog will be eligible for GC
    }
}
