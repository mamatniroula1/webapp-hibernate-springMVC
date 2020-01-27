package com.web.controller;

import com.dao.PDog;
import com.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

//@Service , Repository, @Component
@Controller
public class PetsController {

    @Autowired
    private DogService dogService;

    //method -GET
    //Action- /foo
    @GetMapping("/foo")
    public String feeck(){
        return "hello";
    }

    //METHOD=GET
    @GetMapping("/add-pets")
    public String showPetPage(){
        return "addPets";
    }

    //METHOD=POST
    @PostMapping("/add-pets")
    public String addPets(HttpServletRequest request){
        String name=request.getParameter("name");
        String color=request.getParameter("color");
        String price=request.getParameter("price");
        PDog dog=new PDog(0,name,color,Integer.parseInt(price),new Timestamp(new Date().getTime()));
        dogService.save(dog);
        return "success";
    }

}
