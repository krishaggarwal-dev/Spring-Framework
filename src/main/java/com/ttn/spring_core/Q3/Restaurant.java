package com.ttn.spring_core.Q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

    private Beverage beverage;

    @Autowired
    public Restaurant(Beverage beverage) {
        this.beverage = beverage;
    }

    public void serve() {
        beverage.prepare();
    }
}
