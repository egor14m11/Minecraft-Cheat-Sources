import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Lists;
import java.util.Collection;

// 
// Decompiled by Procyon v0.5.36
// 

public class hr implements ff<fj>
{
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private Collection<String> g;
    private int h;
    private int i;
    
    public hr() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = auq.a.a.e;
        this.f = -1;
        this.g = (Collection<String>)Lists.newArrayList();
    }
    
    public hr(final aul \u2603, final int \u2603) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = auq.a.a.e;
        this.f = -1;
        this.g = (Collection<String>)Lists.newArrayList();
        this.a = \u2603.b();
        this.h = \u2603;
        if (\u2603 == 0 || \u2603 == 2) {
            this.b = \u2603.c();
            this.c = \u2603.e();
            this.d = \u2603.f();
            this.i = \u2603.k();
            this.e = \u2603.i().e;
            this.f = \u2603.l().b();
        }
        if (\u2603 == 0) {
            this.g.addAll(\u2603.d());
        }
    }
    
    public hr(final aul \u2603, final Collection<String> \u2603, final int \u2603) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = auq.a.a.e;
        this.f = -1;
        this.g = (Collection<String>)Lists.newArrayList();
        if (\u2603 != 3 && \u2603 != 4) {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        if (\u2603 == null || \u2603.isEmpty()) {
            throw new IllegalArgumentException("Players cannot be null/empty");
        }
        this.h = \u2603;
        this.a = \u2603.b();
        this.g.addAll(\u2603);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.c(16);
        this.h = \u2603.readByte();
        if (this.h == 0 || this.h == 2) {
            this.b = \u2603.c(32);
            this.c = \u2603.c(16);
            this.d = \u2603.c(16);
            this.i = \u2603.readByte();
            this.e = \u2603.c(32);
            this.f = \u2603.readByte();
        }
        if (this.h == 0 || this.h == 3 || this.h == 4) {
            for (int e = \u2603.e(), i = 0; i < e; ++i) {
                this.g.add(\u2603.c(40));
            }
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        \u2603.writeByte(this.h);
        if (this.h == 0 || this.h == 2) {
            \u2603.a(this.b);
            \u2603.a(this.c);
            \u2603.a(this.d);
            \u2603.writeByte(this.i);
            \u2603.a(this.e);
            \u2603.writeByte(this.f);
        }
        if (this.h == 0 || this.h == 3 || this.h == 4) {
            \u2603.b(this.g.size());
            for (final String \u26032 : this.g) {
                \u2603.a(\u26032);
            }
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public String a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    public String c() {
        return this.c;
    }
    
    public String d() {
        return this.d;
    }
    
    public Collection<String> e() {
        return this.g;
    }
    
    public int f() {
        return this.h;
    }
    
    public int g() {
        return this.i;
    }
    
    public int h() {
        return this.f;
    }
    
    public String i() {
        return this.e;
    }
}
