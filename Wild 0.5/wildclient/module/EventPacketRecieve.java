// 
// Decompiled by Procyon v0.5.36
// 

package black.nigger.wildclient.module;

import net.minecraft.network.Packet;
import com.darkmagician6.eventapi.events.callables.EventCancellable;

public class EventPacketRecieve extends EventCancellable
{
    private Packet packet;
    
    public EventPacketRecieve(final Packet packet) {
        this.packet = packet;
    }
    
    public Packet getPacket() {
        return this.packet;
    }
}
