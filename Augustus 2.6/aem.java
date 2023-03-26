import java.util.List;
import java.util.Random;
import com.google.common.collect.Lists;

// 
// Decompiled by Procyon v0.5.36
// 

public class aem extends ady
{
    protected ady aE;
    
    public aem(final int \u2603, final ady \u2603) {
        super(\u2603);
        this.aE = \u2603;
        this.a(\u2603.ai, true);
        this.ah = \u2603.ah + " M";
        this.ak = \u2603.ak;
        this.al = \u2603.al;
        this.am = \u2603.am;
        this.an = \u2603.an;
        this.ao = \u2603.ao;
        this.ap = \u2603.ap;
        this.aq = \u2603.aq;
        this.ar = \u2603.ar;
        this.ax = \u2603.ax;
        this.ay = \u2603.ay;
        this.au = (List<c>)Lists.newArrayList((Iterable<?>)\u2603.au);
        this.at = (List<c>)Lists.newArrayList((Iterable<?>)\u2603.at);
        this.aw = (List<c>)Lists.newArrayList((Iterable<?>)\u2603.aw);
        this.av = (List<c>)Lists.newArrayList((Iterable<?>)\u2603.av);
        this.ap = \u2603.ap;
        this.aq = \u2603.aq;
        this.an = \u2603.an + 0.1f;
        this.ao = \u2603.ao + 0.2f;
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        this.aE.as.a(\u2603, \u2603, this, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final ans \u2603, final int \u2603, final int \u2603, final double \u2603) {
        this.aE.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public float g() {
        return this.aE.g();
    }
    
    @Override
    public aoh a(final Random \u2603) {
        return this.aE.a(\u2603);
    }
    
    @Override
    public int c(final cj \u2603) {
        return this.aE.c(\u2603);
    }
    
    @Override
    public int b(final cj \u2603) {
        return this.aE.b(\u2603);
    }
    
    @Override
    public Class<? extends ady> l() {
        return this.aE.l();
    }
    
    @Override
    public boolean a(final ady \u2603) {
        return this.aE.a(\u2603);
    }
    
    @Override
    public b m() {
        return this.aE.m();
    }
}
