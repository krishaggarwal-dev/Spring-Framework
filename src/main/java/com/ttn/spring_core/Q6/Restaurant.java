package com.ttn.spring_core.Q6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

    private Beverage beverage;

    @Autowired
    public Restaurant(@Qualifier("myTea") Beverage beverage) {
        this.beverage = beverage;
    }

    public void serve() {
        beverage.prepare();
    }
}
