import java.util.UUID;

// 
// Decompiled by Procyon v0.5.36
// 

public class bmz
{
    private static final jy a;
    private static final jy b;
    
    public static jy a() {
        return bmz.a;
    }
    
    public static jy a(final UUID \u2603) {
        if (c(\u2603)) {
            return bmz.b;
        }
        return bmz.a;
    }
    
    public static String b(final UUID \u2603) {
        if (c(\u2603)) {
            return "slim";
        }
        return "default";
    }
    
    private static boolean c(final UUID \u2603) {
        return (\u2603.hashCode() & 0x1) == 0x1;
    }
    
    static {
        a = new jy("textures/entity/steve.png");
        b = new jy("textures/entity/alex.png");
    }
}
