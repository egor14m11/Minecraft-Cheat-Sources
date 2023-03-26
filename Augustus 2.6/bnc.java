import java.util.List;
import java.util.Enumeration;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.io.IOException;
import java.io.File;
import java.util.zip.ZipFile;
import com.google.common.base.Splitter;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.5.36
// 

public class bnc extends bmx implements Closeable
{
    public static final Splitter b;
    private ZipFile c;
    
    public bnc(final File \u2603) {
        super(\u2603);
    }
    
    private ZipFile d() throws IOException {
        if (this.c == null) {
            this.c = new ZipFile(this.a);
        }
        return this.c;
    }
    
    @Override
    protected InputStream a(final String \u2603) throws IOException {
        final ZipFile d = this.d();
        final ZipEntry entry = d.getEntry(\u2603);
        if (entry == null) {
            throw new bnl(this.a, \u2603);
        }
        return d.getInputStream(entry);
    }
    
    public boolean b(final String \u2603) {
        try {
            return this.d().getEntry(\u2603) != null;
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    @Override
    public Set<String> c() {
        ZipFile d;
        try {
            d = this.d();
        }
        catch (IOException ex) {
            return Collections.emptySet();
        }
        final Enumeration<? extends ZipEntry> entries = d.entries();
        final Set<String> hashSet = (Set<String>)Sets.newHashSet();
        while (entries.hasMoreElements()) {
            final ZipEntry zipEntry = (ZipEntry)entries.nextElement();
            final String name = zipEntry.getName();
            if (name.startsWith("assets/")) {
                final List<String> arrayList = (List<String>)Lists.newArrayList((Iterable<?>)bnc.b.split(name));
                if (arrayList.size() <= 1) {
                    continue;
                }
                final String \u2603 = arrayList.get(1);
                if (!\u2603.equals(\u2603.toLowerCase())) {
                    this.c(\u2603);
                }
                else {
                    hashSet.add(\u2603);
                }
            }
        }
        return hashSet;
    }
    
    @Override
    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }
    
    @Override
    public void close() throws IOException {
        if (this.c != null) {
            this.c.close();
            this.c = null;
        }
    }
    
    static {
        b = Splitter.on('/').omitEmptyStrings().limit(3);
    }
}
