/*
 * Decompiled with CFR 0.150.
 */
package ru.fluger.client.helpers;

import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import ru.fluger.client.helpers.misc.TimerHelper;

public interface Helper {
    public static final Minecraft mc = Minecraft.getMinecraft();
    public static final Gui gui = new Gui();
    public static final Random random = new Random();
    public static final TimerHelper timerHelper1 = new TimerHelper();
}

