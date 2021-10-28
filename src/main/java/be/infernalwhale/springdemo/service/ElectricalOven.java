package be.infernalwhale.springdemo.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ElectricalOven implements Oven {
    public ElectricalOven() {
        System.out.println("Creating Electrical Oven");
    }

    @Override
    public void bakePizza() {
        System.out.println("Bzzzzzzzzzzz.... Baking le pizza with electricity...");
    }
}
