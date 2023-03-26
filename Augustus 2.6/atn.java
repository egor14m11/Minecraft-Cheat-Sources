import org.apache.logging.log4j.LogManager;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import com.google.common.collect.Lists;
import java.util.List;
import java.io.File;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class atn implements atr
{
    private static final Logger b;
    protected final File a;
    
    public atn(final File \u2603) {
        if (!\u2603.exists()) {
            \u2603.mkdirs();
        }
        this.a = \u2603;
    }
    
    @Override
    public String a() {
        return "Old Format";
    }
    
    @Override
    public List<ats> b() throws atq {
        final List<ats> arrayList = (List<ats>)Lists.newArrayList();
        for (int i = 0; i < 5; ++i) {
            final String string = "World" + (i + 1);
            final ato c = this.c(string);
            if (c != null) {
                arrayList.add(new ats(string, "", c.m(), c.h(), c.r(), false, c.t(), c.v()));
            }
        }
        return arrayList;
    }
    
    @Override
    public void d() {
    }
    
    @Override
    public ato c(final String \u2603) {
        final File file = new File(this.a, \u2603);
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, "level.dat");
        if (file2.exists()) {
            try {
                final dn dn = dx.a(new FileInputStream(file2));
                final dn dn2 = dn.m("Data");
                return new ato(dn2);
            }
            catch (Exception ex) {
                atn.b.error("Exception reading " + file2, ex);
            }
        }
        file2 = new File(file, "level.dat_old");
        if (file2.exists()) {
            try {
                final dn dn = dx.a(new FileInputStream(file2));
                final dn dn2 = dn.m("Data");
                return new ato(dn2);
            }
            catch (Exception ex) {
                atn.b.error("Exception reading " + file2, ex);
            }
        }
        return null;
    }
    
    @Override
    public void a(final String \u2603, final String \u2603) {
        final File parent = new File(this.a, \u2603);
        if (!parent.exists()) {
            return;
        }
        final File file = new File(parent, "level.dat");
        if (file.exists()) {
            try {
                final dn a = dx.a(new FileInputStream(file));
                final dn m = a.m("Data");
                m.a("LevelName", \u2603);
                dx.a(a, new FileOutputStream(file));
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public boolean d(final String \u2603) {
        final File file = new File(this.a, \u2603);
        if (file.exists()) {
            return false;
        }
        try {
            file.mkdir();
            file.delete();
        }
        catch (Throwable throwable) {
            atn.b.warn("Couldn't make new level", throwable);
            return false;
        }
        return true;
    }
    
    @Override
    public boolean e(final String \u2603) {
        final File file = new File(this.a, \u2603);
        if (!file.exists()) {
            return true;
        }
        atn.b.info("Deleting level " + \u2603);
        for (int i = 1; i <= 5; ++i) {
            atn.b.info("Attempt " + i + "...");
            if (a(file.listFiles())) {
                break;
            }
            atn.b.warn("Unsuccessful in deleting contents.");
            if (i < 5) {
                try {
                    Thread.sleep(500L);
                }
                catch (InterruptedException ex) {}
            }
        }
        return file.delete();
    }
    
    protected static boolean a(final File[] \u2603) {
        for (int i = 0; i < \u2603.length; ++i) {
            final File obj = \u2603[i];
            atn.b.debug("Deleting " + obj);
            if (obj.isDirectory() && !a(obj.listFiles())) {
                atn.b.warn("Couldn't delete directory " + obj);
                return false;
            }
            if (!obj.delete()) {
                atn.b.warn("Couldn't delete file " + obj);
                return false;
            }
        }
        return true;
    }
    
    @Override
    public atp a(final String \u2603, final boolean \u2603) {
        return new atm(this.a, \u2603, \u2603);
    }
    
    @Override
    public boolean a(final String \u2603) {
        return false;
    }
    
    @Override
    public boolean b(final String \u2603) {
        return false;
    }
    
    @Override
    public boolean a(final String \u2603, final nu \u2603) {
        return false;
    }
    
    @Override
    public boolean f(final String \u2603) {
        final File file = new File(this.a, \u2603);
        return file.isDirectory();
    }
    
    static {
        b = LogManager.getLogger();
    }
}
