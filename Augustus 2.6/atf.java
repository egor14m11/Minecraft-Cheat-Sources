// 
// Decompiled by Procyon v0.5.36
// 

public class atf
{
    private byte a;
    private byte b;
    private byte c;
    private byte d;
    
    public atf(final byte \u2603, final byte \u2603, final byte \u2603, final byte \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    public atf(final atf \u2603) {
        this.a = \u2603.a;
        this.b = \u2603.b;
        this.c = \u2603.c;
        this.d = \u2603.d;
    }
    
    public byte a() {
        return this.a;
    }
    
    public byte b() {
        return this.b;
    }
    
    public byte c() {
        return this.c;
    }
    
    public byte d() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (!(\u2603 instanceof atf)) {
            return false;
        }
        final atf atf = (atf)\u2603;
        return this.a == atf.a && this.d == atf.d && this.b == atf.b && this.c == atf.c;
    }
    
    @Override
    public int hashCode() {
        int a = this.a;
        a = 31 * a + this.b;
        a = 31 * a + this.c;
        a = 31 * a + this.d;
        return a;
    }
}
