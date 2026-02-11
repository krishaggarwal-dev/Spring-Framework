package com.ttn.spring_core.Q2;

public class Restaurant {

    private Beverage beverage;

    public Restaurant(Beverage beverage) {
        this.beverage = beverage;
    }

    public void serve() {
        beverage.prepare();
    }
}
