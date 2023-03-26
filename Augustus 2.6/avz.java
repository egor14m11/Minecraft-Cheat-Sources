// 
// Decompiled by Procyon v0.5.36
// 

public class avz extends avs
{
    public avz(final int \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, 20, 20, "");
    }
    
    @Override
    public void a(final ave \u2603, final int \u2603, final int \u2603) {
        if (!this.m) {
            return;
        }
        \u2603.P().a(avs.a);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        final boolean b = \u2603 >= this.h && \u2603 >= this.i && \u2603 < this.h + this.f && \u2603 < this.i + this.g;
        int \u26032 = 106;
        if (b) {
            \u26032 += this.g;
        }
        this.b(this.h, this.i, 0, \u26032, this.f, this.g);
    }
}
