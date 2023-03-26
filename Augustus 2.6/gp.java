import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class gp implements ff<fj>
{
    private int[] a;
    private int[] b;
    private go.a[] c;
    private boolean d;
    
    public gp() {
    }
    
    public gp(final List<amy> \u2603) {
        final int size = \u2603.size();
        this.a = new int[size];
        this.b = new int[size];
        this.c = new go.a[size];
        this.d = !\u2603.get(0).p().t.o();
        for (int i = 0; i < size; ++i) {
            final amy \u26032 = \u2603.get(i);
            final go.a a = go.a(\u26032, true, this.d, 65535);
            this.a[i] = \u26032.a;
            this.b[i] = \u26032.b;
            this.c[i] = a;
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.d = \u2603.readBoolean();
        final int e = \u2603.e();
        this.a = new int[e];
        this.b = new int[e];
        this.c = new go.a[e];
        for (int i = 0; i < e; ++i) {
            this.a[i] = \u2603.readInt();
            this.b[i] = \u2603.readInt();
            this.c[i] = new go.a();
            this.c[i].b = (\u2603.readShort() & 0xFFFF);
            this.c[i].a = new byte[go.a(Integer.bitCount(this.c[i].b), this.d, true)];
        }
        for (int i = 0; i < e; ++i) {
            \u2603.readBytes(this.c[i].a);
        }
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeBoolean(this.d);
        \u2603.b(this.c.length);
        for (int i = 0; i < this.a.length; ++i) {
            \u2603.writeInt(this.a[i]);
            \u2603.writeInt(this.b[i]);
            \u2603.writeShort((short)(this.c[i].b & 0xFFFF));
        }
        for (int i = 0; i < this.a.length; ++i) {
            \u2603.writeBytes(this.c[i].a);
        }
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a(final int \u2603) {
        return this.a[\u2603];
    }
    
    public int b(final int \u2603) {
        return this.b[\u2603];
    }
    
    public int a() {
        return this.a.length;
    }
    
    public byte[] c(final int \u2603) {
        return this.c[\u2603].a;
    }
    
    public int d(final int \u2603) {
        return this.c[\u2603].b;
    }
}
