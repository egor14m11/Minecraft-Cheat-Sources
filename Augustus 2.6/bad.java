import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public class bad implements bah
{
    private final GameProfile a;
    private final jy b;
    
    public bad(final GameProfile \u2603) {
        this.a = \u2603;
        bet.a(this.b = bet.c(\u2603.getName()), \u2603.getName());
    }
    
    @Override
    public void a(final baf \u2603) {
        ave.A().u().a(new iz(this.a.getId()));
    }
    
    @Override
    public eu A_() {
        return new fa(this.a.getName());
    }
    
    @Override
    public void a(final float \u2603, final int \u2603) {
        ave.A().P().a(this.b);
        bfl.c(1.0f, 1.0f, 1.0f, \u2603 / 255.0f);
        avp.a(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        avp.a(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
    }
    
    @Override
    public boolean B_() {
        return true;
    }
}
