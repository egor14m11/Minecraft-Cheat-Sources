// 
// Decompiled by Procyon v0.5.36
// 

package javassist.compiler.ast;

import javassist.compiler.CompileError;

public class Pair extends ASTree
{
    protected ASTree left;
    protected ASTree right;
    
    public Pair(final ASTree _left, final ASTree _right) {
        this.left = _left;
        this.right = _right;
    }
    
    public void accept(final Visitor v) throws CompileError {
        v.atPair(this);
    }
    
    public String toString() {
        final StringBuffer sbuf = new StringBuffer();
        sbuf.append("(<Pair> ");
        sbuf.append((this.left == null) ? "<null>" : this.left.toString());
        sbuf.append(" . ");
        sbuf.append((this.right == null) ? "<null>" : this.right.toString());
        sbuf.append(')');
        return sbuf.toString();
    }
    
    public ASTree getLeft() {
        return this.left;
    }
    
    public ASTree getRight() {
        return this.right;
    }
    
    public void setLeft(final ASTree _left) {
        this.left = _left;
    }
    
    public void setRight(final ASTree _right) {
        this.right = _right;
    }
}
