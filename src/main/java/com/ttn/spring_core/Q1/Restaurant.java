package com.ttn.spring_core.Q1;

public class Restaurant {

    Tea tea = new Tea();
    Coffee coffee = new Coffee();

    public void order() {
        tea.masalaTea();
        coffee.coldCoffee();
    }
}
