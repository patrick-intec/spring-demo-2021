package be.infernalwhale.springdemo.pubsub;

import org.springframework.context.ApplicationEvent;

public class RequestEvent extends DataEvent {
    public RequestEvent(Object source) {
        super(source);
    }
}
