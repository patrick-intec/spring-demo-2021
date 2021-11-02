package be.infernalwhale.springdemo.pubsub;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SubscriberB {
    @EventListener
    public void listenToEvent(RequestEvent event) {
        System.out.println("SubscriberB: " + event.getSource());
    }
}
