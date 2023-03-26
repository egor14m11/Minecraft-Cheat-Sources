import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class awy extends axu
{
    protected awx a;
    protected String f;
    private String r;
    private final List<String> s;
    protected String g;
    protected String h;
    protected int i;
    private int t;
    
    public awy(final awx \u2603, final String \u2603, final String \u2603, final int \u2603) {
        this.s = (List<String>)Lists.newArrayList();
        this.a = \u2603;
        this.f = \u2603;
        this.r = \u2603;
        this.i = \u2603;
        this.g = bnq.a("gui.yes", new Object[0]);
        this.h = bnq.a("gui.no", new Object[0]);
    }
    
    public awy(final awx \u2603, final String \u2603, final String \u2603, final String \u2603, final String \u2603, final int \u2603) {
        this.s = (List<String>)Lists.newArrayList();
        this.a = \u2603;
        this.f = \u2603;
        this.r = \u2603;
        this.g = \u2603;
        this.h = \u2603;
        this.i = \u2603;
    }
    
    @Override
    public void b() {
        this.n.add(new awe(0, this.l / 2 - 155, this.m / 6 + 96, this.g));
        this.n.add(new awe(1, this.l / 2 - 155 + 160, this.m / 6 + 96, this.h));
        this.s.clear();
        this.s.addAll(this.q.c(this.r, this.l - 50));
    }
    
    @Override
    protected void a(final avs \u2603) {
        this.a.a(\u2603.k == 0, this.i);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, this.f, this.l / 2, 70, 16777215);
        int \u26032 = 90;
        for (final String \u26033 : this.s) {
            this.a(this.q, \u26033, this.l / 2, \u26032, 16777215);
            \u26032 += this.q.a;
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    public void b(final int \u2603) {
        this.t = \u2603;
        for (final avs avs : this.n) {
            avs.l = false;
        }
    }
    
    @Override
    public void e() {
        super.e();
        final int t = this.t - 1;
        this.t = t;
        if (t == 0) {
            for (final avs avs : this.n) {
                avs.l = true;
            }
        }
    }
}
