import java.io.OutputStream;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Set;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bnb implements bni
{
    private static final Logger b;
    protected final List<bnk> a;
    private final bny c;
    
    public bnb(final bny \u2603) {
        this.a = (List<bnk>)Lists.newArrayList();
        this.c = \u2603;
    }
    
    public void a(final bnk \u2603) {
        this.a.add(\u2603);
    }
    
    @Override
    public Set<String> a() {
        return null;
    }
    
    @Override
    public bnh a(final jy \u2603) throws IOException {
        bnk \u26032 = null;
        final jy c = c(\u2603);
        for (int i = this.a.size() - 1; i >= 0; --i) {
            final bnk \u26033 = this.a.get(i);
            if (\u26032 == null && \u26033.b(c)) {
                \u26032 = \u26033;
            }
            if (\u26033.b(\u2603)) {
                InputStream a = null;
                if (\u26032 != null) {
                    a = this.a(c, \u26032);
                }
                return new bno(\u26033.b(), \u2603, this.a(\u2603, \u26033), a, this.c);
            }
        }
        throw new FileNotFoundException(\u2603.toString());
    }
    
    protected InputStream a(final jy \u2603, final bnk \u2603) throws IOException {
        final InputStream a = \u2603.a(\u2603);
        return bnb.b.isDebugEnabled() ? new a(a, \u2603, \u2603.b()) : a;
    }
    
    @Override
    public List<bnh> b(final jy \u2603) throws IOException {
        final List<bnh> arrayList = (List<bnh>)Lists.newArrayList();
        final jy c = c(\u2603);
        for (final bnk bnk : this.a) {
            if (bnk.b(\u2603)) {
                final InputStream \u26032 = bnk.b(c) ? this.a(c, bnk) : null;
                arrayList.add(new bno(bnk.b(), \u2603, this.a(\u2603, bnk), \u26032, this.c));
            }
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException(\u2603.toString());
        }
        return arrayList;
    }
    
    static jy c(final jy \u2603) {
        return new jy(\u2603.b(), \u2603.a() + ".mcmeta");
    }
    
    static {
        b = LogManager.getLogger();
    }
    
    static class a extends InputStream
    {
        private final InputStream a;
        private final String b;
        private boolean c;
        
        public a(final InputStream \u2603, final jy \u2603, final String \u2603) {
            this.c = false;
            this.a = \u2603;
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            new Exception().printStackTrace(new PrintStream(out));
            this.b = "Leaked resource: '" + \u2603 + "' loaded from pack: '" + \u2603 + "'\n" + out.toString();
        }
        
        @Override
        public void close() throws IOException {
            this.a.close();
            this.c = true;
        }
        
        @Override
        protected void finalize() throws Throwable {
            if (!this.c) {
                bnb.b.warn(this.b);
            }
            super.finalize();
        }
        
        @Override
        public int read() throws IOException {
            return this.a.read();
        }
    }
}
