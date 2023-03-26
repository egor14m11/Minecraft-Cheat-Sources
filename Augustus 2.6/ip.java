import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ip implements ff<ic>
{
    protected double a;
    protected double b;
    protected double c;
    protected float d;
    protected float e;
    protected boolean f;
    protected boolean g;
    protected boolean h;
    
    public ip() {
    }
    
    public ip(final boolean \u2603) {
        this.f = \u2603;
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.f = (\u2603.readUnsignedByte() != 0);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.f ? 1 : 0);
    }
    
    public double a() {
        return this.a;
    }
    
    public double b() {
        return this.b;
    }
    
    public double c() {
        return this.c;
    }
    
    public float d() {
        return this.d;
    }
    
    public float e() {
        return this.e;
    }
    
    public boolean f() {
        return this.f;
    }
    
    public boolean g() {
        return this.g;
    }
    
    public boolean h() {
        return this.h;
    }
    
    public void a(final boolean \u2603) {
        this.g = \u2603;
    }
    
    public static class b extends ip
    {
        public b() {
            this.g = true;
            this.h = true;
        }
        
        public b(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final boolean \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
            this.e = \u2603;
            this.f = \u2603;
            this.h = true;
            this.g = true;
        }
        
        @Override
        public void a(final em \u2603) throws IOException {
            this.a = \u2603.readDouble();
            this.b = \u2603.readDouble();
            this.c = \u2603.readDouble();
            this.d = \u2603.readFloat();
            this.e = \u2603.readFloat();
            super.a(\u2603);
        }
        
        @Override
        public void b(final em \u2603) throws IOException {
            \u2603.writeDouble(this.a);
            \u2603.writeDouble(this.b);
            \u2603.writeDouble(this.c);
            \u2603.writeFloat(this.d);
            \u2603.writeFloat(this.e);
            super.b(\u2603);
        }
    }
    
    public static class a extends ip
    {
        public a() {
            this.g = true;
        }
        
        public a(final double \u2603, final double \u2603, final double \u2603, final boolean \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.f = \u2603;
            this.g = true;
        }
        
        @Override
        public void a(final em \u2603) throws IOException {
            this.a = \u2603.readDouble();
            this.b = \u2603.readDouble();
            this.c = \u2603.readDouble();
            super.a(\u2603);
        }
        
        @Override
        public void b(final em \u2603) throws IOException {
            \u2603.writeDouble(this.a);
            \u2603.writeDouble(this.b);
            \u2603.writeDouble(this.c);
            super.b(\u2603);
        }
    }
    
    public static class c extends ip
    {
        public c() {
            this.h = true;
        }
        
        public c(final float \u2603, final float \u2603, final boolean \u2603) {
            this.d = \u2603;
            this.e = \u2603;
            this.f = \u2603;
            this.h = true;
        }
        
        @Override
        public void a(final em \u2603) throws IOException {
            this.d = \u2603.readFloat();
            this.e = \u2603.readFloat();
            super.a(\u2603);
        }
        
        @Override
        public void b(final em \u2603) throws IOException {
            \u2603.writeFloat(this.d);
            \u2603.writeFloat(this.e);
            super.b(\u2603);
        }
    }
}
