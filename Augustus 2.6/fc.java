// 
// Decompiled by Procyon v0.5.36
// 

public class fc extends IllegalArgumentException
{
    public fc(final fb \u2603, final String \u2603) {
        super(String.format("Error parsing: %s: %s", \u2603, \u2603));
    }
    
    public fc(final fb \u2603, final int \u2603) {
        super(String.format("Invalid index %d requested for %s", \u2603, \u2603));
    }
    
    public fc(final fb \u2603, final Throwable \u2603) {
        super(String.format("Error while parsing: %s", \u2603), \u2603);
    }
}
