// 
// Decompiled by Procyon v0.5.36
// 

package javassist.expr;

import javassist.compiler.JvstTypeChecker;
import javassist.compiler.ast.ASTList;
import javassist.compiler.JvstCodeGen;
import javassist.bytecode.Bytecode;
import javassist.bytecode.CodeAttribute;
import javassist.ClassPool;
import javassist.bytecode.BadBytecode;
import javassist.compiler.CompileError;
import javassist.CannotCompileException;
import javassist.compiler.ProceedHandler;
import javassist.compiler.Javac;
import javassist.NotFoundException;
import javassist.bytecode.ConstPool;
import javassist.CtBehavior;
import javassist.bytecode.MethodInfo;
import javassist.CtClass;
import javassist.bytecode.CodeIterator;

public class Cast extends Expr
{
    protected Cast(final int pos, final CodeIterator i, final CtClass declaring, final MethodInfo m) {
        super(pos, i, declaring, m);
    }
    
    public CtBehavior where() {
        return super.where();
    }
    
    public int getLineNumber() {
        return super.getLineNumber();
    }
    
    public String getFileName() {
        return super.getFileName();
    }
    
    public CtClass getType() throws NotFoundException {
        final ConstPool cp = this.getConstPool();
        final int pos = this.currentPos;
        final int index = this.iterator.u16bitAt(pos + 1);
        final String name = cp.getClassInfo(index);
        return this.thisClass.getClassPool().getCtClass(name);
    }
    
    public CtClass[] mayThrow() {
        return super.mayThrow();
    }
    
    public void replace(final String statement) throws CannotCompileException {
        this.thisClass.getClassFile();
        final ConstPool constPool = this.getConstPool();
        final int pos = this.currentPos;
        final int index = this.iterator.u16bitAt(pos + 1);
        final Javac jc = new Javac(this.thisClass);
        final ClassPool cp = this.thisClass.getClassPool();
        final CodeAttribute ca = this.iterator.get();
        try {
            final CtClass[] params = { cp.get("java.lang.Object") };
            final CtClass retType = this.getType();
            final int paramVar = ca.getMaxLocals();
            jc.recordParams("java.lang.Object", params, true, paramVar, this.withinStatic());
            final int retVar = jc.recordReturnType(retType, true);
            jc.recordProceed(new ProceedForCast(index, retType));
            Expr.checkResultValue(retType, statement);
            final Bytecode bytecode = jc.getBytecode();
            Expr.storeStack(params, true, paramVar, bytecode);
            jc.recordLocalVariables(ca, pos);
            bytecode.addConstZero(retType);
            bytecode.addStore(retVar, retType);
            jc.compileStmnt(statement);
            bytecode.addLoad(retVar, retType);
            this.replace0(pos, bytecode, 3);
        }
        catch (CompileError e) {
            throw new CannotCompileException(e);
        }
        catch (NotFoundException e2) {
            throw new CannotCompileException(e2);
        }
        catch (BadBytecode e3) {
            throw new CannotCompileException("broken method");
        }
    }
    
    static class ProceedForCast implements ProceedHandler
    {
        int index;
        CtClass retType;
        
        ProceedForCast(final int i, final CtClass t) {
            this.index = i;
            this.retType = t;
        }
        
        public void doit(final JvstCodeGen gen, final Bytecode bytecode, final ASTList args) throws CompileError {
            if (gen.getMethodArgsLength(args) != 1) {
                throw new CompileError("$proceed() cannot take more than one parameter for cast");
            }
            gen.atMethodArgs(args, new int[1], new int[1], new String[1]);
            bytecode.addOpcode(192);
            bytecode.addIndex(this.index);
            gen.setType(this.retType);
        }
        
        public void setReturnType(final JvstTypeChecker c, final ASTList args) throws CompileError {
            c.atMethodArgs(args, new int[1], new int[1], new String[1]);
            c.setType(this.retType);
        }
    }
}
