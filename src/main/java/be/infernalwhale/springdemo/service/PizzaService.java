package be.infernalwhale.springdemo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class PizzaService {
    public PizzaService(@Qualifier("stone") Oven oven) {
        System.out.println("Creating Pizza Service");

        oven.bakePizza();
    }
}
