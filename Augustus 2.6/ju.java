import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class ju implements ff<jt>
{
    private long a;
    
    public ju() {
    }
    
    public ju(final long \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readLong();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeLong(this.a);
    }
    
    @Override
    public void a(final jt \u2603) {
        \u2603.a(this);
    }
    
    public long a() {
        return this.a;
    }
}
