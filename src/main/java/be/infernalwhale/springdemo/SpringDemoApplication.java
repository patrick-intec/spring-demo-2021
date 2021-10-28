package be.infernalwhale.springdemo;

import be.infernalwhale.springdemo.service.StoneOven;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        // Persistence Context >> a collection in the
        // EntityManager which holds all the given entities

        // Application Context >> a collection in the SpringFramework
        // which holds all the defined beans
        ApplicationContext context =
            SpringApplication.run(SpringDemoApplication.class, args);

        StoneOven o1 = context.getBean(StoneOven.class);
        StoneOven o2 = context.getBean(StoneOven.class);

        System.out.println(o1 == o2);

    }
}
