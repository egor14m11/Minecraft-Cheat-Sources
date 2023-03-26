// 
// Decompiled by Procyon v0.5.36
// 

public class f
{
    public static final char[] a;
    
    public static boolean a(final char \u2603) {
        return \u2603 != '§' && \u2603 >= ' ' && \u2603 != '\u007f';
    }
    
    public static String a(final String \u2603) {
        final StringBuilder sb = new StringBuilder();
        for (final char c : \u2603.toCharArray()) {
            if (a(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    static {
        a = new char[] { '/', '\n', '\r', '\t', '\0', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':' };
    }
}
