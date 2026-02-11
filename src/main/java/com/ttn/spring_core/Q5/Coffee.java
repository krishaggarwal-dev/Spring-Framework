package com.ttn.spring_core.Q5;

import org.springframework.stereotype.Component;

@Component
public class Coffee implements Beverage {

    @Override
    public void prepare() {
        System.out.println("Cold Coffee");
    }
}
