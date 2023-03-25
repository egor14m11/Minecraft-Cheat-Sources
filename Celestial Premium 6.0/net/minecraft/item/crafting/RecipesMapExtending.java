/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.item.crafting;

import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;
import net.minecraft.world.storage.MapDecoration;

public class RecipesMapExtending
extends ShapedRecipes {
    public RecipesMapExtending() {
        super("", 3, 3, NonNullList.func_193580_a(Ingredient.field_193370_a, Ingredient.func_193368_a(Items.PAPER), Ingredient.func_193368_a(Items.PAPER), Ingredient.func_193368_a(Items.PAPER), Ingredient.func_193368_a(Items.PAPER), Ingredient.func_193367_a(Items.FILLED_MAP), Ingredient.func_193368_a(Items.PAPER), Ingredient.func_193368_a(Items.PAPER), Ingredient.func_193368_a(Items.PAPER), Ingredient.func_193368_a(Items.PAPER)), new ItemStack(Items.MAP));
    }

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        if (!super.matches(inv, worldIn)) {
            return false;
        }
        ItemStack itemstack = ItemStack.field_190927_a;
        for (int i = 0; i < inv.getSizeInventory() && itemstack.isEmpty(); ++i) {
            ItemStack itemstack1 = inv.getStackInSlot(i);
            if (itemstack1.getItem() != Items.FILLED_MAP) continue;
            itemstack = itemstack1;
        }
        if (itemstack.isEmpty()) {
            return false;
        }
        MapData mapdata = Items.FILLED_MAP.getMapData(itemstack, worldIn);
        if (mapdata == null) {
            return false;
        }
        if (this.func_190934_a(mapdata)) {
            return false;
        }
        return mapdata.scale < 4;
    }

    private boolean func_190934_a(MapData p_190934_1_) {
        if (p_190934_1_.mapDecorations != null) {
            for (MapDecoration mapdecoration : p_190934_1_.mapDecorations.values()) {
                if (mapdecoration.func_191179_b() != MapDecoration.Type.MANSION && mapdecoration.func_191179_b() != MapDecoration.Type.MONUMENT) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        ItemStack itemstack = ItemStack.field_190927_a;
        for (int i = 0; i < inv.getSizeInventory() && itemstack.isEmpty(); ++i) {
            ItemStack itemstack1 = inv.getStackInSlot(i);
            if (itemstack1.getItem() != Items.FILLED_MAP) continue;
            itemstack = itemstack1;
        }
        itemstack = itemstack.copy();
        itemstack.func_190920_e(1);
        if (itemstack.getTagCompound() == null) {
            itemstack.setTagCompound(new NBTTagCompound());
        }
        itemstack.getTagCompound().setInteger("map_scale_direction", 1);
        return itemstack;
    }

    @Override
    public boolean func_192399_d() {
        return true;
    }
}

