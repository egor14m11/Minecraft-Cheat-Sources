import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajc extends afh
{
    private final boolean a;
    
    public ajc(final boolean \u2603) {
        super(arm.t);
        this.a = \u2603;
        if (\u2603) {
            this.a(1.0f);
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.D) {
            return;
        }
        if (this.a && !\u2603.z(\u2603)) {
            \u2603.a(\u2603, afi.bJ.Q(), 2);
        }
        else if (!this.a && \u2603.z(\u2603)) {
            \u2603.a(\u2603, afi.bK.Q(), 2);
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (\u2603.D) {
            return;
        }
        if (this.a && !\u2603.z(\u2603)) {
            \u2603.a(\u2603, this, 4);
        }
        else if (!this.a && \u2603.z(\u2603)) {
            \u2603.a(\u2603, afi.bK.Q(), 2);
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.D) {
            return;
        }
        if (this.a && !\u2603.z(\u2603)) {
            \u2603.a(\u2603, afi.bJ.Q(), 2);
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zw.a(afi.bJ);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zw.a(afi.bJ);
    }
    
    @Override
    protected zx i(final alz \u2603) {
        return new zx(afi.bJ);
    }
}
