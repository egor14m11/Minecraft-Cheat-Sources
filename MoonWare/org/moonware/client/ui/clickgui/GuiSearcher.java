package org.moonware.client.ui.clickgui;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiPageButtonList;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ChatAllowedCharacters;
import net.minecraft.util.OS;
import net.minecraft.util.math.MathHelper;
import org.moonware.client.MoonWare;
import org.moonware.client.feature.impl.misc.StreamerMode;
import org.moonware.client.helpers.render.rect.RectHelper;

import java.awt.*;

public class GuiSearcher extends Gui {
    private final int id;
    private final Font fontInstance;
    /**
     * The width of this text field.
     */
    private final int width;
    private final int height;
    public int xPosition;
    public int yPosition;
    public int maxStringLength = 32;
    /**
     * If this value is true along with isEnabled, keyTyped will process the keys.
     */
    public boolean isFocused;
    /**
     * Has the current text being edited on the textbox.
     */
    private String text = "";
    private int cursorCounter;
    private boolean enableBackgroundDrawing = true;
    /**
     * if true the textbox can lose focus by clicking elsewhere on the screen
     */
    private boolean canLoseFocus = true;
    /**
     * If this value is true along with isFocused, keyTyped will process the keys.
     */
    private boolean isEnabled = true;

    /**
     * The current character index that should be used as start of the rendered text.
     */
    private int lineScrollOffset;
    private int cursorPosition;

    /**
     * other selection position, maybe the same as the cursor
     */
    private int selectionEnd;
    private int enabledColor = 14737632;
    private int disabledColor = 7368816;

    /**
     * True if this textbox is visible
     */
    private boolean visible = true;
    private GuiPageButtonList.GuiResponder guiResponder;
    private Predicate<String> validator = Predicates.alwaysTrue();

    public GuiSearcher(int componentId, Font fontrendererObj, int x, int y, int par5Width, int par6Height) {
        id = componentId;
        fontInstance = fontrendererObj;
        xPosition = x;
        yPosition = y;
        width = par5Width;
        height = par6Height;
    }

    /**
     * Sets the GuiResponder associated with this text box.
     */
    public void setGuiResponder(GuiPageButtonList.GuiResponder guiResponderIn) {
        guiResponder = guiResponderIn;
    }

    /**
     * Increments the cursor counter
     */
    public void updateCursorCounter() {
        ++cursorCounter;
    }

    /**
     * Returns the contents of the textbox
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the text of the textbox, and moves the cursor to the end.
     */
    public void setText(String textIn) {
        if (validator.apply(textIn)) {
            if (textIn.length() > maxStringLength) {
                text = textIn.substring(0, maxStringLength);
            } else {
                text = textIn;
            }

            setCursorPositionEnd();
        }
    }

    /**
     * returns the text between the cursor and selectionEnd
     */
    public String getSelectedText() {
        int i = cursorPosition < selectionEnd ? cursorPosition : selectionEnd;
        int j = cursorPosition < selectionEnd ? selectionEnd : cursorPosition;
        return text.substring(i, j);
    }

    public void setValidator(Predicate<String> theValidator) {
        validator = theValidator;
    }

    /**
     * Adds the given text after the cursor, or replaces the currently selected text if there is a selection.
     */
    public void writeText(String textToWrite) {
        String s = "";
        String s1 = ChatAllowedCharacters.filterAllowedCharacters(textToWrite);
        int i = cursorPosition < selectionEnd ? cursorPosition : selectionEnd;
        int j = cursorPosition < selectionEnd ? selectionEnd : cursorPosition;
        int k = maxStringLength - text.length() - (i - j);

        if (!text.isEmpty()) {
            s = s + text.substring(0, i);
        }

        int l;

        if (k < s1.length()) {
            s = s + s1.substring(0, k);
            l = k;
        } else {
            s = s + s1;
            l = s1.length();
        }

        if (!text.isEmpty() && j < text.length()) {
            s = s + text.substring(j);
        }

        if (validator.apply(s)) {
            text = s;
            moveCursorBy(i - selectionEnd + l);
            func_190516_a(id, text);
        }
    }

    public void func_190516_a(int p_190516_1_, String p_190516_2_) {
        if (guiResponder != null) {
            guiResponder.setEntryValue(p_190516_1_, p_190516_2_);
        }
    }

    /**
     * Deletes the given number of words from the current cursor's position, unless there is currently a selection, in
     * which case the selection is deleted instead.
     */
    public void deleteWords(int num) {
        if (!text.isEmpty()) {
            if (selectionEnd != cursorPosition) {
                writeText("");
            } else {
                deleteFromCursor(getNthWordFromCursor(num) - cursorPosition);
            }
        }
    }

    /**
     * Deletes the given number of characters from the current cursor's position, unless there is currently a selection,
     * in which case the selection is deleted instead.
     */
    public void deleteFromCursor(int num) {
        if (!text.isEmpty()) {
            if (selectionEnd != cursorPosition) {
                writeText("");
            } else {
                boolean flag = num < 0;
                int i = flag ? cursorPosition + num : cursorPosition;
                int j = flag ? cursorPosition : cursorPosition + num;
                String s = "";

                if (i >= 0) {
                    s = text.substring(0, i);
                }

                if (j < text.length()) {
                    s = s + text.substring(j);
                }

                if (validator.apply(s)) {
                    text = s;

                    if (flag) {
                        moveCursorBy(num);
                    }

                    func_190516_a(id, text);
                }
            }
        }
    }

    public int getId() {
        return id;
    }

    /**
     * Gets the starting index of the word at the specified number of words away from the cursor position.
     */
    public int getNthWordFromCursor(int numWords) {
        return getNthWordFromPos(numWords, getCursorPosition());
    }

    /**
     * Gets the starting index of the word at a distance of the specified number of words away from the given position.
     */
    public int getNthWordFromPos(int n, int pos) {
        return getNthWordFromPosWS(n, pos, true);
    }

    /**
     * Like getNthWordFromPos (which wraps this), but adds option for skipping consecutive spaces
     */
    public int getNthWordFromPosWS(int n, int pos, boolean skipWs) {
        int i = pos;
        boolean flag = n < 0;
        int j = Math.abs(n);

        for (int k = 0; k < j; ++k) {
            if (!flag) {
                int l = text.length();
                i = text.indexOf(32, i);

                if (i == -1) {
                    i = l;
                } else {
                    while (skipWs && i < l && text.charAt(i) == ' ') {
                        ++i;
                    }
                }
            } else {
                while (skipWs && i > 0 && text.charAt(i - 1) == ' ') {
                    --i;
                }

                while (i > 0 && text.charAt(i - 1) != ' ') {
                    --i;
                }
            }
        }

        return i;
    }

    /**
     * Moves the text cursor by a specified number of characters and clears the selection
     */
    public void moveCursorBy(int num) {
        setCursorPosition(selectionEnd + num);
    }

    /**
     * Moves the cursor to the very start of this text box.
     */
    public void setCursorPositionZero() {
        setCursorPosition(0);
    }

    /**
     * Moves the cursor to the very end of this text box.
     */
    public void setCursorPositionEnd() {
        setCursorPosition(text.length());
    }

    /**
     * Call this method from your GuiScreen to process the keys into the textbox
     */
    public boolean textboxKeyTyped(char typedChar, int keyCode) {
        if (!isFocused) {
            return false;
        } else if (Screen.isSelectAll(keyCode)) {
            setCursorPositionEnd();
            setSelectionPos(0);
            return true;
        } else if (Screen.isCopy(keyCode)) {
            OS.setClipboard(getSelectedText());
            return true;
        } else if (Screen.isPaste(keyCode)) {
            if (isEnabled) {
                writeText(OS.getClipboard());
            }

            return true;
        } else if (Screen.isCut(keyCode)) {
            OS.setClipboard(getSelectedText());

            if (isEnabled) {
                writeText("");
            }

            return true;
        } else {
            switch (keyCode) {
                case 14:
                    if (Screen.hasControlDown()) {
                        if (isEnabled) {
                            deleteWords(-1);
                        }
                    } else if (isEnabled) {
                        deleteFromCursor(-1);
                    }

                    return true;

                case 199:
                    if (Screen.hasShiftDown()) {
                        setSelectionPos(0);
                    } else {
                        setCursorPositionZero();
                    }

                    return true;

                case 203:
                    if (Screen.hasShiftDown()) {
                        if (Screen.hasControlDown()) {
                            setSelectionPos(getNthWordFromPos(-1, getSelectionEnd()));
                        } else {
                            setSelectionPos(getSelectionEnd() - 1);
                        }
                    } else if (Screen.hasControlDown()) {
                        setCursorPosition(getNthWordFromCursor(-1));
                    } else {
                        moveCursorBy(-1);
                    }

                    return true;

                case 205:
                    if (Screen.hasShiftDown()) {
                        if (Screen.hasControlDown()) {
                            setSelectionPos(getNthWordFromPos(1, getSelectionEnd()));
                        } else {
                            setSelectionPos(getSelectionEnd() + 1);
                        }
                    } else if (Screen.hasControlDown()) {
                        setCursorPosition(getNthWordFromCursor(1));
                    } else {
                        moveCursorBy(1);
                    }

                    return true;

                case 207:
                    if (Screen.hasShiftDown()) {
                        setSelectionPos(text.length());
                    } else {
                        setCursorPositionEnd();
                    }

                    return true;

                case 211:
                    if (Screen.hasControlDown()) {
                        if (isEnabled) {
                            deleteWords(1);
                        }
                    } else if (isEnabled) {
                        deleteFromCursor(1);
                    }

                    return true;

                default:
                    if (ChatAllowedCharacters.isAllowedCharacter(typedChar)) {
                        if (isEnabled) {
                            writeText(Character.toString(typedChar));
                        }

                        return true;
                    } else {
                        return false;
                    }
            }
        }
    }

    /**
     * Called when mouse is clicked, regardless as to whether it is over this button or not.
     */
    public boolean mouseClicked(int mouseX, int mouseY, int mouseButton) {
        boolean flag = mouseX >= xPosition && mouseX < xPosition + width && mouseY >= yPosition && mouseY < yPosition + height;

        if (canLoseFocus) {
            setFocused(flag);
        }

        if (isFocused && flag && mouseButton == 0) {
            int i = mouseX - xPosition;

            if (enableBackgroundDrawing) {
                i -= 4;
            }

            String s = fontInstance.trimStringToWidth(text.substring(lineScrollOffset), getWidth());
            setCursorPosition(fontInstance.trimStringToWidth(s, i).length() + lineScrollOffset);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Draws the textbox
     */
    public void drawTextBox() {
        if (getVisible()) {
            if (getEnableBackgroundDrawing()) {
                RectHelper.drawRect(xPosition, yPosition, xPosition + width, yPosition + height, new Color(30, 30, 30, 185).getRGB());
                RectHelper.drawGradientRect(xPosition, yPosition, xPosition + width, yPosition + height, new Color(30, 30, 30, 190).getRGB(), new Color(30, 30, 30, 190).getRGB());
            }
            int i = -1;
            int j = cursorPosition - lineScrollOffset;
            int k = selectionEnd - lineScrollOffset;
            String s = fontInstance.trimStringToWidth(text.substring(lineScrollOffset), getWidth());
            boolean flag = j >= 0 && j <= s.length();
            boolean flag1 = isFocused && cursorCounter / 6 % 2 == 0 && flag;
            int l = enableBackgroundDrawing ? xPosition + 4 : xPosition;
            int i1 = enableBackgroundDrawing ? yPosition + (height - 8) / 2 : yPosition;
            int j1 = l;

            if (k > s.length()) {
                k = s.length();
            }

            if (!s.isEmpty()) {

                String s1 = flag ? s.substring(0, j) : s;

                if (MoonWare.featureManager.getFeatureByClass(StreamerMode.class).getState() && StreamerMode.warpSpoof.getBoolValue()) {
                    if (s1.startsWith("/warp")) {
                        s1 = "/warp ";
                    }
                }
                if (MoonWare.featureManager.getFeatureByClass(StreamerMode.class).getState() && StreamerMode.loginSpoof.getBoolValue()) {
                    if (s1.startsWith("/l")) {
                        s1 = "/l ";
                    }
                }

                j1 = fontInstance.drawStringWithShadow(s1, (float) l, (float) i1, i);
            }

            boolean flag2 = cursorPosition < text.length() || text.length() >= getMaxStringLength();
            int k1 = j1;

            if (!flag) {
                k1 = j > 0 ? l + width : l;
            } else if (flag2) {
                k1 = j1 - 1;
                --j1;
            }

            if (!s.isEmpty() && flag && j < s.length()) {
                j1 = fontInstance.drawStringWithShadow(s.substring(j), (float) j1, (float) i1, i);
            }

            if (flag1) {
                if (flag2) {
                    Gui.drawRect(k1, i1 - 1, k1 + 1, i1 + 1 + fontInstance.height, -3092272);
                } else {
                    fontInstance.drawStringWithShadow("_", (float) k1, (float) i1, i);
                }
            }

            if (k != j) {
                int l1 = l + fontInstance.getStringWidth(s.substring(0, k));
                drawCursorVertical(k1, i1 - 1, l1 - 1, i1 + 1 + fontInstance.height);
            }
        }
    }

    /**
     * Draws the current selection and a vertical line cursor in the text box.
     */
    private void drawCursorVertical(int startX, int startY, int endX, int endY) {
        if (startX < endX) {
            int i = startX;
            startX = endX;
            endX = i;
        }

        if (startY < endY) {
            int j = startY;
            startY = endY;
            endY = j;
        }

        if (endX > xPosition + width) {
            endX = xPosition + width;
        }

        if (startX > xPosition + width) {
            startX = xPosition + width;
        }

        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuffer();
        GlStateManager.color(0.0F, 0.0F, 255.0F, 255.0F);
        GlStateManager.disableTexture2D();
        GlStateManager.enableColorLogic();
        GlStateManager.colorLogicOp(GlStateManager.LogicOp.OR_REVERSE);
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION);
        bufferbuilder.pos(startX, endY, 0.0D).endVertex();
        bufferbuilder.pos(endX, endY, 0.0D).endVertex();
        bufferbuilder.pos(endX, startY, 0.0D).endVertex();
        bufferbuilder.pos(startX, startY, 0.0D).endVertex();
        tessellator.draw();
        GlStateManager.disableColorLogic();
        GlStateManager.enableTexture2D();
    }

    /**
     * returns the maximum number of character that can be contained in this textbox
     */
    public int getMaxStringLength() {
        return maxStringLength;
    }

    /**
     * Sets the maximum length for the text in this text box. If the current text is longer than this length, the
     * current text will be trimmed.
     */
    public void setMaxStringLength(int length) {
        maxStringLength = length;

        if (text.length() > length) {
            text = text.substring(0, length);
        }
    }

    /**
     * returns the current position of the cursor
     */
    public int getCursorPosition() {
        return cursorPosition;
    }

    /**
     * Sets the current position of the cursor.
     */
    public void setCursorPosition(int pos) {
        cursorPosition = pos;
        int i = text.length();
        cursorPosition = MathHelper.clamp(cursorPosition, 0, i);
        setSelectionPos(cursorPosition);
    }

    /**
     * Gets whether the background and outline of this text box should be drawn (true if so).
     */
    public boolean getEnableBackgroundDrawing() {
        return enableBackgroundDrawing;
    }

    /**
     * Sets whether or not the background and outline of this text box should be drawn.
     */
    public void setEnableBackgroundDrawing(boolean enableBackgroundDrawingIn) {
        enableBackgroundDrawing = enableBackgroundDrawingIn;
    }

    /**
     * Sets the color to use when drawing this text box's text. A different color is used if this text box is disabled.
     */
    public void setTextColor(int color) {
        enabledColor = color;
    }

    /**
     * Sets the color to use for text in this text box when this text box is disabled.
     */
    public void setDisabledTextColour(int color) {
        disabledColor = color;
    }

    /**
     * Getter for the focused field
     */
    public boolean isFocused() {
        return isFocused;
    }

    /**
     * Sets focus to this gui element
     */
    public void setFocused(boolean isFocusedIn) {
        if (isFocusedIn && !isFocused) {
            cursorCounter = 0;
        }

        isFocused = isFocusedIn;

        if (Minecraft.screen != null) {
            Minecraft.screen.func_193975_a(isFocusedIn);
        }
    }

    /**
     * Sets whether this text box is enabled. Disabled text boxes cannot be typed in.
     */
    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    /**
     * the side of the selection that is not the cursor, may be the same as the cursor
     */
    public int getSelectionEnd() {
        return selectionEnd;
    }

    /**
     * returns the width of the textbox depending on if background drawing is enabled
     */
    public int getWidth() {
        return getEnableBackgroundDrawing() ? width - 8 : width;
    }

    /**
     * Sets the position of the selection anchor (the selection anchor and the cursor position mark the edges of the
     * selection). If the anchor is set beyond the bounds of the current text, it will be put back inside.
     */
    public void setSelectionPos(int position) {
        int i = text.length();

        if (position > i) {
            position = i;
        }

        if (position < 0) {
            position = 0;
        }

        selectionEnd = position;

        if (fontInstance != null) {
            if (lineScrollOffset > i) {
                lineScrollOffset = i;
            }

            int j = getWidth();
            String s = fontInstance.trimStringToWidth(text.substring(lineScrollOffset), j);
            int k = s.length() + lineScrollOffset;

            if (position == lineScrollOffset) {
                lineScrollOffset -= fontInstance.trimStringToWidth(text, j, true).length();
            }

            if (position > k) {
                lineScrollOffset += position - k;
            } else if (position <= lineScrollOffset) {
                lineScrollOffset -= lineScrollOffset - position;
            }

            lineScrollOffset = MathHelper.clamp(lineScrollOffset, 0, i);
        }
    }

    /**
     * Sets whether this text box loses focus when something other than it is clicked.
     */
    public void setCanLoseFocus(boolean canLoseFocusIn) {
        canLoseFocus = canLoseFocusIn;
    }

    /**
     * returns true if this textbox is visible
     */
    public boolean getVisible() {
        return visible;
    }

    /**
     * Sets whether or not this textbox is visible
     */
    public void setVisible(boolean isVisible) {
        visible = isVisible;
    }
}