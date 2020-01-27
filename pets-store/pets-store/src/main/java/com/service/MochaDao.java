package com.service;

import org.springframework.stereotype.Repository;

@Repository // if your bean contains database logic , then it should be annotated @@Repository
public class MochaDao {

    public void save(){
        System.out.println("Hello I am saving data into the database!");
    }

    public void load(){
        System.out.println("Hello I am loading data from the database!");
    }
}
