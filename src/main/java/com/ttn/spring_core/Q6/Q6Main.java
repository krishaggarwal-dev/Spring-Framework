package com.ttn.spring_core.Q6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Q6Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ttn.spring_core.Q6");

        Restaurant restaurant = applicationContext.getBean(Restaurant.class);
        restaurant.serve();
    }
}
