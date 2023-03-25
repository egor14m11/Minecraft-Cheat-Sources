/*
 * Decompiled with CFR 0.150.
 */
package ru.fluger.client.feature.impl;

import java.awt.Color;

public enum Type {
    Combat(new Color(220, 20, 60).getRGB(), new Color(137, 3, 42).getRGB(), "Combat", "Gives a significant advantage in pvp"),
    Movement(new Color(123, 104, 238).getRGB(), new Color(73, 63, 151).getRGB(), "Movement", "Functionality that changes your movement"),
    Visuals(new Color(0, 206, 209).getRGB(), new Color(2, 121, 123).getRGB(), "Visuals", "You can change the visual part of the game"),
    Player(new Color(244, 164, 96).getRGB(), new Color(132, 68, 9).getRGB(), "Player", "Everything related to your player"),
    Misc(new Color(60, 179, 113).getRGB(), new Color(28, 88, 57).getRGB(), "Misc", "Miscellaneous not related to anything specific"),
    Hud(new Color(186, 85, 211).getRGB(), new Color(91, 41, 102).getRGB(), "Hud", "The visual part of the cheat");

    private final int color;
    private final int color2;
    public String name;
    public String discription;

    private Type(int color, int color2, String name, String discrp) {
        this.color = color;
        this.color2 = color2;
        this.name = name;
        this.discription = discrp;
    }

    public String getName() {
        return this.name;
    }

    public int getColor() {
        return this.color;
    }

    public int getColor2() {
        return this.color2;
    }
}

