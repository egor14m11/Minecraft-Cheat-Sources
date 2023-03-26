import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.StringUtils;

// 
// Decompiled by Procyon v0.5.36
// 

public class jy
{
    protected final String a;
    protected final String b;
    
    protected jy(final int \u2603, final String... \u2603) {
        this.a = (StringUtils.isEmpty(\u2603[0]) ? "minecraft" : \u2603[0].toLowerCase());
        Validate.notNull(this.b = \u2603[1]);
    }
    
    public jy(final String \u2603) {
        this(0, a(\u2603));
    }
    
    public jy(final String \u2603, final String \u2603) {
        this(0, new String[] { \u2603, \u2603 });
    }
    
    protected static String[] a(final String \u2603) {
        final String[] array = { null, \u2603 };
        final int index = \u2603.indexOf(58);
        if (index >= 0) {
            array[1] = \u2603.substring(index + 1, \u2603.length());
            if (index > 1) {
                array[0] = \u2603.substring(0, index);
            }
        }
        return array;
    }
    
    public String a() {
        return this.b;
    }
    
    public String b() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return this.a + ':' + this.b;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 instanceof jy) {
            final jy jy = (jy)\u2603;
            return this.a.equals(jy.a) && this.b.equals(jy.b);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }
}
