package Celestial.ui.celestun4ik.component.impl;

import Celestial.Smertnix;
import Celestial.module.impl.Render.ClickGUI;
import Celestial.ui.celestun4ik.component.Component;
import Celestial.ui.celestun4ik.component.PropertyComponent;
import Celestial.ui.settings.Setting;
import Celestial.ui.settings.impl.BooleanSetting;
import Celestial.utils.math.AnimationHelper;
import Celestial.utils.render.RenderUtils;
import Celestial.utils.render.RoundedUtil;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

import java.awt.*;


public class BooleanSettingComponent extends Celestial.ui.celestun4ik.component.Component implements PropertyComponent {
    public float textHoverAnimate = 0f;
    public float leftRectAnimation = 0;
    public float rightRectAnimation = 0;
    public BooleanSetting booleanSetting;
    Minecraft mc = Minecraft.getMinecraft();

    public BooleanSettingComponent(Component parent, BooleanSetting booleanSetting, int x, int y, int width, int height) {
        super(parent, booleanSetting.getName(), x, y, width, height);
        this.booleanSetting = booleanSetting;
    }

    @Override
    public void drawComponent(ScaledResolution scaledResolution, int mouseX, int mouseY) {
        if (booleanSetting.isVisible()) {
            ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft());
            GlStateManager.pushMatrix();
            GL11.glEnable(GL11.GL_SCISSOR_TEST);
            RenderUtils.scissorRect(0, 25.5f, sr.getScaledWidth(), 239);
            int x = getX();
            int y = getY();
            int width = getWidth();
            int height = getHeight();
            int middleHeight = getHeight() / 2;
            boolean hovered = isHovered(mouseX, mouseY);
            mc.mntsb_14.drawString(getName(), x - 2, y + middleHeight, Smertnix.instance.featureManager.getFeature(parent.getName()).isEnabled() ? Color.WHITE.getRGB() : Color.BLACK.getRGB());
            textHoverAnimate = AnimationHelper.animation(textHoverAnimate, hovered ? 2.3f : 2, 0);
            leftRectAnimation = AnimationHelper.animation(leftRectAnimation, booleanSetting.getCurrentValue() ? 10 : 19, 0);
            rightRectAnimation = AnimationHelper.animation(rightRectAnimation, (booleanSetting.getCurrentValue() ? 3 : 12), 0);
            if (ClickGUI.shadow.getCurrentValue()) {
                RenderUtils.drawBlurredShadow(x + width - 18 + 2.5f - 7, y + 2 + 7, x + width + 1 - (x + width - 18 + 1) + 1, y + height - 5 - 3.5f - (y + 7), 7, new Color(250, 250, 250));
            }
            RoundedUtil.drawRound(x + width - 18 + 2 - 7, y + 2 + 7, x + width + 1 - (x + width - 18 + 1) + 2, y + height - 5 - 3.5f - (y + 7), 4, booleanSetting.getCurrentValue() ? new Color(ClickGUI.color.getColorValue()) : new Color(124, 147, 155));
            RoundedUtil.drawRound(x + width - leftRectAnimation + 3 - 5, y + 1 + 2 + 7.5f , x + width - rightRectAnimation - (x + width - leftRectAnimation), y + height - 7 - 4.5f - (y + 7.5f)+ 0.5f, 3, Color.WHITE);
            /*
            if (hovered) {
                if (booleanSetting.getDesc() != null) {
                    RenderUtils.drawSmoothRect(x + width + 20, y + height / 1.5F + 4.5F, x + width + 25 + mc.rubik_18.getStringWidth(booleanSetting.getDesc()), y + 6.5F, new Color(0, 0, 0, 80).getRGB());
                    mc.rubik_18.drawString(booleanSetting.getDesc(), x + width + 22, y + height / 1.35F - 5F, 0);
                }
            }*/
            GL11.glDisable(GL11.GL_SCISSOR_TEST);
            GlStateManager.popMatrix();
        }
    }

    @Override
    public void onMouseClick(int mouseX, int mouseY, int button) {
        if (button == 0 && isHovered(mouseX, mouseY) && booleanSetting.isVisible()) {
            booleanSetting.setBoolValue(!booleanSetting.getCurrentValue());
        }
    }

    @Override
    public Setting getSetting() {
        return booleanSetting;
    }
}
