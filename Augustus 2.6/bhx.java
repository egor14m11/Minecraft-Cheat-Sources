import java.util.Iterator;
import java.util.Set;
import java.util.BitSet;

// 
// Decompiled by Procyon v0.5.36
// 

public class bhx
{
    private static final int a;
    private final BitSet b;
    
    public bhx() {
        this.b = new BitSet(bhx.a * bhx.a);
    }
    
    public void a(final Set<cq> \u2603) {
        for (final cq \u26032 : \u2603) {
            for (final cq \u26033 : \u2603) {
                this.a(\u26032, \u26033, true);
            }
        }
    }
    
    public void a(final cq \u2603, final cq \u2603, final boolean \u2603) {
        this.b.set(\u2603.ordinal() + \u2603.ordinal() * bhx.a, \u2603);
        this.b.set(\u2603.ordinal() + \u2603.ordinal() * bhx.a, \u2603);
    }
    
    public void a(final boolean \u2603) {
        this.b.set(0, this.b.size(), \u2603);
    }
    
    public boolean a(final cq \u2603, final cq \u2603) {
        return this.b.get(\u2603.ordinal() + \u2603.ordinal() * bhx.a);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(' ');
        for (final cq \u2603 : cq.values()) {
            sb.append(' ').append(\u2603.toString().toUpperCase().charAt(0));
        }
        sb.append('\n');
        for (final cq \u2603 : cq.values()) {
            sb.append(\u2603.toString().toUpperCase().charAt(0));
            for (final cq \u26032 : cq.values()) {
                if (\u2603 == \u26032) {
                    sb.append("  ");
                }
                else {
                    final boolean a = this.a(\u2603, \u26032);
                    sb.append(' ').append(a ? 'Y' : 'n');
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
    
    static {
        a = cq.values().length;
    }
}
