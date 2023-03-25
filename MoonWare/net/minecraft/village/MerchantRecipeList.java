package net.minecraft.village;

import java.io.IOException;
import java.util.ArrayList;
import javax.annotation.Nullable;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.network.PacketBuffer;

public class MerchantRecipeList extends ArrayList<MerchantRecipe>
{
    public MerchantRecipeList()
    {
    }

    public MerchantRecipeList(NBTTagCompound compound)
    {
        readRecipiesFromTags(compound);
    }

    @Nullable

    /**
     * can par1,par2 be used to in crafting recipe par3
     */
    public MerchantRecipe canRecipeBeUsed(ItemStack p_77203_1_, ItemStack p_77203_2_, int p_77203_3_)
    {
        if (p_77203_3_ > 0 && p_77203_3_ < size())
        {
            MerchantRecipe merchantrecipe1 = get(p_77203_3_);
            return !areItemStacksExactlyEqual(p_77203_1_, merchantrecipe1.getItemToBuy()) || (!p_77203_2_.isEmpty() || merchantrecipe1.hasSecondItemToBuy()) && (!merchantrecipe1.hasSecondItemToBuy() || !areItemStacksExactlyEqual(p_77203_2_, merchantrecipe1.getSecondItemToBuy())) || p_77203_1_.getCount() < merchantrecipe1.getItemToBuy().getCount() || merchantrecipe1.hasSecondItemToBuy() && p_77203_2_.getCount() < merchantrecipe1.getSecondItemToBuy().getCount() ? null : merchantrecipe1;
        }
        else
        {
            for (int i = 0; i < size(); ++i)
            {
                MerchantRecipe merchantrecipe = get(i);

                if (areItemStacksExactlyEqual(p_77203_1_, merchantrecipe.getItemToBuy()) && p_77203_1_.getCount() >= merchantrecipe.getItemToBuy().getCount() && (!merchantrecipe.hasSecondItemToBuy() && p_77203_2_.isEmpty() || merchantrecipe.hasSecondItemToBuy() && areItemStacksExactlyEqual(p_77203_2_, merchantrecipe.getSecondItemToBuy()) && p_77203_2_.getCount() >= merchantrecipe.getSecondItemToBuy().getCount()))
                {
                    return merchantrecipe;
                }
            }

            return null;
        }
    }

    private boolean areItemStacksExactlyEqual(ItemStack stack1, ItemStack stack2)
    {
        return ItemStack.areItemsEqual(stack1, stack2) && (!stack2.hasTagCompound() || stack1.hasTagCompound() && NBTUtil.areNBTEquals(stack2.getTagCompound(), stack1.getTagCompound(), false));
    }

    public void writeToBuf(PacketBuffer buffer)
    {
        buffer.writeByte((byte)(size() & 255));

        for (int i = 0; i < size(); ++i)
        {
            MerchantRecipe merchantrecipe = get(i);
            buffer.writeItemStackToBuffer(merchantrecipe.getItemToBuy());
            buffer.writeItemStackToBuffer(merchantrecipe.getItemToSell());
            ItemStack itemstack = merchantrecipe.getSecondItemToBuy();
            buffer.writeBoolean(!itemstack.isEmpty());

            if (!itemstack.isEmpty())
            {
                buffer.writeItemStackToBuffer(itemstack);
            }

            buffer.writeBoolean(merchantrecipe.isRecipeDisabled());
            buffer.writeInt(merchantrecipe.getToolUses());
            buffer.writeInt(merchantrecipe.getMaxTradeUses());
        }
    }

    public static MerchantRecipeList readFromBuf(PacketBuffer buffer) throws IOException
    {
        MerchantRecipeList merchantrecipelist = new MerchantRecipeList();
        int i = buffer.readByte() & 255;

        for (int j = 0; j < i; ++j)
        {
            ItemStack itemstack = buffer.readItemStackFromBuffer();
            ItemStack itemstack1 = buffer.readItemStackFromBuffer();
            ItemStack itemstack2 = ItemStack.EMPTY;

            if (buffer.readBoolean())
            {
                itemstack2 = buffer.readItemStackFromBuffer();
            }

            boolean flag = buffer.readBoolean();
            int k = buffer.readInt();
            int l = buffer.readInt();
            MerchantRecipe merchantrecipe = new MerchantRecipe(itemstack, itemstack2, itemstack1, k, l);

            if (flag)
            {
                merchantrecipe.compensateToolUses();
            }

            merchantrecipelist.add(merchantrecipe);
        }

        return merchantrecipelist;
    }

    public void readRecipiesFromTags(NBTTagCompound compound)
    {
        NBTTagList nbttaglist = compound.getTagList("Recipes", 10);

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
            add(new MerchantRecipe(nbttagcompound));
        }
    }

    public NBTTagCompound getRecipiesAsTags()
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < size(); ++i)
        {
            MerchantRecipe merchantrecipe = get(i);
            nbttaglist.appendTag(merchantrecipe.writeToTags());
        }

        nbttagcompound.setTag("Recipes", nbttaglist);
        return nbttagcompound;
    }
}
