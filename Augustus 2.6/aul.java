import java.util.Collection;
import com.google.common.collect.Sets;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class aul extends auq
{
    private final auo a;
    private final String b;
    private final Set<String> c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private a i;
    private a j;
    private a k;
    
    public aul(final auo \u2603, final String \u2603) {
        this.c = (Set<String>)Sets.newHashSet();
        this.e = "";
        this.f = "";
        this.g = true;
        this.h = true;
        this.i = auq.a.a;
        this.j = auq.a.a;
        this.k = a.v;
        this.a = \u2603;
        this.b = \u2603;
        this.d = \u2603;
    }
    
    @Override
    public String b() {
        return this.b;
    }
    
    public String c() {
        return this.d;
    }
    
    public void a(final String \u2603) {
        if (\u2603 == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.d = \u2603;
        this.a.b(this);
    }
    
    @Override
    public Collection<String> d() {
        return this.c;
    }
    
    public String e() {
        return this.e;
    }
    
    public void b(final String \u2603) {
        if (\u2603 == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }
        this.e = \u2603;
        this.a.b(this);
    }
    
    public String f() {
        return this.f;
    }
    
    public void c(final String \u2603) {
        this.f = \u2603;
        this.a.b(this);
    }
    
    @Override
    public String d(final String \u2603) {
        return this.e() + \u2603 + this.f();
    }
    
    public static String a(final auq \u2603, final String \u2603) {
        if (\u2603 == null) {
            return \u2603;
        }
        return \u2603.d(\u2603);
    }
    
    @Override
    public boolean g() {
        return this.g;
    }
    
    public void a(final boolean \u2603) {
        this.g = \u2603;
        this.a.b(this);
    }
    
    @Override
    public boolean h() {
        return this.h;
    }
    
    public void b(final boolean \u2603) {
        this.h = \u2603;
        this.a.b(this);
    }
    
    @Override
    public a i() {
        return this.i;
    }
    
    @Override
    public a j() {
        return this.j;
    }
    
    public void a(final a \u2603) {
        this.i = \u2603;
        this.a.b(this);
    }
    
    public void b(final a \u2603) {
        this.j = \u2603;
        this.a.b(this);
    }
    
    public int k() {
        int n = 0;
        if (this.g()) {
            n |= 0x1;
        }
        if (this.h()) {
            n |= 0x2;
        }
        return n;
    }
    
    public void a(final int \u2603) {
        this.a((\u2603 & 0x1) > 0);
        this.b((\u2603 & 0x2) > 0);
    }
    
    public void a(final a \u2603) {
        this.k = \u2603;
    }
    
    public a l() {
        return this.k;
    }
}
