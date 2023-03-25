package org.moonware.client.feature.impl.visual;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.EnumHandSide;
import org.moonware.client.event.EventTarget;
import org.moonware.client.event.events.impl.player.EventTransformSideFirstPerson;
import org.moonware.client.feature.Feature;
import org.moonware.client.feature.impl.Type;
import org.moonware.client.settings.impl.NumberSetting;

public class ViewModel extends Feature {

    public static NumberSetting rightx;
    public static NumberSetting righty;
    public static NumberSetting rightz;
    public static NumberSetting leftx;
    public static NumberSetting lefty;
    public static NumberSetting leftz;

    public ViewModel() {
        super("ViewModel", "Позволяет редактировать позицию предметов в руке", Type.Visuals);
        rightx = new NumberSetting("RightX", 0, -2, 2, 0.1F, () -> true);
        righty = new NumberSetting("RightY", 0.2F, -2, 2, 0.1F, () -> true);
        rightz = new NumberSetting("RightZ", 0.2F, -2, 2, 0.1F, () -> true);
        leftx = new NumberSetting("LeftX", 0, -2, 2, 0.1F, () -> true);
        lefty = new NumberSetting("LeftY", 0.2F, -2, 2, 0.1F, () -> true);
        leftz = new NumberSetting("LeftZ", 0.2F, -2, 2, 0.1F, () -> true);
        addSettings(rightx, righty, rightz, leftx, lefty, leftz);
    }

    @EventTarget
    public void onSidePerson(EventTransformSideFirstPerson event) {
        if (event.getEnumHandSide() == EnumHandSide.RIGHT) {
            GlStateManager.translate(rightx.getNumberValue(), righty.getNumberValue(), rightz.getNumberValue());
        }
        if (event.getEnumHandSide() == EnumHandSide.LEFT) {
            GlStateManager.translate(-leftx.getNumberValue(), lefty.getNumberValue(), leftz.getNumberValue());
        }
    }
}