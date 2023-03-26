import java.util.Arrays;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.IllegalFormatException;
import com.google.common.collect.Lists;
import java.util.regex.Pattern;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class fb extends es
{
    private final String d;
    private final Object[] e;
    private final Object f;
    private long g;
    List<eu> b;
    public static final Pattern c;
    
    public fb(final String \u2603, final Object... \u2603) {
        this.f = new Object();
        this.g = -1L;
        this.b = (List<eu>)Lists.newArrayList();
        this.d = \u2603;
        this.e = \u2603;
        for (final Object o : \u2603) {
            if (o instanceof eu) {
                ((eu)o).b().a(this.b());
            }
        }
    }
    
    synchronized void g() {
        synchronized (this.f) {
            final long a = di.a();
            if (a == this.g) {
                return;
            }
            this.g = a;
            this.b.clear();
        }
        try {
            this.b(di.a(this.d));
        }
        catch (fc fc) {
            this.b.clear();
            try {
                this.b(di.b(this.d));
            }
            catch (fc fc2) {
                throw fc;
            }
        }
    }
    
    protected void b(final String \u2603) {
        final boolean b = false;
        final Matcher matcher = fb.c.matcher(\u2603);
        int n = 0;
        int beginIndex = 0;
        try {
            while (matcher.find(beginIndex)) {
                final int start = matcher.start();
                final int end = matcher.end();
                if (start > beginIndex) {
                    final fa fa = new fa(String.format(\u2603.substring(beginIndex, start), new Object[0]));
                    fa.b().a(this.b());
                    this.b.add(fa);
                }
                final String group = matcher.group(2);
                final String substring = \u2603.substring(start, end);
                if ("%".equals(group) && "%%".equals(substring)) {
                    final fa fa2 = new fa("%");
                    fa2.b().a(this.b());
                    this.b.add(fa2);
                }
                else {
                    if (!"s".equals(group)) {
                        throw new fc(this, "Unsupported format: '" + substring + "'");
                    }
                    final String group2 = matcher.group(1);
                    final int \u26032 = (group2 != null) ? (Integer.parseInt(group2) - 1) : n++;
                    if (\u26032 < this.e.length) {
                        this.b.add(this.a(\u26032));
                    }
                }
                beginIndex = end;
            }
            if (beginIndex < \u2603.length()) {
                final fa fa3 = new fa(String.format(\u2603.substring(beginIndex), new Object[0]));
                fa3.b().a(this.b());
                this.b.add(fa3);
            }
        }
        catch (IllegalFormatException \u26033) {
            throw new fc(this, \u26033);
        }
    }
    
    private eu a(final int \u2603) {
        if (\u2603 >= this.e.length) {
            throw new fc(this, \u2603);
        }
        final Object o = this.e[\u2603];
        eu eu;
        if (o instanceof eu) {
            eu = (eu)o;
        }
        else {
            eu = new fa((o == null) ? "null" : o.toString());
            eu.b().a(this.b());
        }
        return eu;
    }
    
    @Override
    public eu a(final ez \u2603) {
        super.a(\u2603);
        for (final Object o : this.e) {
            if (o instanceof eu) {
                ((eu)o).b().a(this.b());
            }
        }
        if (this.g > -1L) {
            for (final eu eu : this.b) {
                eu.b().a(\u2603);
            }
        }
        return this;
    }
    
    @Override
    public Iterator<eu> iterator() {
        this.g();
        return Iterators.concat((Iterator<? extends eu>)es.a(this.b), (Iterator<? extends eu>)es.a(this.a));
    }
    
    @Override
    public String e() {
        this.g();
        final StringBuilder sb = new StringBuilder();
        for (final eu eu : this.b) {
            sb.append(eu.e());
        }
        return sb.toString();
    }
    
    public fb h() {
        final Object[] \u2603 = new Object[this.e.length];
        for (int i = 0; i < this.e.length; ++i) {
            if (this.e[i] instanceof eu) {
                \u2603[i] = ((eu)this.e[i]).f();
            }
            else {
                \u2603[i] = this.e[i];
            }
        }
        final fb fb = new fb(this.d, \u2603);
        fb.a(this.b().m());
        for (final eu eu : this.a()) {
            fb.a(eu.f());
        }
        return fb;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 instanceof fb) {
            final fb fb = (fb)\u2603;
            return Arrays.equals(this.e, fb.e) && this.d.equals(fb.d) && super.equals(\u2603);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hashCode = super.hashCode();
        hashCode = 31 * hashCode + this.d.hashCode();
        hashCode = 31 * hashCode + Arrays.hashCode(this.e);
        return hashCode;
    }
    
    @Override
    public String toString() {
        return "TranslatableComponent{key='" + this.d + '\'' + ", args=" + Arrays.toString(this.e) + ", siblings=" + this.a + ", style=" + this.b() + '}';
    }
    
    public String i() {
        return this.d;
    }
    
    public Object[] j() {
        return this.e;
    }
    
    static {
        c = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
    }
}
