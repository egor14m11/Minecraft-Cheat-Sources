import java.util.Iterator;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ex extends es
{
    private final String b;
    private final String c;
    private String d;
    
    public ex(final String \u2603, final String \u2603) {
        this.d = "";
        this.b = \u2603;
        this.c = \u2603;
    }
    
    public String g() {
        return this.b;
    }
    
    public String h() {
        return this.c;
    }
    
    public void b(final String \u2603) {
        this.d = \u2603;
    }
    
    @Override
    public String e() {
        final MinecraftServer n = MinecraftServer.N();
        if (n != null && n.O() && nx.b(this.d)) {
            final auo z = n.a(0).Z();
            final auk b = z.b(this.c);
            if (z.b(this.b, b)) {
                final aum c = z.c(this.b, b);
                this.b(String.format("%d", c.c()));
            }
            else {
                this.d = "";
            }
        }
        return this.d;
    }
    
    public ex i() {
        final ex ex = new ex(this.b, this.c);
        ex.b(this.d);
        ex.a(this.b().m());
        for (final eu eu : this.a()) {
            ex.a(eu.f());
        }
        return ex;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 instanceof ex) {
            final ex ex = (ex)\u2603;
            return this.b.equals(ex.b) && this.c.equals(ex.c) && super.equals(\u2603);
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "ScoreComponent{name='" + this.b + '\'' + "objective='" + this.c + '\'' + ", siblings=" + this.a + ", style=" + this.b() + '}';
    }
}
