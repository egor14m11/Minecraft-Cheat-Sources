// 
// Decompiled by Procyon v0.5.36
// 

public class awc extends avs
{
    private boolean o;
    
    public awc(final int \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, 20, 20, "");
        this.o = false;
    }
    
    public boolean c() {
        return this.o;
    }
    
    public void b(final boolean \u2603) {
        this.o = \u2603;
    }
    
    @Override
    public void a(final ave \u2603, final int \u2603, final int \u2603) {
        if (!this.m) {
            return;
        }
        \u2603.P().a(avs.a);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        final boolean b = \u2603 >= this.h && \u2603 >= this.i && \u2603 < this.h + this.f && \u2603 < this.i + this.g;
        a a;
        if (this.o) {
            if (!this.l) {
                a = awc.a.c;
            }
            else if (b) {
                a = awc.a.b;
            }
            else {
                a = awc.a.a;
            }
        }
        else if (!this.l) {
            a = awc.a.f;
        }
        else if (b) {
            a = awc.a.e;
        }
        else {
            a = awc.a.d;
        }
        this.b(this.h, this.i, a.a(), a.b(), this.f, this.g);
    }
    
    enum a
    {
        a(0, 146), 
        b(0, 166), 
        c(0, 186), 
        d(20, 146), 
        e(20, 166), 
        f(20, 186);
        
        private final int g;
        private final int h;
        
        private a(final int \u2603, final int \u2603) {
            this.g = \u2603;
            this.h = \u2603;
        }
        
        public int a() {
            return this.g;
        }
        
        public int b() {
            return this.h;
        }
    }
}
