package com.naman.DemoApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Hello i am in desktop");
    }
}
