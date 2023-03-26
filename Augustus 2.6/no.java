// 
// Decompiled by Procyon v0.5.36
// 

public abstract class no<T>
{
    private T a;
    private boolean b;
    
    public no() {
        this.b = false;
    }
    
    public T c() {
        if (!this.b) {
            this.b = true;
            this.a = this.b();
        }
        return this.a;
    }
    
    protected abstract T b();
}
