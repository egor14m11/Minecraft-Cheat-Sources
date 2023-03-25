package fun.expensive.client.feature.impl.hud;

import fun.rich.client.Rich;
import fun.rich.client.event.EventTarget;
import fun.rich.client.event.events.impl.render.EventRender2D;
import fun.rich.client.feature.Feature;
import fun.rich.client.feature.impl.FeatureCategory;
import fun.rich.client.ui.settings.impl.BooleanSetting;
import fun.rich.client.ui.settings.impl.ColorSetting;
import fun.rich.client.ui.settings.impl.ListSetting;
import fun.rich.client.ui.settings.impl.NumberSetting;
import fun.rich.client.utils.math.AnimationHelper;
import fun.rich.client.utils.render.ClientHelper;
import fun.rich.client.utils.render.GLUtils;
import fun.rich.client.utils.render.RenderUtils;
import fun.rich.client.utils.Helper;
import net.minecraft.potion.PotionEffect;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

import java.awt.*;
import java.util.Comparator;
import java.util.List;

public class FeatureList extends Feature {
    public float scale = 2;
    public static ListSetting colorList = new ListSetting("ArrayList Color", "Astolfo", () -> true, "Astolfo", "Rainbow", "Fade", "Custom");
    public static ListSetting fontList = new ListSetting("ArrayList Font", "Rubik", () -> true, "Rubik", "SF-UI", "Myseo", "Tahoma");
    public static BooleanSetting background = new BooleanSetting("Background", true, () -> true);
    public static ListSetting backGroundColorMode = new ListSetting("Background Color", "Custom", () -> background.getBoolValue(), "Custom", "Client");
    public NumberSetting offsetY = new NumberSetting("Offset Y", 9, 3, 10, 0.01f, () -> true);

    public ColorSetting backGroundColor = new ColorSetting("Color", new Color(17, 17, 17, 180).getRGB(), () -> background.getBoolValue() && backGroundColorMode.currentMode.equals("Custom"));
    public BooleanSetting rightBorder = new BooleanSetting("Right Border", true, () -> true);
    public BooleanSetting onlyBinds = new BooleanSetting("Only Binds", false, () -> true);
    public BooleanSetting noVisualModules = new BooleanSetting("No Visual Modules", false, () -> true);
    public BooleanSetting glow = new BooleanSetting("Glow", false, () -> true);
    public ColorSetting glowColor = new ColorSetting("Glow Color", new Color(0xFFFFFF).getRGB(), () -> glow.getBoolValue());
    public NumberSetting glowRadius = new NumberSetting("Glow Radius", 10, 0, 50, 1, () -> glow.getBoolValue());
    public NumberSetting glowAlpha = new NumberSetting("Glow Alpha", 80, 30, 255, 1, () -> glow.getBoolValue());
    public static ColorSetting oneColor = new ColorSetting("One Color", new Color(0xFFFFFF).getRGB(), () -> colorList.currentMode.equals("Custom") || colorList.currentMode.equals("Fade"));
    public static ColorSetting twoColor = new ColorSetting("Two Color", new Color(0xFFFFFF).getRGB(), () -> colorList.currentMode.equals("Custom"));


    public FeatureList() {
        super("ArrayList", "���������� ������ ���������� ������� �� ������", FeatureCategory.Hud);
        addSettings(colorList, oneColor, twoColor, fontList, onlyBinds, noVisualModules, background, backGroundColorMode, backGroundColor, rightBorder, glow, glowRadius, glowColor, glowAlpha, offsetY);
    }


    @EventTarget
    public void Event2D(EventRender2D event) {
        if (!isEnabled()) return;
        List<Feature> activeModules = Rich.instance.featureManager.getAllFeatures();
        activeModules.sort(Comparator.comparingDouble(s -> -ClientHelper.getFontRender().getStringWidth(s.getSuffix())));
        float displayWidth = event.getResolution().getScaledWidth() * (event.getResolution().getScaleFactor() / 2F);
        float yPotionOffset = 2;
        for (PotionEffect potionEffect : Helper.mc.player.getActivePotionEffects()) {
            if (potionEffect.getPotion().isBeneficial()) {
                yPotionOffset = 30;
            }
            if (potionEffect.getPotion().isBadEffect()) {
                yPotionOffset = 30 * 2;
            }
        }
        int y = (int) (5 + yPotionOffset);
        int yTotal = 0;
        for (int i = 0; i < Rich.instance.featureManager.getAllFeatures().size(); ++i) {
            yTotal += ClientHelper.getFontRender().getFontHeight() + 3;
        }

        for (Feature module : activeModules) {
            module.animYto = AnimationHelper.Move(module.animYto, (float) (module.isEnabled() ? 1 : 0), (float) (6.5f * Rich.deltaTime()), (float) (6.5f * Rich.deltaTime()), (float) Rich.deltaTime());
            if (module.animYto > 0.01f) {
                if (module.getSuffix().equals("ClickGui") || noVisualModules.getBoolValue() && module.getCategory() == FeatureCategory.Visuals || onlyBinds.getBoolValue() && module.getBind() == 0)
                    continue;
                GL11.glPushMatrix();
                GL11.glTranslated(1, y, 1);
                GL11.glScaled(1, module.animYto, 1);
                GL11.glTranslated(-1, -y, 1);

                if (glow.getBoolValue()) {
                    RenderUtils.drawBlurredShadow(displayWidth - ClientHelper.getFontRender().getStringWidth(module.getSuffix()) - 3, (float) y, displayWidth, offsetY.getNumberValue() /** module.animYto*/, (int) glowRadius.getNumberValue(), RenderUtils.injectAlpha(new Color(glowColor.getColorValue()), (int) glowAlpha.getNumberValue()));
                }
                if (background.getBoolValue()) {
                    RenderUtils.drawRect(displayWidth - ClientHelper.getFontRender().getStringWidth(module.getSuffix()) - 3, y, displayWidth, y + offsetY.getNumberValue()/** module.animYto*/, backGroundColorMode.currentMode.equals("Client") ? RenderUtils.injectAlpha(ClientHelper.getClientColor(y, yTotal, 5), 90).getRGB() : backGroundColor.getColorValue());
                }

                if (rightBorder.getBoolValue()) {
                    RenderUtils.drawRect(displayWidth - 1, y, displayWidth, y + offsetY.getNumberValue() /** module.animYto*/, ClientHelper.getClientColor(y, yTotal, 5).getRGB());
                }
                float f = fontList.currentMode.equalsIgnoreCase("Tahoma") ? 1f : 0f;
                ClientHelper.getFontRender().drawString(module.getSuffix(), displayWidth - ClientHelper.getFontRender().getStringWidth(module.getSuffix()) - 2, y + ClientHelper.getFontRender().getFontHeight() - 3 - f/* * module.animYto*/, ClientHelper.getClientColor(y, yTotal, 5).getRGB());
                y += offsetY.getNumberValue() * module.animYto;
                GL11.glPopMatrix();
            }
        }
    }

}
