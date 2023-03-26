import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

// 
// Decompiled by Procyon v0.5.36
// 

public class bhn
{
    private final bht a;
    private final ReentrantLock b;
    private final List<Runnable> c;
    private final b d;
    private bfg e;
    private bhq f;
    private a g;
    private boolean h;
    
    public bhn(final bht \u2603, final b \u2603) {
        this.b = new ReentrantLock();
        this.c = (List<Runnable>)Lists.newArrayList();
        this.g = bhn.a.a;
        this.a = \u2603;
        this.d = \u2603;
    }
    
    public a a() {
        return this.g;
    }
    
    public bht b() {
        return this.a;
    }
    
    public bhq c() {
        return this.f;
    }
    
    public void a(final bhq \u2603) {
        this.f = \u2603;
    }
    
    public bfg d() {
        return this.e;
    }
    
    public void a(final bfg \u2603) {
        this.e = \u2603;
    }
    
    public void a(final a \u2603) {
        this.b.lock();
        try {
            this.g = \u2603;
        }
        finally {
            this.b.unlock();
        }
    }
    
    public void e() {
        this.b.lock();
        try {
            if (this.d == bhn.b.a && this.g != bhn.a.d) {
                this.a.a(true);
            }
            this.h = true;
            this.g = bhn.a.d;
            for (final Runnable runnable : this.c) {
                runnable.run();
            }
        }
        finally {
            this.b.unlock();
        }
    }
    
    public void a(final Runnable \u2603) {
        this.b.lock();
        try {
            this.c.add(\u2603);
            if (this.h) {
                \u2603.run();
            }
        }
        finally {
            this.b.unlock();
        }
    }
    
    public ReentrantLock f() {
        return this.b;
    }
    
    public b g() {
        return this.d;
    }
    
    public boolean h() {
        return this.h;
    }
    
    public enum b
    {
        a, 
        b;
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d;
    }
}
