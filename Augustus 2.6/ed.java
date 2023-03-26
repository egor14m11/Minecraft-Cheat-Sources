import com.google.common.collect.Iterables;
import com.google.common.base.Splitter;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import java.util.Stack;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class ed
{
    private static final Logger a;
    private static final Pattern b;
    
    public static dn a(String \u2603) throws ec {
        \u2603 = \u2603.trim();
        if (!\u2603.startsWith("{")) {
            throw new ec("Invalid tag encountered, expected '{' as first char.");
        }
        if (b(\u2603) != 1) {
            throw new ec("Encountered multiple top tags, only one expected");
        }
        return (dn)a("tag", \u2603).a();
    }
    
    static int b(final String \u2603) throws ec {
        int n = 0;
        boolean b = false;
        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < \u2603.length(); ++i) {
            final char char1 = \u2603.charAt(i);
            if (char1 == '\"') {
                if (b(\u2603, i)) {
                    if (!b) {
                        throw new ec("Illegal use of \\\": " + \u2603);
                    }
                }
                else {
                    b = !b;
                }
            }
            else if (!b) {
                if (char1 == '{' || char1 == '[') {
                    if (stack.isEmpty()) {
                        ++n;
                    }
                    stack.push(char1);
                }
                else {
                    if (char1 == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                        throw new ec("Unbalanced curly brackets {}: " + \u2603);
                    }
                    if (char1 == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                        throw new ec("Unbalanced square brackets []: " + \u2603);
                    }
                }
            }
        }
        if (b) {
            throw new ec("Unbalanced quotation: " + \u2603);
        }
        if (!stack.isEmpty()) {
            throw new ec("Unbalanced brackets: " + \u2603);
        }
        if (n == 0 && !\u2603.isEmpty()) {
            n = 1;
        }
        return n;
    }
    
    static a a(final String... \u2603) throws ec {
        return a(\u2603[0], \u2603[1]);
    }
    
    static a a(final String \u2603, String \u2603) throws ec {
        \u2603 = \u2603.trim();
        if (\u2603.startsWith("{")) {
            \u2603 = \u2603.substring(1, \u2603.length() - 1);
            final b b = new b(\u2603);
            while (\u2603.length() > 0) {
                final String s = b(\u2603, true);
                if (s.length() > 0) {
                    final boolean b2 = false;
                    b.b.add(a(s, b2));
                }
                if (\u2603.length() < s.length() + 1) {
                    break;
                }
                final char c = \u2603.charAt(s.length());
                if (c != ',' && c != '{' && c != '}' && c != '[' && c != ']') {
                    throw new ec("Unexpected token '" + c + "' at: " + \u2603.substring(s.length()));
                }
                \u2603 = \u2603.substring(s.length() + 1);
            }
            return b;
        }
        if (\u2603.startsWith("[") && !ed.b.matcher(\u2603).matches()) {
            \u2603 = \u2603.substring(1, \u2603.length() - 1);
            final c c2 = new c(\u2603);
            while (\u2603.length() > 0) {
                final String s = b(\u2603, false);
                if (s.length() > 0) {
                    final boolean b2 = true;
                    c2.b.add(a(s, b2));
                }
                if (\u2603.length() < s.length() + 1) {
                    break;
                }
                final char c = \u2603.charAt(s.length());
                if (c != ',' && c != '{' && c != '}' && c != '[' && c != ']') {
                    throw new ec("Unexpected token '" + c + "' at: " + \u2603.substring(s.length()));
                }
                \u2603 = \u2603.substring(s.length() + 1);
            }
            return c2;
        }
        return new d(\u2603, \u2603);
    }
    
    private static a a(final String \u2603, final boolean \u2603) throws ec {
        final String c = c(\u2603, \u2603);
        final String d = d(\u2603, \u2603);
        return a(new String[] { c, d });
    }
    
    private static String b(final String \u2603, final boolean \u2603) throws ec {
        int a = a(\u2603, ':');
        final int a2 = a(\u2603, ',');
        if (\u2603) {
            if (a == -1) {
                throw new ec("Unable to locate name/value separator for string: " + \u2603);
            }
            if (a2 != -1 && a2 < a) {
                throw new ec("Name error at: " + \u2603);
            }
        }
        else if (a == -1 || a > a2) {
            a = -1;
        }
        return a(\u2603, a);
    }
    
    private static String a(final String \u2603, final int \u2603) throws ec {
        final Stack<Character> stack = new Stack<Character>();
        int i = \u2603 + 1;
        boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        int n = 0;
        while (i < \u2603.length()) {
            final char char1 = \u2603.charAt(i);
            if (char1 == '\"') {
                if (b(\u2603, i)) {
                    if (!b) {
                        throw new ec("Illegal use of \\\": " + \u2603);
                    }
                }
                else {
                    b = !b;
                    if (b && !b3) {
                        b2 = true;
                    }
                    if (!b) {
                        n = i;
                    }
                }
            }
            else if (!b) {
                if (char1 == '{' || char1 == '[') {
                    stack.push(char1);
                }
                else {
                    if (char1 == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                        throw new ec("Unbalanced curly brackets {}: " + \u2603);
                    }
                    if (char1 == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                        throw new ec("Unbalanced square brackets []: " + \u2603);
                    }
                    if (char1 == ',' && stack.isEmpty()) {
                        return \u2603.substring(0, i);
                    }
                }
            }
            if (!Character.isWhitespace(char1)) {
                if (!b && b2 && n != i) {
                    return \u2603.substring(0, n + 1);
                }
                b3 = true;
            }
            ++i;
        }
        return \u2603.substring(0, i);
    }
    
    private static String c(String \u2603, final boolean \u2603) throws ec {
        if (\u2603) {
            \u2603 = \u2603.trim();
            if (\u2603.startsWith("{") || \u2603.startsWith("[")) {
                return "";
            }
        }
        final int a = a(\u2603, ':');
        if (a != -1) {
            return \u2603.substring(0, a).trim();
        }
        if (\u2603) {
            return "";
        }
        throw new ec("Unable to locate name/value separator for string: " + \u2603);
    }
    
    private static String d(String \u2603, final boolean \u2603) throws ec {
        if (\u2603) {
            \u2603 = \u2603.trim();
            if (\u2603.startsWith("{") || \u2603.startsWith("[")) {
                return \u2603;
            }
        }
        final int a = a(\u2603, ':');
        if (a != -1) {
            return \u2603.substring(a + 1).trim();
        }
        if (\u2603) {
            return \u2603;
        }
        throw new ec("Unable to locate name/value separator for string: " + \u2603);
    }
    
    private static int a(final String \u2603, final char \u2603) {
        int i = 0;
        boolean b = true;
        while (i < \u2603.length()) {
            final char char1 = \u2603.charAt(i);
            if (char1 == '\"') {
                if (!b(\u2603, i)) {
                    b = !b;
                }
            }
            else if (b) {
                if (char1 == \u2603) {
                    return i;
                }
                if (char1 == '{' || char1 == '[') {
                    return -1;
                }
            }
            ++i;
        }
        return -1;
    }
    
    private static boolean b(final String \u2603, final int \u2603) {
        return \u2603 > 0 && \u2603.charAt(\u2603 - 1) == '\\' && !b(\u2603, \u2603 - 1);
    }
    
    static {
        a = LogManager.getLogger();
        b = Pattern.compile("\\[[-+\\d|,\\s]+\\]");
    }
    
    abstract static class a
    {
        protected String a;
        
        public abstract eb a() throws ec;
    }
    
    static class b extends a
    {
        protected List<a> b;
        
        public b(final String \u2603) {
            this.b = (List<a>)Lists.newArrayList();
            this.a = \u2603;
        }
        
        @Override
        public eb a() throws ec {
            final dn dn = new dn();
            for (final a a : this.b) {
                dn.a(a.a, a.a());
            }
            return dn;
        }
    }
    
    static class c extends a
    {
        protected List<a> b;
        
        public c(final String \u2603) {
            this.b = (List<a>)Lists.newArrayList();
            this.a = \u2603;
        }
        
        @Override
        public eb a() throws ec {
            final du du = new du();
            for (final a a : this.b) {
                du.a(a.a());
            }
            return du;
        }
    }
    
    static class d extends a
    {
        private static final Pattern c;
        private static final Pattern d;
        private static final Pattern e;
        private static final Pattern f;
        private static final Pattern g;
        private static final Pattern h;
        private static final Pattern i;
        private static final Splitter j;
        protected String b;
        
        public d(final String \u2603, final String \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        @Override
        public eb a() throws ec {
            try {
                if (ed.d.c.matcher(this.b).matches()) {
                    return new dp(Double.parseDouble(this.b.substring(0, this.b.length() - 1)));
                }
                if (ed.d.d.matcher(this.b).matches()) {
                    return new dr(Float.parseFloat(this.b.substring(0, this.b.length() - 1)));
                }
                if (ed.d.e.matcher(this.b).matches()) {
                    return new dm(Byte.parseByte(this.b.substring(0, this.b.length() - 1)));
                }
                if (ed.d.f.matcher(this.b).matches()) {
                    return new dv(Long.parseLong(this.b.substring(0, this.b.length() - 1)));
                }
                if (ed.d.g.matcher(this.b).matches()) {
                    return new dz(Short.parseShort(this.b.substring(0, this.b.length() - 1)));
                }
                if (ed.d.h.matcher(this.b).matches()) {
                    return new dt(Integer.parseInt(this.b));
                }
                if (ed.d.i.matcher(this.b).matches()) {
                    return new dp(Double.parseDouble(this.b));
                }
                if (this.b.equalsIgnoreCase("true") || this.b.equalsIgnoreCase("false")) {
                    return new dm((byte)(Boolean.parseBoolean(this.b) ? 1 : 0));
                }
            }
            catch (NumberFormatException ex) {
                this.b = this.b.replaceAll("\\\\\"", "\"");
                return new ea(this.b);
            }
            if (this.b.startsWith("[") && this.b.endsWith("]")) {
                final String substring = this.b.substring(1, this.b.length() - 1);
                final String[] array = Iterables.toArray(ed.d.j.split(substring), String.class);
                try {
                    final int[] \u2603 = new int[array.length];
                    for (int i = 0; i < array.length; ++i) {
                        \u2603[i] = Integer.parseInt(array[i].trim());
                    }
                    return new ds(\u2603);
                }
                catch (NumberFormatException ex2) {
                    return new ea(this.b);
                }
            }
            if (this.b.startsWith("\"") && this.b.endsWith("\"")) {
                this.b = this.b.substring(1, this.b.length() - 1);
            }
            this.b = this.b.replaceAll("\\\\\"", "\"");
            final StringBuilder sb = new StringBuilder();
            for (int j = 0; j < this.b.length(); ++j) {
                if (j < this.b.length() - 1 && this.b.charAt(j) == '\\' && this.b.charAt(j + 1) == '\\') {
                    sb.append('\\');
                    ++j;
                }
                else {
                    sb.append(this.b.charAt(j));
                }
            }
            return new ea(sb.toString());
        }
        
        static {
            c = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[d|D]");
            d = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[f|F]");
            e = Pattern.compile("[-+]?[0-9]+[b|B]");
            f = Pattern.compile("[-+]?[0-9]+[l|L]");
            g = Pattern.compile("[-+]?[0-9]+[s|S]");
            h = Pattern.compile("[-+]?[0-9]+");
            i = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+");
            j = Splitter.on(',').omitEmptyStrings();
        }
    }
}
