import java.io.IOException;
import java.util.UUID;

// 
// Decompiled by Procyon v0.5.36
// 

public class iz implements ff<ic>
{
    private UUID a;
    
    public iz() {
    }
    
    public iz(final UUID \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final em \u2603) throws IOException {
        this.a = \u2603.g();
    }
    
    @Override
    public void b(final em \u2603) throws IOException {
        \u2603.a(this.a);
    }
    
    @Override
    public void a(final ic \u2603) {
        \u2603.a(this);
    }
    
    public pk a(final le \u2603) {
        return \u2603.a(this.a);
    }
}
