package org.moonware.client.event.events.impl.packet;

import net.minecraft.network.Packet;
import org.moonware.client.event.events.callables.EventCancellable;

public class EventReceivePacket extends EventCancellable {

    private Packet<?> packet;

    public EventReceivePacket(Packet<?> packet) {
        this.packet = packet;
    }

    public Packet<?> getPacket() {
        return packet;
    }

    public void setPacket(Packet<?> packet) {
        this.packet = packet;
    }
}
