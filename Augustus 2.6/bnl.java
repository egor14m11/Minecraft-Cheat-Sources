import java.io.File;
import java.io.FileNotFoundException;

// 
// Decompiled by Procyon v0.5.36
// 

public class bnl extends FileNotFoundException
{
    public bnl(final File \u2603, final String \u2603) {
        super(String.format("'%s' in ResourcePack '%s'", \u2603, \u2603));
    }
}
