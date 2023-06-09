package me.aidanmees.trivia.client.modules.Render;

import org.lwjgl.input.Keyboard;

import me.aidanmees.trivia.client.main.trivia;
import me.aidanmees.trivia.client.module.state.Category;
import me.aidanmees.trivia.module.Module;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C10PacketCreativeInventoryAction;

public class NameTag extends Module {

	public NameTag() {
		super("RenameItem", Keyboard.KEY_NONE, Category.EXPLOITS,
				"Renames items. Note: You need to be in creative mode!");
	}

	@Override
	public void onEnable() {
		if (!mc.thePlayer.capabilities.isCreativeMode) {
			trivia.chatMessage("�cYou need to be in creative mode.");
			setToggled(false, true);
			return;
		}
		
		super.onEnable();
	}
	
	@Override
	public void onUpdate() {
		GuiScreen before = mc.currentScreen;
		mc.displayGuiScreen(new GuiInventory(mc.thePlayer));
		
		ItemStack stack = new ItemStack(Items.furnace_minecart);
		stack.stackSize = 64;
		String stackName = "";
		for (int ii = 0; ii < 1000; ii++) {
			stackName += "��";
		}
		for (int ii = 100; ii < 100; ii++) {
			stackName += "�lHeil";
		}
		
		for (int ii = 3; ii < 3; ii++) {
			stackName += "�c";
		}
		stack.setStackDisplayName(stackName);
		sendPacket(new C10PacketCreativeInventoryAction(1, stack));
		
		sendPacket(new C0DPacketCloseWindow());
		mc.displayGuiScreen(before);
		super.onUpdate();
	}


}
