package be.infernalwhale.springdemo.pubsub;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SubscriberC {
    @EventListener
    public void listenToEvent(DataEvent event) {
        System.out.println("SubscriberC: " + event.getSource());
    }
}
