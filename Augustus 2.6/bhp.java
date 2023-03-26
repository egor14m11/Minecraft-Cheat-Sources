import org.apache.logging.log4j.LogManager;
import java.util.concurrent.CancellationException;
import java.util.List;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.collect.Lists;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bhp implements Runnable
{
    private static final Logger a;
    private final bho b;
    private final bfg c;
    
    public bhp(final bho \u2603) {
        this(\u2603, null);
    }
    
    public bhp(final bho \u2603, final bfg \u2603) {
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                this.a(this.b.d());
            }
        }
        catch (InterruptedException ex) {
            bhp.a.debug("Stopping due to interrupt");
        }
        catch (Throwable \u2603) {
            final b a = b.a(\u2603, "Batching chunks");
            ave.A().a(ave.A().b(a));
        }
    }
    
    protected void a(final bhn \u2603) throws InterruptedException {
        \u2603.f().lock();
        try {
            if (\u2603.a() != bhn.a.a) {
                if (!\u2603.h()) {
                    bhp.a.warn("Chunk render task was " + \u2603.a() + " when I expected it to be pending; ignoring task");
                }
                return;
            }
            \u2603.a(bhn.a.b);
        }
        finally {
            \u2603.f().unlock();
        }
        final pk ac = ave.A().ac();
        if (ac == null) {
            \u2603.e();
            return;
        }
        \u2603.a(this.b());
        final float n = (float)ac.s;
        final float n2 = (float)ac.t + ac.aS();
        final float n3 = (float)ac.u;
        final bhn.b g = \u2603.g();
        if (g == bhn.b.a) {
            \u2603.b().b(n, n2, n3, \u2603);
        }
        else if (g == bhn.b.b) {
            \u2603.b().a(n, n2, n3, \u2603);
        }
        \u2603.f().lock();
        try {
            if (\u2603.a() != bhn.a.b) {
                if (!\u2603.h()) {
                    bhp.a.warn("Chunk render task was " + \u2603.a() + " when I expected it to be compiling; aborting task");
                }
                this.b(\u2603);
                return;
            }
            \u2603.a(bhn.a.c);
        }
        finally {
            \u2603.f().unlock();
        }
        final bhq c = \u2603.c();
        final List<ListenableFuture<Object>> arrayList = (List<ListenableFuture<Object>>)Lists.newArrayList();
        if (g == bhn.b.a) {
            for (final adf \u26032 : adf.values()) {
                if (c.d(\u26032)) {
                    arrayList.add(this.b.a(\u26032, \u2603.d().a(\u26032), \u2603.b(), c));
                }
            }
        }
        else if (g == bhn.b.b) {
            arrayList.add(this.b.a(adf.d, \u2603.d().a(adf.d), \u2603.b(), c));
        }
        final ListenableFuture<List<Object>> allAsList = Futures.allAsList((Iterable<? extends ListenableFuture<?>>)arrayList);
        \u2603.a(new Runnable() {
            @Override
            public void run() {
                allAsList.cancel(false);
            }
        });
        Futures.addCallback((ListenableFuture)allAsList, (FutureCallback)new FutureCallback<List<Object>>() {
            public void a(final List<Object> \u2603) {
                bhp.this.b(\u2603);
                \u2603.f().lock();
                try {
                    if (\u2603.a() != bhn.a.c) {
                        if (!\u2603.h()) {
                            bhp.a.warn("Chunk render task was " + \u2603.a() + " when I expected it to be uploading; aborting task");
                        }
                        return;
                    }
                    \u2603.a(bhn.a.d);
                }
                finally {
                    \u2603.f().unlock();
                }
                \u2603.b().a(c);
            }
            
            @Override
            public void onFailure(final Throwable \u2603) {
                bhp.this.b(\u2603);
                if (!(\u2603 instanceof CancellationException) && !(\u2603 instanceof InterruptedException)) {
                    ave.A().a(b.a(\u2603, "Rendering chunk"));
                }
            }
        });
    }
    
    private bfg b() throws InterruptedException {
        return (this.c != null) ? this.c : this.b.c();
    }
    
    private void b(final bhn \u2603) {
        if (this.c == null) {
            this.b.a(\u2603.d());
        }
    }
    
    static {
        a = LogManager.getLogger();
    }
}
