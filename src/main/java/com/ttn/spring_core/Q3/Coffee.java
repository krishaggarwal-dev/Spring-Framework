package com.ttn.spring_core.Q3;

public class Coffee implements Beverage {

    @Override
    public void prepare() {
        System.out.println("Cold Coffee");
    }
}
