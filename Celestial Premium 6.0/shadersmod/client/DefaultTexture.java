/*
 * Decompiled with CFR 0.150.
 */
package shadersmod.client;

import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.resources.IResourceManager;
import shadersmod.client.ShadersTex;

public class DefaultTexture
extends AbstractTexture {
    public DefaultTexture() {
        this.loadTexture(null);
    }

    @Override
    public void loadTexture(IResourceManager resourcemanager) {
        int[] aint = ShadersTex.createAIntImage(1, -1);
        ShadersTex.setupTexture(this.getMultiTexID(), aint, 1, 1, false, false);
    }
}

