package be.infernalwhale.springdemo.service;

import org.springframework.stereotype.Component;

@Component
public class PizzaService {
    public PizzaService(Oven oven) {
        System.out.println("Creating Pizza Service");

        oven.bakePizza();
    }
}
