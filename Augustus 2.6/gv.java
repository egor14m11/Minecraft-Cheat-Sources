import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class gv implements ff<fj>
{
    protected int a;
    protected byte b;
    protected byte c;
    protected byte d;
    protected byte e;
    protected byte f;
    protected boolean g;
    protected boolean h;
    
    public gv() {
    }
    
    public gv(final int \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.e();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.b(this.a);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    @Override
    public String toString() {
        return "Entity_" + super.toString();
    }
    
    public pk a(final adm \u2603) {
        return \u2603.a(this.a);
    }
    
    public byte a() {
        return this.b;
    }
    
    public byte b() {
        return this.c;
    }
    
    public byte c() {
        return this.d;
    }
    
    public byte d() {
        return this.e;
    }
    
    public byte e() {
        return this.f;
    }
    
    public boolean f() {
        return this.h;
    }
    
    public boolean g() {
        return this.g;
    }
    
    public static class b extends gv
    {
        public b() {
            this.h = true;
        }
        
        public b(final int \u2603, final byte \u2603, final byte \u2603, final byte \u2603, final byte \u2603, final byte \u2603, final boolean \u2603) {
            super(\u2603);
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
            this.e = \u2603;
            this.f = \u2603;
            this.g = \u2603;
            this.h = true;
        }
        
        @Override
        public void a(final em \u2603) throws IOException {
            super.a(\u2603);
            this.b = \u2603.readByte();
            this.c = \u2603.readByte();
            this.d = \u2603.readByte();
            this.e = \u2603.readByte();
            this.f = \u2603.readByte();
            this.g = \u2603.readBoolean();
        }
        
        @Override
        public void b(final em \u2603) throws IOException {
            super.b(\u2603);
            \u2603.writeByte(this.b);
            \u2603.writeByte(this.c);
            \u2603.writeByte(this.d);
            \u2603.writeByte(this.e);
            \u2603.writeByte(this.f);
            \u2603.writeBoolean(this.g);
        }
    }
    
    public static class a extends gv
    {
        public a() {
        }
        
        public a(final int \u2603, final byte \u2603, final byte \u2603, final byte \u2603, final boolean \u2603) {
            super(\u2603);
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
            this.g = \u2603;
        }
        
        @Override
        public void a(final em \u2603) throws IOException {
            super.a(\u2603);
            this.b = \u2603.readByte();
            this.c = \u2603.readByte();
            this.d = \u2603.readByte();
            this.g = \u2603.readBoolean();
        }
        
        @Override
        public void b(final em \u2603) throws IOException {
            super.b(\u2603);
            \u2603.writeByte(this.b);
            \u2603.writeByte(this.c);
            \u2603.writeByte(this.d);
            \u2603.writeBoolean(this.g);
        }
    }
    
    public static class c extends gv
    {
        public c() {
            this.h = true;
        }
        
        public c(final int \u2603, final byte \u2603, final byte \u2603, final boolean \u2603) {
            super(\u2603);
            this.e = \u2603;
            this.f = \u2603;
            this.h = true;
            this.g = \u2603;
        }
        
        @Override
        public void a(final em \u2603) throws IOException {
            super.a(\u2603);
            this.e = \u2603.readByte();
            this.f = \u2603.readByte();
            this.g = \u2603.readBoolean();
        }
        
        @Override
        public void b(final em \u2603) throws IOException {
            super.b(\u2603);
            \u2603.writeByte(this.e);
            \u2603.writeByte(this.f);
            \u2603.writeBoolean(this.g);
        }
    }
}
