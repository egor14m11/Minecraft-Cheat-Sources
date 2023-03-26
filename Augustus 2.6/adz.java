import net.minecraft.server.MinecraftServer;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class adz
{
    private final aec a;
    private long b;
    private nq<a> c;
    private List<a> d;
    
    public adz(final aec \u2603) {
        this.c = new nq<a>();
        this.d = (List<a>)Lists.newArrayList();
        this.a = \u2603;
    }
    
    public a a(int \u2603, int \u2603) {
        \u2603 >>= 4;
        \u2603 >>= 4;
        final long n = ((long)\u2603 & 0xFFFFFFFFL) | ((long)\u2603 & 0xFFFFFFFFL) << 32;
        a \u26032 = this.c.a(n);
        if (\u26032 == null) {
            \u26032 = new a(\u2603, \u2603);
            this.c.a(n, \u26032);
            this.d.add(\u26032);
        }
        \u26032.e = MinecraftServer.az();
        return \u26032;
    }
    
    public ady a(final int \u2603, final int \u2603, final ady \u2603) {
        final ady a = this.a(\u2603, \u2603).a(\u2603, \u2603);
        if (a == null) {
            return \u2603;
        }
        return a;
    }
    
    public void a() {
        final long az = MinecraftServer.az();
        final long n = az - this.b;
        if (n > 7500L || n < 0L) {
            this.b = az;
            for (int i = 0; i < this.d.size(); ++i) {
                final a a = this.d.get(i);
                final long n2 = az - a.e;
                if (n2 > 30000L || n2 < 0L) {
                    this.d.remove(i--);
                    final long \u2603 = ((long)a.c & 0xFFFFFFFFL) | ((long)a.d & 0xFFFFFFFFL) << 32;
                    this.c.d(\u2603);
                }
            }
        }
    }
    
    public ady[] c(final int \u2603, final int \u2603) {
        return this.a(\u2603, \u2603).b;
    }
    
    public class a
    {
        public float[] a;
        public ady[] b;
        public int c;
        public int d;
        public long e;
        
        public a(final int \u2603, final int \u2603) {
            this.a = new float[256];
            this.b = new ady[256];
            this.c = \u2603;
            this.d = \u2603;
            adz.this.a.a(this.a, \u2603 << 4, \u2603 << 4, 16, 16);
            adz.this.a.a(this.b, \u2603 << 4, \u2603 << 4, 16, 16, false);
        }
        
        public ady a(final int \u2603, final int \u2603) {
            return this.b[(\u2603 & 0xF) | (\u2603 & 0xF) << 4];
        }
    }
}
