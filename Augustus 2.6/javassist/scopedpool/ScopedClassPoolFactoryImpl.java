// 
// Decompiled by Procyon v0.5.36
// 

package javassist.scopedpool;

import javassist.ClassPool;

public class ScopedClassPoolFactoryImpl implements ScopedClassPoolFactory
{
    public ScopedClassPool create(final ClassLoader cl, final ClassPool src, final ScopedClassPoolRepository repository) {
        return new ScopedClassPool(cl, src, repository, false);
    }
    
    public ScopedClassPool create(final ClassPool src, final ScopedClassPoolRepository repository) {
        return new ScopedClassPool(null, src, repository, true);
    }
}
