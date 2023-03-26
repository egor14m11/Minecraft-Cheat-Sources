import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class sq<T extends pr> extends sp
{
    private qa g;
    
    public sq(final qa \u2603, final Class<T> \u2603, final boolean \u2603, final Predicate<? super T> \u2603) {
        super(\u2603, \u2603, 10, \u2603, false, \u2603);
        this.g = \u2603;
    }
    
    @Override
    public boolean a() {
        return !this.g.cl() && super.a();
    }
}
