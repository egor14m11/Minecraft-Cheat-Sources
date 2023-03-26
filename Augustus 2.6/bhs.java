// 
// Decompiled by Procyon v0.5.36
// 

public class bhs extends bht
{
    private final int d;
    
    public bhs(final adm \u2603, final bfr \u2603, final cj \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.d = avd.a(adf.values().length);
    }
    
    public int a(final adf \u2603, final bhq \u2603) {
        if (!\u2603.b(\u2603)) {
            return this.d + \u2603.ordinal();
        }
        return -1;
    }
    
    @Override
    public void a() {
        super.a();
        avd.a(this.d, adf.values().length);
    }
}
