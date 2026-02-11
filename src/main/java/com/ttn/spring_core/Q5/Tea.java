package com.ttn.spring_core.Q5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Tea implements Beverage {

    @Override
    public void prepare() {
        System.out.println("Masala Tea");
    }
}
