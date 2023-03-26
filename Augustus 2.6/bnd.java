import java.io.FileFilter;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import com.google.common.collect.Sets;
import java.util.Set;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

// 
// Decompiled by Procyon v0.5.36
// 

public class bnd extends bmx
{
    public bnd(final File \u2603) {
        super(\u2603);
    }
    
    @Override
    protected InputStream a(final String \u2603) throws IOException {
        return new BufferedInputStream(new FileInputStream(new File(this.a, \u2603)));
    }
    
    @Override
    protected boolean b(final String \u2603) {
        return new File(this.a, \u2603).isFile();
    }
    
    @Override
    public Set<String> c() {
        final Set<String> hashSet = (Set<String>)Sets.newHashSet();
        final File \u2603 = new File(this.a, "assets/");
        if (\u2603.isDirectory()) {
            for (final File \u26032 : \u2603.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY)) {
                final String a = bmx.a(\u2603, \u26032);
                if (!a.equals(a.toLowerCase())) {
                    this.c(a);
                }
                else {
                    hashSet.add(a.substring(0, a.length() - 1));
                }
            }
        }
        return hashSet;
    }
}
