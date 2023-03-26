import java.util.IllegalFormatException;
import com.google.common.collect.Iterables;
import org.apache.commons.io.Charsets;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.util.Iterator;
import java.io.IOException;
import java.util.List;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.regex.Pattern;
import com.google.common.base.Splitter;

// 
// Decompiled by Procyon v0.5.36
// 

public class bnt
{
    private static final Splitter b;
    private static final Pattern c;
    Map<String, String> a;
    private boolean d;
    
    public bnt() {
        this.a = (Map<String, String>)Maps.newHashMap();
    }
    
    public synchronized void a(final bni \u2603, final List<String> \u2603) {
        this.a.clear();
        for (final String s : \u2603) {
            final String format = String.format("lang/%s.lang", s);
            for (final String \u26032 : \u2603.a()) {
                try {
                    this.a(\u2603.b(new jy(\u26032, format)));
                }
                catch (IOException ex) {}
            }
        }
        this.b();
    }
    
    public boolean a() {
        return this.d;
    }
    
    private void b() {
        this.d = false;
        int n = 0;
        int n2 = 0;
        for (final String s : this.a.values()) {
            final int length = s.length();
            n2 += length;
            for (int i = 0; i < length; ++i) {
                if (s.charAt(i) >= '\u0100') {
                    ++n;
                }
            }
        }
        final float n3 = n / (float)n2;
        this.d = (n3 > 0.1);
    }
    
    private void a(final List<bnh> \u2603) throws IOException {
        for (final bnh bnh : \u2603) {
            final InputStream b = bnh.b();
            try {
                this.a(b);
            }
            finally {
                IOUtils.closeQuietly(b);
            }
        }
    }
    
    private void a(final InputStream \u2603) throws IOException {
        for (final String sequence : IOUtils.readLines(\u2603, Charsets.UTF_8)) {
            if (!sequence.isEmpty()) {
                if (sequence.charAt(0) == '#') {
                    continue;
                }
                final String[] array = Iterables.toArray(bnt.b.split(sequence), String.class);
                if (array == null) {
                    continue;
                }
                if (array.length != 2) {
                    continue;
                }
                final String s = array[0];
                final String replaceAll = bnt.c.matcher(array[1]).replaceAll("%$1s");
                this.a.put(s, replaceAll);
            }
        }
    }
    
    private String b(final String \u2603) {
        final String s = this.a.get(\u2603);
        return (s == null) ? \u2603 : s;
    }
    
    public String a(final String \u2603, final Object[] \u2603) {
        final String b = this.b(\u2603);
        try {
            return String.format(b, \u2603);
        }
        catch (IllegalFormatException ex) {
            return "Format error: " + b;
        }
    }
    
    static {
        b = Splitter.on('=').limit(2);
        c = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    }
}
