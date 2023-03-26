import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class axh extends axu
{
    private String a;
    private eu f;
    private List<String> g;
    private final axu h;
    private int i;
    
    public axh(final axu \u2603, final String \u2603, final eu \u2603) {
        this.h = \u2603;
        this.a = bnq.a(\u2603, new Object[0]);
        this.f = \u2603;
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
    }
    
    @Override
    public void b() {
        this.n.clear();
        this.g = this.q.c(this.f.d(), this.l - 50);
        this.i = this.g.size() * this.q.a;
        this.n.add(new avs(0, this.l / 2 - 100, this.m / 2 + this.i / 2 + this.q.a, bnq.a("gui.toMenu", new Object[0])));
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == 0) {
            this.j.a(this.h);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, this.a, this.l / 2, this.m / 2 - this.i / 2 - this.q.a * 2, 11184810);
        int \u26032 = this.m / 2 - this.i / 2;
        if (this.g != null) {
            for (final String \u26033 : this.g) {
                this.a(this.q, \u26033, this.l / 2, \u26032, 16777215);
                \u26032 += this.q.a;
            }
        }
        super.a(\u2603, \u2603, \u2603);
    }
}
