package event;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.concurrent.Executors;

public class EventBusUtil {

    static EventBus eventBus = new AsyncEventBus(Executors.newFixedThreadPool(30));

    public EventBusUtil() {
    }

    public static void post(Object event) {
        eventBus.post(event);
    }

    public static void register(Object handler) {
        eventBus.register(handler);
    }

    public static void unregister(Object handler) {
        eventBus.unregister(handler);
    }
}
