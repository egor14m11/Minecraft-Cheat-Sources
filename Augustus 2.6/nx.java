import org.apache.commons.lang3.StringUtils;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.5.36
// 

public class nx
{
    private static final Pattern a;
    
    public static String a(final int \u2603) {
        int n = \u2603 / 20;
        final int n2 = n / 60;
        n %= 60;
        if (n < 10) {
            return n2 + ":0" + n;
        }
        return n2 + ":" + n;
    }
    
    public static String a(final String \u2603) {
        return nx.a.matcher(\u2603).replaceAll("");
    }
    
    public static boolean b(final String \u2603) {
        return StringUtils.isEmpty(\u2603);
    }
    
    static {
        a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
    }
}
