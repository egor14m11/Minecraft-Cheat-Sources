import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class avb implements Comparable<avb>
{
    private static final List<avb> a;
    private static final nm<avb> b;
    private static final Set<String> c;
    private final String d;
    private final int e;
    private final String f;
    private int g;
    private boolean h;
    private int i;
    
    public static void a(final int \u2603) {
        if (\u2603 == 0) {
            return;
        }
        final avb avb = avb.b.a(\u2603);
        if (avb != null) {
            final avb avb2 = avb;
            ++avb2.i;
        }
    }
    
    public static void a(final int \u2603, final boolean \u2603) {
        if (\u2603 == 0) {
            return;
        }
        final avb avb = avb.b.a(\u2603);
        if (avb != null) {
            avb.h = \u2603;
        }
    }
    
    public static void a() {
        for (final avb avb : avb.a) {
            avb.j();
        }
    }
    
    public static void b() {
        avb.b.c();
        for (final avb \u2603 : avb.a) {
            avb.b.a(\u2603.g, \u2603);
        }
    }
    
    public static Set<String> c() {
        return avb.c;
    }
    
    public avb(final String \u2603, final int \u2603, final String \u2603) {
        this.d = \u2603;
        this.g = \u2603;
        this.e = \u2603;
        this.f = \u2603;
        avb.a.add(this);
        avb.b.a(\u2603, this);
        avb.c.add(\u2603);
    }
    
    public boolean d() {
        return this.h;
    }
    
    public String e() {
        return this.f;
    }
    
    public boolean f() {
        if (this.i == 0) {
            return false;
        }
        --this.i;
        return true;
    }
    
    private void j() {
        this.i = 0;
        this.h = false;
    }
    
    public String g() {
        return this.d;
    }
    
    public int h() {
        return this.e;
    }
    
    public int i() {
        return this.g;
    }
    
    public void b(final int \u2603) {
        this.g = \u2603;
    }
    
    public int a(final avb \u2603) {
        int n = bnq.a(this.f, new Object[0]).compareTo(bnq.a(\u2603.f, new Object[0]));
        if (n == 0) {
            n = bnq.a(this.d, new Object[0]).compareTo(bnq.a(\u2603.d, new Object[0]));
        }
        return n;
    }
    
    static {
        a = Lists.newArrayList();
        b = new nm<avb>();
        c = Sets.newHashSet();
    }
}
