// 
// Decompiled by Procyon v0.5.36
// 

public class vg extends va
{
    public vg(final adm \u2603) {
        super(\u2603);
    }
    
    public vg(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean e(final wn \u2603) {
        if (this.l != null && this.l instanceof wn && this.l != \u2603) {
            return true;
        }
        if (this.l != null && this.l != \u2603) {
            return false;
        }
        if (!this.o.D) {
            \u2603.a(this);
        }
        return true;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        if (\u2603) {
            if (this.l != null) {
                this.l.a((pk)null);
            }
            if (this.q() == 0) {
                this.k(-this.r());
                this.j(10);
                this.a(50.0f);
                this.ac();
            }
        }
    }
    
    @Override
    public a s() {
        return va.a.a;
    }
}
