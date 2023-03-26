import com.google.common.collect.Maps;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.util.Iterator;
import java.io.IOException;
import java.io.File;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class ani
{
    private static final Map<File, anh> a;
    
    public static synchronized anh a(final File \u2603, final int \u2603, final int \u2603) {
        final File parent = new File(\u2603, "region");
        final File \u26032 = new File(parent, "r." + (\u2603 >> 5) + "." + (\u2603 >> 5) + ".mca");
        final anh anh = ani.a.get(\u26032);
        if (anh != null) {
            return anh;
        }
        if (!parent.exists()) {
            parent.mkdirs();
        }
        if (ani.a.size() >= 256) {
            a();
        }
        final anh anh2 = new anh(\u26032);
        ani.a.put(\u26032, anh2);
        return anh2;
    }
    
    public static synchronized void a() {
        for (final anh anh : ani.a.values()) {
            try {
                if (anh == null) {
                    continue;
                }
                anh.c();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        ani.a.clear();
    }
    
    public static DataInputStream c(final File \u2603, final int \u2603, final int \u2603) {
        final anh a = a(\u2603, \u2603, \u2603);
        return a.a(\u2603 & 0x1F, \u2603 & 0x1F);
    }
    
    public static DataOutputStream d(final File \u2603, final int \u2603, final int \u2603) {
        final anh a = a(\u2603, \u2603, \u2603);
        return a.b(\u2603 & 0x1F, \u2603 & 0x1F);
    }
    
    static {
        a = Maps.newHashMap();
    }
}
