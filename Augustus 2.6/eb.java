import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class eb
{
    public static final String[] a;
    
    abstract void a(final DataOutput p0) throws IOException;
    
    abstract void a(final DataInput p0, final int p1, final dw p2) throws IOException;
    
    @Override
    public abstract String toString();
    
    public abstract byte a();
    
    protected eb() {
    }
    
    protected static eb a(final byte \u2603) {
        switch (\u2603) {
            case 0: {
                return new dq();
            }
            case 1: {
                return new dm();
            }
            case 2: {
                return new dz();
            }
            case 3: {
                return new dt();
            }
            case 4: {
                return new dv();
            }
            case 5: {
                return new dr();
            }
            case 6: {
                return new dp();
            }
            case 7: {
                return new dl();
            }
            case 11: {
                return new ds();
            }
            case 8: {
                return new ea();
            }
            case 9: {
                return new du();
            }
            case 10: {
                return new dn();
            }
            default: {
                return null;
            }
        }
    }
    
    public abstract eb b();
    
    public boolean c_() {
        return false;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (!(\u2603 instanceof eb)) {
            return false;
        }
        final eb eb = (eb)\u2603;
        return this.a() == eb.a();
    }
    
    @Override
    public int hashCode() {
        return this.a();
    }
    
    protected String a_() {
        return this.toString();
    }
    
    static {
        a = new String[] { "END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]" };
    }
    
    public abstract static class a extends eb
    {
        protected a() {
        }
        
        public abstract long c();
        
        public abstract int d();
        
        public abstract short e();
        
        public abstract byte f();
        
        public abstract double g();
        
        public abstract float h();
    }
}
