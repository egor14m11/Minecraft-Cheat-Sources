package zamorozka.modules.COMBAT;

import java.awt.Color;
import java.util.Comparator;
import java.util.Objects;

import org.lwjgl.opengl.GL11;

import de.Hero.settings.Setting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import optifine.FontUtils;
import zamorozka.event.EventTarget;
import zamorozka.event.events.EventRender2D;
import zamorozka.main.Zamorozka;
import zamorozka.module.Category;
import zamorozka.module.Module;
import zamorozka.ui.Colors;
import zamorozka.ui.JColor;
import zamorozka.ui.MathUtil;
import zamorozka.ui.RenderUtil;
import zamorozka.ui.RenderUtils;

public class TgHUD extends Module {

	boolean on;
	
    JColor outlineColor;
    JColor backgroundColor;
    JColor nameColor;
    JColor healthColor;
    TextFormatting playercolor;
	FontRenderer fr = mc.fontRendererObj;
    String playerinfo;
    float ping;
    public static EntityPlayer targetPlayer;
	
    @Override
    public void setup() {
    	Zamorozka.settingsManager.rSetting(new Setting("TargetHdRange", this, 100, 0, 260, true));
    	Zamorozka.settingsManager.rSetting(new Setting("TargetPosX", this, 10, -1000, 1000, true));
    	Zamorozka.settingsManager.rSetting(new Setting("TargetPosY", this, 10, -1000, 1000, true));
    }
    
	public TgHUD() {
		super("TgHUD", 0, Category.COMBAT);
	}
	
    public void onEnable() {
    	super.onEnable();
    	on = true;
    }
    
    public void onDisable() {
    	super.onDisable();
    	on = false;
    }
	
	@EventTarget
	public void on2d(EventRender2D event) {
		if(on) {
			double posX = Zamorozka.settingsManager.getSettingByName("TargetPosX").getValDouble();
			double posY = Zamorozka.settingsManager.getSettingByName("TargetPosY").getValDouble();
			double rng = Zamorozka.settingsManager.getSettingByName("TargetHdRange").getValDouble();
        if (mc.world != null && mc.player.ticksExisted >= 10) {
            backgroundColor = new JColor(255,255,255);
            outlineColor = new JColor(255,255,255);
			if (KillAura.target == null)
                return;

            if ((KillAura.target != null && IsValidEntity((KillAura.target)))) {
                String playerName = (KillAura.target.getName());
                int playerHealth = (int) ((KillAura.target.getHealth() + (KillAura.target.getAbsorptionAmount())));
                findNameColor(playerName);
                findHealthColor(playerHealth);

                //player model
                drawEntityPlayer((EntityPlayer) KillAura.target, (int) posX + 35, (int) posY + 87 - (KillAura.target.isSneaking()?10:0));

                //box
                drawTargetBox();

                //player name
                fr.drawStringWithShadow(TextFormatting.ITALIC + playerName, (float) posX + 61, (float) posY + 33, 0xff79c2ec);

                //health + absorption
                fr.drawStringWithShadow("health:", (int) posX+ 61, (int) posY + 43, 0xff79c2ec);
                fr.drawStringWithShadow(playerHealth + "", (int) posX + 96,  (int) posY + 43, playerHealth >= 15 ? 0xff00ff00 : 0xffe6000);
                
                //distance
                fr.drawStringWithShadow("Distance:", (int) posX+ 61, (int) posY+ 53, 0xff79c2ec);
                fr.drawStringWithShadow(KillAura.target.getDistanceToEntity(mc.player) + "", (int) posX + 108, (int) posY+ 53, KillAura.target.getDistanceToEntity(mc.player) < 6 ? 0xffe60000 : 0xff00ff00);
                
                //ping
                ping = getPing((EntityPlayer) KillAura.target);
                fr.drawStringWithShadow("ping:", (int) posX + 61, (int) posY + 63, 0xff79c2ec);
                fr.drawStringWithShadow(ping + "", (int) posX + 85, (int) posY+ 63, ping > 100 ? 0xffe60000 : 0xff00ff00);

                //status effects
                drawStatusEffects((EntityPlayer) KillAura.target, (int) posX, (int) posY);

                //armor + items
                drawItemTextures((EntityPlayer) KillAura.target, (int) posX + 51, (int) posY + 83);

                //player info
                drawPlayerInfo((EntityPlayer) KillAura.target, (int) posX + 61, (int) posY+ 73);
            }
        }
		}
	}
	
    public void drawTargetBox(){
		double posX = Zamorozka.settingsManager.getSettingByName("TargetPosX").getValDouble();
		double posY = Zamorozka.settingsManager.getSettingByName("TargetPosY").getValDouble();
		double rng = Zamorozka.settingsManager.getSettingByName("TargetHdRange").getValDouble();
        Gui.drawRect((int) posX + 10, (int) posY + 23, (int) posX+ 155, (int) posY + 93, backgroundColor.getRGB());
    }

    public void drawEntityPlayer(EntityPlayer entityPlayer, int x, int y){
        targetPlayer = entityPlayer;
        GlStateManager.pushMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        GuiInventory.drawEntityOnScreen(x, y, 30, 28, 60, entityPlayer);
        GlStateManager.popMatrix();
    }

    public void drawPlayerInfo(EntityPlayer entityPlayer, int x, int y) {

        if (entityPlayer.inventory.armorItemInSlot(2).getItem().equals(Items.ELYTRA)) {
            playerinfo = "ayo watch yo jet";
            playercolor = TextFormatting.LIGHT_PURPLE;
        }
        else if (entityPlayer.inventory.armorItemInSlot(2).getItem().equals(Items.DIAMOND_CHESTPLATE)) {
            playerinfo = "threat";
            playercolor = TextFormatting.RED;
        }
        else if (entityPlayer.inventory.armorItemInSlot(3).getItem().equals(Items.field_190929_cY)) {
            playerinfo = "i suck ass";
            playercolor = TextFormatting.GREEN;
        }
        else {
            playerinfo = "None";
            playercolor = TextFormatting.WHITE;
        }

        ping = getPing(entityPlayer);
        mc.fontRendererObj.drawStringWithShadow(playercolor + playerinfo, x, y, 0xffffffff);
    }

    //having more than one of these displayed at once makes things too crowded
    JColor statusColor = new JColor(255, 255, 255, 255);
    public void drawStatusEffects(EntityPlayer entityPlayer, int x, int y){
        int inX = x + 71;
        int inY = y + 55;

        entityPlayer.getActivePotionEffects().forEach(potionEffect -> {
            findPotionColor(potionEffect);

            if (potionEffect.getPotion() == MobEffects.WEAKNESS) {
                fr.drawStringWithShadow(TextFormatting.RESET + "i have weakness!", inX, inY, 0xffffffff);
            }
            else if (potionEffect.getPotion() == MobEffects.INVISIBILITY){
                fr.drawStringWithShadow(TextFormatting.RESET + "im invisible!", inX, inY, 0xffffffff);
            }
            else if (potionEffect.getPotion() == MobEffects.STRENGTH){
                fr.drawStringWithShadow(TextFormatting.RESET + "i have strength!", inX, inY, 0xffffffff);
            }
        });
    }

    private static final RenderItem itemRender = Minecraft.getMinecraft().getRenderItem();
    public void drawItemTextures(EntityPlayer entityPlayer, int x, int y){
        GlStateManager.pushMatrix();
        RenderHelper.enableGUIStandardItemLighting();

        int iteration = 0;
        for (ItemStack itemStack : entityPlayer.getArmorInventoryList()) {
            iteration++;
            if (itemStack.func_190926_b()) continue;
            int inX = x - 90 + (9 - iteration) * 20 + 2;

            itemRender.zLevel = 200F;
            itemRender.renderItemAndEffectIntoGUI(itemStack, inX, y);
            itemRender.renderItemOverlayIntoGUI(mc.fontRendererObj, itemStack, inX, y, "");
            itemRender.zLevel = 0F;
        }

        RenderHelper.disableStandardItemLighting();
        mc.getRenderItem().zLevel = 0.0F;
        GlStateManager.popMatrix();
    }

    public void findPotionColor(PotionEffect potionEffect){
        if (potionEffect.getPotion() == MobEffects.STRENGTH){
            statusColor = new JColor(135, 0, 25, 255);
        }
        else if (potionEffect.getPotion() == MobEffects.WEAKNESS){
            statusColor = new JColor(185, 65, 185, 255);
        }
        else if (potionEffect.getPotion() == MobEffects.INVISIBILITY){
            statusColor = new JColor(90, 90, 90, 255);
        }
    }

    public void findNameColor(String playerName){
            nameColor = new JColor(255, 255, 255, 255);
        }

    public void findHealthColor(int health){
        if (health >= 15){
            healthColor = new JColor(0, 255, 0, 255);
        }
        else if (health >= 5 && health < 15){
            healthColor = new JColor(255, 255, 0, 255);
        }
        else {
            healthColor = new JColor(255, 0, 0, 255);
        }
    }

    private boolean IsValidEntity (Entity e){
        if (!(e instanceof EntityPlayer)) {
            return false;
        }

        if (e instanceof EntityPlayer) {
            return e != mc.player;
        }

        return true;
    }

    public float getPing (EntityPlayer player){
        float ping = 0;
        try { ping = MathUtil.clamp(Objects.requireNonNull(mc.getConnection()).getPlayerInfo(player.getUniqueID()).getResponseTime(), 1, 300.0f); }
        catch (NullPointerException ignored) {}
        return ping;
    }
    public static boolean isRenderingEntity(EntityPlayer entityPlayer){
        if (targetPlayer == entityPlayer){
            return true;
        }

        return false;
    }
}