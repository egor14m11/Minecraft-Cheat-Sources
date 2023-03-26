import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

// 
// Decompiled by Procyon v0.5.36
// 

public class mw
{
    public final String e;
    private final eu a;
    public boolean f;
    private final mx b;
    private final auu c;
    private Class<? extends mz> d;
    private static NumberFormat k;
    public static mx g;
    private static DecimalFormat l;
    public static mx h;
    public static mx i;
    public static mx j;
    
    public mw(final String \u2603, final eu \u2603, final mx \u2603) {
        this.e = \u2603;
        this.a = \u2603;
        this.b = \u2603;
        this.c = new auv(this);
        auu.a.put(this.c.a(), this.c);
    }
    
    public mw(final String \u2603, final eu \u2603) {
        this(\u2603, \u2603, mw.g);
    }
    
    public mw i() {
        this.f = true;
        return this;
    }
    
    public mw h() {
        if (na.a.containsKey(this.e)) {
            throw new RuntimeException("Duplicate stat id: \"" + na.a.get(this.e).a + "\" and \"" + this.a + "\" at id " + this.e);
        }
        na.b.add(this);
        na.a.put(this.e, this);
        return this;
    }
    
    public boolean d() {
        return false;
    }
    
    public String a(final int \u2603) {
        return this.b.a(\u2603);
    }
    
    public eu e() {
        final eu f = this.a.f();
        f.b().a(a.h);
        f.b().a(new ew(ew.a.b, new fa(this.e)));
        return f;
    }
    
    public eu j() {
        final eu e = this.e();
        final eu a = new fa("[").a(e).a("]");
        a.a(e.b());
        return a;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 == null || this.getClass() != \u2603.getClass()) {
            return false;
        }
        final mw mw = (mw)\u2603;
        return this.e.equals(mw.e);
    }
    
    @Override
    public int hashCode() {
        return this.e.hashCode();
    }
    
    @Override
    public String toString() {
        return "Stat{id=" + this.e + ", nameId=" + this.a + ", awardLocallyOnly=" + this.f + ", formatter=" + this.b + ", objectiveCriteria=" + this.c + '}';
    }
    
    public auu k() {
        return this.c;
    }
    
    public Class<? extends mz> l() {
        return this.d;
    }
    
    public mw b(final Class<? extends mz> \u2603) {
        this.d = \u2603;
        return this;
    }
    
    static {
        mw.k = NumberFormat.getIntegerInstance(Locale.US);
        mw.g = new mx() {
            @Override
            public String a(final int \u2603) {
                return mw.k.format(\u2603);
            }
        };
        mw.l = new DecimalFormat("########0.00");
        mw.h = new mx() {
            @Override
            public String a(final int \u2603) {
                final double d = \u2603 / 20.0;
                final double number = d / 60.0;
                final double number2 = number / 60.0;
                final double number3 = number2 / 24.0;
                final double number4 = number3 / 365.0;
                if (number4 > 0.5) {
                    return mw.l.format(number4) + " y";
                }
                if (number3 > 0.5) {
                    return mw.l.format(number3) + " d";
                }
                if (number2 > 0.5) {
                    return mw.l.format(number2) + " h";
                }
                if (number > 0.5) {
                    return mw.l.format(number) + " m";
                }
                return d + " s";
            }
        };
        mw.i = new mx() {
            @Override
            public String a(final int \u2603) {
                final double number = \u2603 / 100.0;
                final double number2 = number / 1000.0;
                if (number2 > 0.5) {
                    return mw.l.format(number2) + " km";
                }
                if (number > 0.5) {
                    return mw.l.format(number) + " m";
                }
                return \u2603 + " cm";
            }
        };
        mw.j = new mx() {
            @Override
            public String a(final int \u2603) {
                return mw.l.format(\u2603 * 0.1);
            }
        };
    }
}
