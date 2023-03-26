import org.apache.logging.log4j.LogManager;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.io.IOException;
import java.net.DatagramSocket;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bpr extends Thread
{
    private static final AtomicInteger a;
    private static final Logger b;
    private final String c;
    private final DatagramSocket d;
    private boolean e;
    private final String f;
    
    public bpr(final String \u2603, final String \u2603) throws IOException {
        super("LanServerPinger #" + bpr.a.incrementAndGet());
        this.e = true;
        this.c = \u2603;
        this.f = \u2603;
        this.setDaemon(true);
        this.d = new DatagramSocket();
    }
    
    @Override
    public void run() {
        final String a = a(this.c, this.f);
        final byte[] bytes = a.getBytes();
        while (!this.isInterrupted() && this.e) {
            try {
                final InetAddress byName = InetAddress.getByName("224.0.2.60");
                final DatagramPacket p = new DatagramPacket(bytes, bytes.length, byName, 4445);
                this.d.send(p);
            }
            catch (IOException ex) {
                bpr.b.warn("LanServerPinger: " + ex.getMessage());
                break;
            }
            try {
                Thread.sleep(1500L);
            }
            catch (InterruptedException ex2) {}
        }
    }
    
    @Override
    public void interrupt() {
        super.interrupt();
        this.e = false;
    }
    
    public static String a(final String \u2603, final String \u2603) {
        return "[MOTD]" + \u2603 + "[/MOTD][AD]" + \u2603 + "[/AD]";
    }
    
    public static String a(final String \u2603) {
        final int index = \u2603.indexOf("[MOTD]");
        if (index < 0) {
            return "missing no";
        }
        final int index2 = \u2603.indexOf("[/MOTD]", index + "[MOTD]".length());
        if (index2 < index) {
            return "missing no";
        }
        return \u2603.substring(index + "[MOTD]".length(), index2);
    }
    
    public static String b(final String \u2603) {
        final int index = \u2603.indexOf("[/MOTD]");
        if (index < 0) {
            return null;
        }
        final int index2 = \u2603.indexOf("[/MOTD]", index + "[/MOTD]".length());
        if (index2 >= 0) {
            return null;
        }
        final int index3 = \u2603.indexOf("[AD]", index + "[/MOTD]".length());
        if (index3 < 0) {
            return null;
        }
        final int index4 = \u2603.indexOf("[/AD]", index3 + "[AD]".length());
        if (index4 < index3) {
            return null;
        }
        return \u2603.substring(index3 + "[AD]".length(), index4);
    }
    
    static {
        a = new AtomicInteger(0);
        b = LogManager.getLogger();
    }
}
