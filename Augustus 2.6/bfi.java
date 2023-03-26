import java.util.UUID;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class bfi
{
    public static bfi a;
    private aky b;
    private aky c;
    private alf d;
    private aku e;
    private alo f;
    
    public bfi() {
        this.b = new aky(0);
        this.c = new aky(1);
        this.d = new alf();
        this.e = new aku();
        this.f = new alo();
    }
    
    public void a(final zx \u2603) {
        if (\u2603.b() == zy.cE) {
            this.e.a(\u2603);
            bhc.a.a(this.e, 0.0, 0.0, 0.0, 0.0f);
        }
        else if (\u2603.b() == zy.bX) {
            GameProfile \u26032 = null;
            if (\u2603.n()) {
                final dn o = \u2603.o();
                if (o.b("SkullOwner", 10)) {
                    \u26032 = dy.a(o.m("SkullOwner"));
                }
                else if (o.b("SkullOwner", 8) && o.j("SkullOwner").length() > 0) {
                    \u26032 = new GameProfile(null, o.j("SkullOwner"));
                    \u26032 = alo.b(\u26032);
                    o.o("SkullOwner");
                    o.a("SkullOwner", dy.a(new dn(), \u26032));
                }
            }
            if (bhk.c != null) {
                bfl.E();
                bfl.b(-0.5f, 0.0f, -0.5f);
                bfl.a(2.0f, 2.0f, 2.0f);
                bfl.p();
                bhk.c.a(0.0f, 0.0f, 0.0f, cq.b, 0.0f, \u2603.i(), \u26032, -1);
                bfl.o();
                bfl.F();
            }
        }
        else {
            final afh a = afh.a(\u2603.b());
            if (a == afi.bQ) {
                bhc.a.a(this.d, 0.0, 0.0, 0.0, 0.0f);
            }
            else if (a == afi.cg) {
                bhc.a.a(this.c, 0.0, 0.0, 0.0, 0.0f);
            }
            else {
                bhc.a.a(this.b, 0.0, 0.0, 0.0, 0.0f);
            }
        }
    }
    
    static {
        bfi.a = new bfi();
    }
}
