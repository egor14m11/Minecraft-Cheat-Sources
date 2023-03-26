import org.apache.commons.lang3.Validate;
import java.util.Random;
import io.netty.util.internal.ThreadLocalRandom;
import java.util.UUID;

// 
// Decompiled by Procyon v0.5.36
// 

public class qd
{
    private final double a;
    private final int b;
    private final String c;
    private final UUID d;
    private boolean e;
    
    public qd(final String \u2603, final double \u2603, final int \u2603) {
        this(ns.a(ThreadLocalRandom.current()), \u2603, \u2603, \u2603);
    }
    
    public qd(final UUID \u2603, final String \u2603, final double \u2603, final int \u2603) {
        this.e = true;
        this.d = \u2603;
        this.c = \u2603;
        this.a = \u2603;
        this.b = \u2603;
        Validate.notEmpty(\u2603, "Modifier name cannot be empty", new Object[0]);
        Validate.inclusiveBetween(0L, 2L, \u2603, "Invalid operation");
    }
    
    public UUID a() {
        return this.d;
    }
    
    public String b() {
        return this.c;
    }
    
    public int c() {
        return this.b;
    }
    
    public double d() {
        return this.a;
    }
    
    public boolean e() {
        return this.e;
    }
    
    public qd a(final boolean \u2603) {
        this.e = \u2603;
        return this;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 == null || this.getClass() != \u2603.getClass()) {
            return false;
        }
        final qd qd = (qd)\u2603;
        if (this.d != null) {
            if (this.d.equals(qd.d)) {
                return true;
            }
        }
        else if (qd.d == null) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.d != null) ? this.d.hashCode() : 0;
    }
    
    @Override
    public String toString() {
        return "AttributeModifier{amount=" + this.a + ", operation=" + this.b + ", name='" + this.c + '\'' + ", id=" + this.d + ", serialize=" + this.e + '}';
    }
}
