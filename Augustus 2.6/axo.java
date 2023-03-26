// 
// Decompiled by Procyon v0.5.36
// 

public class axo extends axu
{
    @Override
    public void b() {
        this.n.clear();
        this.n.add(new awe(0, this.l / 2 - 155, this.m / 4 + 120 + 12, bnq.a("gui.toTitle", new Object[0])));
        this.n.add(new awe(1, this.l / 2 - 155 + 160, this.m / 4 + 120 + 12, bnq.a("menu.quit", new Object[0])));
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == 0) {
            this.j.a(new aya());
        }
        else if (\u2603.k == 1) {
            this.j.m();
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.a(this.q, "Out of memory!", this.l / 2, this.m / 4 - 60 + 20, 16777215);
        this.c(this.q, "Minecraft has run out of memory.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 0, 10526880);
        this.c(this.q, "This could be caused by a bug in the game or by the", this.l / 2 - 140, this.m / 4 - 60 + 60 + 18, 10526880);
        this.c(this.q, "Java Virtual Machine not being allocated enough", this.l / 2 - 140, this.m / 4 - 60 + 60 + 27, 10526880);
        this.c(this.q, "memory.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 36, 10526880);
        this.c(this.q, "To prevent level corruption, the current game has quit.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 54, 10526880);
        this.c(this.q, "We've tried to free up enough memory to let you go back to", this.l / 2 - 140, this.m / 4 - 60 + 60 + 63, 10526880);
        this.c(this.q, "the main menu and back to playing, but this may not have worked.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 72, 10526880);
        this.c(this.q, "Please restart the game if you see this message again.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 81, 10526880);
        super.a(\u2603, \u2603, \u2603);
    }
}
