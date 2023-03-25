package org.moonware.client.feature.impl;

import java.awt.*;

public enum Type {

    Combat(new Color(220, 20, 60).getRGB(), new Color(137, 3, 42).getRGB(), "Combat"),
    Movement(new Color(123, 104, 238).getRGB(), new Color(73, 63, 151).getRGB(), "Movement"),
    Visuals(new Color(0, 206, 209).getRGB(), new Color(2, 121, 123).getRGB(), "Visuals"),
    Other(new Color(60, 179, 113).getRGB(), new Color(28, 88, 57).getRGB(), "Other"),
    //Ghost(new Color(90, 10, 190).getRGB(), new Color(90, 10, 120).getRGB(), "Ghost"),
    Hud(new Color(186, 85, 211).getRGB(), new Color(91, 41, 102).getRGB(), "Hud");

    private final int color;
    private final int color2;
    public String icon;

    public String name;

    Type(int color, int color2, String name) {
        this.color = color;
        this.color2 = color2;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }

    public int getColor2() {
        return color2;
    }
}
