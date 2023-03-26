import java.util.Random;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqi extends aqq
{
    private List<ady.c> d;
    
    public aqi() {
        (this.d = (List<ady.c>)Lists.newArrayList()).add(new ady.c(vl.class, 10, 2, 3));
        this.d.add(new ady.c(vw.class, 5, 4, 4));
        this.d.add(new ady.c(wa.class, 10, 4, 4));
        this.d.add(new ady.c(vu.class, 3, 4, 4));
    }
    
    @Override
    public String a() {
        return "Fortress";
    }
    
    public List<ady.c> b() {
        return this.d;
    }
    
    @Override
    protected boolean a(final int \u2603, final int \u2603) {
        final int n = \u2603 >> 4;
        final int n2 = \u2603 >> 4;
        this.b.setSeed((long)(n ^ n2 << 4) ^ this.c.J());
        this.b.nextInt();
        return this.b.nextInt(3) == 0 && \u2603 == (n << 4) + 4 + this.b.nextInt(8) && \u2603 == (n2 << 4) + 4 + this.b.nextInt(8);
    }
    
    @Override
    protected aqu b(final int \u2603, final int \u2603) {
        return new a(this.c, this.b, \u2603, \u2603);
    }
    
    public static class a extends aqu
    {
        public a() {
        }
        
        public a(final adm \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603);
            final aqj.q \u26032 = new aqj.q(\u2603, (\u2603 << 4) + 2, (\u2603 << 4) + 2);
            this.a.add(\u26032);
            \u26032.a(\u26032, this.a, \u2603);
            final List<aqt> e = \u26032.e;
            while (!e.isEmpty()) {
                final int nextInt = \u2603.nextInt(e.size());
                final aqt aqt = e.remove(nextInt);
                aqt.a(\u26032, this.a, \u2603);
            }
            this.c();
            this.a(\u2603, \u2603, 48, 70);
        }
    }
}
