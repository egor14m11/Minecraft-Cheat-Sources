package ua.apraxia.eventapi.events.impl.render;

import ua.apraxia.eventapi.events.callables.EventCancellable;
import net.minecraft.entity.EntityLivingBase;

public class EventRenderPlayerName extends EventCancellable {
    private final EntityLivingBase entity;
    private String renderedName;

    public EventRenderPlayerName(EntityLivingBase entity, String renderedName) {
        this.entity = entity;
        this.renderedName = renderedName;
    }

    public EntityLivingBase getEntity() {
        return this.entity;
    }

    public String getRenderedName() {
        return this.renderedName;
    }

    public void setRenderedName(String renderedName) {
        this.renderedName = renderedName;
    }

}
