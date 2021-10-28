package be.infernalwhale.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.json.BasicJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Component;

@Component
public class PizzaService {
    private Oven oven;

    @Value("${object}")
    private String hello;

    @Value("${number}")
    private Integer number;

    @Value("${pi}")
    private Double pi;

    @Value("hello world")
    private String helloWorld;

    public PizzaService() {
        System.out.println("Creating Pizza Service");
    }

    public Oven getOven() {
        return oven;
    }

    @Autowired(required = false)
    public PizzaService setOven(Oven oven) {
        if (oven == null) this.oven = new Oven() {
            @Override
            public void bakePizza() {

            }
        };
        this.oven = oven;
        return this;
    }

    public void checkOven() {
        System.out.println(pi);

    }
}
