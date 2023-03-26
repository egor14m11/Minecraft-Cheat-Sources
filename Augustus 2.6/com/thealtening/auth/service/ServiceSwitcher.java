// 
// Decompiled by Procyon v0.5.36
// 

package com.thealtening.auth.service;

import java.net.URL;

public final class ServiceSwitcher
{
    private final String MINECRAFT_SESSION_SERVICE_CLASS = "com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService";
    private final String MINECRAFT_AUTHENTICATION_SERVICE_CLASS = "com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication";
    private final String[] WHITELISTED_DOMAINS;
    private final FieldAdapter minecraftSessionServer;
    private final FieldAdapter userAuthentication;
    
    public ServiceSwitcher() {
        this.WHITELISTED_DOMAINS = new String[] { ".minecraft.net", ".mojang.com", ".thealtening.com" };
        this.minecraftSessionServer = new FieldAdapter("com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService");
        this.userAuthentication = new FieldAdapter("com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication");
        try {
            this.minecraftSessionServer.updateFieldIfPresent("WHITELISTED_DOMAINS", this.WHITELISTED_DOMAINS);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public AlteningServiceType switchToService(final AlteningServiceType service) {
        try {
            final String authServer = service.getAuthServer();
            final FieldAdapter userAuth = this.userAuthentication;
            userAuth.updateFieldIfPresent("BASE_URL", authServer);
            userAuth.updateFieldIfPresent("ROUTE_AUTHENTICATE", new URL(authServer + "authenticate"));
            userAuth.updateFieldIfPresent("ROUTE_INVALIDATE", new URL(authServer + "invalidate"));
            userAuth.updateFieldIfPresent("ROUTE_REFRESH", new URL(authServer + "refresh"));
            userAuth.updateFieldIfPresent("ROUTE_VALIDATE", new URL(authServer + "validate"));
            userAuth.updateFieldIfPresent("ROUTE_SIGNOUT", new URL(authServer + "signout"));
            final String sessionServer = service.getSessionServer();
            final FieldAdapter userSession = this.minecraftSessionServer;
            userSession.updateFieldIfPresent("BASE_URL", sessionServer + "session/minecraft/");
            userSession.updateFieldIfPresent("JOIN_URL", new URL(sessionServer + "session/minecraft/join"));
            userSession.updateFieldIfPresent("CHECK_URL", new URL(sessionServer + "session/minecraft/hasJoined"));
        }
        catch (Exception ignored) {
            ignored.printStackTrace();
            return AlteningServiceType.MOJANG;
        }
        return service;
    }
}
