/*
 * Decompiled with CFR 0.150.
 */
package shadersmod.client;

import java.util.ArrayList;
import net.minecraft.client.gui.GuiSlot;
import optifine.Lang;
import shadersmod.client.GuiShaders;
import shadersmod.client.Shaders;

class GuiSlotShaders
extends GuiSlot {
    private ArrayList shaderslist;
    private int selectedIndex;
    private long lastClickedCached = 0L;
    final GuiShaders shadersGui;

    public GuiSlotShaders(GuiShaders par1GuiShaders, int width, int height, int top, int bottom, int slotHeight) {
        super(par1GuiShaders.getMc(), width, height, top, bottom, slotHeight);
        this.shadersGui = par1GuiShaders;
        this.updateList();
        this.amountScrolled = 0.0f;
        int i = this.selectedIndex * slotHeight;
        int j = (bottom - top) / 2;
        if (i > j) {
            this.scrollBy(i - j);
        }
    }

    @Override
    public int getListWidth() {
        return this.width - 20;
    }

    public void updateList() {
        this.shaderslist = Shaders.listOfShaders();
        this.selectedIndex = 0;
        int j = this.shaderslist.size();
        for (int i = 0; i < j; ++i) {
            if (!((String)this.shaderslist.get(i)).equals(Shaders.currentshadername)) continue;
            this.selectedIndex = i;
            break;
        }
    }

    @Override
    protected int getSize() {
        return this.shaderslist.size();
    }

    @Override
    protected void elementClicked(int index, boolean doubleClicked, int mouseX, int mouseY) {
        if (index != this.selectedIndex || this.lastClicked != this.lastClickedCached) {
            this.selectedIndex = index;
            this.lastClickedCached = this.lastClicked;
            Shaders.setShaderPack((String)this.shaderslist.get(index));
            Shaders.uninit();
            this.shadersGui.updateButtons();
        }
    }

    @Override
    protected boolean isSelected(int index) {
        return index == this.selectedIndex;
    }

    @Override
    protected int getScrollBarX() {
        return this.width - 6;
    }

    @Override
    protected int getContentHeight() {
        return this.getSize() * 18;
    }

    @Override
    protected void drawBackground() {
    }

    @Override
    protected void func_192637_a(int index, int posX, int posY, int contentY, int mouseX, int mouseY, float partialTicks) {
        String s = (String)this.shaderslist.get(index);
        if (s.equals(Shaders.packNameNone)) {
            s = Lang.get("of.options.shaders.packNone");
        } else if (s.equals(Shaders.packNameDefault)) {
            s = Lang.get("of.options.shaders.packDefault");
        }
        this.shadersGui.drawCenteredString(s, this.width / 2, posY + 1, 0xFFFFFF);
    }

    public int getSelectedIndex() {
        return this.selectedIndex;
    }
}

