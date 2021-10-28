package be.infernalwhale.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PizzaService {
    @Autowired
    private List<Oven> ovens;

    public PizzaService() {
        System.out.println("Creating Pizza Service -> " + ovens);
    }

    public void checkOvens() {
        System.out.println(ovens.size());

        ovens.forEach(oven -> oven.bakePizza());
    }

}
