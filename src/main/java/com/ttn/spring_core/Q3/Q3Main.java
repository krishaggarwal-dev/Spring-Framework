package com.ttn.spring_core.Q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Q3Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ttn.spring_core.Q3");

        Restaurant restaurant = applicationContext.getBean(Restaurant.class);
        restaurant.serve();
    }
}
