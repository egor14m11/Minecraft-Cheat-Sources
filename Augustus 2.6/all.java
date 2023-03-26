// 
// Decompiled by Procyon v0.5.36
// 

public class all extends akw implements km
{
    private final add a;
    
    public all() {
        this.a = new add() {
            @Override
            public void a(final int \u2603) {
                all.this.b.c(all.this.c, afi.ac, \u2603, 0);
            }
            
            @Override
            public adm a() {
                return all.this.b;
            }
            
            @Override
            public cj b() {
                return all.this.c;
            }
            
            @Override
            public void a(final a \u2603) {
                super.a(\u2603);
                if (this.a() != null) {
                    this.a().h(all.this.c);
                }
            }
        };
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.a.a(\u2603);
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        this.a.b(\u2603);
    }
    
    @Override
    public void c() {
        this.a.c();
    }
    
    @Override
    public ff y_() {
        final dn dn = new dn();
        this.b(dn);
        dn.o("SpawnPotentials");
        return new ft(this.c, 1, dn);
    }
    
    @Override
    public boolean c(final int \u2603, final int \u2603) {
        return this.a.b(\u2603) || super.c(\u2603, \u2603);
    }
    
    @Override
    public boolean F() {
        return true;
    }
    
    public add b() {
        return this.a;
    }
}
