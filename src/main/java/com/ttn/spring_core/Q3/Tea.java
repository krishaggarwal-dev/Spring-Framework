package com.ttn.spring_core.Q3;

import org.springframework.stereotype.Component;

@Component
public class Tea implements Beverage {

    @Override
    public void prepare() {
        System.out.println("Masala Tea");
    }
}
