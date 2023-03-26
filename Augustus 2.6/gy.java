import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gy implements ff<fj>
{
    public a a;
    public int b;
    public int c;
    public int d;
    public String e;
    
    public gy() {
    }
    
    public gy(final ov \u2603, final a \u2603) {
        this.a = \u2603;
        final pr c = \u2603.c();
        switch (gy$1.a[\u2603.ordinal()]) {
            case 1: {
                this.d = \u2603.f();
                this.c = ((c == null) ? -1 : c.F());
                break;
            }
            case 2: {
                this.b = \u2603.h().F();
                this.c = ((c == null) ? -1 : c.F());
                this.e = \u2603.b().c();
                break;
            }
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.a(a.class);
        if (this.a == gy.a.b) {
            this.d = \u2603.e();
            this.c = \u2603.readInt();
        }
        else if (this.a == gy.a.c) {
            this.b = \u2603.e();
            this.c = \u2603.readInt();
            this.e = \u2603.c(32767);
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
        if (this.a == gy.a.b) {
            \u2603.b(this.d);
            \u2603.writeInt(this.c);
        }
        else if (this.a == gy.a.c) {
            \u2603.b(this.b);
            \u2603.writeInt(this.c);
            \u2603.a(this.e);
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public enum a
    {
        a, 
        b, 
        c;
    }
}
