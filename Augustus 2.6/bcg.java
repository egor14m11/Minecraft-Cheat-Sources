// 
// Decompiled by Procyon v0.5.36
// 

public class bcg
{
    public aui a;
    public float b;
    public float c;
    
    public bcg(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this(new aui(\u2603, \u2603, \u2603), \u2603, \u2603);
    }
    
    public bcg a(final float \u2603, final float \u2603) {
        return new bcg(this, \u2603, \u2603);
    }
    
    public bcg(final bcg \u2603, final float \u2603, final float \u2603) {
        this.a = \u2603.a;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    public bcg(final aui \u2603, final float \u2603, final float \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
}
