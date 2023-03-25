/*
 * Decompiled with CFR 0.150.
 */
package shadersmod.client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import optifine.StrUtils;
import shadersmod.client.IShaderPack;

public class ShaderPackFolder
implements IShaderPack {
    protected File packFile;

    public ShaderPackFolder(String name, File file) {
        this.packFile = file;
    }

    @Override
    public void close() {
    }

    @Override
    public InputStream getResourceAsStream(String resName) {
        try {
            String s = StrUtils.removePrefixSuffix(resName, "/", "/");
            File file1 = new File(this.packFile, s);
            return !file1.exists() ? null : new BufferedInputStream(new FileInputStream(file1));
        }
        catch (Exception var4) {
            return null;
        }
    }

    @Override
    public boolean hasDirectory(String name) {
        File file1 = new File(this.packFile, name.substring(1));
        if (!file1.exists()) {
            return false;
        }
        return file1.isDirectory();
    }

    @Override
    public String getName() {
        return this.packFile.getName();
    }
}

