import java.util.Collection;
import java.util.Iterator;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class apz
{
    private final List<aqa> a;
    private final Map<String, Map<String, String>> b;
    private int c;
    
    public apz() {
        this.a = (List<aqa>)Lists.newArrayList();
        this.b = (Map<String, Map<String, String>>)Maps.newHashMap();
    }
    
    public int a() {
        return this.c;
    }
    
    public void a(final int \u2603) {
        this.c = \u2603;
    }
    
    public Map<String, Map<String, String>> b() {
        return this.b;
    }
    
    public List<aqa> c() {
        return this.a;
    }
    
    public void d() {
        int \u2603 = 0;
        for (final aqa aqa : this.a) {
            aqa.b(\u2603);
            \u2603 += aqa.b();
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(3);
        sb.append(";");
        for (int i = 0; i < this.a.size(); ++i) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(this.a.get(i).toString());
        }
        sb.append(";");
        sb.append(this.c);
        if (!this.b.isEmpty()) {
            sb.append(";");
            int i = 0;
            for (final Map.Entry<String, Map<String, String>> entry : this.b.entrySet()) {
                if (i++ > 0) {
                    sb.append(",");
                }
                sb.append(entry.getKey().toLowerCase());
                final Map<String, String> map = entry.getValue();
                if (!map.isEmpty()) {
                    sb.append("(");
                    int n = 0;
                    for (final Map.Entry<String, String> entry2 : map.entrySet()) {
                        if (n++ > 0) {
                            sb.append(" ");
                        }
                        sb.append(entry2.getKey());
                        sb.append("=");
                        sb.append(entry2.getValue());
                    }
                    sb.append(")");
                }
            }
        }
        else {
            sb.append(";");
        }
        return sb.toString();
    }
    
    private static aqa a(final int \u2603, final String \u2603, final int \u2603) {
        String[] array = (\u2603 >= 3) ? \u2603.split("\\*", 2) : \u2603.split("x", 2);
        int int1 = 1;
        int int2 = 0;
        if (array.length == 2) {
            try {
                int1 = Integer.parseInt(array[0]);
                if (\u2603 + int1 >= 256) {
                    int1 = 256 - \u2603;
                }
                if (int1 < 0) {
                    int1 = 0;
                }
            }
            catch (Throwable t) {
                return null;
            }
        }
        afh \u26032 = null;
        try {
            final String s = array[array.length - 1];
            if (\u2603 < 3) {
                array = s.split(":", 2);
                if (array.length > 1) {
                    int2 = Integer.parseInt(array[1]);
                }
                \u26032 = afh.c(Integer.parseInt(array[0]));
            }
            else {
                array = s.split(":", 3);
                \u26032 = ((array.length > 1) ? afh.b(array[0] + ":" + array[1]) : null);
                if (\u26032 != null) {
                    int2 = ((array.length > 2) ? Integer.parseInt(array[2]) : 0);
                }
                else {
                    \u26032 = afh.b(array[0]);
                    if (\u26032 != null) {
                        int2 = ((array.length > 1) ? Integer.parseInt(array[1]) : 0);
                    }
                }
                if (\u26032 == null) {
                    return null;
                }
            }
            if (\u26032 == afi.a) {
                int2 = 0;
            }
            if (int2 < 0 || int2 > 15) {
                int2 = 0;
            }
        }
        catch (Throwable t2) {
            return null;
        }
        final aqa aqa = new aqa(\u2603, int1, \u26032, int2);
        aqa.b(\u2603);
        return aqa;
    }
    
    private static List<aqa> a(final int \u2603, final String \u2603) {
        if (\u2603 == null || \u2603.length() < 1) {
            return null;
        }
        final List<aqa> arrayList = (List<aqa>)Lists.newArrayList();
        final String[] split = \u2603.split(",");
        int \u26032 = 0;
        for (final String \u26033 : split) {
            final aqa a = a(\u2603, \u26033, \u26032);
            if (a == null) {
                return null;
            }
            arrayList.add(a);
            \u26032 += a.b();
        }
        return arrayList;
    }
    
    public static apz a(final String \u2603) {
        if (\u2603 == null) {
            return e();
        }
        final String[] split = \u2603.split(";", -1);
        final int \u26032 = (split.length == 1) ? 0 : ns.a(split[0], 0);
        if (\u26032 < 0 || \u26032 > 3) {
            return e();
        }
        final apz apz = new apz();
        int n = (split.length != 1) ? 1 : 0;
        final List<aqa> a = a(\u26032, split[n++]);
        if (a == null || a.isEmpty()) {
            return e();
        }
        apz.c().addAll(a);
        apz.d();
        int n2 = ady.q.az;
        if (\u26032 > 0 && split.length > n) {
            n2 = ns.a(split[n++], n2);
        }
        apz.a(n2);
        if (\u26032 > 0 && split.length > n) {
            final String[] split2;
            final String[] array = split2 = split[n++].toLowerCase().split(",");
            for (final String s : split2) {
                final String[] split3 = s.split("\\(", 2);
                final Map<String, String> hashMap = (Map<String, String>)Maps.newHashMap();
                if (split3[0].length() > 0) {
                    apz.b().put(split3[0], hashMap);
                    if (split3.length > 1 && split3[1].endsWith(")") && split3[1].length() > 1) {
                        final String[] split4 = split3[1].substring(0, split3[1].length() - 1).split(" ");
                        for (int j = 0; j < split4.length; ++j) {
                            final String[] split5 = split4[j].split("=", 2);
                            if (split5.length == 2) {
                                hashMap.put(split5[0], split5[1]);
                            }
                        }
                    }
                }
            }
        }
        else {
            apz.b().put("village", (Map<String, String>)Maps.newHashMap());
        }
        return apz;
    }
    
    public static apz e() {
        final apz apz = new apz();
        apz.a(ady.q.az);
        apz.c().add(new aqa(1, afi.h));
        apz.c().add(new aqa(2, afi.d));
        apz.c().add(new aqa(1, afi.c));
        apz.d();
        apz.b().put("village", (Map<String, String>)Maps.newHashMap());
        return apz;
    }
}
