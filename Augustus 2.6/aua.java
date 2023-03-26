import java.io.DataOutput;
import java.io.DataOutputStream;
import java.util.Iterator;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class aua
{
    private atp b;
    protected Map<String, ate> a;
    private List<ate> c;
    private Map<String, Short> d;
    
    public aua(final atp \u2603) {
        this.a = (Map<String, ate>)Maps.newHashMap();
        this.c = (List<ate>)Lists.newArrayList();
        this.d = (Map<String, Short>)Maps.newHashMap();
        this.b = \u2603;
        this.b();
    }
    
    public ate a(final Class<? extends ate> \u2603, final String \u2603) {
        ate ate = this.a.get(\u2603);
        if (ate != null) {
            return ate;
        }
        if (this.b != null) {
            try {
                final File a = this.b.a(\u2603);
                if (a != null && a.exists()) {
                    try {
                        ate = (ate)\u2603.getConstructor(String.class).newInstance(\u2603);
                    }
                    catch (Exception cause) {
                        throw new RuntimeException("Failed to instantiate " + \u2603.toString(), cause);
                    }
                    final FileInputStream \u26032 = new FileInputStream(a);
                    final dn a2 = dx.a(\u26032);
                    \u26032.close();
                    ate.a(a2.m("data"));
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (ate != null) {
            this.a.put(\u2603, ate);
            this.c.add(ate);
        }
        return ate;
    }
    
    public void a(final String \u2603, final ate \u2603) {
        if (this.a.containsKey(\u2603)) {
            this.c.remove(this.a.remove(\u2603));
        }
        this.a.put(\u2603, \u2603);
        this.c.add(\u2603);
    }
    
    public void a() {
        for (int i = 0; i < this.c.size(); ++i) {
            final ate \u2603 = this.c.get(i);
            if (\u2603.d()) {
                this.a(\u2603);
                \u2603.a(false);
            }
        }
    }
    
    private void a(final ate \u2603) {
        if (this.b == null) {
            return;
        }
        try {
            final File a = this.b.a(\u2603.a);
            if (a != null) {
                final dn \u26032 = new dn();
                \u2603.b(\u26032);
                final dn \u26033 = new dn();
                \u26033.a("data", \u26032);
                final FileOutputStream \u26034 = new FileOutputStream(a);
                dx.a(\u26033, \u26034);
                \u26034.close();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void b() {
        try {
            this.d.clear();
            if (this.b == null) {
                return;
            }
            final File a = this.b.a("idcounts");
            if (a != null && a.exists()) {
                final DataInputStream \u2603 = new DataInputStream(new FileInputStream(a));
                final dn a2 = dx.a(\u2603);
                \u2603.close();
                for (final String \u26032 : a2.c()) {
                    final eb a3 = a2.a(\u26032);
                    if (a3 instanceof dz) {
                        final dz dz = (dz)a3;
                        final String s = \u26032;
                        final short e = dz.e();
                        this.d.put(s, e);
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int a(final String \u2603) {
        Short n = this.d.get(\u2603);
        if (n == null) {
            n = 0;
        }
        else {
            n = (short)(n + 1);
        }
        this.d.put(\u2603, n);
        if (this.b == null) {
            return n;
        }
        try {
            final File a = this.b.a("idcounts");
            if (a != null) {
                final dn \u26032 = new dn();
                for (final String \u26033 : this.d.keySet()) {
                    final short shortValue = this.d.get(\u26033);
                    \u26032.a(\u26033, shortValue);
                }
                final DataOutputStream \u26034 = new DataOutputStream(new FileOutputStream(a));
                dx.a(\u26032, (DataOutput)\u26034);
                \u26034.close();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return n;
    }
}
