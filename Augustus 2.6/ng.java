import org.apache.logging.log4j.LogManager;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.PrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.security.MessageDigest;
import java.io.UnsupportedEncodingException;
import java.security.PublicKey;
import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class ng
{
    private static final Logger a;
    
    public static SecretKey a() {
        try {
            final KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128);
            return instance.generateKey();
        }
        catch (NoSuchAlgorithmException cause) {
            throw new Error(cause);
        }
    }
    
    public static KeyPair b() {
        try {
            final KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(1024);
            return instance.generateKeyPair();
        }
        catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            ng.a.error("Key pair generation failed!");
            return null;
        }
    }
    
    public static byte[] a(final String \u2603, final PublicKey \u2603, final SecretKey \u2603) {
        try {
            return a("SHA-1", new byte[][] { \u2603.getBytes("ISO_8859_1"), \u2603.getEncoded(), \u2603.getEncoded() });
        }
        catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static byte[] a(final String \u2603, final byte[]... \u2603) {
        try {
            final MessageDigest instance = MessageDigest.getInstance(\u2603);
            for (final byte[] input : \u2603) {
                instance.update(input);
            }
            return instance.digest();
        }
        catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static PublicKey a(final byte[] \u2603) {
        try {
            final EncodedKeySpec keySpec = new X509EncodedKeySpec(\u2603);
            final KeyFactory instance = KeyFactory.getInstance("RSA");
            return instance.generatePublic(keySpec);
        }
        catch (NoSuchAlgorithmException ex) {}
        catch (InvalidKeySpecException ex2) {}
        ng.a.error("Public key reconstitute failed!");
        return null;
    }
    
    public static SecretKey a(final PrivateKey \u2603, final byte[] \u2603) {
        return new SecretKeySpec(b(\u2603, \u2603), "AES");
    }
    
    public static byte[] a(final Key \u2603, final byte[] \u2603) {
        return a(1, \u2603, \u2603);
    }
    
    public static byte[] b(final Key \u2603, final byte[] \u2603) {
        return a(2, \u2603, \u2603);
    }
    
    private static byte[] a(final int \u2603, final Key \u2603, final byte[] \u2603) {
        try {
            return a(\u2603, \u2603.getAlgorithm(), \u2603).doFinal(\u2603);
        }
        catch (IllegalBlockSizeException ex) {
            ex.printStackTrace();
        }
        catch (BadPaddingException ex2) {
            ex2.printStackTrace();
        }
        ng.a.error("Cipher data failed!");
        return null;
    }
    
    private static Cipher a(final int \u2603, final String \u2603, final Key \u2603) {
        try {
            final Cipher instance = Cipher.getInstance(\u2603);
            instance.init(\u2603, \u2603);
            return instance;
        }
        catch (InvalidKeyException ex) {
            ex.printStackTrace();
        }
        catch (NoSuchAlgorithmException ex2) {
            ex2.printStackTrace();
        }
        catch (NoSuchPaddingException ex3) {
            ex3.printStackTrace();
        }
        ng.a.error("Cipher creation failed!");
        return null;
    }
    
    public static Cipher a(final int \u2603, final Key \u2603) {
        try {
            final Cipher instance = Cipher.getInstance("AES/CFB8/NoPadding");
            instance.init(\u2603, \u2603, new IvParameterSpec(\u2603.getEncoded()));
            return instance;
        }
        catch (GeneralSecurityException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    static {
        a = LogManager.getLogger();
    }
}
