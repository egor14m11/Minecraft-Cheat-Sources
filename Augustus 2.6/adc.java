import io.netty.buffer.ByteBuf;
import java.util.Date;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class adc implements m
{
    private static final SimpleDateFormat a;
    private int b;
    private boolean c;
    private eu d;
    private String e;
    private String f;
    private final n g;
    
    public adc() {
        this.c = true;
        this.d = null;
        this.e = "";
        this.f = "@";
        this.g = new n();
    }
    
    public int j() {
        return this.b;
    }
    
    public eu k() {
        return this.d;
    }
    
    public void a(final dn \u2603) {
        \u2603.a("Command", this.e);
        \u2603.a("SuccessCount", this.b);
        \u2603.a("CustomName", this.f);
        \u2603.a("TrackOutput", this.c);
        if (this.d != null && this.c) {
            \u2603.a("LastOutput", eu.a.a(this.d));
        }
        this.g.b(\u2603);
    }
    
    public void b(final dn \u2603) {
        this.e = \u2603.j("Command");
        this.b = \u2603.f("SuccessCount");
        if (\u2603.b("CustomName", 8)) {
            this.f = \u2603.j("CustomName");
        }
        if (\u2603.b("TrackOutput", 1)) {
            this.c = \u2603.n("TrackOutput");
        }
        if (\u2603.b("LastOutput", 8) && this.c) {
            this.d = eu.a.a(\u2603.j("LastOutput"));
        }
        this.g.a(\u2603);
    }
    
    @Override
    public boolean a(final int \u2603, final String \u2603) {
        return \u2603 <= 2;
    }
    
    public void a(final String \u2603) {
        this.e = \u2603;
        this.b = 0;
    }
    
    public String l() {
        return this.e;
    }
    
    public void a(final adm \u2603) {
        if (\u2603.D) {
            this.b = 0;
        }
        final MinecraftServer n = MinecraftServer.N();
        if (n != null && n.O() && n.al()) {
            final l p = n.P();
            try {
                this.d = null;
                this.b = p.a(this, this.e);
            }
            catch (Throwable \u26032) {
                final b a = b.a(\u26032, "Executing command block");
                final c a2 = a.a("Command to be executed");
                a2.a("Command", new Callable<String>() {
                    public String a() throws Exception {
                        return adc.this.l();
                    }
                });
                a2.a("Name", new Callable<String>() {
                    public String a() throws Exception {
                        return adc.this.e_();
                    }
                });
                throw new e(a);
            }
        }
        else {
            this.b = 0;
        }
    }
    
    @Override
    public String e_() {
        return this.f;
    }
    
    @Override
    public eu f_() {
        return new fa(this.e_());
    }
    
    public void b(final String \u2603) {
        this.f = \u2603;
    }
    
    @Override
    public void a(final eu \u2603) {
        if (this.c && this.e() != null && !this.e().D) {
            this.d = new fa("[" + adc.a.format(new Date()) + "] ").a(\u2603);
            this.h();
        }
    }
    
    @Override
    public boolean u_() {
        final MinecraftServer n = MinecraftServer.N();
        return n == null || !n.O() || n.d[0].Q().b("commandBlockOutput");
    }
    
    @Override
    public void a(final n.a \u2603, final int \u2603) {
        this.g.a(this, \u2603, \u2603);
    }
    
    public abstract void h();
    
    public abstract int i();
    
    public abstract void a(final ByteBuf p0);
    
    public void b(final eu \u2603) {
        this.d = \u2603;
    }
    
    public void a(final boolean \u2603) {
        this.c = \u2603;
    }
    
    public boolean m() {
        return this.c;
    }
    
    public boolean a(final wn \u2603) {
        if (!\u2603.bA.d) {
            return false;
        }
        if (\u2603.e().D) {
            \u2603.a(this);
        }
        return true;
    }
    
    public n n() {
        return this.g;
    }
    
    static {
        a = new SimpleDateFormat("HH:mm:ss");
    }
}
