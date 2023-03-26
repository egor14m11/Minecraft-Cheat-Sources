import net.minecraft.server.MinecraftServer;
import com.google.gson.JsonParseException;

// 
// Decompiled by Procyon v0.5.36
// 

public class aln extends akw
{
    public final eu[] a;
    public int f;
    private boolean g;
    private wn h;
    private final n i;
    
    public aln() {
        this.a = new eu[] { new fa(""), new fa(""), new fa(""), new fa("") };
        this.f = -1;
        this.g = true;
        this.i = new n();
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        for (int i = 0; i < 4; ++i) {
            final String a = eu.a.a(this.a[i]);
            \u2603.a("Text" + (i + 1), a);
        }
        this.i.b(\u2603);
    }
    
    @Override
    public void a(final dn \u2603) {
        this.g = false;
        super.a(\u2603);
        final m \u26032 = new m() {
            @Override
            public String e_() {
                return "Sign";
            }
            
            @Override
            public eu f_() {
                return new fa(this.e_());
            }
            
            @Override
            public void a(final eu \u2603) {
            }
            
            @Override
            public boolean a(final int \u2603, final String \u2603) {
                return true;
            }
            
            @Override
            public cj c() {
                return aln.this.c;
            }
            
            @Override
            public aui d() {
                return new aui(aln.this.c.n() + 0.5, aln.this.c.o() + 0.5, aln.this.c.p() + 0.5);
            }
            
            @Override
            public adm e() {
                return aln.this.b;
            }
            
            @Override
            public pk f() {
                return null;
            }
            
            @Override
            public boolean u_() {
                return false;
            }
            
            @Override
            public void a(final n.a \u2603, final int \u2603) {
            }
        };
        for (int i = 0; i < 4; ++i) {
            final String j = \u2603.j("Text" + (i + 1));
            try {
                final eu a = eu.a.a(j);
                try {
                    this.a[i] = ev.a(\u26032, a, null);
                }
                catch (bz bz) {
                    this.a[i] = a;
                }
            }
            catch (JsonParseException ex) {
                this.a[i] = new fa(j);
            }
        }
        this.i.a(\u2603);
    }
    
    @Override
    public ff y_() {
        final eu[] \u2603 = new eu[4];
        System.arraycopy(this.a, 0, \u2603, 0, 4);
        return new hw(this.b, this.c, \u2603);
    }
    
    @Override
    public boolean F() {
        return true;
    }
    
    public boolean b() {
        return this.g;
    }
    
    public void a(final boolean \u2603) {
        if (!(this.g = \u2603)) {
            this.h = null;
        }
    }
    
    public void a(final wn \u2603) {
        this.h = \u2603;
    }
    
    public wn c() {
        return this.h;
    }
    
    public boolean b(final wn \u2603) {
        final m m = new m() {
            @Override
            public String e_() {
                return \u2603.e_();
            }
            
            @Override
            public eu f_() {
                return \u2603.f_();
            }
            
            @Override
            public void a(final eu \u2603) {
            }
            
            @Override
            public boolean a(final int \u2603, final String \u2603) {
                return \u2603 <= 2;
            }
            
            @Override
            public cj c() {
                return aln.this.c;
            }
            
            @Override
            public aui d() {
                return new aui(aln.this.c.n() + 0.5, aln.this.c.o() + 0.5, aln.this.c.p() + 0.5);
            }
            
            @Override
            public adm e() {
                return \u2603.e();
            }
            
            @Override
            public pk f() {
                return \u2603;
            }
            
            @Override
            public boolean u_() {
                return false;
            }
            
            @Override
            public void a(final n.a \u2603, final int \u2603) {
                aln.this.i.a(this, \u2603, \u2603);
            }
        };
        for (int i = 0; i < this.a.length; ++i) {
            final ez ez = (this.a[i] == null) ? null : this.a[i].b();
            if (ez != null) {
                if (ez.h() != null) {
                    final et h = ez.h();
                    if (h.a() == et.a.c) {
                        MinecraftServer.N().P().a(m, h.b());
                    }
                }
            }
        }
        return true;
    }
    
    public n d() {
        return this.i;
    }
}
