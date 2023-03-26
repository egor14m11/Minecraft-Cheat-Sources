import java.util.Iterator;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.base.Functions;
import java.util.Arrays;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import com.google.common.primitives.Doubles;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class i implements k
{
    private static h a;
    
    public int a() {
        return 4;
    }
    
    @Override
    public List<String> b() {
        return Collections.emptyList();
    }
    
    @Override
    public boolean a(final m \u2603) {
        return \u2603.a(this.a(), this.c());
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        return null;
    }
    
    public static int a(final String \u2603) throws cb {
        try {
            return Integer.parseInt(\u2603);
        }
        catch (NumberFormatException ex) {
            throw new cb("commands.generic.num.invalid", new Object[] { \u2603 });
        }
    }
    
    public static int a(final String \u2603, final int \u2603) throws cb {
        return a(\u2603, \u2603, Integer.MAX_VALUE);
    }
    
    public static int a(final String \u2603, final int \u2603, final int \u2603) throws cb {
        final int a = a(\u2603);
        if (a < \u2603) {
            throw new cb("commands.generic.num.tooSmall", new Object[] { a, \u2603 });
        }
        if (a > \u2603) {
            throw new cb("commands.generic.num.tooBig", new Object[] { a, \u2603 });
        }
        return a;
    }
    
    public static long b(final String \u2603) throws cb {
        try {
            return Long.parseLong(\u2603);
        }
        catch (NumberFormatException ex) {
            throw new cb("commands.generic.num.invalid", new Object[] { \u2603 });
        }
    }
    
    public static long a(final String \u2603, final long \u2603, final long \u2603) throws cb {
        final long b = b(\u2603);
        if (b < \u2603) {
            throw new cb("commands.generic.num.tooSmall", new Object[] { b, \u2603 });
        }
        if (b > \u2603) {
            throw new cb("commands.generic.num.tooBig", new Object[] { b, \u2603 });
        }
        return b;
    }
    
    public static cj a(final m \u2603, final String[] \u2603, final int \u2603, final boolean \u2603) throws cb {
        final cj c = \u2603.c();
        return new cj(b(c.n(), \u2603[\u2603], -30000000, 30000000, \u2603), b(c.o(), \u2603[\u2603 + 1], 0, 256, false), b(c.p(), \u2603[\u2603 + 2], -30000000, 30000000, \u2603));
    }
    
    public static double c(final String \u2603) throws cb {
        try {
            final double double1 = Double.parseDouble(\u2603);
            if (!Doubles.isFinite(double1)) {
                throw new cb("commands.generic.num.invalid", new Object[] { \u2603 });
            }
            return double1;
        }
        catch (NumberFormatException ex) {
            throw new cb("commands.generic.num.invalid", new Object[] { \u2603 });
        }
    }
    
    public static double a(final String \u2603, final double \u2603) throws cb {
        return a(\u2603, \u2603, Double.MAX_VALUE);
    }
    
    public static double a(final String \u2603, final double \u2603, final double \u2603) throws cb {
        final double c = c(\u2603);
        if (c < \u2603) {
            throw new cb("commands.generic.double.tooSmall", new Object[] { c, \u2603 });
        }
        if (c > \u2603) {
            throw new cb("commands.generic.double.tooBig", new Object[] { c, \u2603 });
        }
        return c;
    }
    
    public static boolean d(final String \u2603) throws bz {
        if (\u2603.equals("true") || \u2603.equals("1")) {
            return true;
        }
        if (\u2603.equals("false") || \u2603.equals("0")) {
            return false;
        }
        throw new bz("commands.generic.boolean.invalid", new Object[] { \u2603 });
    }
    
    public static lf b(final m \u2603) throws cd {
        if (\u2603 instanceof lf) {
            return (lf)\u2603;
        }
        throw new cd("You must specify which player you wish to perform this action on.", new Object[0]);
    }
    
    public static lf a(final m \u2603, final String \u2603) throws cd {
        lf lf = o.a(\u2603, \u2603);
        if (lf == null) {
            try {
                lf = MinecraftServer.N().ap().a(UUID.fromString(\u2603));
            }
            catch (IllegalArgumentException ex) {}
        }
        if (lf == null) {
            lf = MinecraftServer.N().ap().a(\u2603);
        }
        if (lf == null) {
            throw new cd();
        }
        return lf;
    }
    
    public static pk b(final m \u2603, final String \u2603) throws ca {
        return a(\u2603, \u2603, (Class<? extends pk>)pk.class);
    }
    
    public static <T extends pk> T a(final m \u2603, final String \u2603, final Class<? extends T> \u2603) throws ca {
        pk pk = o.a(\u2603, \u2603, (Class<? extends pk>)\u2603);
        final MinecraftServer n = MinecraftServer.N();
        if (pk == null) {
            pk = n.ap().a(\u2603);
        }
        if (pk == null) {
            try {
                final UUID fromString = UUID.fromString(\u2603);
                pk = n.a(fromString);
                if (pk == null) {
                    pk = n.ap().a(fromString);
                }
            }
            catch (IllegalArgumentException ex) {
                throw new ca("commands.generic.entity.invalidUuid", new Object[0]);
            }
        }
        if (pk == null || !\u2603.isAssignableFrom(pk.getClass())) {
            throw new ca();
        }
        return (T)pk;
    }
    
    public static List<pk> c(final m \u2603, final String \u2603) throws ca {
        if (o.b(\u2603)) {
            return o.b(\u2603, \u2603, (Class<? extends pk>)pk.class);
        }
        return Lists.newArrayList(b(\u2603, \u2603));
    }
    
    public static String d(final m \u2603, final String \u2603) throws cd {
        try {
            return a(\u2603, \u2603).e_();
        }
        catch (cd cd) {
            if (o.b(\u2603)) {
                throw cd;
            }
            return \u2603;
        }
    }
    
    public static String e(final m \u2603, final String \u2603) throws ca {
        try {
            return a(\u2603, \u2603).e_();
        }
        catch (cd cd) {
            try {
                return b(\u2603, \u2603).aK().toString();
            }
            catch (ca ca) {
                if (o.b(\u2603)) {
                    throw ca;
                }
                return \u2603;
            }
        }
    }
    
    public static eu a(final m \u2603, final String[] \u2603, final int \u2603) throws cd {
        return b(\u2603, \u2603, \u2603, false);
    }
    
    public static eu b(final m \u2603, final String[] \u2603, final int \u2603, final boolean \u2603) throws cd {
        final eu eu = new fa("");
        for (int i = \u2603; i < \u2603.length; ++i) {
            if (i > \u2603) {
                eu.a(" ");
            }
            eu eu2 = new fa(\u2603[i]);
            if (\u2603) {
                final eu b = o.b(\u2603, \u2603[i]);
                if (b == null) {
                    if (o.b(\u2603[i])) {
                        throw new cd();
                    }
                }
                else {
                    eu2 = b;
                }
            }
            eu.a(eu2);
        }
        return eu;
    }
    
    public static String a(final String[] \u2603, final int \u2603) {
        final StringBuilder sb = new StringBuilder();
        for (int i = \u2603; i < \u2603.length; ++i) {
            if (i > \u2603) {
                sb.append(" ");
            }
            final String str = \u2603[i];
            sb.append(str);
        }
        return sb.toString();
    }
    
    public static a a(final double \u2603, final String \u2603, final boolean \u2603) throws cb {
        return a(\u2603, \u2603, -30000000, 30000000, \u2603);
    }
    
    public static a a(final double \u2603, String \u2603, final int \u2603, final int \u2603, final boolean \u2603) throws cb {
        final boolean startsWith = \u2603.startsWith("~");
        if (startsWith && Double.isNaN(\u2603)) {
            throw new cb("commands.generic.num.invalid", new Object[] { \u2603 });
        }
        double \u26032 = 0.0;
        if (!startsWith || \u2603.length() > 1) {
            final boolean contains = \u2603.contains(".");
            if (startsWith) {
                \u2603 = \u2603.substring(1);
            }
            \u26032 += c(\u2603);
            if (!contains && !startsWith && \u2603) {
                \u26032 += 0.5;
            }
        }
        if (\u2603 != 0 || \u2603 != 0) {
            if (\u26032 < \u2603) {
                throw new cb("commands.generic.double.tooSmall", new Object[] { \u26032, \u2603 });
            }
            if (\u26032 > \u2603) {
                throw new cb("commands.generic.double.tooBig", new Object[] { \u26032, \u2603 });
            }
        }
        return new a(\u26032 + (startsWith ? \u2603 : 0.0), \u26032, startsWith);
    }
    
    public static double b(final double \u2603, final String \u2603, final boolean \u2603) throws cb {
        return b(\u2603, \u2603, -30000000, 30000000, \u2603);
    }
    
    public static double b(final double \u2603, String \u2603, final int \u2603, final int \u2603, final boolean \u2603) throws cb {
        final boolean startsWith = \u2603.startsWith("~");
        if (startsWith && Double.isNaN(\u2603)) {
            throw new cb("commands.generic.num.invalid", new Object[] { \u2603 });
        }
        double n = startsWith ? \u2603 : 0.0;
        if (!startsWith || \u2603.length() > 1) {
            final boolean contains = \u2603.contains(".");
            if (startsWith) {
                \u2603 = \u2603.substring(1);
            }
            n += c(\u2603);
            if (!contains && !startsWith && \u2603) {
                n += 0.5;
            }
        }
        if (\u2603 != 0 || \u2603 != 0) {
            if (n < \u2603) {
                throw new cb("commands.generic.double.tooSmall", new Object[] { n, \u2603 });
            }
            if (n > \u2603) {
                throw new cb("commands.generic.double.tooBig", new Object[] { n, \u2603 });
            }
        }
        return n;
    }
    
    public static zw f(final m \u2603, final String \u2603) throws cb {
        final jy \u26032 = new jy(\u2603);
        final zw zw = zw.e.a(\u26032);
        if (zw == null) {
            throw new cb("commands.give.item.notFound", new Object[] { \u26032 });
        }
        return zw;
    }
    
    public static afh g(final m \u2603, final String \u2603) throws cb {
        final jy jy = new jy(\u2603);
        if (!afh.c.d(jy)) {
            throw new cb("commands.give.block.notFound", new Object[] { jy });
        }
        final afh afh = afh.c.a(jy);
        if (afh == null) {
            throw new cb("commands.give.block.notFound", new Object[] { jy });
        }
        return afh;
    }
    
    public static String a(final Object[] \u2603) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < \u2603.length; ++i) {
            final String string = \u2603[i].toString();
            if (i > 0) {
                if (i == \u2603.length - 1) {
                    sb.append(" and ");
                }
                else {
                    sb.append(", ");
                }
            }
            sb.append(string);
        }
        return sb.toString();
    }
    
    public static eu a(final List<eu> \u2603) {
        final eu eu = new fa("");
        for (int i = 0; i < \u2603.size(); ++i) {
            if (i > 0) {
                if (i == \u2603.size() - 1) {
                    eu.a(" and ");
                }
                else if (i > 0) {
                    eu.a(", ");
                }
            }
            eu.a(\u2603.get(i));
        }
        return eu;
    }
    
    public static String a(final Collection<String> \u2603) {
        return a((Object[])\u2603.toArray(new String[\u2603.size()]));
    }
    
    public static List<String> a(final String[] \u2603, final int \u2603, final cj \u2603) {
        if (\u2603 == null) {
            return null;
        }
        final int n = \u2603.length - 1;
        String s;
        if (n == \u2603) {
            s = Integer.toString(\u2603.n());
        }
        else if (n == \u2603 + 1) {
            s = Integer.toString(\u2603.o());
        }
        else {
            if (n != \u2603 + 2) {
                return null;
            }
            s = Integer.toString(\u2603.p());
        }
        return Lists.newArrayList(s);
    }
    
    public static List<String> b(final String[] \u2603, final int \u2603, final cj \u2603) {
        if (\u2603 == null) {
            return null;
        }
        final int n = \u2603.length - 1;
        String s;
        if (n == \u2603) {
            s = Integer.toString(\u2603.n());
        }
        else {
            if (n != \u2603 + 1) {
                return null;
            }
            s = Integer.toString(\u2603.p());
        }
        return Lists.newArrayList(s);
    }
    
    public static boolean a(final String \u2603, final String \u2603) {
        return \u2603.regionMatches(true, 0, \u2603, 0, \u2603.length());
    }
    
    public static List<String> a(final String[] \u2603, final String... \u2603) {
        return a(\u2603, Arrays.asList(\u2603));
    }
    
    public static List<String> a(final String[] \u2603, final Collection<?> \u2603) {
        final String s = \u2603[\u2603.length - 1];
        final List<String> arrayList = (List<String>)Lists.newArrayList();
        if (!\u2603.isEmpty()) {
            for (final String \u26032 : Iterables.transform((Iterable<?>)\u2603, (Function<?, ?>)Functions.toStringFunction())) {
                if (a(s, \u26032)) {
                    arrayList.add(\u26032);
                }
            }
            if (arrayList.isEmpty()) {
                for (final Object next : \u2603) {
                    if (next instanceof jy && a(s, ((jy)next).a())) {
                        arrayList.add(String.valueOf(next));
                    }
                }
            }
        }
        return arrayList;
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return false;
    }
    
    public static void a(final m \u2603, final k \u2603, final String \u2603, final Object... \u2603) {
        a(\u2603, \u2603, 0, \u2603, \u2603);
    }
    
    public static void a(final m \u2603, final k \u2603, final int \u2603, final String \u2603, final Object... \u2603) {
        if (i.a != null) {
            i.a.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public static void a(final h \u2603) {
        i.a = \u2603;
    }
    
    public int a(final k \u2603) {
        return this.c().compareTo(\u2603.c());
    }
    
    public static class a
    {
        private final double a;
        private final double b;
        private final boolean c;
        
        protected a(final double \u2603, final double \u2603, final boolean \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
        }
        
        public double a() {
            return this.a;
        }
        
        public double b() {
            return this.b;
        }
        
        public boolean c() {
            return this.c;
        }
    }
}
