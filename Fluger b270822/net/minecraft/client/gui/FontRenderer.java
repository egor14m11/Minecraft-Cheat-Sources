/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.ArabicShapingException
 *  com.ibm.icu.text.Bidi
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.client.gui;

import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import optifine.CustomColors;
import optifine.FontUtils;
import optifine.GlBlendState;
import org.apache.commons.io.IOUtils;
import ru.fluger.client.helpers.render.RenderHelper;

public class FontRenderer
implements IResourceManagerReloadListener {
    private static final ResourceLocation[] UNICODE_PAGE_LOCATIONS = new ResourceLocation[256];
    public int[] charWidth = new int[256];
    public int FONT_HEIGHT = 9;
    public Random fontRandom = new Random();
    private final byte[] glyphWidth = new byte[65536];
    private final int[] colorCode = new int[32];
    public ResourceLocation locationFontTexture;
    private final TextureManager renderEngine;
    public float posX;
    public float posY;
    private boolean unicodeFlag;
    private boolean bidiFlag;
    private float red;
    private float blue;
    private float green;
    private float alpha;
    private int textColor;
    private boolean randomStyle;
    private boolean boldStyle;
    private boolean italicStyle;
    private boolean underlineStyle;
    private boolean strikethroughStyle;
    public GameSettings gameSettings;
    public ResourceLocation locationFontTextureBase;
    public boolean enabled = true;
    public float offsetBold = 1.0f;
    private float[] charWidthFloat = new float[256];
    private boolean blend = false;
    private GlBlendState oldBlendState = new GlBlendState();

    public FontRenderer(GameSettings gameSettingsIn, ResourceLocation location, TextureManager textureManagerIn, boolean unicode) {
        this.gameSettings = gameSettingsIn;
        this.locationFontTextureBase = location;
        this.locationFontTexture = location;
        this.renderEngine = textureManagerIn;
        this.unicodeFlag = unicode;
        this.locationFontTexture = FontUtils.getHdFontLocation(this.locationFontTextureBase);
        this.bindTexture(this.locationFontTexture);
        for (int i = 0; i < 32; ++i) {
            int j = (i >> 3 & 1) * 85;
            int k = (i >> 2 & 1) * 170 + j;
            int l = (i >> 1 & 1) * 170 + j;
            int i1 = (i >> 0 & 1) * 170 + j;
            if (i == 6) {
                k += 85;
            }
            if (gameSettingsIn.anaglyph) {
                int j1 = (k * 30 + l * 59 + i1 * 11) / 100;
                int k1 = (k * 30 + l * 70) / 100;
                int l1 = (k * 30 + i1 * 70) / 100;
                k = j1;
                l = k1;
                i1 = l1;
            }
            if (i >= 16) {
                k /= 4;
                l /= 4;
                i1 /= 4;
            }
            this.colorCode[i] = (k & 0xFF) << 16 | (l & 0xFF) << 8 | i1 & 0xFF;
        }
        this.readGlyphSizes();
    }

    @Override
    public void onResourceManagerReload(IResourceManager resourceManager) {
        this.locationFontTexture = FontUtils.getHdFontLocation(this.locationFontTextureBase);
        for (int i = 0; i < UNICODE_PAGE_LOCATIONS.length; ++i) {
            FontRenderer.UNICODE_PAGE_LOCATIONS[i] = null;
        }
        this.readFontTexture();
        this.readGlyphSizes();
    }

    private void readFontTexture() {
        BufferedImage bufferedimage;
        IResource iresource = null;
        try {
            iresource = this.getResource(this.locationFontTexture);
            bufferedimage = TextureUtil.readBufferedImage(iresource.getInputStream());
        }
        catch (IOException ioexception) {
            try {
                throw new RuntimeException(ioexception);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly((Closeable)iresource);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((Closeable)iresource);
        Properties props = FontUtils.readFontProperties(this.locationFontTexture);
        this.blend = FontUtils.readBoolean(props, "blend", false);
        int imgWidth = bufferedimage.getWidth();
        int imgHeight = bufferedimage.getHeight();
        int charW = imgWidth / 16;
        int charH = imgHeight / 16;
        float kx = (float)imgWidth / 128.0f;
        float boldScaleFactor = Config.limit(kx, 1.0f, 2.0f);
        this.offsetBold = 1.0f / boldScaleFactor;
        float offsetBoldConfig = FontUtils.readFloat(props, "offsetBold", -1.0f);
        if (offsetBoldConfig >= 0.0f) {
            this.offsetBold = offsetBoldConfig;
        }
        int[] aint = new int[imgWidth * imgHeight];
        bufferedimage.getRGB(0, 0, imgWidth, imgHeight, aint, 0, imgWidth);
        for (int i1 = 0; i1 < 256; ++i1) {
            int j1 = i1 % 16;
            int k1 = i1 / 16;
            int l1 = 0;
            for (l1 = charW - 1; l1 >= 0; --l1) {
                int i2 = j1 * charW + l1;
                boolean flag = true;
                for (int j2 = 0; j2 < charH && flag; ++j2) {
                    int k2 = (k1 * charH + j2) * imgWidth;
                    int l2 = aint[i2 + k2];
                    int i3 = l2 >> 24 & 0xFF;
                    if (i3 <= 16) continue;
                    flag = false;
                }
                if (!flag) break;
            }
            if (i1 == 65) {
                // empty if block
            }
            if (i1 == 32) {
                l1 = charW <= 8 ? (int)(2.0f * kx) : (int)(1.5f * kx);
            }
            this.charWidthFloat[i1] = (float)(l1 + 1) / kx + 1.0f;
        }
        FontUtils.readCustomCharWidths(props, this.charWidthFloat);
        for (int j3 = 0; j3 < this.charWidth.length; ++j3) {
            this.charWidth[j3] = Math.round(this.charWidthFloat[j3]);
        }
    }

    private void readGlyphSizes() {
        IResource iresource = null;
        try {
            iresource = this.getResource(new ResourceLocation("font/glyph_sizes.bin"));
            iresource.getInputStream().read(this.glyphWidth);
        }
        catch (IOException ioexception) {
            try {
                throw new RuntimeException(ioexception);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly((Closeable)iresource);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((Closeable)iresource);
    }

    private float renderChar(char ch, boolean italic) {
        if (ch != ' ' && ch != '\u00a0') {
            int i = "?????????????????????????\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000?????????????????????????????????????????\u00ae\u00ac???\u00ab\u00bb?????????????????????????????????????????????????????????????????\u00b1??????\u00b0?\u00b7????\u0000".indexOf(ch);
            return i != -1 && !this.unicodeFlag ? this.renderDefaultChar(i, italic) : this.renderUnicodeChar(ch, italic);
        }
        return !this.unicodeFlag ? this.charWidthFloat[ch] : 4.0f;
    }

    private float renderDefaultChar(int ch, boolean italic)
    {
        int i = ch % 16 * 8;
        int j = ch / 16 * 8;
        int k = italic ? 1 : 0;
        this.bindTexture(this.locationFontTexture);
        float f = this.charWidthFloat[ch];
        float f1 = 7.99F;
        GlStateManager.glBegin(5);
        GlStateManager.glTexCoord2f((float)i / 128.0F, (float)j / 128.0F);
        GlStateManager.glVertex3f(this.posX + (float)k, this.posY, 0.0F);
        GlStateManager.glTexCoord2f((float)i / 128.0F, ((float)j + 7.99F) / 128.0F);
        GlStateManager.glVertex3f(this.posX - (float)k, this.posY + 7.99F, 0.0F);
        GlStateManager.glTexCoord2f(((float)i + f1 - 1.0F) / 128.0F, (float)j / 128.0F);
        GlStateManager.glVertex3f(this.posX + f1 - 1.0F + (float)k, this.posY, 0.0F);
        GlStateManager.glTexCoord2f(((float)i + f1 - 1.0F) / 128.0F, ((float)j + 7.99F) / 128.0F);
        GlStateManager.glVertex3f(this.posX + f1 - 1.0F - (float)k, this.posY + 7.99F, 0.0F);
        GlStateManager.glEnd();
        return f;
    }

    private ResourceLocation getUnicodePageLocation(int page) {
        if (UNICODE_PAGE_LOCATIONS[page] == null) {
            FontRenderer.UNICODE_PAGE_LOCATIONS[page] = new ResourceLocation(String.format("textures/font/unicode_page_%02x.png", page));
            FontRenderer.UNICODE_PAGE_LOCATIONS[page] = FontUtils.getHdFontLocation(UNICODE_PAGE_LOCATIONS[page]);
        }
        return UNICODE_PAGE_LOCATIONS[page];
    }

    private void loadGlyphTexture(int page) {
        this.bindTexture(this.getUnicodePageLocation(page));
    }

    private float renderUnicodeChar(char ch, boolean italic) {
        int i = this.glyphWidth[ch] & 0xFF;
        if (i == 0) {
            return 0.0f;
        }
        int j = ch / 256;
        this.loadGlyphTexture(j);
        int k = i >>> 4;
        int l = i & 0xF;
        float f = k;
        float f1 = l + 1;
        float f2 = (float)(ch % 16 * 16) + f;
        float f3 = (ch & 0xFF) / 16 * 16;
        float f4 = f1 - f - 0.02f;
        float f5 = italic ? 1.0f : 0.0f;
        GlStateManager.glBegin(5);
        GlStateManager.glTexCoord2f(f2 / 256.0f, f3 / 256.0f);
        GlStateManager.glVertex3f(this.posX + f5, this.posY, 0.0f);
        GlStateManager.glTexCoord2f(f2 / 256.0f, (f3 + 15.98f) / 256.0f);
        GlStateManager.glVertex3f(this.posX - f5, this.posY + 7.99f, 0.0f);
        GlStateManager.glTexCoord2f((f2 + f4) / 256.0f, f3 / 256.0f);
        GlStateManager.glVertex3f(this.posX + f4 / 2.0f + f5, this.posY, 0.0f);
        GlStateManager.glTexCoord2f((f2 + f4) / 256.0f, (f3 + 15.98f) / 256.0f);
        GlStateManager.glVertex3f(this.posX + f4 / 2.0f - f5, this.posY + 7.99f, 0.0f);
        GlStateManager.glEnd();
        return (f1 - f) / 2.0f + 1.0f;
    }

    public void drawSmallString(String s, int x, int y, int color) {
        GlStateManager.pushMatrix();
        GlStateManager.scale(0.5f, 0.5f, 0.5f);
        GlStateManager.translate(1.0f, 1.0f, 1.0f);
        this.drawStringWithShadow(s, x *= 2, y *= 2, color);
        GlStateManager.scale(1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
    }

    public void drawBlurredStringWithShadow(String text, double x, double y, int blurRadius, Color blurColor, int color) {
        GlStateManager.resetColor();
        RenderHelper.drawBlurredShadow((int)x, (int)y, this.getStringWidth(text), this.FONT_HEIGHT, blurRadius, blurColor);
        this.drawStringWithShadow(text, (float)x, (float)y, color);
    }

    public void drawBlurredString(String text, double x, double y, int blurRadius, Color blurColor, int color) {
        GlStateManager.resetColor();
        RenderHelper.drawBlurredShadow((int)x, (int)y, this.getStringWidth(text), this.FONT_HEIGHT, blurRadius, blurColor);
        this.drawString(text, (float)x, (float)y, color);
    }

    public void drawCenteredBlurredString(String text, double x, double y, int blurRadius, Color blurColor, int color) {
        GlStateManager.resetColor();
        RenderHelper.drawBlurredShadow((int)((float)((int)x) - (float)this.getStringWidth(text) / 2.0f), (int)y, this.getStringWidth(text), this.FONT_HEIGHT, blurRadius, blurColor);
        this.drawString(text, (float)(x - (double)((float)this.getStringWidth(text) / 2.0f)), (float)y, color);
    }

    public int drawStringWithShadow(String text, float x, float y, int color) {
        return this.drawString(text, x, y, color, true);
    }

    public int drawString(String text, float x, float y, int color) {
        return !this.enabled ? 0 : this.drawString(text, x, y, color, false);
    }

    public int drawString(String text, float x, float y, int color, boolean dropShadow) {
        int i;
        this.enableAlpha();
        if (this.blend) {
            GlStateManager.getBlendState(this.oldBlendState);
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        }
        this.resetStyles();
        if (dropShadow) {
            i = this.renderString(text, x + 1.0f, y + 1.0f, color, true);
            i = Math.max(i, this.renderString(text, x, y, color, false));
        } else {
            i = this.renderString(text, x, y, color, false);
        }
        if (this.blend) {
            GlStateManager.setBlendState(this.oldBlendState);
        }
        return i;
    }

    private String bidiReorder(String text) {
        try {
            Bidi bidi = new Bidi(new ArabicShaping(8).shape(text), 127);
            bidi.setReorderingMode(0);
            return bidi.writeReordered(2);
        }
        catch (ArabicShapingException var31) {
            return text;
        }
    }

    private void resetStyles() {
        this.randomStyle = false;
        this.boldStyle = false;
        this.italicStyle = false;
        this.underlineStyle = false;
        this.strikethroughStyle = false;
    }

    private void renderStringAtPos(String text, boolean shadow) {
        for (int i = 0; i < text.length(); ++i) {
            char c0 = text.charAt(i);
            if (c0 == '\u00a7' && i + 1 < text.length()) {
                int l = "0123456789abcdefklmnor".indexOf(String.valueOf(text.charAt(i + 1)).toLowerCase(Locale.ROOT).charAt(0));
                if (l < 16) {
                    this.randomStyle = false;
                    this.boldStyle = false;
                    this.strikethroughStyle = false;
                    this.underlineStyle = false;
                    this.italicStyle = false;
                    if (l < 0 || l > 15) {
                        l = 15;
                    }
                    if (shadow) {
                        l += 16;
                    }
                    int i1 = this.colorCode[l];
                    if (Config.isCustomColors()) {
                        i1 = CustomColors.getTextColor(l, i1);
                    }
                    this.textColor = i1;
                    this.setColor((float)(i1 >> 16) / 255.0f, (float)(i1 >> 8 & 0xFF) / 255.0f, (float)(i1 & 0xFF) / 255.0f, this.alpha);
                } else if (l == 16) {
                    this.randomStyle = true;
                } else if (l == 17) {
                    this.boldStyle = true;
                } else if (l == 18) {
                    this.strikethroughStyle = true;
                } else if (l == 19) {
                    this.underlineStyle = true;
                } else if (l == 20) {
                    this.italicStyle = true;
                } else if (l == 21) {
                    this.randomStyle = false;
                    this.boldStyle = false;
                    this.strikethroughStyle = false;
                    this.underlineStyle = false;
                    this.italicStyle = false;
                    this.setColor(this.red, this.blue, this.green, this.alpha);
                }
                ++i;
                continue;
            }
            int j = "?????????????????????????\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000?????????????????????????????????????????\u00ae\u00ac???\u00ab\u00bb?????????????????????????????????????????????????????????????????\u00b1??????\u00b0?\u00b7????\u0000".indexOf(c0);
            if (this.randomStyle && j != -1) {
                char c1;
                int k = this.getCharWidth(c0);
                while (k != this.getCharWidth(c1 = "?????????????????????????\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000?????????????????????????????????????????\u00ae\u00ac???\u00ab\u00bb?????????????????????????????????????????????????????????????????\u00b1??????\u00b0?\u00b7????\u0000".charAt(j = this.fontRandom.nextInt("?????????????????????????\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000?????????????????????????????????????????\u00ae\u00ac???\u00ab\u00bb?????????????????????????????????????????????????????????????????\u00b1??????\u00b0?\u00b7????\u0000".length())))) {
                }
                c0 = c1;
            }
            float f1 = j != -1 && !this.unicodeFlag ? this.offsetBold : 0.5f;
            boolean flag = (c0 == '\u0000' || j == -1 || this.unicodeFlag) && shadow;
            boolean bl = flag;
            if (flag) {
                this.posX -= f1;
                this.posY -= f1;
            }
            float f = this.renderChar(c0, this.italicStyle);
            if (flag) {
                this.posX += f1;
                this.posY += f1;
            }
            if (this.boldStyle) {
                this.posX += f1;
                if (flag) {
                    this.posX -= f1;
                    this.posY -= f1;
                }
                this.renderChar(c0, this.italicStyle);
                this.posX -= f1;
                if (flag) {
                    this.posX += f1;
                    this.posY += f1;
                }
                f += f1;
            }
            this.doDraw(f);
        }
    }

    protected void doDraw(float p_doDraw_1_) {
        if (this.strikethroughStyle) {
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder bufferbuilder = tessellator.getBuffer();
            GlStateManager.disableTexture2D();
            bufferbuilder.begin(7, DefaultVertexFormats.POSITION);
            bufferbuilder.pos(this.posX, this.posY + (float)(this.FONT_HEIGHT / 2), 0.0).endVertex();
            bufferbuilder.pos(this.posX + p_doDraw_1_, this.posY + (float)(this.FONT_HEIGHT / 2), 0.0).endVertex();
            bufferbuilder.pos(this.posX + p_doDraw_1_, this.posY + (float)(this.FONT_HEIGHT / 2) - 1.0f, 0.0).endVertex();
            bufferbuilder.pos(this.posX, this.posY + (float)(this.FONT_HEIGHT / 2) - 1.0f, 0.0).endVertex();
            tessellator.draw();
            GlStateManager.enableTexture2D();
        }
        if (this.underlineStyle) {
            Tessellator tessellator1 = Tessellator.getInstance();
            BufferBuilder bufferbuilder1 = tessellator1.getBuffer();
            GlStateManager.disableTexture2D();
            bufferbuilder1.begin(7, DefaultVertexFormats.POSITION);
            int i = this.underlineStyle ? -1 : 0;
            bufferbuilder1.pos(this.posX + (float)i, this.posY + (float)this.FONT_HEIGHT, 0.0).endVertex();
            bufferbuilder1.pos(this.posX + p_doDraw_1_, this.posY + (float)this.FONT_HEIGHT, 0.0).endVertex();
            bufferbuilder1.pos(this.posX + p_doDraw_1_, this.posY + (float)this.FONT_HEIGHT - 1.0f, 0.0).endVertex();
            bufferbuilder1.pos(this.posX + (float)i, this.posY + (float)this.FONT_HEIGHT - 1.0f, 0.0).endVertex();
            tessellator1.draw();
            GlStateManager.enableTexture2D();
        }
        this.posX += p_doDraw_1_;
    }

    private int renderStringAligned(String text, int x, int y, int width, int color, boolean dropShadow) {
        if (this.bidiFlag) {
            int i = this.getStringWidth(this.bidiReorder(text));
            x = x + width - i;
        }
        return this.renderString(text, x, y, color, dropShadow);
    }

    private int renderString(String text, double x, double y, int color, boolean dropShadow) {
        if (text == null) {
            return 0;
        }
        if (this.bidiFlag) {
            text = this.bidiReorder(text);
        }
        if ((color & 0xFC000000) == 0) {
            color |= 0xFF000000;
        }
        if (dropShadow) {
            color = (color & 0xFCFCFC) >> 2 | color & 0xFF000000;
        }
        this.red = (float)(color >> 16 & 0xFF) / 255.0f;
        this.blue = (float)(color >> 8 & 0xFF) / 255.0f;
        this.green = (float)(color & 0xFF) / 255.0f;
        this.alpha = (float)(color >> 24 & 0xFF) / 255.0f;
        this.setColor(this.red, this.blue, this.green, this.alpha);
        this.posX = (float)x;
        this.posY = (float)y;
        this.renderStringAtPos(text, dropShadow);
        return (int)this.posX;
    }

    public int getStringWidth(String text) {
        if (text == null) {
            return 0;
        }
        float f = 0.0f;
        boolean flag = false;
        for (int i = 0; i < text.length(); ++i) {
            char c0 = text.charAt(i);
            float f1 = this.getCharWidthFloat(c0);
            if (f1 < 0.0f && i < text.length() - 1) {
                if ((c0 = text.charAt(++i)) != 'l' && c0 != 'L') {
                    if (c0 == 'r' || c0 == 'R') {
                        flag = false;
                    }
                } else {
                    flag = true;
                }
                f1 = 0.0f;
            }
            f += f1;
            if (!flag || !(f1 > 0.0f)) continue;
            f += this.unicodeFlag ? 1.0f : this.offsetBold;
        }
        return Math.round(f);
    }

    public int getCharWidth(char character) {
        return Math.round(this.getCharWidthFloat(character));
    }

    private float getCharWidthFloat(char p_getCharWidthFloat_1_) {
        if (p_getCharWidthFloat_1_ == '\u00a7') {
            return -1.0f;
        }
        if (p_getCharWidthFloat_1_ != ' ' && p_getCharWidthFloat_1_ != '\u00a0') {
            int i = "?????????????????????????\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000?????????????????????????????????????????\u00ae\u00ac???\u00ab\u00bb?????????????????????????????????????????????????????????????????\u00b1??????\u00b0?\u00b7????\u0000".indexOf(p_getCharWidthFloat_1_);
            if (p_getCharWidthFloat_1_ > '\u0000' && i != -1 && !this.unicodeFlag) {
                return this.charWidthFloat[i];
            }
            if (this.glyphWidth[p_getCharWidthFloat_1_] != 0) {
                int j = this.glyphWidth[p_getCharWidthFloat_1_] & 0xFF;
                int k = j >>> 4;
                int l = j & 0xF;
                return (++l - k) / 2 + 1;
            }
            return 0.0f;
        }
        return this.charWidthFloat[32];
    }

    public String trimStringToWidth(String text, int width) {
        return this.trimStringToWidth(text, width, false);
    }

    public String trimStringToWidth(String text, int width, boolean reverse) {
        StringBuilder stringbuilder = new StringBuilder();
        float f = 0.0f;
        int i = reverse ? text.length() - 1 : 0;
        int j = reverse ? -1 : 1;
        boolean flag = false;
        boolean flag1 = false;
        for (int k = i; k >= 0 && k < text.length() && f < (float)width; k += j) {
            char c0 = text.charAt(k);
            float f1 = this.getCharWidthFloat(c0);
            if (flag) {
                flag = false;
                if (c0 != 'l' && c0 != 'L') {
                    if (c0 == 'r' || c0 == 'R') {
                        flag1 = false;
                    }
                } else {
                    flag1 = true;
                }
            } else if (f1 < 0.0f) {
                flag = true;
            } else {
                f += f1;
                if (flag1) {
                    f += 1.0f;
                }
            }
            if (f > (float)width) break;
            if (reverse) {
                stringbuilder.insert(0, c0);
                continue;
            }
            stringbuilder.append(c0);
        }
        return stringbuilder.toString();
    }

    private String trimStringNewline(String text) {
        while (text != null && text.endsWith("\n")) {
            text = text.substring(0, text.length() - 1);
        }
        return text;
    }

    public void drawSplitString(String str, int x, int y, int wrapWidth, int textColor) {
        if (this.blend) {
            GlStateManager.getBlendState(this.oldBlendState);
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        }
        this.resetStyles();
        this.textColor = textColor;
        str = this.trimStringNewline(str);
        this.renderSplitString(str, x, y, wrapWidth, false);
        if (this.blend) {
            GlStateManager.setBlendState(this.oldBlendState);
        }
    }

    private void renderSplitString(String str, int x, int y, int wrapWidth, boolean addShadow) {
        for (String s : this.listFormattedStringToWidth(str, wrapWidth)) {
            this.renderStringAligned(s, x, y, wrapWidth, this.textColor, addShadow);
            y += this.FONT_HEIGHT;
        }
    }

    public int splitStringWidth(String str, int maxLength) {
        return this.FONT_HEIGHT * this.listFormattedStringToWidth(str, maxLength).size();
    }

    public void setUnicodeFlag(boolean unicodeFlagIn) {
        this.unicodeFlag = unicodeFlagIn;
    }

    public boolean getUnicodeFlag() {
        return this.unicodeFlag;
    }

    public void setBidiFlag(boolean bidiFlagIn) {
        this.bidiFlag = bidiFlagIn;
    }

    public List<String> listFormattedStringToWidth(String str, int wrapWidth) {
        return Arrays.asList(this.wrapFormattedStringToWidth(str, wrapWidth).split("\n"));
    }

    String wrapFormattedStringToWidth(String str, int wrapWidth) {
        if (str.length() <= 1) {
            return str;
        }
        int i = this.sizeStringToWidth(str, wrapWidth);
        if (str.length() <= i) {
            return str;
        }
        String s = str.substring(0, i);
        char c0 = str.charAt(i);
        boolean flag = c0 == ' ' || c0 == '\n';
        String s1 = FontRenderer.getFormatFromString(s) + str.substring(i + (flag ? 1 : 0));
        return s + "\n" + this.wrapFormattedStringToWidth(s1, wrapWidth);
    }

    private int sizeStringToWidth(String str, int wrapWidth) {
        int j;
        int i = str.length();
        float f = 0.0f;
        int k = -1;
        boolean flag = false;
        for (j = 0; j < i; ++j) {
            char c0 = str.charAt(j);
            switch (c0) {
                case '\n': {
                    --j;
                    break;
                }
                case ' ': {
                    k = j;
                }
                default: {
                    f += this.getCharWidthFloat(c0);
                    if (!flag) break;
                    f += 1.0f;
                    break;
                }
                case '\u00a7': {
                    char c1;
                    if (j >= i - 1) break;
                    if ((c1 = str.charAt(++j)) != 'l' && c1 != 'L') {
                        if (c1 != 'r' && c1 != 'R' && !FontRenderer.isFormatColor(c1)) break;
                        flag = false;
                        break;
                    }
                    flag = true;
                }
            }
            if (c0 == '\n') {
                k = ++j;
                break;
            }
            if (Math.round(f) > wrapWidth) break;
        }
        return j != i && k != -1 && k < j ? k : j;
    }

    private static boolean isFormatColor(char colorChar) {
        return colorChar >= '0' && colorChar <= '9' || colorChar >= 'a' && colorChar <= 'f' || colorChar >= 'A' && colorChar <= 'F';
    }

    private static boolean isFormatSpecial(char formatChar) {
        return formatChar >= 'k' && formatChar <= 'o' || formatChar >= 'K' && formatChar <= 'O' || formatChar == 'r' || formatChar == 'R';
    }

    public static String getFormatFromString(String text) {
        String s = "";
        int i = -1;
        int j = text.length();
        while ((i = text.indexOf(167, i + 1)) != -1) {
            if (i >= j - 1) continue;
            char c0 = text.charAt(i + 1);
            if (FontRenderer.isFormatColor(c0)) {
                s = "\u00a7" + c0;
                continue;
            }
            if (!FontRenderer.isFormatSpecial(c0)) continue;
            s = s + "\u00a7" + c0;
        }
        return s;
    }

    public boolean getBidiFlag() {
        return this.bidiFlag;
    }

    public int getColorCode(char character) {
        int i = "0123456789abcdef".indexOf(character);
        if (i >= 0 && i < this.colorCode.length) {
            int j = this.colorCode[i];
            if (Config.isCustomColors()) {
                j = CustomColors.getTextColor(i, j);
            }
            return j;
        }
        return 0xFFFFFF;
    }

    protected void setColor(float p_setColor_1_, float p_setColor_2_, float p_setColor_3_, float p_setColor_4_) {
        GlStateManager.color(p_setColor_1_, p_setColor_2_, p_setColor_3_, p_setColor_4_);
    }

    protected void enableAlpha() {
        GlStateManager.enableAlpha();
    }

    protected void bindTexture(ResourceLocation p_bindTexture_1_) {
        this.renderEngine.bindTexture(p_bindTexture_1_);
    }

    protected IResource getResource(ResourceLocation p_getResource_1_) throws IOException {
        return Minecraft.getMinecraft().getResourceManager().getResource(p_getResource_1_);
    }

    public void drawCenteredString(String text, float x, float y, int color) {
        this.drawStringWithShadow(text, x - (float)this.getStringWidth(text) / 2.0f, y, color);
    }

    public int getStringHeight(String text) {
        return this.FONT_HEIGHT;
    }
}

