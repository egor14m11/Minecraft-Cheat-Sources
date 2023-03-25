package net.minecraft.client.resources;

import java.util.UUID;
import net.minecraft.util.Namespaced;

public class DefaultPlayerSkin
{
    /** The default skin for the Steve model. */
    private static final Namespaced TEXTURE_STEVE = new Namespaced("textures/entity/steve.png");

    /** The default skin for the Alex model. */
    private static final Namespaced TEXTURE_ALEX = new Namespaced("textures/entity/alex.png");

    /**
     * Returns the default skind for versions prior to 1.8, which is always the Steve texture.
     */
    public static Namespaced getDefaultSkinLegacy()
    {
        return TEXTURE_STEVE;
    }

    /**
     * Retrieves the default skin for this player. Depending on the model used this will be Alex or Steve.
     */
    public static Namespaced getDefaultSkin(UUID playerUUID)
    {
        return isSlimSkin(playerUUID) ? TEXTURE_ALEX : TEXTURE_STEVE;
    }

    /**
     * Retrieves the type of skin that a player is using. The Alex model is slim while the Steve model is default.
     */
    public static String getSkinType(UUID playerUUID)
    {
        return isSlimSkin(playerUUID) ? "slim" : "default";
    }

    /**
     * Checks if a players skin model is slim or the default. The Alex model is slime while the Steve model is default.
     */
    private static boolean isSlimSkin(UUID playerUUID)
    {
        return (playerUUID.hashCode() & 1) == 1;
    }
}
