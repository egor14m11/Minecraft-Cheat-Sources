import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hj implements ff<fj>
{
    private int a;
    private String b;
    
    public hj() {
    }
    
    public hj(final int \u2603, final auk \u2603) {
        this.a = \u2603;
        if (\u2603 == null) {
            this.b = "";
        }
        else {
            this.b = \u2603.b();
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readByte();
        this.b = \u2603.c(16);
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeByte(this.a);
        \u2603.a(this.b);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public int a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
}
