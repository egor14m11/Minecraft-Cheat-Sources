import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class kz extends le
{
    private le a;
    
    public kz(final MinecraftServer \u2603, final atp \u2603, final int \u2603, final le \u2603, final nt \u2603) {
        super(\u2603, \u2603, new atl(\u2603.P()), \u2603, \u2603);
        this.a = \u2603;
        \u2603.af().a(new amq() {
            @Override
            public void a(final ams \u2603, final double \u2603) {
                kz.this.af().a(\u2603);
            }
            
            @Override
            public void a(final ams \u2603, final double \u2603, final double \u2603, final long \u2603) {
                kz.this.af().a(\u2603, \u2603, \u2603);
            }
            
            @Override
            public void a(final ams \u2603, final double \u2603, final double \u2603) {
                kz.this.af().c(\u2603, \u2603);
            }
            
            @Override
            public void a(final ams \u2603, final int \u2603) {
                kz.this.af().b(\u2603);
            }
            
            @Override
            public void b(final ams \u2603, final int \u2603) {
                kz.this.af().c(\u2603);
            }
            
            @Override
            public void b(final ams \u2603, final double \u2603) {
                kz.this.af().c(\u2603);
            }
            
            @Override
            public void c(final ams \u2603, final double \u2603) {
                kz.this.af().b(\u2603);
            }
        });
    }
    
    @Override
    protected void a() {
    }
    
    @Override
    public adm b() {
        this.z = this.a.T();
        this.C = this.a.Z();
        final String a = th.a(this.t);
        final th a2 = (th)this.z.a(th.class, a);
        if (a2 == null) {
            this.A = new th(this);
            this.z.a(a, this.A);
        }
        else {
            (this.A = a2).a(this);
        }
        return this;
    }
}
