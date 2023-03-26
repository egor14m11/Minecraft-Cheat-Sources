import org.apache.commons.io.IOUtils;
import java.io.Closeable;
import java.awt.image.BufferedImage;
import org.apache.logging.log4j.LogManager;
import java.util.Comparator;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import java.util.Map;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.Futures;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.common.io.Files;
import com.google.common.hash.Hashing;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.locks.ReentrantLock;
import java.io.File;
import java.io.FileFilter;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bnm
{
    private static final Logger c;
    private static final FileFilter d;
    private final File e;
    public final bnk a;
    private final File f;
    public final bny b;
    private bnk g;
    private final ReentrantLock h;
    private ListenableFuture<Object> i;
    private List<a> j;
    private List<a> k;
    
    public bnm(final File \u2603, final File \u2603, final bnk \u2603, final bny \u2603, final avh \u2603) {
        this.h = new ReentrantLock();
        this.j = (List<a>)Lists.newArrayList();
        this.k = (List<a>)Lists.newArrayList();
        this.e = \u2603;
        this.f = \u2603;
        this.a = \u2603;
        this.b = \u2603;
        this.g();
        this.a();
        final Iterator<String> iterator = \u2603.k.iterator();
        while (iterator.hasNext()) {
            final String anObject = iterator.next();
            for (final a a : this.j) {
                if (a.d().equals(anObject)) {
                    if (a.f() == 1 || \u2603.l.contains(a.d())) {
                        this.k.add(a);
                        break;
                    }
                    iterator.remove();
                    bnm.c.warn("Removed selected resource pack {} because it's no longer compatible", new Object[] { a.d() });
                }
            }
        }
    }
    
    private void g() {
        if (this.e.exists()) {
            if (!this.e.isDirectory() && (!this.e.delete() || !this.e.mkdirs())) {
                bnm.c.warn("Unable to recreate resourcepack folder, it exists but is not a directory: " + this.e);
            }
        }
        else if (!this.e.mkdirs()) {
            bnm.c.warn("Unable to create resourcepack folder: " + this.e);
        }
    }
    
    private List<File> h() {
        if (this.e.isDirectory()) {
            return Arrays.asList(this.e.listFiles(bnm.d));
        }
        return Collections.emptyList();
    }
    
    public void a() {
        final List<a> arrayList = (List<a>)Lists.newArrayList();
        for (final File \u2603 : this.h()) {
            final a a = new a(\u2603);
            if (!this.j.contains(a)) {
                try {
                    a.a();
                    arrayList.add(a);
                }
                catch (Exception ex) {
                    arrayList.remove(a);
                }
            }
            else {
                final int index = this.j.indexOf(a);
                if (index <= -1 || index >= this.j.size()) {
                    continue;
                }
                arrayList.add(this.j.get(index));
            }
        }
        this.j.removeAll(arrayList);
        for (final a a2 : this.j) {
            a2.b();
        }
        this.j = arrayList;
    }
    
    public List<a> b() {
        return (List<a>)ImmutableList.copyOf((Collection<?>)this.j);
    }
    
    public List<a> c() {
        return (List<a>)ImmutableList.copyOf((Collection<?>)this.k);
    }
    
    public void a(final List<a> \u2603) {
        this.k.clear();
        this.k.addAll(\u2603);
    }
    
    public File d() {
        return this.e;
    }
    
    public ListenableFuture<Object> a(final String \u2603, final String \u2603) {
        String child;
        if (\u2603.matches("^[a-f0-9]{40}$")) {
            child = \u2603;
        }
        else {
            child = "legacy";
        }
        final File \u26032 = new File(this.f, child);
        this.h.lock();
        try {
            this.f();
            if (\u26032.exists() && \u2603.length() == 40) {
                try {
                    final String string = Hashing.sha1().hashBytes(Files.toByteArray(\u26032)).toString();
                    if (string.equals(\u2603)) {
                        return this.a(\u26032);
                    }
                    bnm.c.warn("File " + \u26032 + " had wrong hash (expected " + \u2603 + ", found " + string + "). Deleting it.");
                    FileUtils.deleteQuietly(\u26032);
                }
                catch (IOException throwable) {
                    bnm.c.warn("File " + \u26032 + " couldn't be hashed. Deleting it.", throwable);
                    FileUtils.deleteQuietly(\u26032);
                }
            }
            this.i();
            final axr \u26033 = new axr();
            final Map<String, String> ak = ave.ak();
            final ave a = ave.A();
            Futures.getUnchecked(a.a(new Runnable() {
                @Override
                public void run() {
                    a.a(\u26033);
                }
            }));
            final SettableFuture<Object> create = SettableFuture.create();
            Futures.addCallback((ListenableFuture)(this.i = nj.a(\u26032, \u2603, ak, 52428800, \u26033, a.O())), (FutureCallback)new FutureCallback<Object>() {
                @Override
                public void onSuccess(final Object \u2603) {
                    bnm.this.a(\u26032);
                    create.set(null);
                }
                
                @Override
                public void onFailure(final Throwable \u2603) {
                    create.setException(\u2603);
                }
            });
            return this.i;
        }
        finally {
            this.h.unlock();
        }
    }
    
    private void i() {
        final List<File> arrayList = (List<File>)Lists.newArrayList((Iterable<?>)FileUtils.listFiles(this.f, TrueFileFilter.TRUE, null));
        Collections.sort(arrayList, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
        int n = 0;
        for (final File file : arrayList) {
            if (n++ >= 10) {
                bnm.c.info("Deleting old server resource pack " + file.getName());
                FileUtils.deleteQuietly(file);
            }
        }
    }
    
    public ListenableFuture<Object> a(final File \u2603) {
        this.g = new bnc(\u2603);
        return ave.A().B();
    }
    
    public bnk e() {
        return this.g;
    }
    
    public void f() {
        this.h.lock();
        try {
            if (this.i != null) {
                this.i.cancel(true);
            }
            this.i = null;
            if (this.g != null) {
                this.g = null;
                ave.A().B();
            }
        }
        finally {
            this.h.unlock();
        }
    }
    
    static {
        c = LogManager.getLogger();
        d = new FileFilter() {
            @Override
            public boolean accept(final File \u2603) {
                final boolean b = \u2603.isFile() && \u2603.getName().endsWith(".zip");
                final boolean b2 = \u2603.isDirectory() && new File(\u2603, "pack.mcmeta").isFile();
                return b || b2;
            }
        };
    }
    
    public class a
    {
        private final File b;
        private bnk c;
        private boj d;
        private BufferedImage e;
        private jy f;
        
        private a(final File \u2603) {
            this.b = \u2603;
        }
        
        public void a() throws IOException {
            this.c = (this.b.isDirectory() ? new bnd(this.b) : new bnc(this.b));
            this.d = this.c.a(bnm.this.b, "pack");
            try {
                this.e = this.c.a();
            }
            catch (IOException ex) {}
            if (this.e == null) {
                this.e = bnm.this.a.a();
            }
            this.b();
        }
        
        public void a(final bmj \u2603) {
            if (this.f == null) {
                this.f = \u2603.a("texturepackicon", new blz(this.e));
            }
            \u2603.a(this.f);
        }
        
        public void b() {
            if (this.c instanceof Closeable) {
                IOUtils.closeQuietly((Closeable)this.c);
            }
        }
        
        public bnk c() {
            return this.c;
        }
        
        public String d() {
            return this.c.b();
        }
        
        public String e() {
            return (this.d == null) ? (a.m + "Invalid pack.mcmeta (or missing 'pack' section)") : this.d.a().d();
        }
        
        public int f() {
            return this.d.b();
        }
        
        @Override
        public boolean equals(final Object \u2603) {
            return this == \u2603 || (\u2603 instanceof a && this.toString().equals(\u2603.toString()));
        }
        
        @Override
        public int hashCode() {
            return this.toString().hashCode();
        }
        
        @Override
        public String toString() {
            return String.format("%s:%s:%d", this.b.getName(), this.b.isDirectory() ? "folder" : "zip", this.b.lastModified());
        }
    }
}
