package net.minecraft.client.model;

public class ModelChest extends ModelBase
{
    /** The chest lid in the chest's model. */
    public ModelRenderer chestLid = (new ModelRenderer(this, 0, 0)).setTextureSize(64, 64);

    /** The model of the bottom of the chest. */
    public ModelRenderer chestBelow;

    /** The chest's knob in the chest model. */
    public ModelRenderer chestKnob;

    public ModelChest()
    {
        chestLid.addBox(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
        chestLid.rotationPointX = 1.0F;
        chestLid.rotationPointY = 7.0F;
        chestLid.rotationPointZ = 15.0F;
        chestKnob = (new ModelRenderer(this, 0, 0)).setTextureSize(64, 64);
        chestKnob.addBox(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
        chestKnob.rotationPointX = 8.0F;
        chestKnob.rotationPointY = 7.0F;
        chestKnob.rotationPointZ = 15.0F;
        chestBelow = (new ModelRenderer(this, 0, 19)).setTextureSize(64, 64);
        chestBelow.addBox(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
        chestBelow.rotationPointX = 1.0F;
        chestBelow.rotationPointY = 6.0F;
        chestBelow.rotationPointZ = 1.0F;
    }

    /**
     * This method renders out all parts of the chest model.
     */
    public void renderAll()
    {
        chestKnob.rotateAngleX = chestLid.rotateAngleX;
        chestLid.render(0.0625F);
        chestKnob.render(0.0625F);
        chestBelow.render(0.0625F);
    }
}
