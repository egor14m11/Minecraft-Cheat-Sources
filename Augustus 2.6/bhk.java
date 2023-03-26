import java.util.UUID;
import java.util.Map;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class bhk extends bhd<alo>
{
    private static final jy d;
    private static final jy e;
    private static final jy f;
    private static final jy g;
    public static bhk c;
    private final bbz h;
    private final bbz i;
    
    public bhk() {
        this.h = new bbz(0, 0, 64, 32);
        this.i = new bbi();
    }
    
    @Override
    public void a(final alo \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final int \u2603) {
        final cq a = cq.a(\u2603.u() & 0x7);
        this.a((float)\u2603, (float)\u2603, (float)\u2603, a, \u2603.d() * 360 / 16.0f, \u2603.c(), \u2603.b(), \u2603);
    }
    
    @Override
    public void a(final bhc \u2603) {
        super.a(\u2603);
        bhk.c = this;
    }
    
    public void a(final float \u2603, final float \u2603, final float \u2603, final cq \u2603, float \u2603, final int \u2603, final GameProfile \u2603, final int \u2603) {
        bbo bbo = this.h;
        if (\u2603 >= 0) {
            this.a(bhk.a[\u2603]);
            bfl.n(5890);
            bfl.E();
            bfl.a(4.0f, 2.0f, 1.0f);
            bfl.b(0.0625f, 0.0625f, 0.0625f);
            bfl.n(5888);
        }
        else {
            switch (\u2603) {
                default: {
                    this.a(bhk.d);
                    break;
                }
                case 1: {
                    this.a(bhk.e);
                    break;
                }
                case 2: {
                    this.a(bhk.f);
                    bbo = this.i;
                    break;
                }
                case 3: {
                    bbo = this.i;
                    jy \u26032 = bmz.a();
                    if (\u2603 != null) {
                        final ave a = ave.A();
                        final Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a2 = a.ab().a(\u2603);
                        if (a2.containsKey(MinecraftProfileTexture.Type.SKIN)) {
                            \u26032 = a.ab().a(a2.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
                        }
                        else {
                            final UUID a3 = wn.a(\u2603);
                            \u26032 = bmz.a(a3);
                        }
                    }
                    this.a(\u26032);
                    break;
                }
                case 4: {
                    this.a(bhk.g);
                    break;
                }
            }
        }
        bfl.E();
        bfl.p();
        if (\u2603 != cq.b) {
            switch (bhk$1.a[\u2603.ordinal()]) {
                case 1: {
                    bfl.b(\u2603 + 0.5f, \u2603 + 0.25f, \u2603 + 0.74f);
                    break;
                }
                case 2: {
                    bfl.b(\u2603 + 0.5f, \u2603 + 0.25f, \u2603 + 0.26f);
                    \u2603 = 180.0f;
                    break;
                }
                case 3: {
                    bfl.b(\u2603 + 0.74f, \u2603 + 0.25f, \u2603 + 0.5f);
                    \u2603 = 270.0f;
                    break;
                }
                default: {
                    bfl.b(\u2603 + 0.26f, \u2603 + 0.25f, \u2603 + 0.5f);
                    \u2603 = 90.0f;
                    break;
                }
            }
        }
        else {
            bfl.b(\u2603 + 0.5f, \u2603, \u2603 + 0.5f);
        }
        final float \u26033 = 0.0625f;
        bfl.B();
        bfl.a(-1.0f, -1.0f, 1.0f);
        bfl.d();
        bbo.a(null, 0.0f, 0.0f, 0.0f, \u2603, 0.0f, \u26033);
        bfl.F();
        if (\u2603 >= 0) {
            bfl.n(5890);
            bfl.F();
            bfl.n(5888);
        }
    }
    
    static {
        d = new jy("textures/entity/skeleton/skeleton.png");
        e = new jy("textures/entity/skeleton/wither_skeleton.png");
        f = new jy("textures/entity/zombie/zombie.png");
        g = new jy("textures/entity/creeper/creeper.png");
    }
}
