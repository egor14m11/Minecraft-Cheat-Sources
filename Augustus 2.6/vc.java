import io.netty.buffer.ByteBuf;

// 
// Decompiled by Procyon v0.5.36
// 

public class vc extends va
{
    private final adc a;
    private int b;
    
    public vc(final adm \u2603) {
        super(\u2603);
        this.a = new adc() {
            @Override
            public void h() {
                vc.this.H().b(23, this.l());
                vc.this.H().b(24, eu.a.a(this.k()));
            }
            
            @Override
            public int i() {
                return 1;
            }
            
            @Override
            public void a(final ByteBuf \u2603) {
                \u2603.writeInt(vc.this.F());
            }
            
            @Override
            public cj c() {
                return new cj(vc.this.s, vc.this.t + 0.5, vc.this.u);
            }
            
            @Override
            public aui d() {
                return new aui(vc.this.s, vc.this.t, vc.this.u);
            }
            
            @Override
            public adm e() {
                return vc.this.o;
            }
            
            @Override
            public pk f() {
                return vc.this;
            }
        };
        this.b = 0;
    }
    
    public vc(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.a = new adc() {
            @Override
            public void h() {
                vc.this.H().b(23, this.l());
                vc.this.H().b(24, eu.a.a(this.k()));
            }
            
            @Override
            public int i() {
                return 1;
            }
            
            @Override
            public void a(final ByteBuf \u2603) {
                \u2603.writeInt(vc.this.F());
            }
            
            @Override
            public cj c() {
                return new cj(vc.this.s, vc.this.t + 0.5, vc.this.u);
            }
            
            @Override
            public aui d() {
                return new aui(vc.this.s, vc.this.t, vc.this.u);
            }
            
            @Override
            public adm e() {
                return vc.this.o;
            }
            
            @Override
            public pk f() {
                return vc.this;
            }
        };
        this.b = 0;
    }
    
    @Override
    protected void h() {
        super.h();
        this.H().a(23, "");
        this.H().a(24, "");
    }
    
    @Override
    protected void a(final dn \u2603) {
        super.a(\u2603);
        this.a.b(\u2603);
        this.H().b(23, this.j().l());
        this.H().b(24, eu.a.a(this.j().k()));
    }
    
    @Override
    protected void b(final dn \u2603) {
        super.b(\u2603);
        this.a.a(\u2603);
    }
    
    @Override
    public a s() {
        return va.a.g;
    }
    
    @Override
    public alz u() {
        return afi.bX.Q();
    }
    
    public adc j() {
        return this.a;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        if (\u2603 && this.W - this.b >= 4) {
            this.j().a(this.o);
            this.b = this.W;
        }
    }
    
    @Override
    public boolean e(final wn \u2603) {
        this.a.a(\u2603);
        return false;
    }
    
    @Override
    public void i(final int \u2603) {
        super.i(\u2603);
        if (\u2603 == 24) {
            try {
                this.a.b(eu.a.a(this.H().e(24)));
            }
            catch (Throwable t) {}
        }
        else if (\u2603 == 23) {
            this.a.a(this.H().e(23));
        }
    }
}
