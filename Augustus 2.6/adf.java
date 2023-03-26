// 
// Decompiled by Procyon v0.5.36
// 

public enum adf
{
    a("Solid"), 
    b("Mipped Cutout"), 
    c("Cutout"), 
    d("Translucent");
    
    private final String e;
    
    private adf(final String \u2603) {
        this.e = \u2603;
    }
    
    @Override
    public String toString() {
        return this.e;
    }
}
