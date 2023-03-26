import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hg implements ff<fj>
{
    private a a;
    private int b;
    private double c;
    private double d;
    private double e;
    private double f;
    private long g;
    private int h;
    private int i;
    
    public hg() {
    }
    
    public hg(final ams \u2603, final a \u2603) {
        this.a = \u2603;
        this.c = \u2603.f();
        this.d = \u2603.g();
        this.f = \u2603.h();
        this.e = \u2603.j();
        this.g = \u2603.i();
        this.b = \u2603.l();
        this.i = \u2603.q();
        this.h = \u2603.p();
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.a(a.class);
        switch (hg$1.a[this.a.ordinal()]) {
            case 1: {
                this.e = \u2603.readDouble();
                break;
            }
            case 2: {
                this.f = \u2603.readDouble();
                this.e = \u2603.readDouble();
                this.g = \u2603.f();
                break;
            }
            case 3: {
                this.c = \u2603.readDouble();
                this.d = \u2603.readDouble();
                break;
            }
            case 4: {
                this.i = \u2603.e();
                break;
            }
            case 5: {
                this.h = \u2603.e();
                break;
            }
            case 6: {
                this.c = \u2603.readDouble();
                this.d = \u2603.readDouble();
                this.f = \u2603.readDouble();
                this.e = \u2603.readDouble();
                this.g = \u2603.f();
                this.b = \u2603.e();
                this.i = \u2603.e();
                this.h = \u2603.e();
                break;
            }
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        switch (hg$1.a[this.a.ordinal()]) {
            case 1: {
                \u2603.writeDouble(this.e);
                break;
            }
            case 2: {
                \u2603.writeDouble(this.f);
                \u2603.writeDouble(this.e);
                \u2603.b(this.g);
                break;
            }
            case 3: {
                \u2603.writeDouble(this.c);
                \u2603.writeDouble(this.d);
                break;
            }
            case 5: {
                \u2603.b(this.h);
                break;
            }
            case 4: {
                \u2603.b(this.i);
                break;
            }
            case 6: {
                \u2603.writeDouble(this.c);
                \u2603.writeDouble(this.d);
                \u2603.writeDouble(this.f);
                \u2603.writeDouble(this.e);
                \u2603.b(this.g);
                \u2603.b(this.b);
                \u2603.b(this.i);
                \u2603.b(this.h);
                break;
            }
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public void a(final ams \u2603) {
        switch (hg$1.a[this.a.ordinal()]) {
            case 1: {
                \u2603.a(this.e);
                break;
            }
            case 2: {
                \u2603.a(this.f, this.e, this.g);
                break;
            }
            case 3: {
                \u2603.c(this.c, this.d);
                break;
            }
            case 6: {
                \u2603.c(this.c, this.d);
                if (this.g > 0L) {
                    \u2603.a(this.f, this.e, this.g);
                }
                else {
                    \u2603.a(this.e);
                }
                \u2603.a(this.b);
                \u2603.c(this.i);
                \u2603.b(this.h);
                break;
            }
            case 5: {
                \u2603.b(this.h);
                break;
            }
            case 4: {
                \u2603.c(this.i);
                break;
            }
        }
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d, 
        e, 
        f;
    }
}
