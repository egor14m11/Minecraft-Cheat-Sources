import java.io.File;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class bet extends wn
{
    private bdc a;
    
    public bet(final adm \u2603, final GameProfile \u2603) {
        super(\u2603, \u2603);
    }
    
    @Override
    public boolean v() {
        final bdc a = ave.A().u().a(this.cd().getId());
        return a != null && a.b() == adp.a.e;
    }
    
    public boolean a() {
        return this.b() != null;
    }
    
    protected bdc b() {
        if (this.a == null) {
            this.a = ave.A().u().a(this.aK());
        }
        return this.a;
    }
    
    public boolean g() {
        final bdc b = this.b();
        return b != null && b.e();
    }
    
    public jy i() {
        final bdc b = this.b();
        return (b == null) ? bmz.a(this.aK()) : b.g();
    }
    
    public jy k() {
        final bdc b = this.b();
        return (b == null) ? null : b.h();
    }
    
    public static bma a(final jy \u2603, final String \u2603) {
        final bmj p = ave.A().P();
        bmk b = p.b(\u2603);
        if (b == null) {
            b = new bma(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", nx.a(\u2603)), bmz.a(wn.b(\u2603)), new bfs());
            p.a(\u2603, b);
        }
        return (bma)b;
    }
    
    public static jy c(final String \u2603) {
        return new jy("skins/" + nx.a(\u2603));
    }
    
    public String l() {
        final bdc b = this.b();
        return (b == null) ? bmz.b(this.aK()) : b.f();
    }
    
    public float o() {
        float n = 1.0f;
        if (this.bA.b) {
            n *= 1.1f;
        }
        final qc a = this.a(vy.d);
        n *= (float)((a.e() / this.bA.b() + 1.0) / 2.0);
        if (this.bA.b() == 0.0f || Float.isNaN(n) || Float.isInfinite(n)) {
            n = 1.0f;
        }
        if (this.bS() && this.bQ().b() == zy.f) {
            final int bt = this.bT();
            float n2 = bt / 20.0f;
            if (n2 > 1.0f) {
                n2 = 1.0f;
            }
            else {
                n2 *= n2;
            }
            n *= 1.0f - n2 * 0.15f;
        }
        return n;
    }
}
