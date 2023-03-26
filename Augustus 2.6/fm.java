import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class fm implements ff<fj>
{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    
    public fm() {
    }
    
    public fm(final pk \u2603) {
        this.a = \u2603.F();
        this.b = ns.c(\u2603.s * 32.0);
        this.c = ns.c(\u2603.t * 32.0);
        this.d = ns.c(\u2603.u * 32.0);
        if (\u2603 instanceof uv) {
            this.e = 1;
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
        this.e = \u2603.readByte();
        this.b = \u2603.readInt();
        this.c = \u2603.readInt();
        this.d = \u2603.readInt();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
        \u2603.writeByte(this.e);
        \u2603.writeInt(this.b);
        \u2603.writeInt(this.c);
        \u2603.writeInt(this.d);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
    
    public int d() {
        return this.d;
    }
    
    public int e() {
        return this.e;
    }
}
