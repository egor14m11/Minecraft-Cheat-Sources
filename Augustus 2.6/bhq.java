import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bhq
{
    public static final bhq a;
    private final boolean[] b;
    private final boolean[] c;
    private boolean d;
    private final List<akw> e;
    private bhx f;
    private bfd.a g;
    
    public bhq() {
        this.b = new boolean[adf.values().length];
        this.c = new boolean[adf.values().length];
        this.d = true;
        this.e = (List<akw>)Lists.newArrayList();
        this.f = new bhx();
    }
    
    public boolean a() {
        return this.d;
    }
    
    protected void a(final adf \u2603) {
        this.d = false;
        this.b[\u2603.ordinal()] = true;
    }
    
    public boolean b(final adf \u2603) {
        return !this.b[\u2603.ordinal()];
    }
    
    public void c(final adf \u2603) {
        this.c[\u2603.ordinal()] = true;
    }
    
    public boolean d(final adf \u2603) {
        return this.c[\u2603.ordinal()];
    }
    
    public List<akw> b() {
        return this.e;
    }
    
    public void a(final akw \u2603) {
        this.e.add(\u2603);
    }
    
    public boolean a(final cq \u2603, final cq \u2603) {
        return this.f.a(\u2603, \u2603);
    }
    
    public void a(final bhx \u2603) {
        this.f = \u2603;
    }
    
    public bfd.a c() {
        return this.g;
    }
    
    public void a(final bfd.a \u2603) {
        this.g = \u2603;
    }
    
    static {
        a = new bhq() {
            @Override
            protected void a(final adf \u2603) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public void c(final adf \u2603) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public boolean a(final cq \u2603, final cq \u2603) {
                return false;
            }
        };
    }
}
