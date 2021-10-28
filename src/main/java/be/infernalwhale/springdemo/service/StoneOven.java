package be.infernalwhale.springdemo.service;

import org.springframework.stereotype.Component;

//@Component("stone")
public class StoneOven implements Oven {
    public StoneOven() {
        System.out.println("Building a Stone Oven");
    }

    @Override
    public void bakePizza() {
        System.out.println("Baking the pizza....");
    }
}
