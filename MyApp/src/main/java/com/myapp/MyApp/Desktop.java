package com.myapp.MyApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Computer {

    public void compile(){
        System.out.println("Compiling the program for the project but on a Desktop");
    }

}
