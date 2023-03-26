import java.net.SocketTimeoutException;
import java.net.DatagramPacket;
import java.io.IOException;
import java.net.MulticastSocket;
import java.util.Iterator;
import java.net.InetAddress;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bpq
{
    private static final AtomicInteger a;
    private static final Logger b;
    
    static {
        a = new AtomicInteger(0);
        b = LogManager.getLogger();
    }
    
    public static class c
    {
        private List<a> b;
        boolean a;
        
        public c() {
            this.b = (List<a>)Lists.newArrayList();
        }
        
        public synchronized boolean a() {
            return this.a;
        }
        
        public synchronized void b() {
            this.a = false;
        }
        
        public synchronized List<a> c() {
            return Collections.unmodifiableList((List<? extends a>)this.b);
        }
        
        public synchronized void a(final String \u2603, final InetAddress \u2603) {
            final String a = bpr.a(\u2603);
            String \u26032 = bpr.b(\u2603);
            if (\u26032 == null) {
                return;
            }
            \u26032 = \u2603.getHostAddress() + ":" + \u26032;
            boolean b = false;
            for (final a a2 : this.b) {
                if (a2.b().equals(\u26032)) {
                    a2.c();
                    b = true;
                    break;
                }
            }
            if (!b) {
                this.b.add(new a(a, \u26032));
                this.a = true;
            }
        }
    }
    
    public static class a
    {
        private String a;
        private String b;
        private long c;
        
        public a(final String \u2603, final String \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = ave.J();
        }
        
        public String a() {
            return this.a;
        }
        
        public String b() {
            return this.b;
        }
        
        public void c() {
            this.c = ave.J();
        }
    }
    
    public static class b extends Thread
    {
        private final c a;
        private final InetAddress b;
        private final MulticastSocket c;
        
        public b(final c \u2603) throws IOException {
            super("LanServerDetector #" + bpq.a.incrementAndGet());
            this.a = \u2603;
            this.setDaemon(true);
            this.c = new MulticastSocket(4445);
            this.b = InetAddress.getByName("224.0.2.60");
            this.c.setSoTimeout(5000);
            this.c.joinGroup(this.b);
        }
        
        @Override
        public void run() {
            final byte[] buf = new byte[1024];
            while (!this.isInterrupted()) {
                final DatagramPacket p = new DatagramPacket(buf, buf.length);
                try {
                    this.c.receive(p);
                }
                catch (SocketTimeoutException ex) {
                    continue;
                }
                catch (IOException throwable) {
                    bpq.b.error("Couldn't ping server", throwable);
                    break;
                }
                final String s = new String(p.getData(), p.getOffset(), p.getLength());
                bpq.b.debug(p.getAddress() + ": " + s);
                this.a.a(s, p.getAddress());
            }
            try {
                this.c.leaveGroup(this.b);
            }
            catch (IOException ex2) {}
            this.c.close();
        }
    }
}
