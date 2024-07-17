package com.myapp.MyApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // it is known as field injection.
   // Laptop laptop = new Laptop();

    Laptop laptop;

//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){

        laptop.compile();

        System.out.println("working on a project");
    }

}
