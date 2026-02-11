package com.ttn.spring_core.Q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Q5Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ttn.spring_core.Q5");

        Restaurant restaurant = applicationContext.getBean(Restaurant.class);
        restaurant.serve();

        // 2 ways ambiguity can be resolved, I used @Primary here, another way is using @Qualifier
    }
}
