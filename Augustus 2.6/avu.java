import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class avu
{
    public static String a(final String \u2603, final boolean \u2603) {
        if (\u2603 || ave.A().t.n) {
            return \u2603;
        }
        return a.a(\u2603);
    }
    
    public static List<eu> a(final eu \u2603, final int \u2603, final avn \u2603, final boolean \u2603, final boolean \u2603) {
        int n = 0;
        eu eu = new fa("");
        final List<eu> arrayList = (List<eu>)Lists.newArrayList();
        final List<eu> arrayList2 = (List<eu>)Lists.newArrayList((Iterable<?>)\u2603);
        for (int i = 0; i < arrayList2.size(); ++i) {
            final eu eu2 = arrayList2.get(i);
            String str = eu2.e();
            boolean b = false;
            if (str.contains("\n")) {
                final int index = str.indexOf(10);
                final String substring = str.substring(index + 1);
                str = str.substring(0, index + 1);
                final fa fa = new fa(substring);
                fa.a(eu2.b().m());
                arrayList2.add(i + 1, fa);
                b = true;
            }
            String a = a(eu2.b().k() + str, \u2603);
            final String substring = a.endsWith("\n") ? a.substring(0, a.length() - 1) : a;
            int n2 = \u2603.a(substring);
            fa fa2 = new fa(substring);
            fa2.a(eu2.b().m());
            if (n + n2 > \u2603) {
                String s = \u2603.a(a, \u2603 - n, false);
                String substring2 = (s.length() < a.length()) ? a.substring(s.length()) : null;
                if (substring2 != null && substring2.length() > 0) {
                    int lastIndex = s.lastIndexOf(" ");
                    if (lastIndex >= 0 && \u2603.a(a.substring(0, lastIndex)) > 0) {
                        s = a.substring(0, lastIndex);
                        if (\u2603) {
                            ++lastIndex;
                        }
                        substring2 = a.substring(lastIndex);
                    }
                    else if (n > 0 && !a.contains(" ")) {
                        s = "";
                        substring2 = a;
                    }
                    final fa fa3 = new fa(substring2);
                    fa3.a(eu2.b().m());
                    arrayList2.add(i + 1, fa3);
                }
                a = s;
                n2 = \u2603.a(a);
                fa2 = new fa(a);
                fa2.a(eu2.b().m());
                b = true;
            }
            if (n + n2 <= \u2603) {
                n += n2;
                eu.a(fa2);
            }
            else {
                b = true;
            }
            if (b) {
                arrayList.add(eu);
                n = 0;
                eu = new fa("");
            }
        }
        arrayList.add(eu);
        return arrayList;
    }
}
