package net.minecraft.item;

import baritone.api.utils.accessor.IItemStack;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentDurability;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.datafix.FixTypes;
import net.minecraft.util.datafix.walkers.BlockEntityTag;
import net.minecraft.util.datafix.walkers.EntityTag;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.Component;
import net.minecraft.util.text.Formatting;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class ItemStack implements IItemStack
{
    public static final ItemStack EMPTY = new ItemStack((Item)null);
    public static final DecimalFormat DECIMALFORMAT = new DecimalFormat("#.##");

    /** Size of the stack. */
    public int stackSize;

    /**
     * Number of animation frames to go when receiving an item (by walking into it, for example).
     */
    private int animationsToGo;
    private final Item item;

    /**
     * A NBTTagMap containing data about an ItemStack. Can only be used for non stackable items
     */
    private NBTTagCompound stackTagCompound;
    private boolean field_190928_g;
    private int itemDamage;

    /** Item frame this stack is on, or null if not on an item frame. */
    private EntityItemFrame itemFrame;
    private Block canDestroyCacheBlock;
    private boolean canDestroyCacheResult;
    private Block canPlaceOnCacheBlock;
    private boolean canPlaceOnCacheResult;

    private int baritoneHash;

    public ItemStack(Block blockIn)
    {
        this(blockIn, 1);
    }

    public ItemStack(Block blockIn, int amount)
    {
        this(blockIn, amount, 0);
    }

    public ItemStack(Block blockIn, int amount, int meta)
    {
        this(Item.getItemFromBlock(blockIn), amount, meta);
    }

    public ItemStack(Item itemIn)
    {
        this(itemIn, 1);
    }

    public ItemStack(Item itemIn, int amount)
    {
        this(itemIn, amount, 0);
    }

    public ItemStack(Item itemIn, int amount, int meta)
    {
        item = itemIn;
        itemDamage = meta;
        stackSize = amount;

        if (itemDamage < 0)
        {
            itemDamage = 0;
        }

        func_190923_F();
    }

    private void func_190923_F()
    {
        field_190928_g = isEmpty();
    }

    public ItemStack(NBTTagCompound p_i47263_1_)
    {
        item = Item.getByNameOrId(p_i47263_1_.getString("id"));
        stackSize = p_i47263_1_.getByte("Count");
        itemDamage = Math.max(0, p_i47263_1_.getShort("Damage"));

        if (p_i47263_1_.hasKey("tag", 10))
        {
            stackTagCompound = p_i47263_1_.getCompoundTag("tag");

            if (item != null)
            {
                item.updateItemStackNBT(p_i47263_1_);
            }
        }

        func_190923_F();
    }

    public boolean isEmpty()
    {
        if (this == EMPTY)
        {
            return true;
        }
        else if (item != null && item != Item.getItemFromBlock(Blocks.AIR))
        {
            if (stackSize <= 0)
            {
                return true;
            }
            else
            {
                return itemDamage < -32768 || itemDamage > 65535;
            }
        }
        else
        {
            return true;
        }
    }

    public static void registerFixes(DataFixer fixer)
    {
        fixer.registerWalker(FixTypes.ITEM_INSTANCE, new BlockEntityTag());
        fixer.registerWalker(FixTypes.ITEM_INSTANCE, new EntityTag());
    }

    /**
     * Splits off a stack of the given amount of this stack and reduces this stack by the amount.
     */
    public ItemStack splitStack(int amount)
    {
        int i = Math.min(amount, stackSize);
        ItemStack itemstack = copy();
        itemstack.func_190920_e(i);
        func_190918_g(i);
        return itemstack;
    }

    /**
     * Returns the object corresponding to the stack.
     */
    public Item getItem()
    {
        return field_190928_g ? Item.getItemFromBlock(Blocks.AIR) : item;
    }

    /**
     * Called when the player uses this ItemStack on a Block (right-click). Places blocks, etc. (Legacy name:
     * tryPlaceItemIntoWorld)
     */
    public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        EnumActionResult enumactionresult = getItem().onItemUse(playerIn, worldIn, pos, hand, side, hitX, hitY, hitZ);

        if (enumactionresult == EnumActionResult.SUCCESS)
        {
            playerIn.addStat(StatList.getObjectUseStats(item));
        }

        return enumactionresult;
    }

    public float getStrVsBlock(IBlockState blockIn)
    {
        return getItem().getStrVsBlock(this, blockIn);
    }

    public ActionResult<ItemStack> useItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        return getItem().onItemRightClick(worldIn, playerIn, hand);
    }

    /**
     * Called when the item in use count reach 0, e.g. item food eaten. Return the new ItemStack. Args : world, entity
     */
    public ItemStack onItemUseFinish(World worldIn, EntityLivingBase entityLiving)
    {
        return getItem().onItemUseFinish(this, worldIn, entityLiving);
    }

    /**
     * Write the stack fields to a NBT object. Return the new NBT object.
     */
    public NBTTagCompound writeToNBT(NBTTagCompound nbt)
    {
        Namespaced resourcelocation = Item.REGISTRY.getNameForObject(item);
        nbt.setString("id", resourcelocation == null ? "minecraft:air" : resourcelocation.toString());
        nbt.setByte("Count", (byte) stackSize);
        nbt.setShort("Damage", (short) itemDamage);

        if (stackTagCompound != null)
        {
            nbt.setTag("tag", stackTagCompound);
        }

        return nbt;
    }

    /**
     * Returns maximum size of the stack.
     */
    public int getMaxStackSize()
    {
        return getItem().getItemStackLimit();
    }

    /**
     * Returns true if the ItemStack can hold 2 or more units of the item.
     */
    public boolean isStackable()
    {
        return getMaxStackSize() > 1 && (!isItemStackDamageable() || !isItemDamaged());
    }

    /**
     * true if this itemStack is damageable
     */
    public boolean isItemStackDamageable()
    {
        if (field_190928_g)
        {
            return false;
        }
        else if (item.getMaxDamage() <= 0)
        {
            return false;
        }
        else
        {
            return !hasTagCompound() || !getTagCompound().getBoolean("Unbreakable");
        }
    }

    public boolean getHasSubtypes()
    {
        return getItem().getHasSubtypes();
    }

    /**
     * returns true when a damageable item is damaged
     */
    public boolean isItemDamaged()
    {
        return isItemStackDamageable() && itemDamage > 0;
    }

    public int getItemDamage()
    {
        return itemDamage;
    }

    public int getMetadata()
    {
        return itemDamage;
    }

    public void setItemDamage(int meta)
    {
        itemDamage = meta;

        if (itemDamage < 0)
        {
            itemDamage = 0;
        }
    }

    /**
     * Returns the max damage an item in the stack can take.
     */
    public int getMaxDamage()
    {
        return getItem().getMaxDamage();
    }

    /**
     * Attempts to damage the ItemStack with par1 amount of damage, If the ItemStack has the Unbreaking enchantment
     * there is a chance for each point of damage to be negated. Returns true if it takes more damage than
     * getMaxDamage(). Returns false otherwise or if the ItemStack can't be damaged or if all points of damage are
     * negated.
     */
    public boolean attemptDamageItem(int amount, Random rand, @Nullable EntityPlayerMP p_96631_3_)
    {
        if (!isItemStackDamageable())
        {
            return false;
        }
        else
        {
            if (amount > 0)
            {
                int i = EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, this);
                int j = 0;

                for (int k = 0; i > 0 && k < amount; ++k)
                {
                    if (EnchantmentDurability.negateDamage(this, i, rand))
                    {
                        ++j;
                    }
                }

                amount -= j;

                if (amount <= 0)
                {
                    return false;
                }
            }

            if (p_96631_3_ != null && amount != 0)
            {
                CriteriaTriggers.field_193132_s.func_193158_a(p_96631_3_, this, itemDamage + amount);
            }

            itemDamage += amount;
            return itemDamage > getMaxDamage();
        }
    }

    /**
     * Damages the item in the ItemStack
     */
    public void damageItem(int amount, EntityLivingBase entityIn)
    {
        if (!(entityIn instanceof EntityPlayer) || !((EntityPlayer)entityIn).capabilities.isCreativeMode)
        {
            if (isItemStackDamageable())
            {
                if (attemptDamageItem(amount, entityIn.getRNG(), entityIn instanceof EntityPlayerMP ? (EntityPlayerMP)entityIn : null))
                {
                    entityIn.renderBrokenItemStack(this);
                    func_190918_g(1);

                    if (entityIn instanceof EntityPlayer)
                    {
                        EntityPlayer entityplayer = (EntityPlayer)entityIn;
                        entityplayer.addStat(StatList.getObjectBreakStats(item));
                    }

                    itemDamage = 0;
                }
            }
        }
    }

    /**
     * Calls the delegated method to the Item to damage the incoming Entity, and if necessary, triggers a stats
     * increase.
     */
    public void hitEntity(EntityLivingBase entityIn, EntityPlayer playerIn)
    {
        boolean flag = item.hitEntity(this, entityIn, playerIn);

        if (flag)
        {
            playerIn.addStat(StatList.getObjectUseStats(item));
        }
    }

    /**
     * Called when a Block is destroyed using this ItemStack
     */
    public void onBlockDestroyed(World worldIn, IBlockState blockIn, BlockPos pos, EntityPlayer playerIn)
    {
        boolean flag = getItem().onBlockDestroyed(this, worldIn, blockIn, pos, playerIn);

        if (flag)
        {
            playerIn.addStat(StatList.getObjectUseStats(item));
        }
    }

    /**
     * Check whether the given Block can be harvested using this ItemStack.
     */
    public boolean canHarvestBlock(IBlockState blockIn)
    {
        return getItem().canHarvestBlock(blockIn);
    }

    public boolean interactWithEntity(EntityPlayer playerIn, EntityLivingBase entityIn, EnumHand hand)
    {
        return getItem().itemInteractionForEntity(this, playerIn, entityIn, hand);
    }

    /**
     * Returns a new stack with the same properties.
     */
    public ItemStack copy()
    {
        ItemStack itemstack = new ItemStack(item, stackSize, itemDamage);
        itemstack.func_190915_d(func_190921_D());

        if (stackTagCompound != null)
        {
            itemstack.stackTagCompound = stackTagCompound.copy();
        }

        return itemstack;
    }

    public static boolean areItemStackTagsEqual(ItemStack stackA, ItemStack stackB)
    {
        if (stackA.isEmpty() && stackB.isEmpty())
        {
            return true;
        }
        else if (!stackA.isEmpty() && !stackB.isEmpty())
        {
            if (stackA.stackTagCompound == null && stackB.stackTagCompound != null)
            {
                return false;
            }
            else
            {
                return stackA.stackTagCompound == null || stackA.stackTagCompound.equals(stackB.stackTagCompound);
            }
        }
        else
        {
            return false;
        }
    }

    /**
     * compares ItemStack argument1 with ItemStack argument2; returns true if both ItemStacks are equal
     */
    public static boolean areItemStacksEqual(ItemStack stackA, ItemStack stackB)
    {
        if (stackA.isEmpty() && stackB.isEmpty())
        {
            return true;
        }
        else
        {
            return !stackA.isEmpty() && !stackB.isEmpty() && stackA.isItemStackEqual(stackB);
        }
    }

    /**
     * compares ItemStack argument to the instance ItemStack; returns true if both ItemStacks are equal
     */
    private boolean isItemStackEqual(ItemStack other)
    {
        if (stackSize != other.stackSize)
        {
            return false;
        }
        else if (getItem() != other.getItem())
        {
            return false;
        }
        else if (itemDamage != other.itemDamage)
        {
            return false;
        }
        else if (stackTagCompound == null && other.stackTagCompound != null)
        {
            return false;
        }
        else
        {
            return stackTagCompound == null || stackTagCompound.equals(other.stackTagCompound);
        }
    }

    /**
     * Compares Item and damage value of the two stacks
     */
    public static boolean areItemsEqual(ItemStack stackA, ItemStack stackB)
    {
        if (stackA == stackB)
        {
            return true;
        }
        else
        {
            return !stackA.isEmpty() && !stackB.isEmpty() && stackA.isItemEqual(stackB);
        }
    }

    public static boolean areItemsEqualIgnoreDurability(ItemStack stackA, ItemStack stackB)
    {
        if (stackA == stackB)
        {
            return true;
        }
        else
        {
            return !stackA.isEmpty() && !stackB.isEmpty() && stackA.isItemEqualIgnoreDurability(stackB);
        }
    }

    /**
     * compares ItemStack argument to the instance ItemStack; returns true if the Items contained in both ItemStacks are
     * equal
     */
    public boolean isItemEqual(ItemStack other)
    {
        return !other.isEmpty() && item == other.item && itemDamage == other.itemDamage;
    }

    public boolean isItemEqualIgnoreDurability(ItemStack stack)
    {
        if (!isItemStackDamageable())
        {
            return isItemEqual(stack);
        }
        else
        {
            return !stack.isEmpty() && item == stack.item;
        }
    }

    public String getUnlocalizedName()
    {
        return getItem().getUnlocalizedName(this);
    }

    public String toString()
    {
        return stackSize + "x" + getItem().getUnlocalizedName() + "@" + itemDamage;
    }

    /**
     * Called each tick as long the ItemStack in on player inventory. Used to progress the pickup animation and update
     * maps.
     */
    public void updateAnimation(World worldIn, Entity entityIn, int inventorySlot, boolean isCurrentItem)
    {
        if (animationsToGo > 0)
        {
            --animationsToGo;
        }

        if (item != null)
        {
            item.onUpdate(this, worldIn, entityIn, inventorySlot, isCurrentItem);
        }
    }

    public void onCrafting(World worldIn, EntityPlayer playerIn, int amount)
    {
        playerIn.addStat(StatList.getCraftStats(item), amount);
        getItem().onCreated(this, worldIn, playerIn);
    }

    public int getMaxItemUseDuration()
    {
        return getItem().getMaxItemUseDuration(this);
    }

    public EnumAction getItemUseAction()
    {
        return getItem().getItemUseAction(this);
    }

    /**
     * Called when the player releases the use item button.
     */
    public void onPlayerStoppedUsing(World worldIn, EntityLivingBase entityLiving, int timeLeft)
    {
        getItem().onPlayerStoppedUsing(this, worldIn, entityLiving, timeLeft);
    }

    /**
     * Returns true if the ItemStack has an NBTTagCompound. Currently used to store enchantments.
     */
    public boolean hasTagCompound()
    {
        return !field_190928_g && stackTagCompound != null;
    }

    @Nullable

    /**
     * Returns the NBTTagCompound of the ItemStack.
     */
    public NBTTagCompound getTagCompound()
    {
        return stackTagCompound;
    }

    public NBTTagCompound func_190925_c(String p_190925_1_)
    {
        if (stackTagCompound != null && stackTagCompound.hasKey(p_190925_1_, 10))
        {
            return stackTagCompound.getCompoundTag(p_190925_1_);
        }
        else
        {
            NBTTagCompound nbttagcompound = new NBTTagCompound();
            setTagInfo(p_190925_1_, nbttagcompound);
            return nbttagcompound;
        }
    }

    @Nullable

    /**
     * Get an NBTTagCompound from this stack's NBT data.
     */
    public NBTTagCompound getSubCompound(String key)
    {
        return stackTagCompound != null && stackTagCompound.hasKey(key, 10) ? stackTagCompound.getCompoundTag(key) : null;
    }

    public void func_190919_e(String p_190919_1_)
    {
        if (stackTagCompound != null && stackTagCompound.hasKey(p_190919_1_, 10))
        {
            stackTagCompound.removeTag(p_190919_1_);
        }
    }

    public NBTTagList getEnchantmentTagList()
    {
        return stackTagCompound != null ? stackTagCompound.getTagList("ench", 10) : new NBTTagList();
    }

    /**
     * Assigns a NBTTagCompound to the ItemStack, minecraft validates that only non-stackable items can have it.
     */
    public void setTagCompound(@Nullable NBTTagCompound nbt)
    {
        stackTagCompound = nbt;
    }

    /**
     * returns the display name of the itemstack
     */
    public String getDisplayName()
    {
        NBTTagCompound nbttagcompound = getSubCompound("display");

        if (nbttagcompound != null)
        {
            if (nbttagcompound.hasKey("Name", 8))
            {
                return nbttagcompound.getString("Name");
            }

            if (nbttagcompound.hasKey("LocName", 8))
            {
                return I18n.translateToLocal(nbttagcompound.getString("LocName"));
            }
        }

        return getItem().getItemStackDisplayName(this);
    }

    public ItemStack func_190924_f(String p_190924_1_)
    {
        func_190925_c("display").setString("LocName", p_190924_1_);
        return this;
    }

    public ItemStack setStackDisplayName(String displayName)
    {
        func_190925_c("display").setString("Name", displayName);
        return this;
    }

    /**
     * Clear any custom name set for this ItemStack
     */
    public void clearCustomName()
    {
        NBTTagCompound nbttagcompound = getSubCompound("display");

        if (nbttagcompound != null)
        {
            nbttagcompound.removeTag("Name");

            if (nbttagcompound.hasNoTags())
            {
                func_190919_e("display");
            }
        }

        if (stackTagCompound != null && stackTagCompound.hasNoTags())
        {
            stackTagCompound = null;
        }
    }

    /**
     * Returns true if the itemstack has a display name
     */
    public boolean hasDisplayName()
    {
        NBTTagCompound nbttagcompound = getSubCompound("display");
        return nbttagcompound != null && nbttagcompound.hasKey("Name", 8);
    }

    public List<String> getTooltip(@Nullable EntityPlayer playerIn, ITooltipFlag advanced)
    {
        List<String> list = Lists.newArrayList();
        String s = getDisplayName();

        if (hasDisplayName())
        {
            s = Formatting.ITALIC + s;
        }

        s = s + Formatting.RESET;

        if (advanced.func_194127_a())
        {
            String s1 = "";

            if (!s.isEmpty())
            {
                s = s + " (";
                s1 = ")";
            }

            int i = Item.getIdFromItem(item);

            if (getHasSubtypes())
            {
                s = s + String.format("#%04d/%d%s", i, itemDamage, s1);
            }
            else
            {
                s = s + String.format("#%04d%s", i, s1);
            }
        }
        else if (!hasDisplayName() && item == Items.FILLED_MAP)
        {
            s = s + " #" + itemDamage;
        }

        list.add(s);
        int i1 = 0;

        if (hasTagCompound() && stackTagCompound.hasKey("HideFlags", 99))
        {
            i1 = stackTagCompound.getInteger("HideFlags");
        }

        if ((i1 & 32) == 0)
        {
            getItem().addInformation(this, playerIn == null ? null : playerIn.world, list, advanced);
        }

        if (hasTagCompound())
        {
            if ((i1 & 1) == 0)
            {
                NBTTagList nbttaglist = getEnchantmentTagList();

                for (int j = 0; j < nbttaglist.tagCount(); ++j)
                {
                    NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(j);
                    int k = nbttagcompound.getShort("id");
                    int l = nbttagcompound.getShort("lvl");
                    Enchantment enchantment = Enchantment.getEnchantmentByID(k);

                    if (enchantment != null)
                    {
                        list.add(enchantment.getTranslatedName(l));
                    }
                }
            }

            if (stackTagCompound.hasKey("display", 10))
            {
                NBTTagCompound nbttagcompound1 = stackTagCompound.getCompoundTag("display");

                if (nbttagcompound1.hasKey("color", 3))
                {
                    if (advanced.func_194127_a())
                    {
                        list.add(I18n.translateToLocalFormatted("item.color", String.format("#%06X", nbttagcompound1.getInteger("color"))));
                    }
                    else
                    {
                        list.add(Formatting.ITALIC + I18n.translateToLocal("item.dyed"));
                    }
                }

                if (nbttagcompound1.getTagId("Lore") == 9)
                {
                    NBTTagList nbttaglist3 = nbttagcompound1.getTagList("Lore", 8);

                    if (!nbttaglist3.hasNoTags())
                    {
                        for (int l1 = 0; l1 < nbttaglist3.tagCount(); ++l1)
                        {
                            list.add(Formatting.DARK_PURPLE + "" + Formatting.ITALIC + nbttaglist3.getStringTagAt(l1));
                        }
                    }
                }
            }
        }

        for (EntityEquipmentSlot entityequipmentslot : EntityEquipmentSlot.values())
        {
            Multimap<String, AttributeModifier> multimap = getAttributeModifiers(entityequipmentslot);

            if (!multimap.isEmpty() && (i1 & 2) == 0)
            {
                list.add("");
                list.add(I18n.translateToLocal("item.modifiers." + entityequipmentslot.getName()));

                for (Map.Entry<String, AttributeModifier> entry : multimap.entries())
                {
                    AttributeModifier attributemodifier = entry.getValue();
                    double d0 = attributemodifier.getAmount();
                    boolean flag = false;

                    if (playerIn != null)
                    {
                        if (attributemodifier.getID() == Item.ATTACK_DAMAGE_MODIFIER)
                        {
                            d0 = d0 + playerIn.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getBaseValue();
                            d0 = d0 + (double)EnchantmentHelper.getModifierForCreature(this, EnumCreatureAttribute.UNDEFINED);
                            flag = true;
                        }
                        else if (attributemodifier.getID() == Item.ATTACK_SPEED_MODIFIER)
                        {
                            d0 += playerIn.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED).getBaseValue();
                            flag = true;
                        }
                    }

                    double d1;

                    if (attributemodifier.getOperation() != 1 && attributemodifier.getOperation() != 2)
                    {
                        d1 = d0;
                    }
                    else
                    {
                        d1 = d0 * 100.0D;
                    }

                    if (flag)
                    {
                        list.add(" " + I18n.translateToLocalFormatted("attribute.modifier.equals." + attributemodifier.getOperation(), DECIMALFORMAT.format(d1), I18n.translateToLocal("attribute.name." + entry.getKey())));
                    }
                    else if (d0 > 0.0D)
                    {
                        list.add(Formatting.BLUE + " " + I18n.translateToLocalFormatted("attribute.modifier.plus." + attributemodifier.getOperation(), DECIMALFORMAT.format(d1), I18n.translateToLocal("attribute.name." + entry.getKey())));
                    }
                    else if (d0 < 0.0D)
                    {
                        d1 = d1 * -1.0D;
                        list.add(Formatting.RED + " " + I18n.translateToLocalFormatted("attribute.modifier.take." + attributemodifier.getOperation(), DECIMALFORMAT.format(d1), I18n.translateToLocal("attribute.name." + entry.getKey())));
                    }
                }
            }
        }

        if (hasTagCompound() && getTagCompound().getBoolean("Unbreakable") && (i1 & 4) == 0)
        {
            list.add(Formatting.BLUE + I18n.translateToLocal("item.unbreakable"));
        }

        if (hasTagCompound() && stackTagCompound.hasKey("CanDestroy", 9) && (i1 & 8) == 0)
        {
            NBTTagList nbttaglist1 = stackTagCompound.getTagList("CanDestroy", 8);

            if (!nbttaglist1.hasNoTags())
            {
                list.add("");
                list.add(Formatting.GRAY + I18n.translateToLocal("item.canBreak"));

                for (int j1 = 0; j1 < nbttaglist1.tagCount(); ++j1)
                {
                    Block block = Block.getBlockFromName(nbttaglist1.getStringTagAt(j1));

                    if (block != null)
                    {
                        list.add(Formatting.DARK_GRAY + block.getLocalizedName());
                    }
                    else
                    {
                        list.add(Formatting.DARK_GRAY + "missingno");
                    }
                }
            }
        }

        if (hasTagCompound() && stackTagCompound.hasKey("CanPlaceOn", 9) && (i1 & 16) == 0)
        {
            NBTTagList nbttaglist2 = stackTagCompound.getTagList("CanPlaceOn", 8);

            if (!nbttaglist2.hasNoTags())
            {
                list.add("");
                list.add(Formatting.GRAY + I18n.translateToLocal("item.canPlace"));

                for (int k1 = 0; k1 < nbttaglist2.tagCount(); ++k1)
                {
                    Block block1 = Block.getBlockFromName(nbttaglist2.getStringTagAt(k1));

                    if (block1 != null)
                    {
                        list.add(Formatting.DARK_GRAY + block1.getLocalizedName());
                    }
                    else
                    {
                        list.add(Formatting.DARK_GRAY + "missingno");
                    }
                }
            }
        }

        if (advanced.func_194127_a())
        {
            if (isItemDamaged())
            {
                list.add(I18n.translateToLocalFormatted("item.durability", getMaxDamage() - getItemDamage(), getMaxDamage()));
            }

            list.add(Formatting.DARK_GRAY + Item.REGISTRY.getNameForObject(item).toString());

            if (hasTagCompound())
            {
                list.add(Formatting.DARK_GRAY + I18n.translateToLocalFormatted("item.nbt_tags", getTagCompound().getKeySet().size()));
            }
        }

        return list;
    }

    public boolean hasEffect()
    {
        return getItem().hasEffect(this);
    }

    public EnumRarity getRarity()
    {
        return getItem().getRarity(this);
    }

    /**
     * True if it is a tool and has no enchantments to begin with
     */
    public boolean isItemEnchantable()
    {
        if (!getItem().isItemTool(this))
        {
            return false;
        }
        else
        {
            return !isItemEnchanted();
        }
    }

    /**
     * Adds an enchantment with a desired level on the ItemStack.
     */
    public void addEnchantment(Enchantment ench, int level)
    {
        if (stackTagCompound == null)
        {
            setTagCompound(new NBTTagCompound());
        }

        if (!stackTagCompound.hasKey("ench", 9))
        {
            stackTagCompound.setTag("ench", new NBTTagList());
        }

        NBTTagList nbttaglist = stackTagCompound.getTagList("ench", 10);
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        nbttagcompound.setShort("id", (short)Enchantment.getEnchantmentID(ench));
        nbttagcompound.setShort("lvl", (byte)level);
        nbttaglist.appendTag(nbttagcompound);
    }

    /**
     * True if the item has enchantment data
     */
    public boolean isItemEnchanted()
    {
        if (stackTagCompound != null && stackTagCompound.hasKey("ench", 9))
        {
            return !stackTagCompound.getTagList("ench", 10).hasNoTags();
        }
        else
        {
            return false;
        }
    }

    public void setTagInfo(String key, NBTBase value)
    {
        if (stackTagCompound == null)
        {
            setTagCompound(new NBTTagCompound());
        }

        stackTagCompound.setTag(key, value);
    }

    public boolean canEditBlocks()
    {
        return getItem().canItemEditBlocks();
    }

    /**
     * Return whether this stack is on an item frame.
     */
    public boolean isOnItemFrame()
    {
        return itemFrame != null;
    }

    /**
     * Set the item frame this stack is on.
     */
    public void setItemFrame(EntityItemFrame frame)
    {
        itemFrame = frame;
    }

    @Nullable

    /**
     * Return the item frame this stack is on. Returns null if not on an item frame.
     */
    public EntityItemFrame getItemFrame()
    {
        return field_190928_g ? null : itemFrame;
    }

    /**
     * Get this stack's repair cost, or 0 if no repair cost is defined.
     */
    public int getRepairCost()
    {
        return hasTagCompound() && stackTagCompound.hasKey("RepairCost", 3) ? stackTagCompound.getInteger("RepairCost") : 0;
    }

    /**
     * Set this stack's repair cost.
     */
    public void setRepairCost(int cost)
    {
        if (!hasTagCompound())
        {
            stackTagCompound = new NBTTagCompound();
        }

        stackTagCompound.setInteger("RepairCost", cost);
    }

    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot equipmentSlot)
    {
        Multimap<String, AttributeModifier> multimap;

        if (hasTagCompound() && stackTagCompound.hasKey("AttributeModifiers", 9))
        {
            multimap = HashMultimap.create();
            NBTTagList nbttaglist = stackTagCompound.getTagList("AttributeModifiers", 10);

            for (int i = 0; i < nbttaglist.tagCount(); ++i)
            {
                NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
                AttributeModifier attributemodifier = SharedMonsterAttributes.readAttributeModifierFromNBT(nbttagcompound);

                if (attributemodifier != null && (!nbttagcompound.hasKey("Slot", 8) || nbttagcompound.getString("Slot").equals(equipmentSlot.getName())) && attributemodifier.getID().getLeastSignificantBits() != 0L && attributemodifier.getID().getMostSignificantBits() != 0L)
                {
                    multimap.put(nbttagcompound.getString("AttributeName"), attributemodifier);
                }
            }
        }
        else
        {
            multimap = getItem().getItemAttributeModifiers(equipmentSlot);
        }

        return multimap;
    }

    public void addAttributeModifier(String attributeName, AttributeModifier modifier, @Nullable EntityEquipmentSlot equipmentSlot)
    {
        if (stackTagCompound == null)
        {
            stackTagCompound = new NBTTagCompound();
        }

        if (!stackTagCompound.hasKey("AttributeModifiers", 9))
        {
            stackTagCompound.setTag("AttributeModifiers", new NBTTagList());
        }

        NBTTagList nbttaglist = stackTagCompound.getTagList("AttributeModifiers", 10);
        NBTTagCompound nbttagcompound = SharedMonsterAttributes.writeAttributeModifierToNBT(modifier);
        nbttagcompound.setString("AttributeName", attributeName);

        if (equipmentSlot != null)
        {
            nbttagcompound.setString("Slot", equipmentSlot.getName());
        }

        nbttaglist.appendTag(nbttagcompound);
    }

    /**
     * Get a ChatComponent for this Item's display name that shows this Item on hover
     */
    public Component getTextComponent()
    {
        TextComponent textcomponentstring = new TextComponent(getDisplayName());

        if (hasDisplayName())
        {
            textcomponentstring.getStyle().setItalic(Boolean.valueOf(true));
        }

        Component itextcomponent = (new TextComponent("[")).append(textcomponentstring).append("]");

        if (!field_190928_g)
        {
            NBTTagCompound nbttagcompound = writeToNBT(new NBTTagCompound());
            itextcomponent.getStyle().setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_ITEM, new TextComponent(nbttagcompound.toString())));
            itextcomponent.getStyle().setColor(getRarity().rarityColor);
        }

        return itextcomponent;
    }

    public boolean canDestroy(Block blockIn)
    {
        if (blockIn == canDestroyCacheBlock)
        {
            return canDestroyCacheResult;
        }
        else
        {
            canDestroyCacheBlock = blockIn;

            if (hasTagCompound() && stackTagCompound.hasKey("CanDestroy", 9))
            {
                NBTTagList nbttaglist = stackTagCompound.getTagList("CanDestroy", 8);

                for (int i = 0; i < nbttaglist.tagCount(); ++i)
                {
                    Block block = Block.getBlockFromName(nbttaglist.getStringTagAt(i));

                    if (block == blockIn)
                    {
                        canDestroyCacheResult = true;
                        return true;
                    }
                }
            }

            canDestroyCacheResult = false;
            return false;
        }
    }

    public boolean canPlaceOn(Block blockIn)
    {
        if (blockIn == canPlaceOnCacheBlock)
        {
            return canPlaceOnCacheResult;
        }
        else
        {
            canPlaceOnCacheBlock = blockIn;

            if (hasTagCompound() && stackTagCompound.hasKey("CanPlaceOn", 9))
            {
                NBTTagList nbttaglist = stackTagCompound.getTagList("CanPlaceOn", 8);

                for (int i = 0; i < nbttaglist.tagCount(); ++i)
                {
                    Block block = Block.getBlockFromName(nbttaglist.getStringTagAt(i));

                    if (block == blockIn)
                    {
                        canPlaceOnCacheResult = true;
                        return true;
                    }
                }
            }

            canPlaceOnCacheResult = false;
            return false;
        }
    }

    public int func_190921_D()
    {
        return animationsToGo;
    }

    public void func_190915_d(int p_190915_1_)
    {
        animationsToGo = p_190915_1_;
    }

    public int getCount()
    {
        return field_190928_g ? 0 : stackSize;
    }

    public void func_190920_e(int p_190920_1_)
    {
        stackSize = p_190920_1_;
        func_190923_F();
    }

    public void func_190917_f(int p_190917_1_)
    {
        func_190920_e(stackSize + p_190917_1_);
    }

    public void func_190918_g(int p_190918_1_)
    {
        func_190917_f(-p_190918_1_);
    }

    @Override
    public int getBaritoneHash() {
        return 0;
    }
}
