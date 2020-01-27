package com.service;

//<bean id="BizService"  class="com.service.BizService">
// <property name="mochaDao" ref="mochaDao"/>
//</bean>

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Here id will be same as class name and first letter will be small
//@Component, @Controller ,@Repository

//Here we are injecting MochaDao bean inside BizService bean ?? yes yes
@Service
public class BizService {

    @Autowired  //<property name="mochaDao" ref="mochaDao"/>
    private MochaDao mochaDao;

    public void show(){
        System.out.println("Hello Mr . show");
        mochaDao.save();
    }

    public void foo(){
        System.out.println("Hello Mr foo!!!!!!!!!!!!!!!!!");
        mochaDao.load();
    }
}
