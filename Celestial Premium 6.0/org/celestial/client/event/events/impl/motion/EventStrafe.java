/*
 * Decompiled with CFR 0.150.
 */
package org.celestial.client.event.events.impl.motion;

import org.celestial.client.event.events.callables.EventCancellable;

public class EventStrafe
extends EventCancellable {
    private float yaw;
    private float strafe;
    private float forward;
    private float friction;

    public EventStrafe(float yaw, float strafe, float forward, float friction) {
        this.yaw = yaw;
        this.strafe = strafe;
        this.forward = forward;
        this.friction = friction;
    }

    public float getStrafe() {
        return this.strafe;
    }

    public void setStrafe(float strafe) {
        this.strafe = strafe;
    }

    public float getForward() {
        return this.forward;
    }

    public void setForward(float forward) {
        this.forward = forward;
    }

    public float getFriction() {
        return this.friction;
    }

    public void setFriction(float friction) {
        this.friction = friction;
    }

    public float getYaw() {
        return this.yaw;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }
}

