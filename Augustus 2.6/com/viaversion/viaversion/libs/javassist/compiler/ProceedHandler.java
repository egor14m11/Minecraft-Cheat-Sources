// 
// Decompiled by Procyon v0.5.36
// 

package com.viaversion.viaversion.libs.javassist.compiler;

import com.viaversion.viaversion.libs.javassist.compiler.ast.ASTList;
import com.viaversion.viaversion.libs.javassist.bytecode.Bytecode;

public interface ProceedHandler
{
    void doit(final JvstCodeGen p0, final Bytecode p1, final ASTList p2) throws CompileError;
    
    void setReturnType(final JvstTypeChecker p0, final ASTList p1) throws CompileError;
}
