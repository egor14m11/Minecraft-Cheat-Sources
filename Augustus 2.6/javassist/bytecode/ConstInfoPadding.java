// 
// Decompiled by Procyon v0.5.36
// 

package javassist.bytecode;

import java.io.PrintWriter;
import java.io.IOException;
import java.io.DataOutputStream;
import java.util.Map;

class ConstInfoPadding extends ConstInfo
{
    public int getTag() {
        return 0;
    }
    
    public int copy(final ConstPool src, final ConstPool dest, final Map map) {
        return dest.addConstInfoPadding();
    }
    
    public void write(final DataOutputStream out) throws IOException {
    }
    
    public void print(final PrintWriter out) {
        out.println("padding");
    }
}
