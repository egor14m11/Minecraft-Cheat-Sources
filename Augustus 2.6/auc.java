import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class auc implements Runnable
{
    private static final auc a;
    private List<aud> b;
    private volatile long c;
    private volatile long d;
    private volatile boolean e;
    
    private auc() {
        this.b = Collections.synchronizedList((List<aud>)Lists.newArrayList());
        final Thread thread = new Thread(this, "File IO Thread");
        thread.setPriority(1);
        thread.start();
    }
    
    public static auc a() {
        return auc.a;
    }
    
    @Override
    public void run() {
        while (true) {
            this.c();
        }
    }
    
    private void c() {
        for (int i = 0; i < this.b.size(); ++i) {
            final aud aud = this.b.get(i);
            final boolean c = aud.c();
            if (!c) {
                this.b.remove(i--);
                ++this.d;
            }
            try {
                Thread.sleep(this.e ? 0L : 10L);
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        if (this.b.isEmpty()) {
            try {
                Thread.sleep(25L);
            }
            catch (InterruptedException ex2) {
                ex2.printStackTrace();
            }
        }
    }
    
    public void a(final aud \u2603) {
        if (this.b.contains(\u2603)) {
            return;
        }
        ++this.c;
        this.b.add(\u2603);
    }
    
    public void b() throws InterruptedException {
        this.e = true;
        while (this.c != this.d) {
            Thread.sleep(10L);
        }
        this.e = false;
    }
    
    static {
        a = new auc();
    }
}
