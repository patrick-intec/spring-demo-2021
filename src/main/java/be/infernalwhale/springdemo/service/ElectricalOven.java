package be.infernalwhale.springdemo.service;

import org.springframework.stereotype.Component;

@Component
public class ElectricalOven implements Oven {
    @Override
    public void bakePizza() {
        System.out.println("Bzzzzzzzzzzz.... Baking le pizza with electricity...");
    }
}
