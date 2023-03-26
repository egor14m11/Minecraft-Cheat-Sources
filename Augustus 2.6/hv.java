import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hv implements ff<fj>
{
    private a a;
    private eu b;
    private int c;
    private int d;
    private int e;
    
    public hv() {
    }
    
    public hv(final a \u2603, final eu \u2603) {
        this(\u2603, \u2603, -1, -1, -1);
    }
    
    public hv(final int \u2603, final int \u2603, final int \u2603) {
        this(hv.a.c, null, \u2603, \u2603, \u2603);
    }
    
    public hv(final a \u2603, final eu \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.a(a.class);
        if (this.a == hv.a.a || this.a == hv.a.b) {
            this.b = \u2603.d();
        }
        if (this.a == hv.a.c) {
            this.c = \u2603.readInt();
            this.d = \u2603.readInt();
            this.e = \u2603.readInt();
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        if (this.a == hv.a.a || this.a == hv.a.b) {
            \u2603.a(this.b);
        }
        if (this.a == hv.a.c) {
            \u2603.writeInt(this.c);
            \u2603.writeInt(this.d);
            \u2603.writeInt(this.e);
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public a a() {
        return this.a;
    }
    
    public eu b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
    
    public int d() {
        return this.d;
    }
    
    public int e() {
        return this.e;
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d, 
        e;
        
        public static a a(final String \u2603) {
            for (final a a : values()) {
                if (a.name().equalsIgnoreCase(\u2603)) {
                    return a;
                }
            }
            return a.a;
        }
        
        public static String[] a() {
            final String[] array = new String[values().length];
            int n = 0;
            for (final a a : values()) {
                array[n++] = a.name().toLowerCase();
            }
            return array;
        }
    }
}
