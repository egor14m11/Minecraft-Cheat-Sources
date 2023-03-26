// 
// Decompiled by Procyon v0.5.36
// 

public class asx
{
    private final asv[] a;
    private int b;
    private int c;
    
    public asx(final asv[] \u2603) {
        this.a = \u2603;
        this.c = \u2603.length;
    }
    
    public void a() {
        ++this.b;
    }
    
    public boolean b() {
        return this.b >= this.c;
    }
    
    public asv c() {
        if (this.c > 0) {
            return this.a[this.c - 1];
        }
        return null;
    }
    
    public asv a(final int \u2603) {
        return this.a[\u2603];
    }
    
    public int d() {
        return this.c;
    }
    
    public void b(final int \u2603) {
        this.c = \u2603;
    }
    
    public int e() {
        return this.b;
    }
    
    public void c(final int \u2603) {
        this.b = \u2603;
    }
    
    public aui a(final pk \u2603, final int \u2603) {
        final double \u26032 = this.a[\u2603].a + (int)(\u2603.J + 1.0f) * 0.5;
        final double \u26033 = this.a[\u2603].b;
        final double \u26034 = this.a[\u2603].c + (int)(\u2603.J + 1.0f) * 0.5;
        return new aui(\u26032, \u26033, \u26034);
    }
    
    public aui a(final pk \u2603) {
        return this.a(\u2603, this.b);
    }
    
    public boolean a(final asx \u2603) {
        if (\u2603 == null) {
            return false;
        }
        if (\u2603.a.length != this.a.length) {
            return false;
        }
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i].a != \u2603.a[i].a || this.a[i].b != \u2603.a[i].b || this.a[i].c != \u2603.a[i].c) {
                return false;
            }
        }
        return true;
    }
    
    public boolean b(final aui \u2603) {
        final asv c = this.c();
        return c != null && c.a == (int)\u2603.a && c.c == (int)\u2603.c;
    }
}
