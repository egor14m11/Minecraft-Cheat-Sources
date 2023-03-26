import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bmv
{
    private static final Logger a;
    private final a b;
    private final b c;
    private int d;
    private int e;
    
    public bmv(final int \u2603, final a \u2603, final b \u2603, final int \u2603) {
        if (!this.a(\u2603, \u2603)) {
            bmv.a.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
            this.c = bmv.b.d;
        }
        else {
            this.c = \u2603;
        }
        this.b = \u2603;
        this.d = \u2603;
        this.e = \u2603;
    }
    
    private final boolean a(final int \u2603, final b \u2603) {
        return \u2603 == 0 || \u2603 == bmv.b.d;
    }
    
    public final a a() {
        return this.b;
    }
    
    public final b b() {
        return this.c;
    }
    
    public final int c() {
        return this.e;
    }
    
    public final int d() {
        return this.d;
    }
    
    @Override
    public String toString() {
        return this.e + "," + this.c.a() + "," + this.b.b();
    }
    
    public final int e() {
        return this.b.a() * this.e;
    }
    
    public final boolean f() {
        return this.c == bmv.b.a;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 == null || this.getClass() != \u2603.getClass()) {
            return false;
        }
        final bmv bmv = (bmv)\u2603;
        return this.e == bmv.e && this.d == bmv.d && this.b == bmv.b && this.c == bmv.c;
    }
    
    @Override
    public int hashCode() {
        int hashCode = this.b.hashCode();
        hashCode = 31 * hashCode + this.c.hashCode();
        hashCode = 31 * hashCode + this.d;
        hashCode = 31 * hashCode + this.e;
        return hashCode;
    }
    
    static {
        a = LogManager.getLogger();
    }
    
    public enum b
    {
        a("Position"), 
        b("Normal"), 
        c("Vertex Color"), 
        d("UV"), 
        e("Bone Matrix"), 
        f("Blend Weight"), 
        g("Padding");
        
        private final String h;
        
        private b(final String \u2603) {
            this.h = \u2603;
        }
        
        public String a() {
            return this.h;
        }
    }
    
    public enum a
    {
        a(4, "Float", 5126), 
        b(1, "Unsigned Byte", 5121), 
        c(1, "Byte", 5120), 
        d(2, "Unsigned Short", 5123), 
        e(2, "Short", 5122), 
        f(4, "Unsigned Int", 5125), 
        g(4, "Int", 5124);
        
        private final int h;
        private final String i;
        private final int j;
        
        private a(final int \u2603, final String \u2603, final int \u2603) {
            this.h = \u2603;
            this.i = \u2603;
            this.j = \u2603;
        }
        
        public int a() {
            return this.h;
        }
        
        public String b() {
            return this.i;
        }
        
        public int c() {
            return this.j;
        }
    }
}
