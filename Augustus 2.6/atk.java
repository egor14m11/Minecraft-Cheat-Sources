import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import java.io.FilenameFilter;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.DataOutput;
import java.util.Iterator;
import java.util.Collection;
import org.apache.commons.lang3.StringUtils;
import com.google.common.collect.Lists;
import java.util.List;
import java.io.File;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class atk extends atn
{
    private static final Logger b;
    
    public atk(final File \u2603) {
        super(\u2603);
    }
    
    @Override
    public String a() {
        return "Anvil";
    }
    
    @Override
    public List<ats> b() throws atq {
        if (this.a == null || !this.a.exists() || !this.a.isDirectory()) {
            throw new atq("Unable to read or access folder where game worlds are saved!");
        }
        final List<ats> arrayList = (List<ats>)Lists.newArrayList();
        final File[] listFiles;
        final File[] array = listFiles = this.a.listFiles();
        for (final File file : listFiles) {
            if (file.isDirectory()) {
                final String name = file.getName();
                final ato c = this.c(name);
                if (c != null && (c.l() == 19132 || c.l() == 19133)) {
                    final boolean \u2603 = c.l() != this.c();
                    String k = c.k();
                    if (StringUtils.isEmpty(k)) {
                        k = name;
                    }
                    final long \u26032 = 0L;
                    arrayList.add(new ats(name, k, c.m(), \u26032, c.r(), \u2603, c.t(), c.v()));
                }
            }
        }
        return arrayList;
    }
    
    protected int c() {
        return 19133;
    }
    
    @Override
    public void d() {
        ani.a();
    }
    
    @Override
    public atp a(final String \u2603, final boolean \u2603) {
        return new atj(this.a, \u2603, \u2603);
    }
    
    @Override
    public boolean a(final String \u2603) {
        final ato c = this.c(\u2603);
        return c != null && c.l() == 19132;
    }
    
    @Override
    public boolean b(final String \u2603) {
        final ato c = this.c(\u2603);
        return c != null && c.l() != this.c();
    }
    
    @Override
    public boolean a(final String \u2603, final nu \u2603) {
        \u2603.a(0);
        final List<File> arrayList = (List<File>)Lists.newArrayList();
        final List<File> arrayList2 = (List<File>)Lists.newArrayList();
        final List<File> arrayList3 = (List<File>)Lists.newArrayList();
        final File file = new File(this.a, \u2603);
        final File file2 = new File(file, "DIM-1");
        final File file3 = new File(file, "DIM1");
        atk.b.info("Scanning folders...");
        this.a(file, arrayList);
        if (file2.exists()) {
            this.a(file2, arrayList2);
        }
        if (file3.exists()) {
            this.a(file3, arrayList3);
        }
        final int n = arrayList.size() + arrayList2.size() + arrayList3.size();
        atk.b.info("Total conversion count is " + n);
        final ato c = this.c(\u2603);
        aec \u26032 = null;
        if (c.u() == adr.c) {
            \u26032 = new aef(ady.q, 0.5f);
        }
        else {
            \u26032 = new aec(c.b(), c.u(), c.B());
        }
        this.a(new File(file, "region"), arrayList, \u26032, 0, n, \u2603);
        this.a(new File(file2, "region"), arrayList2, new aef(ady.x, 0.0f), arrayList.size(), n, \u2603);
        this.a(new File(file3, "region"), arrayList3, new aef(ady.y, 0.0f), arrayList.size() + arrayList2.size(), n, \u2603);
        c.e(19133);
        if (c.u() == adr.h) {
            c.a(adr.b);
        }
        this.g(\u2603);
        final atp a = this.a(\u2603, false);
        a.a(c);
        return true;
    }
    
    private void g(final String \u2603) {
        final File file = new File(this.a, \u2603);
        if (!file.exists()) {
            atk.b.warn("Unable to create level.dat_mcr backup");
            return;
        }
        final File file2 = new File(file, "level.dat");
        if (!file2.exists()) {
            atk.b.warn("Unable to create level.dat_mcr backup");
            return;
        }
        final File dest = new File(file, "level.dat_mcr");
        if (!file2.renameTo(dest)) {
            atk.b.warn("Unable to create level.dat_mcr backup");
        }
    }
    
    private void a(final File \u2603, Iterable<File> \u2603, final aec \u2603, final int \u2603, final int \u2603, final nu \u2603) {
        for (final File \u26032 : \u2603) {
            this.a(\u2603, \u26032, \u2603, \u2603, \u2603, \u2603);
            ++\u2603;
            final int n = (int)Math.round(100.0 * \u2603 / \u2603);
            \u2603.a(n);
        }
    }
    
    private void a(final File \u2603, final File \u2603, final aec \u2603, final int \u2603, final int \u2603, final nu \u2603) {
        try {
            final String name = \u2603.getName();
            final anh anh = new anh(\u2603);
            final anh anh2 = new anh(new File(\u2603, name.substring(0, name.length() - ".mcr".length()) + ".mca"));
            for (int i = 0; i < 32; ++i) {
                for (int j = 0; j < 32; ++j) {
                    if (anh.c(i, j) && !anh2.c(i, j)) {
                        final DataInputStream a = anh.a(i, j);
                        if (a == null) {
                            atk.b.warn("Failed to fetch input stream");
                        }
                        else {
                            final dn a2 = dx.a(a);
                            a.close();
                            final dn m = a2.m("Level");
                            final ang.a a3 = ang.a(m);
                            final dn \u26032 = new dn();
                            final dn dn = new dn();
                            \u26032.a("Level", dn);
                            ang.a(a3, dn, \u2603);
                            final DataOutputStream b = anh2.b(i, j);
                            dx.a(\u26032, (DataOutput)b);
                            b.close();
                        }
                    }
                }
                int j = (int)Math.round(100.0 * (\u2603 * 1024) / (\u2603 * 1024));
                final int n = (int)Math.round(100.0 * ((i + 1) * 32 + \u2603 * 1024) / (\u2603 * 1024));
                if (n > j) {
                    \u2603.a(n);
                }
            }
            anh.c();
            anh2.c();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void a(final File \u2603, final Collection<File> \u2603) {
        final File file = new File(\u2603, "region");
        final File[] listFiles = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(final File \u2603, final String \u2603) {
                return \u2603.endsWith(".mcr");
            }
        });
        if (listFiles != null) {
            Collections.addAll(\u2603, listFiles);
        }
    }
    
    static {
        b = LogManager.getLogger();
    }
}
