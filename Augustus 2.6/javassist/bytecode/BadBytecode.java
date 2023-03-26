// 
// Decompiled by Procyon v0.5.36
// 

package javassist.bytecode;

public class BadBytecode extends Exception
{
    public BadBytecode(final int opcode) {
        super("bytecode " + opcode);
    }
    
    public BadBytecode(final String msg) {
        super(msg);
    }
    
    public BadBytecode(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
