package com.ttn.spring_core.Q2;

public class MainApp {
    public static void main(String[] args) {

        Beverage tea = new Tea();
        Restaurant restaurant = new Restaurant(tea);

        restaurant.serve();
    }
}
