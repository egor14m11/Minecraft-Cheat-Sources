/*
 * Decompiled with CFR 0.150.
 */
package org.moonware.client.helpers.render.animations;

import org.moonware.client.helpers.render.Animation;

public class Quint
extends Animation {
    @Override
    public float easeIn(float t, float b, float c, float d) {
        return c * (t /= d) * t * t * t * t + b;
    }

    @Override
    public float easeIn(float t, float b, float c, float d, float s) {
        return 0.0f;
    }

    @Override
    public float easeOut(float t, float b, float c, float d) {
        t = t / d - 1.0f;
        return c * (t * t * t * t * t + 1.0f) + b;
    }

    @Override
    public float easeOut(float t, float b, float c, float d, float s) {
        return 0.0f;
    }

    @Override
    public float easeInOut(float t, float b, float c, float d) {
        float f=0;
        t /= d / 2.0f;
        if (f < 1.0f) {
            return c / 2.0f * t * t * t * t * t + b;
        }
        return c / 2.0f * ((t -= 2.0f) * t * t * t * t + 2.0f) + b;
    }

    @Override
    public float easeInOut(float t, float b, float c, float d, float s) {
        return 0.0f;
    }
}

