// 
// Decompiled by Procyon v0.5.36
// 

package de.gerrygames.viarewind;

import de.gerrygames.viarewind.api.ViaRewindConfig;
import de.gerrygames.viarewind.api.ViaRewindPlatform;

public class ViaRewind
{
    private static ViaRewindPlatform platform;
    private static ViaRewindConfig config;
    
    public static void init(final ViaRewindPlatform platform, final ViaRewindConfig config) {
        ViaRewind.platform = platform;
        ViaRewind.config = config;
    }
    
    public static ViaRewindPlatform getPlatform() {
        return ViaRewind.platform;
    }
    
    public static ViaRewindConfig getConfig() {
        return ViaRewind.config;
    }
}
