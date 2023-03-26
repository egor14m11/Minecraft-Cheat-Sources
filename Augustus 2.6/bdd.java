import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;
import java.net.IDN;

// 
// Decompiled by Procyon v0.5.36
// 

public class bdd
{
    private final String a;
    private final int b;
    
    private bdd(final String \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    public String a() {
        return IDN.toASCII(this.a);
    }
    
    public int b() {
        return this.b;
    }
    
    public static bdd a(final String \u2603) {
        if (\u2603 == null) {
            return null;
        }
        String[] split = \u2603.split(":");
        if (\u2603.startsWith("[")) {
            final int index = \u2603.indexOf("]");
            if (index > 0) {
                final String substring = \u2603.substring(1, index);
                String s = \u2603.substring(index + 1).trim();
                if (s.startsWith(":") && s.length() > 0) {
                    s = s.substring(1);
                    split = new String[] { substring, s };
                }
                else {
                    split = new String[] { substring };
                }
            }
        }
        if (split.length > 2) {
            split = new String[] { \u2603 };
        }
        String s2 = split[0];
        int a = (split.length > 1) ? a(split[1], 25565) : 25565;
        if (a == 25565) {
            final String[] b = b(s2);
            s2 = b[0];
            a = a(b[1], 25565);
        }
        return new bdd(s2, a);
    }
    
    private static String[] b(final String \u2603) {
        try {
            final String s = "com.sun.jndi.dns.DnsContextFactory";
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            final Hashtable environment = new Hashtable();
            environment.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            environment.put("java.naming.provider.url", "dns:");
            environment.put("com.sun.jndi.dns.timeout.retries", "1");
            final DirContext dirContext = new InitialDirContext(environment);
            final Attributes attributes = dirContext.getAttributes("_minecraft._tcp." + \u2603, new String[] { "SRV" });
            final String[] split = attributes.get("srv").get().toString().split(" ", 4);
            return new String[] { split[3], split[2] };
        }
        catch (Throwable t) {
            return new String[] { \u2603, Integer.toString(25565) };
        }
    }
    
    private static int a(final String \u2603, final int \u2603) {
        try {
            return Integer.parseInt(\u2603.trim());
        }
        catch (Exception ex) {
            return \u2603;
        }
    }
}
