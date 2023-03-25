package org.moonware.client.event.events.impl.motion;


import org.moonware.client.event.events.Event;

public class EventStep implements Event {

    private final boolean pre;
    private double stepHeight;

    public EventStep(boolean pre, double stepHeight) {
        this.pre = pre;
        this.stepHeight = stepHeight;
    }

    public boolean isPre() {
        return pre;
    }

    public double getStepHeight() {
        return stepHeight;
    }

    public void setStepHeight(double stepHeight) {
        this.stepHeight = stepHeight;
    }
}