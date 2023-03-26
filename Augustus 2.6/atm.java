import org.apache.logging.log4j.LogManager;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import net.minecraft.server.MinecraftServer;
import java.io.File;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class atm implements atp, aty
{
    private static final Logger a;
    private final File b;
    private final File c;
    private final File d;
    private final long e;
    private final String f;
    
    public atm(final File \u2603, final String \u2603, final boolean \u2603) {
        this.e = MinecraftServer.az();
        (this.b = new File(\u2603, \u2603)).mkdirs();
        this.c = new File(this.b, "playerdata");
        (this.d = new File(this.b, "data")).mkdirs();
        this.f = \u2603;
        if (\u2603) {
            this.c.mkdirs();
        }
        this.h();
    }
    
    private void h() {
        try {
            final File file = new File(this.b, "session.lock");
            final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeLong(this.e);
            }
            finally {
                dataOutputStream.close();
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Failed to check session lock, aborting");
        }
    }
    
    @Override
    public File b() {
        return this.b;
    }
    
    @Override
    public void c() throws adn {
        try {
            final File file = new File(this.b, "session.lock");
            final DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                if (dataInputStream.readLong() != this.e) {
                    throw new adn("The save is being accessed from another location, aborting");
                }
            }
            finally {
                dataInputStream.close();
            }
        }
        catch (IOException ex) {
            throw new adn("Failed to check session lock, aborting");
        }
    }
    
    @Override
    public and a(final anm \u2603) {
        throw new RuntimeException("Old Chunk Storage is no longer supported.");
    }
    
    @Override
    public ato d() {
        File file = new File(this.b, "level.dat");
        if (file.exists()) {
            try {
                final dn dn = dx.a(new FileInputStream(file));
                final dn dn2 = dn.m("Data");
                return new ato(dn2);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        file = new File(this.b, "level.dat_old");
        if (file.exists()) {
            try {
                final dn dn = dx.a(new FileInputStream(file));
                final dn dn2 = dn.m("Data");
                return new ato(dn2);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
    
    @Override
    public void a(final ato \u2603, final dn \u2603) {
        final dn a = \u2603.a(\u2603);
        final dn \u26032 = new dn();
        \u26032.a("Data", a);
        try {
            final File file = new File(this.b, "level.dat_new");
            final File dest = new File(this.b, "level.dat_old");
            final File dest2 = new File(this.b, "level.dat");
            dx.a(\u26032, new FileOutputStream(file));
            if (dest.exists()) {
                dest.delete();
            }
            dest2.renameTo(dest);
            if (dest2.exists()) {
                dest2.delete();
            }
            file.renameTo(dest2);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void a(final ato \u2603) {
        final dn a = \u2603.a();
        final dn \u26032 = new dn();
        \u26032.a("Data", a);
        try {
            final File file = new File(this.b, "level.dat_new");
            final File dest = new File(this.b, "level.dat_old");
            final File dest2 = new File(this.b, "level.dat");
            dx.a(\u26032, new FileOutputStream(file));
            if (dest.exists()) {
                dest.delete();
            }
            dest2.renameTo(dest);
            if (dest2.exists()) {
                dest2.delete();
            }
            file.renameTo(dest2);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void a(final wn \u2603) {
        try {
            final dn dn = new dn();
            \u2603.e(dn);
            final File file = new File(this.c, \u2603.aK().toString() + ".dat.tmp");
            final File dest = new File(this.c, \u2603.aK().toString() + ".dat");
            dx.a(dn, new FileOutputStream(file));
            if (dest.exists()) {
                dest.delete();
            }
            file.renameTo(dest);
        }
        catch (Exception ex) {
            atm.a.warn("Failed to save player data for " + \u2603.e_());
        }
    }
    
    @Override
    public dn b(final wn \u2603) {
        dn a = null;
        try {
            final File file = new File(this.c, \u2603.aK().toString() + ".dat");
            if (file.exists() && file.isFile()) {
                a = dx.a(new FileInputStream(file));
            }
        }
        catch (Exception ex) {
            atm.a.warn("Failed to load player data for " + \u2603.e_());
        }
        if (a != null) {
            \u2603.f(a);
        }
        return a;
    }
    
    @Override
    public aty e() {
        return this;
    }
    
    @Override
    public String[] f() {
        String[] list = this.c.list();
        if (list == null) {
            list = new String[0];
        }
        for (int i = 0; i < list.length; ++i) {
            if (list[i].endsWith(".dat")) {
                list[i] = list[i].substring(0, list[i].length() - 4);
            }
        }
        return list;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public File a(final String \u2603) {
        return new File(this.d, \u2603 + ".dat");
    }
    
    @Override
    public String g() {
        return this.f;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
