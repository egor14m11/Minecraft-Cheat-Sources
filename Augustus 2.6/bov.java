import org.apache.commons.lang3.StringUtils;

// 
// Decompiled by Procyon v0.5.36
// 

public class bov extends jy
{
    private final String c;
    
    protected bov(final int \u2603, final String... \u2603) {
        super(0, new String[] { \u2603[0], \u2603[1] });
        this.c = (StringUtils.isEmpty(\u2603[2]) ? "normal" : \u2603[2].toLowerCase());
    }
    
    public bov(final String \u2603) {
        this(0, b(\u2603));
    }
    
    public bov(final jy \u2603, final String \u2603) {
        this(\u2603.toString(), \u2603);
    }
    
    public bov(final String \u2603, final String \u2603) {
        this(0, b(\u2603 + '#' + ((\u2603 == null) ? "normal" : \u2603)));
    }
    
    protected static String[] b(final String \u2603) {
        final String[] array = { null, \u2603, null };
        final int index = \u2603.indexOf(35);
        String substring = \u2603;
        if (index >= 0) {
            array[2] = \u2603.substring(index + 1, \u2603.length());
            if (index > 1) {
                substring = \u2603.substring(0, index);
            }
        }
        System.arraycopy(jy.a(substring), 0, array, 0, 2);
        return array;
    }
    
    public String c() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 instanceof bov && super.equals(\u2603)) {
            final bov bov = (bov)\u2603;
            return this.c.equals(bov.c);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.c.hashCode();
    }
    
    @Override
    public String toString() {
        return super.toString() + '#' + this.c;
    }
}
