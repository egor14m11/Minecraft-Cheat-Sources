package Celestial.event.events.impl.input;

import Celestial.event.events.Event;

public class EventInputKey implements Event {

    private int key;

    public EventInputKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
