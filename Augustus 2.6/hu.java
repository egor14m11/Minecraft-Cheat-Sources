import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class hu implements ff<fj>
{
    private long a;
    private long b;
    
    public hu() {
    }
    
    public hu(final long \u2603, final long \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        if (!\u2603) {
            this.b = -this.b;
            if (this.b == 0L) {
                this.b = -1L;
            }
        }
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.readLong();
        this.b = \u2603.readLong();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.writeLong(this.a);
        \u2603.writeLong(this.b);
    }
    
    @Override
    public void a(final fj \u2603) {
        \u2603.a(this);
    }
    
    public long a() {
        return this.a;
    }
    
    public long b() {
        return this.b;
    }
}
