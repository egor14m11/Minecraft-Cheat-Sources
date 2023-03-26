import java.util.Iterator;
import java.util.List;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ManagementFactory;
import java.util.TimerTask;
import java.net.MalformedURLException;
import java.util.UUID;
import com.google.common.collect.Maps;
import java.util.Timer;
import java.net.URL;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class or
{
    private final Map<String, Object> a;
    private final Map<String, Object> b;
    private final String c;
    private final URL d;
    private final os e;
    private final Timer f;
    private final Object g;
    private final long h;
    private boolean i;
    private int j;
    
    public or(final String \u2603, final os \u2603, final long \u2603) {
        this.a = (Map<String, Object>)Maps.newHashMap();
        this.b = (Map<String, Object>)Maps.newHashMap();
        this.c = UUID.randomUUID().toString();
        this.f = new Timer("Snooper Timer", true);
        this.g = new Object();
        try {
            this.d = new URL("http://snoop.minecraft.net/" + \u2603 + "?version=" + 2);
        }
        catch (MalformedURLException ex) {
            throw new IllegalArgumentException();
        }
        this.e = \u2603;
        this.h = \u2603;
    }
    
    public void a() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.h();
        this.f.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!or.this.e.ad()) {
                    return;
                }
                final Map<String, Object> hashMap;
                synchronized (or.this.g) {
                    hashMap = (Map<String, Object>)Maps.newHashMap((Map<?, ?>)or.this.b);
                    if (or.this.j == 0) {
                        hashMap.putAll(or.this.a);
                    }
                    hashMap.put("snooper_count", or.this.j++);
                    hashMap.put("snooper_token", or.this.c);
                }
                nj.a(or.this.d, hashMap, true);
            }
        }, 0L, 900000L);
    }
    
    private void h() {
        this.i();
        this.a("snooper_token", this.c);
        this.b("snooper_token", this.c);
        this.b("os_name", System.getProperty("os.name"));
        this.b("os_version", System.getProperty("os.version"));
        this.b("os_architecture", System.getProperty("os.arch"));
        this.b("java_version", System.getProperty("java.version"));
        this.a("version", "1.8.8");
        this.e.b(this);
    }
    
    private void i() {
        final RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        final List<String> inputArguments = runtimeMXBean.getInputArguments();
        int i = 0;
        for (final String \u2603 : inputArguments) {
            if (\u2603.startsWith("-X")) {
                this.a("jvm_arg[" + i++ + "]", \u2603);
            }
        }
        this.a("jvm_args", i);
    }
    
    public void b() {
        this.b("memory_total", Runtime.getRuntime().totalMemory());
        this.b("memory_max", Runtime.getRuntime().maxMemory());
        this.b("memory_free", Runtime.getRuntime().freeMemory());
        this.b("cpu_cores", Runtime.getRuntime().availableProcessors());
        this.e.a(this);
    }
    
    public void a(final String \u2603, final Object \u2603) {
        synchronized (this.g) {
            this.b.put(\u2603, \u2603);
        }
    }
    
    public void b(final String \u2603, final Object \u2603) {
        synchronized (this.g) {
            this.a.put(\u2603, \u2603);
        }
    }
    
    public Map<String, String> c() {
        final Map<String, String> linkedHashMap = (Map<String, String>)Maps.newLinkedHashMap();
        synchronized (this.g) {
            this.b();
            for (final Map.Entry<String, Object> entry : this.a.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            for (final Map.Entry<String, Object> entry : this.b.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return linkedHashMap;
    }
    
    public boolean d() {
        return this.i;
    }
    
    public void e() {
        this.f.cancel();
    }
    
    public String f() {
        return this.c;
    }
    
    public long g() {
        return this.h;
    }
}
