package be.infernalwhale.springdemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class ElectricalOven implements Oven {
    public ElectricalOven() {
        System.out.println("Creating Electrical Oven");
    }

    @Override
    public void bakePizza() {
        System.out.println("Bzzzzzzzzzzz.... Baking le pizza with electricity...");
    }
}
