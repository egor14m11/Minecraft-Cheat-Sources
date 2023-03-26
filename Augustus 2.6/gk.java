import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class gk implements ff<fj>
{
    private double a;
    private double b;
    private double c;
    private float d;
    private List<cj> e;
    private float f;
    private float g;
    private float h;
    
    public gk() {
    }
    
    public gk(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final List<cj> \u2603, final aui \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = (List<cj>)Lists.newArrayList((Iterable<?>)\u2603);
        if (\u2603 != null) {
            this.f = (float)\u2603.a;
            this.g = (float)\u2603.b;
            this.h = (float)\u2603.c;
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readFloat();
        this.b = \u2603.readFloat();
        this.c = \u2603.readFloat();
        this.d = \u2603.readFloat();
        final int int1 = \u2603.readInt();
        this.e = (List<cj>)Lists.newArrayListWithCapacity(int1);
        final int n = (int)this.a;
        final int n2 = (int)this.b;
        final int n3 = (int)this.c;
        for (int i = 0; i < int1; ++i) {
            final int \u26032 = \u2603.readByte() + n;
            final int \u26033 = \u2603.readByte() + n2;
            final int \u26034 = \u2603.readByte() + n3;
            this.e.add(new cj(\u26032, \u26033, \u26034));
        }
        this.f = \u2603.readFloat();
        this.g = \u2603.readFloat();
        this.h = \u2603.readFloat();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeFloat((float)this.a);
        \u2603.writeFloat((float)this.b);
        \u2603.writeFloat((float)this.c);
        \u2603.writeFloat(this.d);
        \u2603.writeInt(this.e.size());
        final int n = (int)this.a;
        final int n2 = (int)this.b;
        final int n3 = (int)this.c;
        for (final cj cj : this.e) {
            final int \u26032 = cj.n() - n;
            final int \u26033 = cj.o() - n2;
            final int \u26034 = cj.p() - n3;
            \u2603.writeByte(\u26032);
            \u2603.writeByte(\u26033);
            \u2603.writeByte(\u26034);
        }
        \u2603.writeFloat(this.f);
        \u2603.writeFloat(this.g);
        \u2603.writeFloat(this.h);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public float a() {
        return this.f;
    }
    
    public float b() {
        return this.g;
    }
    
    public float c() {
        return this.h;
    }
    
    public double d() {
        return this.a;
    }
    
    public double e() {
        return this.b;
    }
    
    public double f() {
        return this.c;
    }
    
    public float g() {
        return this.d;
    }
    
    public List<cj> h() {
        return this.e;
    }
}
