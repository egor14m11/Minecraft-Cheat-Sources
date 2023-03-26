import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajl extends afc
{
    protected ajl() {
        super(arm.d);
        final float n = 0.25f;
        final float \u2603 = 1.0f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, \u2603, 0.5f + n);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public aug b(final adm \u2603, final cj \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.b(\u2603, \u2603);
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean b(final adq \u2603, final cj \u2603) {
        return true;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean g() {
        return true;
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new aln();
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.ap;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.ap;
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        final akw s = \u2603.s(\u2603);
        return s instanceof aln && ((aln)s).b(\u2603);
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return !this.e(\u2603, \u2603) && super.d(\u2603, \u2603);
    }
}
