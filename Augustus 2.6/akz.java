import io.netty.buffer.ByteBuf;

// 
// Decompiled by Procyon v0.5.36
// 

public class akz extends akw
{
    private final adc a;
    
    public akz() {
        this.a = new adc() {
            @Override
            public cj c() {
                return akz.this.c;
            }
            
            @Override
            public aui d() {
                return new aui(akz.this.c.n() + 0.5, akz.this.c.o() + 0.5, akz.this.c.p() + 0.5);
            }
            
            @Override
            public adm e() {
                return akz.this.z();
            }
            
            @Override
            public void a(final String \u2603) {
                super.a(\u2603);
                akz.this.p_();
            }
            
            @Override
            public void h() {
                akz.this.z().h(akz.this.c);
            }
            
            @Override
            public int i() {
                return 0;
            }
            
            @Override
            public void a(final ByteBuf \u2603) {
                \u2603.writeInt(akz.this.c.n());
                \u2603.writeInt(akz.this.c.o());
                \u2603.writeInt(akz.this.c.p());
            }
            
            @Override
            public pk f() {
                return null;
            }
        };
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        this.a.a(\u2603);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.a.b(\u2603);
    }
    
    @Override
    public ff y_() {
        final dn dn = new dn();
        this.b(dn);
        return new ft(this.c, 2, dn);
    }
    
    @Override
    public boolean F() {
        return true;
    }
    
    public adc b() {
        return this.a;
    }
    
    public n c() {
        return this.a.n();
    }
}
