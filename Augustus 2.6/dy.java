import com.google.common.collect.ForwardingMultimap;
import java.util.Iterator;
import com.mojang.authlib.properties.Property;
import java.util.UUID;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public final class dy
{
    public static GameProfile a(final dn \u2603) {
        String j = null;
        String i = null;
        if (\u2603.b("Name", 8)) {
            j = \u2603.j("Name");
        }
        if (\u2603.b("Id", 8)) {
            i = \u2603.j("Id");
        }
        if (nx.b(j)) {
            if (nx.b(i)) {
                return null;
            }
        }
        UUID fromString;
        try {
            fromString = UUID.fromString(i);
        }
        catch (Throwable t) {
            fromString = null;
        }
        final GameProfile gameProfile = new GameProfile(fromString, j);
        if (\u2603.b("Properties", 10)) {
            final dn m = \u2603.m("Properties");
            for (final String value : m.c()) {
                final du c = m.c(value, 10);
                for (int k = 0; k < c.c(); ++k) {
                    final dn b = c.b(k);
                    final String l = b.j("Value");
                    if (b.b("Signature", 8)) {
                        gameProfile.getProperties().put(value, new Property(value, l, b.j("Signature")));
                    }
                    else {
                        gameProfile.getProperties().put(value, new Property(value, l));
                    }
                }
            }
        }
        return gameProfile;
    }
    
    public static dn a(final dn \u2603, final GameProfile \u2603) {
        if (!nx.b(\u2603.getName())) {
            \u2603.a("Name", \u2603.getName());
        }
        if (\u2603.getId() != null) {
            \u2603.a("Id", \u2603.getId().toString());
        }
        if (!\u2603.getProperties().isEmpty()) {
            final dn \u26032 = new dn();
            for (final String s : ((ForwardingMultimap<String, V>)\u2603.getProperties()).keySet()) {
                final du \u26033 = new du();
                for (final Property property : ((ForwardingMultimap<String, Object>)\u2603.getProperties()).get(s)) {
                    final dn \u26034 = new dn();
                    \u26034.a("Value", property.getValue());
                    if (property.hasSignature()) {
                        \u26034.a("Signature", property.getSignature());
                    }
                    \u26033.a(\u26034);
                }
                \u26032.a(s, \u26033);
            }
            \u2603.a("Properties", \u26032);
        }
        return \u2603;
    }
    
    public static boolean a(final eb \u2603, final eb \u2603, final boolean \u2603) {
        if (\u2603 == \u2603) {
            return true;
        }
        if (\u2603 == null) {
            return true;
        }
        if (\u2603 == null) {
            return false;
        }
        if (!\u2603.getClass().equals(\u2603.getClass())) {
            return false;
        }
        if (\u2603 instanceof dn) {
            final dn dn = (dn)\u2603;
            final dn dn2 = (dn)\u2603;
            for (final String s : dn.c()) {
                final eb a = dn.a(s);
                if (!a(a, dn2.a(s), \u2603)) {
                    return false;
                }
            }
            return true;
        }
        if (!(\u2603 instanceof du) || !\u2603) {
            return \u2603.equals(\u2603);
        }
        final du du = (du)\u2603;
        final du du2 = (du)\u2603;
        if (du.c() == 0) {
            return du2.c() == 0;
        }
        for (int i = 0; i < du.c(); ++i) {
            final eb g = du.g(i);
            boolean b = false;
            for (int j = 0; j < du2.c(); ++j) {
                if (a(g, du2.g(j), \u2603)) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
