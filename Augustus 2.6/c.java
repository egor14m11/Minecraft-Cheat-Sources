import java.util.Iterator;
import java.util.concurrent.Callable;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class c
{
    private final b a;
    private final String b;
    private final List<a> c;
    private StackTraceElement[] d;
    
    public c(final b \u2603, final String \u2603) {
        this.c = (List<a>)Lists.newArrayList();
        this.d = new StackTraceElement[0];
        this.a = \u2603;
        this.b = \u2603;
    }
    
    public static String a(final double \u2603, final double \u2603, final double \u2603) {
        return String.format("%.2f,%.2f,%.2f - %s", \u2603, \u2603, \u2603, a(new cj(\u2603, \u2603, \u2603)));
    }
    
    public static String a(final cj \u2603) {
        final int n = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        final StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format("World: (%d,%d,%d)", n, o, p));
        }
        catch (Throwable t) {
            sb.append("(Error finding world loc)");
        }
        sb.append(", ");
        try {
            final int n2 = n >> 4;
            final int n3 = p >> 4;
            final int n4 = n & 0xF;
            final int n5 = o >> 4;
            final int n6 = p & 0xF;
            final int n7 = n2 << 4;
            final int n8 = n3 << 4;
            final int n9 = (n2 + 1 << 4) - 1;
            final int n10 = (n3 + 1 << 4) - 1;
            sb.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", n4, n5, n6, n2, n3, n7, n8, n9, n10));
        }
        catch (Throwable t) {
            sb.append("(Error finding chunk loc)");
        }
        sb.append(", ");
        try {
            final int n2 = n >> 9;
            final int n3 = p >> 9;
            final int n4 = n2 << 5;
            final int n5 = n3 << 5;
            final int n6 = (n2 + 1 << 5) - 1;
            final int n7 = (n3 + 1 << 5) - 1;
            final int n8 = n2 << 9;
            final int n9 = n3 << 9;
            final int n10 = (n2 + 1 << 9) - 1;
            final int i = (n3 + 1 << 9) - 1;
            sb.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", n2, n3, n4, n5, n6, n7, n8, n9, n10, i));
        }
        catch (Throwable t) {
            sb.append("(Error finding world loc)");
        }
        return sb.toString();
    }
    
    public void a(final String \u2603, final Callable<String> \u2603) {
        try {
            this.a(\u2603, \u2603.call());
        }
        catch (Throwable \u26032) {
            this.a(\u2603, \u26032);
        }
    }
    
    public void a(final String \u2603, final Object \u2603) {
        this.c.add(new a(\u2603, \u2603));
    }
    
    public void a(final String \u2603, final Throwable \u2603) {
        this.a(\u2603, (Object)\u2603);
    }
    
    public int a(final int \u2603) {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= 0) {
            return 0;
        }
        System.arraycopy(stackTrace, 3 + \u2603, this.d = new StackTraceElement[stackTrace.length - 3 - \u2603], 0, this.d.length);
        return this.d.length;
    }
    
    public boolean a(final StackTraceElement \u2603, final StackTraceElement \u2603) {
        if (this.d.length == 0 || \u2603 == null) {
            return false;
        }
        final StackTraceElement stackTraceElement = this.d[0];
        if (stackTraceElement.isNativeMethod() != \u2603.isNativeMethod() || !stackTraceElement.getClassName().equals(\u2603.getClassName()) || !stackTraceElement.getFileName().equals(\u2603.getFileName()) || !stackTraceElement.getMethodName().equals(\u2603.getMethodName())) {
            return false;
        }
        if (\u2603 != null != this.d.length > 1) {
            return false;
        }
        if (\u2603 != null && !this.d[1].equals(\u2603)) {
            return false;
        }
        this.d[0] = \u2603;
        return true;
    }
    
    public void b(final int \u2603) {
        final StackTraceElement[] d = new StackTraceElement[this.d.length - \u2603];
        System.arraycopy(this.d, 0, d, 0, d.length);
        this.d = d;
    }
    
    public void a(final StringBuilder \u2603) {
        \u2603.append("-- ").append(this.b).append(" --\n");
        \u2603.append("Details:");
        for (final a a : this.c) {
            \u2603.append("\n\t");
            \u2603.append(a.a());
            \u2603.append(": ");
            \u2603.append(a.b());
        }
        if (this.d != null && this.d.length > 0) {
            \u2603.append("\nStacktrace:");
            for (final StackTraceElement stackTraceElement : this.d) {
                \u2603.append("\n\tat ");
                \u2603.append(stackTraceElement.toString());
            }
        }
    }
    
    public StackTraceElement[] a() {
        return this.d;
    }
    
    public static void a(final c \u2603, final cj \u2603, final afh \u2603, final int \u2603) {
        final int a = afh.a(\u2603);
        \u2603.a("Block type", new Callable<String>() {
            public String a() throws Exception {
                try {
                    return String.format("ID #%d (%s // %s)", a, \u2603.a(), \u2603.getClass().getCanonicalName());
                }
                catch (Throwable t) {
                    return "ID #" + a;
                }
            }
        });
        \u2603.a("Block data value", new Callable<String>() {
            public String a() throws Exception {
                if (\u2603 < 0) {
                    return "Unknown? (Got " + \u2603 + ")";
                }
                final String replace = String.format("%4s", Integer.toBinaryString(\u2603)).replace(" ", "0");
                return String.format("%1$d / 0x%1$X / 0b%2$s", \u2603, replace);
            }
        });
        \u2603.a("Block location", new Callable<String>() {
            public String a() throws Exception {
                return c.a(\u2603);
            }
        });
    }
    
    public static void a(final c \u2603, final cj \u2603, final alz \u2603) {
        \u2603.a("Block", new Callable<String>() {
            public String a() throws Exception {
                return \u2603.toString();
            }
        });
        \u2603.a("Block location", new Callable<String>() {
            public String a() throws Exception {
                return c.a(\u2603);
            }
        });
    }
    
    static class a
    {
        private final String a;
        private final String b;
        
        public a(final String \u2603, final Object \u2603) {
            this.a = \u2603;
            if (\u2603 == null) {
                this.b = "~~NULL~~";
            }
            else if (\u2603 instanceof Throwable) {
                final Throwable t = (Throwable)\u2603;
                this.b = "~~ERROR~~ " + t.getClass().getSimpleName() + ": " + t.getMessage();
            }
            else {
                this.b = \u2603.toString();
            }
        }
        
        public String a() {
            return this.a;
        }
        
        public String b() {
            return this.b;
        }
    }
}
