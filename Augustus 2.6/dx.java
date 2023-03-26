import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.BufferedOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class dx
{
    public static dn a(final InputStream \u2603) throws IOException {
        final DataInputStream \u26032 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(\u2603)));
        try {
            return a(\u26032, dw.a);
        }
        finally {
            \u26032.close();
        }
    }
    
    public static void a(final dn \u2603, final OutputStream \u2603) throws IOException {
        final DataOutputStream \u26032 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(\u2603)));
        try {
            a(\u2603, (DataOutput)\u26032);
        }
        finally {
            \u26032.close();
        }
    }
    
    public static void a(final dn \u2603, final File \u2603) throws IOException {
        final File \u26032 = new File(\u2603.getAbsolutePath() + "_tmp");
        if (\u26032.exists()) {
            \u26032.delete();
        }
        b(\u2603, \u26032);
        if (\u2603.exists()) {
            \u2603.delete();
        }
        if (\u2603.exists()) {
            throw new IOException("Failed to delete " + \u2603);
        }
        \u26032.renameTo(\u2603);
    }
    
    public static void b(final dn \u2603, final File \u2603) throws IOException {
        final DataOutputStream \u26032 = new DataOutputStream(new FileOutputStream(\u2603));
        try {
            a(\u2603, (DataOutput)\u26032);
        }
        finally {
            \u26032.close();
        }
    }
    
    public static dn a(final File \u2603) throws IOException {
        if (!\u2603.exists()) {
            return null;
        }
        final DataInputStream \u26032 = new DataInputStream(new FileInputStream(\u2603));
        try {
            return a(\u26032, dw.a);
        }
        finally {
            \u26032.close();
        }
    }
    
    public static dn a(final DataInputStream \u2603) throws IOException {
        return a(\u2603, dw.a);
    }
    
    public static dn a(final DataInput \u2603, final dw \u2603) throws IOException {
        final eb a = a(\u2603, 0, \u2603);
        if (a instanceof dn) {
            return (dn)a;
        }
        throw new IOException("Root tag must be a named compound tag");
    }
    
    public static void a(final dn \u2603, final DataOutput \u2603) throws IOException {
        a((eb)\u2603, \u2603);
    }
    
    private static void a(final eb \u2603, final DataOutput \u2603) throws IOException {
        \u2603.writeByte(\u2603.a());
        if (\u2603.a() == 0) {
            return;
        }
        \u2603.writeUTF("");
        \u2603.a(\u2603);
    }
    
    private static eb a(final DataInput \u2603, final int \u2603, final dw \u2603) throws IOException {
        final byte byte1 = \u2603.readByte();
        if (byte1 == 0) {
            return new dq();
        }
        \u2603.readUTF();
        final eb a = eb.a(byte1);
        try {
            a.a(\u2603, \u2603, \u2603);
        }
        catch (IOException \u26032) {
            final b a2 = b.a(\u26032, "Loading NBT data");
            final c a3 = a2.a("NBT Tag");
            a3.a("Tag name", "[UNNAMED TAG]");
            a3.a("Tag type", byte1);
            throw new e(a2);
        }
        return a;
    }
}
