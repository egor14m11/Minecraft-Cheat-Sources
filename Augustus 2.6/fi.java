import java.util.Iterator;
import java.util.EnumSet;
import java.io.IOException;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class fi implements ff<fj>
{
    private double a;
    private double b;
    private double c;
    private float d;
    private float e;
    private Set<a> f;
    
    public fi() {
    }
    
    public fi(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final Set<a> \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.f = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readDouble();
        this.b = \u2603.readDouble();
        this.c = \u2603.readDouble();
        this.d = \u2603.readFloat();
        this.e = \u2603.readFloat();
        this.f = fi.a.a(\u2603.readUnsignedByte());
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeDouble(this.a);
        \u2603.writeDouble(this.b);
        \u2603.writeDouble(this.c);
        \u2603.writeFloat(this.d);
        \u2603.writeFloat(this.e);
        \u2603.writeByte(fi.a.a(this.f));
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public double a() {
        return this.a;
    }
    
    public double b() {
        return this.b;
    }
    
    public double c() {
        return this.c;
    }
    
    public float d() {
        return this.d;
    }
    
    public float e() {
        return this.e;
    }
    
    public Set<a> f() {
        return this.f;
    }
    
    public enum a
    {
        a(0), 
        b(1), 
        c(2), 
        d(3), 
        e(4);
        
        private int f;
        
        private a(final int \u2603) {
            this.f = \u2603;
        }
        
        private int a() {
            return 1 << this.f;
        }
        
        private boolean b(final int \u2603) {
            return (\u2603 & this.a()) == this.a();
        }
        
        public static Set<a> a(final int \u2603) {
            final Set<a> none = EnumSet.noneOf(a.class);
            for (final a a : values()) {
                if (a.b(\u2603)) {
                    none.add(a);
                }
            }
            return none;
        }
        
        public static int a(final Set<a> \u2603) {
            int n = 0;
            for (final a a : \u2603) {
                n |= a.a();
            }
            return n;
        }
    }
}
