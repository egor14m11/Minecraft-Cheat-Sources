package optifine;

import java.util.IdentityHashMap;
import java.util.Map;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.MathHelper;

public class NaturalProperties
{
    public int rotation = 1;
    public boolean flip;
    private Map[] quadMaps = new Map[8];

    public NaturalProperties(String p_i68_1_)
    {
        if (p_i68_1_.equals("4"))
        {
            rotation = 4;
        }
        else if (p_i68_1_.equals("2"))
        {
            rotation = 2;
        }
        else if (p_i68_1_.equals("F"))
        {
            flip = true;
        }
        else if (p_i68_1_.equals("4F"))
        {
            rotation = 4;
            flip = true;
        }
        else if (p_i68_1_.equals("2F"))
        {
            rotation = 2;
            flip = true;
        }
        else
        {
            Config.warn("NaturalTextures: Unknown type: " + p_i68_1_);
        }
    }

    public boolean isValid()
    {
        if (rotation != 2 && rotation != 4)
        {
            return flip;
        }
        else
        {
            return true;
        }
    }

    public synchronized BakedQuad getQuad(BakedQuad p_getQuad_1_, int p_getQuad_2_, boolean p_getQuad_3_)
    {
        int i = p_getQuad_2_;

        if (p_getQuad_3_)
        {
            i = p_getQuad_2_ | 4;
        }

        if (i > 0 && i < quadMaps.length)
        {
            Map map = quadMaps[i];

            if (map == null)
            {
                map = new IdentityHashMap(1);
                quadMaps[i] = map;
            }

            BakedQuad bakedquad = (BakedQuad)map.get(p_getQuad_1_);

            if (bakedquad == null)
            {
                bakedquad = makeQuad(p_getQuad_1_, p_getQuad_2_, p_getQuad_3_);
                map.put(p_getQuad_1_, bakedquad);
            }

            return bakedquad;
        }
        else
        {
            return p_getQuad_1_;
        }
    }

    private BakedQuad makeQuad(BakedQuad p_makeQuad_1_, int p_makeQuad_2_, boolean p_makeQuad_3_)
    {
        int[] aint = p_makeQuad_1_.getVertexData();
        int i = p_makeQuad_1_.getTintIndex();
        EnumFacing enumfacing = p_makeQuad_1_.getFace();
        TextureAtlasSprite textureatlassprite = p_makeQuad_1_.getSprite();

        if (!isFullSprite(p_makeQuad_1_))
        {
            p_makeQuad_2_ = 0;
        }

        aint = transformVertexData(aint, p_makeQuad_2_, p_makeQuad_3_);
        BakedQuad bakedquad = new BakedQuad(aint, i, enumfacing, textureatlassprite);
        return bakedquad;
    }

    private int[] transformVertexData(int[] p_transformVertexData_1_, int p_transformVertexData_2_, boolean p_transformVertexData_3_)
    {
        int[] aint = p_transformVertexData_1_.clone();
        int i = 4 - p_transformVertexData_2_;

        if (p_transformVertexData_3_)
        {
            i += 3;
        }

        i = i % 4;
        int j = aint.length / 4;

        for (int k = 0; k < 4; ++k)
        {
            int l = k * j;
            int i1 = i * j;
            aint[i1 + 4] = p_transformVertexData_1_[l + 4];
            aint[i1 + 4 + 1] = p_transformVertexData_1_[l + 4 + 1];

            if (p_transformVertexData_3_)
            {
                --i;

                if (i < 0)
                {
                    i = 3;
                }
            }
            else
            {
                ++i;

                if (i > 3)
                {
                    i = 0;
                }
            }
        }

        return aint;
    }

    private boolean isFullSprite(BakedQuad p_isFullSprite_1_)
    {
        TextureAtlasSprite textureatlassprite = p_isFullSprite_1_.getSprite();
        float f = textureatlassprite.getMinU();
        float f1 = textureatlassprite.getMaxU();
        float f2 = f1 - f;
        float f3 = f2 / 256.0F;
        float f4 = textureatlassprite.getMinV();
        float f5 = textureatlassprite.getMaxV();
        float f6 = f5 - f4;
        float f7 = f6 / 256.0F;
        int[] aint = p_isFullSprite_1_.getVertexData();
        int i = aint.length / 4;

        for (int j = 0; j < 4; ++j)
        {
            int k = j * i;
            float f8 = Float.intBitsToFloat(aint[k + 4]);
            float f9 = Float.intBitsToFloat(aint[k + 4 + 1]);

            if (!equalsDelta(f8, f, f3) && !equalsDelta(f8, f1, f3))
            {
                return false;
            }

            if (!equalsDelta(f9, f4, f7) && !equalsDelta(f9, f5, f7))
            {
                return false;
            }
        }

        return true;
    }

    private boolean equalsDelta(float p_equalsDelta_1_, float p_equalsDelta_2_, float p_equalsDelta_3_)
    {
        float f = MathHelper.abs(p_equalsDelta_1_ - p_equalsDelta_2_);
        return f < p_equalsDelta_3_;
    }
}
