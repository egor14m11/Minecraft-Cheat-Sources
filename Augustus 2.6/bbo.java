import java.util.Random;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class bbo
{
    public float p;
    public boolean q;
    public boolean r;
    public List<bct> s;
    private Map<String, bcu> a;
    public int t;
    public int u;
    
    public bbo() {
        this.r = true;
        this.s = (List<bct>)Lists.newArrayList();
        this.a = (Map<String, bcu>)Maps.newHashMap();
        this.t = 64;
        this.u = 32;
    }
    
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
    }
    
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
    }
    
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603) {
    }
    
    public bct a(final Random \u2603) {
        return this.s.get(\u2603.nextInt(this.s.size()));
    }
    
    protected void a(final String \u2603, final int \u2603, final int \u2603) {
        this.a.put(\u2603, new bcu(\u2603, \u2603));
    }
    
    public bcu a(final String \u2603) {
        return this.a.get(\u2603);
    }
    
    public static void a(final bct \u2603, final bct \u2603) {
        \u2603.f = \u2603.f;
        \u2603.g = \u2603.g;
        \u2603.h = \u2603.h;
        \u2603.c = \u2603.c;
        \u2603.d = \u2603.d;
        \u2603.e = \u2603.e;
    }
    
    public void a(final bbo \u2603) {
        this.p = \u2603.p;
        this.q = \u2603.q;
        this.r = \u2603.r;
    }
}
