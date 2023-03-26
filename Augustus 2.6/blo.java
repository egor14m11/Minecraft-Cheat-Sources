import com.google.gson.JsonObject;
import org.lwjgl.opengl.GL14;

// 
// Decompiled by Procyon v0.5.36
// 

public class blo
{
    private static blo a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final boolean h;
    
    private blo(final boolean \u2603, final boolean \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.g = \u2603;
        this.b = \u2603;
        this.d = \u2603;
        this.c = \u2603;
        this.e = \u2603;
        this.h = \u2603;
        this.f = \u2603;
    }
    
    public blo() {
        this(false, true, 1, 0, 1, 0, 32774);
    }
    
    public blo(final int \u2603, final int \u2603, final int \u2603) {
        this(false, false, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public blo(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this(true, false, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public void a() {
        if (this.equals(blo.a)) {
            return;
        }
        if (blo.a == null || this.h != blo.a.b()) {
            blo.a = this;
            if (this.h) {
                bfl.k();
                return;
            }
            bfl.l();
        }
        GL14.glBlendEquation(this.f);
        if (this.g) {
            bfl.a(this.b, this.d, this.c, this.e);
        }
        else {
            bfl.b(this.b, this.d);
        }
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (!(\u2603 instanceof blo)) {
            return false;
        }
        final blo blo = (blo)\u2603;
        return this.f == blo.f && this.e == blo.e && this.d == blo.d && this.h == blo.h && this.g == blo.g && this.c == blo.c && this.b == blo.b;
    }
    
    @Override
    public int hashCode() {
        int b = this.b;
        b = 31 * b + this.c;
        b = 31 * b + this.d;
        b = 31 * b + this.e;
        b = 31 * b + this.f;
        b = 31 * b + (this.g ? 1 : 0);
        b = 31 * b + (this.h ? 1 : 0);
        return b;
    }
    
    public boolean b() {
        return this.h;
    }
    
    public static blo a(final JsonObject \u2603) {
        if (\u2603 == null) {
            return new blo();
        }
        int a = 32774;
        int b = 1;
        int b2 = 0;
        int b3 = 1;
        int b4 = 0;
        boolean b5 = true;
        boolean b6 = false;
        if (ni.a(\u2603, "func")) {
            a = a(\u2603.get("func").getAsString());
            if (a != 32774) {
                b5 = false;
            }
        }
        if (ni.a(\u2603, "srcrgb")) {
            b = b(\u2603.get("srcrgb").getAsString());
            if (b != 1) {
                b5 = false;
            }
        }
        if (ni.a(\u2603, "dstrgb")) {
            b2 = b(\u2603.get("dstrgb").getAsString());
            if (b2 != 0) {
                b5 = false;
            }
        }
        if (ni.a(\u2603, "srcalpha")) {
            b3 = b(\u2603.get("srcalpha").getAsString());
            if (b3 != 1) {
                b5 = false;
            }
            b6 = true;
        }
        if (ni.a(\u2603, "dstalpha")) {
            b4 = b(\u2603.get("dstalpha").getAsString());
            if (b4 != 0) {
                b5 = false;
            }
            b6 = true;
        }
        if (b5) {
            return new blo();
        }
        if (b6) {
            return new blo(b, b2, b3, b4, a);
        }
        return new blo(b, b2, a);
    }
    
    private static int a(final String \u2603) {
        final String lowerCase = \u2603.trim().toLowerCase();
        if (lowerCase.equals("add")) {
            return 32774;
        }
        if (lowerCase.equals("subtract")) {
            return 32778;
        }
        if (lowerCase.equals("reversesubtract")) {
            return 32779;
        }
        if (lowerCase.equals("reverse_subtract")) {
            return 32779;
        }
        if (lowerCase.equals("min")) {
            return 32775;
        }
        if (lowerCase.equals("max")) {
            return 32776;
        }
        return 32774;
    }
    
    private static int b(final String \u2603) {
        String s = \u2603.trim().toLowerCase();
        s = s.replaceAll("_", "");
        s = s.replaceAll("one", "1");
        s = s.replaceAll("zero", "0");
        s = s.replaceAll("minus", "-");
        if (s.equals("0")) {
            return 0;
        }
        if (s.equals("1")) {
            return 1;
        }
        if (s.equals("srccolor")) {
            return 768;
        }
        if (s.equals("1-srccolor")) {
            return 769;
        }
        if (s.equals("dstcolor")) {
            return 774;
        }
        if (s.equals("1-dstcolor")) {
            return 775;
        }
        if (s.equals("srcalpha")) {
            return 770;
        }
        if (s.equals("1-srcalpha")) {
            return 771;
        }
        if (s.equals("dstalpha")) {
            return 772;
        }
        if (s.equals("1-dstalpha")) {
            return 773;
        }
        return -1;
    }
    
    static {
        blo.a = null;
    }
}
