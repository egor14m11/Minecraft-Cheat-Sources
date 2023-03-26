// 
// Decompiled by Procyon v0.5.36
// 

public final class ki extends RuntimeException
{
    public static final ki a;
    
    private ki() {
        this.setStackTrace(new StackTraceElement[0]);
    }
    
    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
    
    static {
        a = new ki();
    }
}
