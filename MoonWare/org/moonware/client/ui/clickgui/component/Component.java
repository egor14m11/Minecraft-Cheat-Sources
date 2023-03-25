package org.moonware.client.ui.clickgui.component;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import org.moonware.client.MoonWare;
import org.moonware.client.feature.Feature;
import org.moonware.client.feature.impl.hud.HUD;
import org.moonware.client.helpers.Helper;
import org.moonware.client.helpers.misc.ClientHelper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Component implements Helper {

    public final Component parent;
    protected final List<Component> components = new ArrayList<>();
    private final String name;
    private int x;
    private int y;
    private int width;
    private int height;

    public Component(Component parent, String name, int x, int y, int width, int height) {
        this.parent = parent;
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Component getParent() {
        return parent;
    }

    public void drawComponent(ScaledResolution scaledResolution, int mouseX, int mouseY) {
        for (Component child : components) {
            child.drawComponent(scaledResolution, mouseX, mouseY);
        }
    }

    public void onMouseClick(int mouseX, int mouseY, int button) {
        for (Component child : components) {
            child.onMouseClick(mouseX, mouseY, button);
        }
    }

    public void onMouseRelease(int button) {
        for (Component child : components) {
            child.onMouseRelease(button);
        }
    }

    public void onKeyPress(int keyCode) {
        for (Component child : components) {
            child.onKeyPress(keyCode);
        }
    }

    public String getName() {
        return name;
    }
    public Feature getsortLabel() {
        MoonWare.featureManager.getFeatureList().sort(Comparator.comparingInt(feature -> !HUD.font.currentMode.equals("Minecraft") ? -ClientHelper.getFontRender().getWidth(feature.getLabel()) : -Minecraft.font.getStringWidth(feature.getLabel())));
        for (Feature feature : MoonWare.featureManager.getFeatureList()) {
            
        }
        return null;
    }

    public int getX() {
        Component familyMember = parent;
        int familyTreeX = x;

        while (familyMember != null) {
            familyTreeX += familyMember.x;
            familyMember = familyMember.parent;
        }

        return familyTreeX;
    }

    public int posX() {
        Component familyMember = parent;
        int familyTreeX = x;

        while (familyMember != null) {
            familyTreeX += familyMember.x;
            familyMember = familyMember.parent;
        }

        return familyTreeX;
    }
    public void setX(int x) {
        this.x = x;
    }

    protected boolean isHovered(int mouseX, int mouseY) {
        int x;
        int y;
        return mouseX >= (x = getX()) && mouseY >= (y = getY()) && mouseX < x + getWidth() && mouseY < y + getHeight();
    }

    public int getY() {
        Component familyMember = parent;
        int familyTreeY = y;

        while (familyMember != null) {
            familyTreeY += familyMember.y;
            familyMember = familyMember.parent;
        }

        return familyTreeY;
    }
    public int posY() {
        Component familyMember = parent;
        int familyTreeY = y;

        while (familyMember != null) {
            familyTreeY += familyMember.y;
            familyMember = familyMember.parent;
        }

        return familyTreeY;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Component> getComponents() {
        return components;
    }
}
