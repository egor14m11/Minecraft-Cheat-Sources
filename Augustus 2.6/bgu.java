import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class bgu implements bgy
{
    protected Map<alz, bov> b;
    
    public bgu() {
        this.b = (Map<alz, bov>)Maps.newLinkedHashMap();
    }
    
    public String a(final Map<amo, Comparable> \u2603) {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<amo, Comparable> entry : \u2603.entrySet()) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            final amo amo = entry.getKey();
            final Comparable comparable = entry.getValue();
            sb.append(amo.a());
            sb.append("=");
            sb.append(amo.a(comparable));
        }
        if (sb.length() == 0) {
            sb.append("normal");
        }
        return sb.toString();
    }
    
    @Override
    public Map<alz, bov> a(final afh \u2603) {
        for (final alz alz : \u2603.P().a()) {
            this.b.put(alz, this.a(alz));
        }
        return this.b;
    }
    
    protected abstract bov a(final alz p0);
}
