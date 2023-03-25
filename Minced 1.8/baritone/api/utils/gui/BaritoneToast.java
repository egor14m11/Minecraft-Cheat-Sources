/*
 * This file is part of Baritone.
 *
 * Baritone is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Baritone is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Baritone.  If not, see <https://www.gnu.org/licenses/>.
 */

package baritone.api.utils.gui;

import net.minecraft.client.gui.toasts.GuiToast;
import net.minecraft.client.gui.toasts.IToast;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class BaritoneToast implements IToast {
    private String title;
    private String subtitle;
    private long firstDrawTime;
    private boolean newDisplay;
    private long totalShowTime;

    public BaritoneToast(ITextComponent titleComponent, ITextComponent subtitleComponent, long totalShowTime) {
        this.title = titleComponent.getFormattedText();
        this.subtitle = subtitleComponent == null ? null : subtitleComponent.getFormattedText();
        this.totalShowTime = totalShowTime;
    }

    public void setDisplayedText(ITextComponent titleComponent, ITextComponent subtitleComponent) {
        this.title = titleComponent.getFormattedText();
        this.subtitle = subtitleComponent == null ? null : subtitleComponent.getFormattedText();
        this.newDisplay = true;
    }

    public static void addOrUpdate(GuiToast toast, ITextComponent title, ITextComponent subtitle, long totalShowTime) {
        BaritoneToast baritonetoast = toast.getToast(BaritoneToast.class, new Object());

        if (baritonetoast == null) {
            toast.add(new BaritoneToast(title, subtitle, totalShowTime));
        } else {
            baritonetoast.setDisplayedText(title, subtitle);
        }
    }

    public static void addOrUpdate(ITextComponent title, ITextComponent subtitle) {
        addOrUpdate(net.minecraft.client.Minecraft.getMinecraft().getToastGui(), title, subtitle, baritone.api.BaritoneAPI.getSettings().toastTimer.value);
    }

    @Override
    public Visibility func_193653_a(GuiToast toastGui, long delta) {
        if (this.newDisplay) {
            this.firstDrawTime = delta;
            this.newDisplay = false;
        }

        toastGui.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("textures/gui/toasts.png"));
        GlStateManager.color(1.0F, 1.0F, 1.0F, 255.0f);
        toastGui.drawTexturedModalRect(0, 0, 0, 32, 160, 32);

        if (this.subtitle == null) {
            toastGui.getMinecraft().rubik_16.drawString(this.title, 18, 12, -11534256);
        } else {
            toastGui.getMinecraft().rubik_16.drawString(this.title, 18, 7, -11534256);
            toastGui.getMinecraft().rubik_16.drawString(this.subtitle, 18, 18, -16777216);
        }

        return delta - this.firstDrawTime < totalShowTime ? Visibility.SHOW : Visibility.HIDE;
    }
}
