package com.naman.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component     //this is helping print function to get called
public class Build {

    //Field Injection -> @Autowired
    @Autowired //will make wire from Build to Laptop
    @Qualifier("laptop")
    //@Qualifier("laptop"); used to prioritise Laptop.java instead of Desktop.java
     private Computer computer;
    //this will throw error bw laptop and desktop as both have .compile() function
    //to fix we use @Primary in one of it to reduce confusion

    //Constructor Injection
//     public Build(Laptop laptop){
//         this.laptop = laptop;
//     }

    //Setter Injection
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void print() {
         computer.compile();
        System.out.println("Hello I am Naman Chachan");

    }
}
