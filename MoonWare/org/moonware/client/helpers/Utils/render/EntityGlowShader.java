package org.moonware.client.helpers.Utils.render;


import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL20;
import org.moonware.client.ui.shader.FramebufferShader;

public class EntityGlowShader extends FramebufferShader {

    public static EntityGlowShader GLOW_SHADER = new EntityGlowShader();

    public EntityGlowShader() {
        super("entityGlow.frag");
    }

    @Override
    public void setupUniforms() {
        setupUniform("texture");
        setupUniform("texelSize");
        setupUniform("color");
        setupUniform("divider");
        setupUniform("radius");
        setupUniform("maxSample");
    }

    @Override
    public void updateUniforms() {
        GL20.glUniform1i(getUniform("texture"), 0);
        GL20.glUniform2f(getUniform("texelSize"), 1F / Minecraft.width * (radius * quality), 1F / Minecraft.height * (radius * quality));
        GL20.glUniform3f(getUniform("color"), red, green, blue);
        GL20.glUniform1f(getUniform("divider"), 140F);
        GL20.glUniform1f(getUniform("radius"), radius);
        GL20.glUniform1f(getUniform("maxSample"), 10F);
    }
}
