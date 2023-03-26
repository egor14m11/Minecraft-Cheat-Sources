import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GL11;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import com.google.common.collect.Queues;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bho
{
    private static final Logger a;
    private static final ThreadFactory b;
    private final List<bhp> c;
    private final BlockingQueue<bhn> d;
    private final BlockingQueue<bfg> e;
    private final bfe f;
    private final bfz g;
    private final Queue<ListenableFutureTask<?>> h;
    private final bhp i;
    
    public bho() {
        this.c = (List<bhp>)Lists.newArrayList();
        this.d = (BlockingQueue<bhn>)Queues.newArrayBlockingQueue(100);
        this.e = (BlockingQueue<bfg>)Queues.newArrayBlockingQueue(5);
        this.f = new bfe();
        this.g = new bfz();
        this.h = (Queue<ListenableFutureTask<?>>)Queues.newArrayDeque();
        for (int i = 0; i < 2; ++i) {
            final bhp bhp = new bhp(this);
            final Thread thread = bho.b.newThread(bhp);
            thread.start();
            this.c.add(bhp);
        }
        for (int i = 0; i < 5; ++i) {
            this.e.add(new bfg());
        }
        this.i = new bhp(this, new bfg());
    }
    
    public String a() {
        return String.format("pC: %03d, pU: %1d, aB: %1d", this.d.size(), this.h.size(), this.e.size());
    }
    
    public boolean a(final long \u2603) {
        boolean b = false;
        long n;
        do {
            boolean b2 = false;
            synchronized (this.h) {
                if (!this.h.isEmpty()) {
                    this.h.poll().run();
                    b2 = true;
                    b = true;
                }
            }
            if (\u2603 == 0L) {
                break;
            }
            if (!b2) {
                break;
            }
            n = \u2603 - System.nanoTime();
        } while (n >= 0L);
        return b;
    }
    
    public boolean a(final bht \u2603) {
        \u2603.c().lock();
        try {
            final bhn d = \u2603.d();
            d.a(new Runnable() {
                @Override
                public void run() {
                    bho.this.d.remove(d);
                }
            });
            final boolean offer = this.d.offer(d);
            if (!offer) {
                d.e();
            }
            return offer;
        }
        finally {
            \u2603.c().unlock();
        }
    }
    
    public boolean b(final bht \u2603) {
        \u2603.c().lock();
        try {
            final bhn d = \u2603.d();
            try {
                this.i.a(d);
            }
            catch (InterruptedException ex) {}
            return true;
        }
        finally {
            \u2603.c().unlock();
        }
    }
    
    public void b() {
        this.e();
        while (this.a(0L)) {}
        final List<bfg> arrayList = (List<bfg>)Lists.newArrayList();
        while (arrayList.size() != 5) {
            try {
                arrayList.add(this.c());
            }
            catch (InterruptedException ex) {}
        }
        this.e.addAll((Collection<?>)arrayList);
    }
    
    public void a(final bfg \u2603) {
        this.e.add(\u2603);
    }
    
    public bfg c() throws InterruptedException {
        return this.e.take();
    }
    
    public bhn d() throws InterruptedException {
        return this.d.take();
    }
    
    public boolean c(final bht \u2603) {
        \u2603.c().lock();
        try {
            final bhn e = \u2603.e();
            if (e != null) {
                e.a(new Runnable() {
                    @Override
                    public void run() {
                        bho.this.d.remove(e);
                    }
                });
                return this.d.offer(e);
            }
            return true;
        }
        finally {
            \u2603.c().unlock();
        }
    }
    
    public ListenableFuture<Object> a(final adf \u2603, final bfd \u2603, final bht \u2603, final bhq \u2603) {
        if (ave.A().aJ()) {
            if (bqs.f()) {
                this.a(\u2603, \u2603.b(\u2603.ordinal()));
            }
            else {
                this.a(\u2603, ((bhs)\u2603).a(\u2603, \u2603), \u2603);
            }
            \u2603.c(0.0, 0.0, 0.0);
            return Futures.immediateFuture((Object)null);
        }
        final ListenableFutureTask<Object> create = ListenableFutureTask.create(new Runnable() {
            @Override
            public void run() {
                bho.this.a(\u2603, \u2603, \u2603, \u2603);
            }
        }, (Object)null);
        synchronized (this.h) {
            this.h.add(create);
        }
        return create;
    }
    
    private void a(final bfd \u2603, final int \u2603, final bht \u2603) {
        GL11.glNewList(\u2603, 4864);
        bfl.E();
        \u2603.f();
        this.f.a(\u2603);
        bfl.F();
        GL11.glEndList();
    }
    
    private void a(final bfd \u2603, final bmt \u2603) {
        this.g.a(\u2603);
        this.g.a(\u2603);
    }
    
    public void e() {
        while (!this.d.isEmpty()) {
            final bhn bhn = this.d.poll();
            if (bhn != null) {
                bhn.e();
            }
        }
    }
    
    static {
        a = LogManager.getLogger();
        b = new ThreadFactoryBuilder().setNameFormat("Chunk Batcher %d").setDaemon(true).build();
    }
}
