import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class bdc
{
    private final GameProfile a;
    private adp.a b;
    private int c;
    private boolean d;
    private jy e;
    private jy f;
    private String g;
    private eu h;
    private int i;
    private int j;
    private long k;
    private long l;
    private long m;
    
    public bdc(final GameProfile \u2603) {
        this.d = false;
        this.i = 0;
        this.j = 0;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.a = \u2603;
    }
    
    public bdc(final gz.b \u2603) {
        this.d = false;
        this.i = 0;
        this.j = 0;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.a = \u2603.a();
        this.b = \u2603.c();
        this.c = \u2603.b();
        this.h = \u2603.d();
    }
    
    public GameProfile a() {
        return this.a;
    }
    
    public adp.a b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
    
    protected void a(final adp.a \u2603) {
        this.b = \u2603;
    }
    
    protected void a(final int \u2603) {
        this.c = \u2603;
    }
    
    public boolean e() {
        return this.e != null;
    }
    
    public String f() {
        if (this.g == null) {
            return bmz.b(this.a.getId());
        }
        return this.g;
    }
    
    public jy g() {
        if (this.e == null) {
            this.j();
        }
        return (jy)Objects.firstNonNull((Object)this.e, (Object)bmz.a(this.a.getId()));
    }
    
    public jy h() {
        if (this.f == null) {
            this.j();
        }
        return this.f;
    }
    
    public aul i() {
        return ave.A().f.Z().h(this.a().getName());
    }
    
    protected void j() {
        synchronized (this) {
            if (!this.d) {
                this.d = true;
                ave.A().ab().a(this.a, new bnp.a() {
                    @Override
                    public void a(final MinecraftProfileTexture.Type \u2603, final jy \u2603, final MinecraftProfileTexture \u2603) {
                        switch (bdc$2.a[\u2603.ordinal()]) {
                            case 1: {
                                bdc.this.e = \u2603;
                                bdc.this.g = \u2603.getMetadata("model");
                                if (bdc.this.g == null) {
                                    bdc.this.g = "default";
                                    break;
                                }
                                break;
                            }
                            case 2: {
                                bdc.this.f = \u2603;
                                break;
                            }
                        }
                    }
                }, true);
            }
        }
    }
    
    public void a(final eu \u2603) {
        this.h = \u2603;
    }
    
    public eu k() {
        return this.h;
    }
    
    public int l() {
        return this.i;
    }
    
    public void b(final int \u2603) {
        this.i = \u2603;
    }
    
    public int m() {
        return this.j;
    }
    
    public void c(final int \u2603) {
        this.j = \u2603;
    }
    
    public long n() {
        return this.k;
    }
    
    public void a(final long \u2603) {
        this.k = \u2603;
    }
    
    public long o() {
        return this.l;
    }
    
    public void b(final long \u2603) {
        this.l = \u2603;
    }
    
    public long p() {
        return this.m;
    }
    
    public void c(final long \u2603) {
        this.m = \u2603;
    }
}
