package be.infernalwhale.springdemo.pubsub;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Publisher {
    private ApplicationEventPublisher eventPublisher;

    public Publisher(ApplicationEventPublisher publisher) {
        System.out.println("Publisher created");
        this.eventPublisher = publisher;
    }

    public void sendEvent() {
        System.out.println("Sending event");
        eventPublisher.publishEvent(new RequestEvent("A requestEvent... Let's see who's listening"));
    }
}
