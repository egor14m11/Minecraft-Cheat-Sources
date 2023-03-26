import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import com.mojang.authlib.properties.Property;
import com.google.common.collect.Multimap;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.google.common.collect.Maps;
import java.awt.image.BufferedImage;
import com.google.common.cache.CacheLoader;
import java.util.concurrent.TimeUnit;
import com.google.common.cache.CacheBuilder;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.util.Map;
import com.mojang.authlib.GameProfile;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.File;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.5.36
// 

public class bnp
{
    private static final ExecutorService a;
    private final bmj b;
    private final File c;
    private final MinecraftSessionService d;
    private final LoadingCache<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> e;
    
    public bnp(final bmj \u2603, final File \u2603, final MinecraftSessionService \u2603) {
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build((CacheLoader<? super GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>>)new CacheLoader<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>>() {
            public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(final GameProfile \u2603) throws Exception {
                return ave.A().aa().getTextures(\u2603, false);
            }
        });
    }
    
    public jy a(final MinecraftProfileTexture \u2603, final MinecraftProfileTexture.Type \u2603) {
        return this.a(\u2603, \u2603, null);
    }
    
    public jy a(final MinecraftProfileTexture \u2603, final MinecraftProfileTexture.Type \u2603, final a \u2603) {
        final jy jy = new jy("skins/" + \u2603.getHash());
        final bmk b = this.b.b(jy);
        if (b != null) {
            if (\u2603 != null) {
                \u2603.a(\u2603, jy, \u2603);
            }
        }
        else {
            final File parent = new File(this.c, (\u2603.getHash().length() > 2) ? \u2603.getHash().substring(0, 2) : "xx");
            final File \u26032 = new File(parent, \u2603.getHash());
            final bfm bfm = (\u2603 == MinecraftProfileTexture.Type.SKIN) ? new bfs() : null;
            final bma \u26033 = new bma(\u26032, \u2603.getUrl(), bmz.a(), new bfm() {
                @Override
                public BufferedImage a(BufferedImage \u2603) {
                    if (bfm != null) {
                        \u2603 = bfm.a(\u2603);
                    }
                    return \u2603;
                }
                
                @Override
                public void a() {
                    if (bfm != null) {
                        bfm.a();
                    }
                    if (\u2603 != null) {
                        \u2603.a(\u2603, jy, \u2603);
                    }
                }
            });
            this.b.a(jy, \u26033);
        }
        return jy;
    }
    
    public void a(final GameProfile \u2603, final a \u2603, final boolean \u2603) {
        bnp.a.submit(new Runnable() {
            @Override
            public void run() {
                final Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> hashMap = (Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>)Maps.newHashMap();
                try {
                    hashMap.putAll(bnp.this.d.getTextures(\u2603, \u2603));
                }
                catch (InsecureTextureException ex) {}
                if (hashMap.isEmpty() && \u2603.getId().equals(ave.A().L().e().getId())) {
                    \u2603.getProperties().clear();
                    \u2603.getProperties().putAll(ave.A().N());
                    hashMap.putAll(bnp.this.d.getTextures(\u2603, false));
                }
                ave.A().a(new Runnable() {
                    @Override
                    public void run() {
                        if (hashMap.containsKey(MinecraftProfileTexture.Type.SKIN)) {
                            bnp.this.a(hashMap.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, \u2603);
                        }
                        if (hashMap.containsKey(MinecraftProfileTexture.Type.CAPE)) {
                            bnp.this.a(hashMap.get(MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, \u2603);
                        }
                    }
                });
            }
        });
    }
    
    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(final GameProfile \u2603) {
        return this.e.getUnchecked(\u2603);
    }
    
    static {
        a = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
    }
    
    public interface a
    {
        void a(final MinecraftProfileTexture.Type p0, final jy p1, final MinecraftProfileTexture p2);
    }
}
