import org.apache.logging.log4j.LogManager;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.Agent;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import com.google.common.base.Predicate;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.Collection;
import net.minecraft.server.MinecraftServer;
import java.io.File;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class lw
{
    private static final Logger e;
    public static final File a;
    public static final File b;
    public static final File c;
    public static final File d;
    
    private static void a(final MinecraftServer \u2603, final Collection<String> \u2603, final ProfileLookupCallback \u2603) {
        final String[] array = Iterators.toArray(Iterators.filter(\u2603.iterator(), new Predicate<String>() {
            public boolean a(final String \u2603) {
                return !nx.b(\u2603);
            }
        }), String.class);
        if (\u2603.af()) {
            \u2603.aE().findProfilesByNames(array, Agent.MINECRAFT, \u2603);
        }
        else {
            for (final String s : array) {
                final UUID a = wn.a(new GameProfile(null, s));
                final GameProfile gameProfile = new GameProfile(a, s);
                \u2603.onProfileLookupSucceeded(gameProfile);
            }
        }
    }
    
    public static String a(final String \u2603) {
        if (nx.b(\u2603) || \u2603.length() > 16) {
            return \u2603;
        }
        final MinecraftServer n = MinecraftServer.N();
        final GameProfile a = n.aF().a(\u2603);
        if (a != null && a.getId() != null) {
            return a.getId().toString();
        }
        if (n.T() || !n.af()) {
            return wn.a(new GameProfile(null, \u2603)).toString();
        }
        final List<GameProfile> arrayList = (List<GameProfile>)Lists.newArrayList();
        final ProfileLookupCallback \u26032 = new ProfileLookupCallback() {
            @Override
            public void onProfileLookupSucceeded(final GameProfile \u2603) {
                n.aF().a(\u2603);
                arrayList.add(\u2603);
            }
            
            @Override
            public void onProfileLookupFailed(final GameProfile \u2603, final Exception \u2603) {
                lw.e.warn("Could not lookup user whitelist entry for " + \u2603.getName(), \u2603);
            }
        };
        a(n, Lists.newArrayList(\u2603), \u26032);
        if (arrayList.size() > 0 && arrayList.get(0).getId() != null) {
            return arrayList.get(0).getId().toString();
        }
        return "";
    }
    
    static {
        e = LogManager.getLogger();
        a = new File("banned-ips.txt");
        b = new File("banned-players.txt");
        c = new File("ops.txt");
        d = new File("white-list.txt");
    }
}
