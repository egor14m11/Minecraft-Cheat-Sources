package zamorozka.ui;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

@FunctionalInterface
public interface ICheck {
    Minecraft mc = Minecraft.getMinecraft();

    boolean validate(Entity paramEntity);
}
