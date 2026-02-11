package com.ttn.spring_core.Q6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Coffee implements Beverage {

    @Override
    public void prepare() {
        System.out.println("Cold Coffee");
    }
}
