package net.minecraft.client.shader;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.util.JsonException;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.Namespaced;
import org.apache.commons.io.IOUtils;
import org.lwjgl.util.vector.Matrix4f;

public class ShaderGroup
{
    public Framebuffer mainFramebuffer;
    private final IResourceManager resourceManager;
    private final String shaderGroupName;
    private final List<Shader> listShaders = Lists.newArrayList();
    private final Map<String, Framebuffer> mapFramebuffers = Maps.newHashMap();
    private final List<Framebuffer> listFramebuffers = Lists.newArrayList();
    private Matrix4f projectionMatrix;
    private int mainFramebufferWidth;
    private int mainFramebufferHeight;
    private float time;
    private float lastStamp;

    public ShaderGroup(TextureManager p_i1050_1_, IResourceManager resourceManagerIn, Framebuffer mainFramebufferIn, Namespaced p_i1050_4_) throws IOException, JsonSyntaxException
    {
        resourceManager = resourceManagerIn;
        mainFramebuffer = mainFramebufferIn;
        time = 0.0F;
        lastStamp = 0.0F;
        mainFramebufferWidth = mainFramebufferIn.framebufferWidth;
        mainFramebufferHeight = mainFramebufferIn.framebufferHeight;
        shaderGroupName = p_i1050_4_.toString();
        resetProjectionMatrix();
        parseGroup(p_i1050_1_, p_i1050_4_);
    }

    public void parseGroup(TextureManager p_152765_1_, Namespaced p_152765_2_) throws IOException, JsonSyntaxException
    {
        JsonParser jsonparser = new JsonParser();
        IResource iresource = null;

        try
        {
            iresource = resourceManager.getResource(p_152765_2_);
            JsonObject jsonobject = jsonparser.parse(IOUtils.toString(iresource.getInputStream(), StandardCharsets.UTF_8)).getAsJsonObject();

            if (JsonUtils.isJsonArray(jsonobject, "targets"))
            {
                JsonArray jsonarray = jsonobject.getAsJsonArray("targets");
                int i = 0;

                for (JsonElement jsonelement : jsonarray)
                {
                    try
                    {
                        initTarget(jsonelement);
                    }
                    catch (Exception exception1)
                    {
                        JsonException jsonexception1 = JsonException.forException(exception1);
                        jsonexception1.prependJsonKey("targets[" + i + "]");
                        throw jsonexception1;
                    }

                    ++i;
                }
            }

            if (JsonUtils.isJsonArray(jsonobject, "passes"))
            {
                JsonArray jsonarray1 = jsonobject.getAsJsonArray("passes");
                int j = 0;

                for (JsonElement jsonelement1 : jsonarray1)
                {
                    try
                    {
                        parsePass(p_152765_1_, jsonelement1);
                    }
                    catch (Exception exception)
                    {
                        JsonException jsonexception2 = JsonException.forException(exception);
                        jsonexception2.prependJsonKey("passes[" + j + "]");
                        throw jsonexception2;
                    }

                    ++j;
                }
            }
        }
        catch (Exception exception2)
        {
            JsonException jsonexception = JsonException.forException(exception2);
            jsonexception.setFilenameAndFlush(p_152765_2_.getPath());
            throw jsonexception;
        }
        finally
        {
            IOUtils.closeQuietly(iresource);
        }
    }

    public List<Shader> getShaders() {
        return listShaders;
    }

    private void initTarget(JsonElement p_148027_1_) throws JsonException
    {
        if (JsonUtils.isString(p_148027_1_))
        {
            addFramebuffer(p_148027_1_.getAsString(), mainFramebufferWidth, mainFramebufferHeight);
        }
        else
        {
            JsonObject jsonobject = JsonUtils.getJsonObject(p_148027_1_, "target");
            String s = JsonUtils.getString(jsonobject, "name");
            int i = JsonUtils.getInt(jsonobject, "width", mainFramebufferWidth);
            int j = JsonUtils.getInt(jsonobject, "height", mainFramebufferHeight);

            if (mapFramebuffers.containsKey(s))
            {
                throw new JsonException(s + " is already defined");
            }

            addFramebuffer(s, i, j);
        }
    }

    private void parsePass(TextureManager p_152764_1_, JsonElement p_152764_2_) throws IOException
    {
        JsonObject jsonobject = JsonUtils.getJsonObject(p_152764_2_, "pass");
        String s = JsonUtils.getString(jsonobject, "name");
        String s1 = JsonUtils.getString(jsonobject, "intarget");
        String s2 = JsonUtils.getString(jsonobject, "outtarget");
        Framebuffer framebuffer = getFramebuffer(s1);
        Framebuffer framebuffer1 = getFramebuffer(s2);

        if (framebuffer == null)
        {
            throw new JsonException("Input target '" + s1 + "' does not exist");
        }
        else if (framebuffer1 == null)
        {
            throw new JsonException("Output target '" + s2 + "' does not exist");
        }
        else
        {
            Shader shader = addShader(s, framebuffer, framebuffer1);
            JsonArray jsonarray = JsonUtils.getJsonArray(jsonobject, "auxtargets", null);

            if (jsonarray != null)
            {
                int i = 0;

                for (JsonElement jsonelement : jsonarray)
                {
                    try
                    {
                        JsonObject jsonobject1 = JsonUtils.getJsonObject(jsonelement, "auxtarget");
                        String s4 = JsonUtils.getString(jsonobject1, "name");
                        String s3 = JsonUtils.getString(jsonobject1, "id");
                        Framebuffer framebuffer2 = getFramebuffer(s3);

                        if (framebuffer2 == null)
                        {
                            Namespaced resourcelocation = new Namespaced("textures/effect/" + s3 + ".png");
                            IResource iresource = null;

                            try
                            {
                                iresource = resourceManager.getResource(resourcelocation);
                            }
                            catch (FileNotFoundException var29)
                            {
                                throw new JsonException("Render target or texture '" + s3 + "' does not exist");
                            }
                            finally
                            {
                                IOUtils.closeQuietly(iresource);
                            }

                            p_152764_1_.bindTexture(resourcelocation);
                            ITextureObject lvt_20_2_ = p_152764_1_.getTexture(resourcelocation);
                            int lvt_21_1_ = JsonUtils.getInt(jsonobject1, "width");
                            int lvt_22_1_ = JsonUtils.getInt(jsonobject1, "height");
                            boolean lvt_23_1_ = JsonUtils.getBoolean(jsonobject1, "bilinear");

                            if (lvt_23_1_)
                            {
                                GlStateManager.glTexParameteri(3553, 10241, 9729);
                                GlStateManager.glTexParameteri(3553, 10240, 9729);
                            }
                            else
                            {
                                GlStateManager.glTexParameteri(3553, 10241, 9728);
                                GlStateManager.glTexParameteri(3553, 10240, 9728);
                            }

                            shader.addAuxFramebuffer(s4, Integer.valueOf(lvt_20_2_.getGlTextureId()), lvt_21_1_, lvt_22_1_);
                        }
                        else
                        {
                            shader.addAuxFramebuffer(s4, framebuffer2, framebuffer2.framebufferTextureWidth, framebuffer2.framebufferTextureHeight);
                        }
                    }
                    catch (Exception exception1)
                    {
                        JsonException jsonexception = JsonException.forException(exception1);
                        jsonexception.prependJsonKey("auxtargets[" + i + "]");
                        throw jsonexception;
                    }

                    ++i;
                }
            }

            JsonArray jsonarray1 = JsonUtils.getJsonArray(jsonobject, "uniforms", null);

            if (jsonarray1 != null)
            {
                int l = 0;

                for (JsonElement jsonelement1 : jsonarray1)
                {
                    try
                    {
                        initUniform(jsonelement1);
                    }
                    catch (Exception exception)
                    {
                        JsonException jsonexception1 = JsonException.forException(exception);
                        jsonexception1.prependJsonKey("uniforms[" + l + "]");
                        throw jsonexception1;
                    }

                    ++l;
                }
            }
        }
    }

    private void initUniform(JsonElement p_148028_1_) throws JsonException
    {
        JsonObject jsonobject = JsonUtils.getJsonObject(p_148028_1_, "uniform");
        String s = JsonUtils.getString(jsonobject, "name");
        ShaderUniform shaderuniform = listShaders.get(listShaders.size() - 1).getShaderManager().getShaderUniform(s);

        if (shaderuniform == null)
        {
            throw new JsonException("Uniform '" + s + "' does not exist");
        }
        else
        {
            float[] afloat = new float[4];
            int i = 0;

            for (JsonElement jsonelement : JsonUtils.getJsonArray(jsonobject, "values"))
            {
                try
                {
                    afloat[i] = JsonUtils.getFloat(jsonelement, "value");
                }
                catch (Exception exception)
                {
                    JsonException jsonexception = JsonException.forException(exception);
                    jsonexception.prependJsonKey("values[" + i + "]");
                    throw jsonexception;
                }

                ++i;
            }

            switch (i)
            {
                case 0:
                default:
                    break;

                case 1:
                    shaderuniform.set(afloat[0]);
                    break;

                case 2:
                    shaderuniform.set(afloat[0], afloat[1]);
                    break;

                case 3:
                    shaderuniform.set(afloat[0], afloat[1], afloat[2]);
                    break;

                case 4:
                    shaderuniform.set(afloat[0], afloat[1], afloat[2], afloat[3]);
            }
        }
    }

    public Framebuffer getFramebufferRaw(String p_177066_1_)
    {
        return mapFramebuffers.get(p_177066_1_);
    }

    public void addFramebuffer(String p_148020_1_, int p_148020_2_, int p_148020_3_)
    {
        Framebuffer framebuffer = new Framebuffer(p_148020_2_, p_148020_3_, true);
        framebuffer.setFramebufferColor(0.0F, 0.0F, 0.0F, 0.0F);
        mapFramebuffers.put(p_148020_1_, framebuffer);

        if (p_148020_2_ == mainFramebufferWidth && p_148020_3_ == mainFramebufferHeight)
        {
            listFramebuffers.add(framebuffer);
        }
    }

    public void deleteShaderGroup()
    {
        for (Framebuffer framebuffer : mapFramebuffers.values())
        {
            framebuffer.deleteFramebuffer();
        }

        for (Shader shader : listShaders)
        {
            shader.deleteShader();
        }

        listShaders.clear();
    }

    public Shader addShader(String p_148023_1_, Framebuffer p_148023_2_, Framebuffer p_148023_3_) throws IOException
    {
        Shader shader = new Shader(resourceManager, p_148023_1_, p_148023_2_, p_148023_3_);
        listShaders.add(listShaders.size(), shader);
        return shader;
    }

    private void resetProjectionMatrix()
    {
        projectionMatrix = new Matrix4f();
        projectionMatrix.setIdentity();
        projectionMatrix.m00 = 2.0F / (float) mainFramebuffer.framebufferTextureWidth;
        projectionMatrix.m11 = 2.0F / (float)(-mainFramebuffer.framebufferTextureHeight);
        projectionMatrix.m22 = -0.0020001999F;
        projectionMatrix.m33 = 1.0F;
        projectionMatrix.m03 = -1.0F;
        projectionMatrix.m13 = 1.0F;
        projectionMatrix.m23 = -1.0001999F;
    }

    public void createBindFramebuffers(int width, int height)
    {
        mainFramebufferWidth = mainFramebuffer.framebufferTextureWidth;
        mainFramebufferHeight = mainFramebuffer.framebufferTextureHeight;
        resetProjectionMatrix();

        for (Shader shader : listShaders)
        {
            shader.setProjectionMatrix(projectionMatrix);
        }

        for (Framebuffer framebuffer : listFramebuffers)
        {
            framebuffer.createBindFramebuffer(width, height);
        }
    }

    public void loadShaderGroup(float partialTicks)
    {
        if (partialTicks < lastStamp)
        {
            time += 1.0F - lastStamp;
            time += partialTicks;
        }
        else
        {
            time += partialTicks - lastStamp;
        }

        for (lastStamp = partialTicks; time > 20.0F; time -= 20.0F)
        {
        }

        for (Shader shader : listShaders)
        {
            shader.loadShader(time / 20.0F);
        }
    }

    public final String getShaderGroupName()
    {
        return shaderGroupName;
    }

    private Framebuffer getFramebuffer(String p_148017_1_)
    {
        if (p_148017_1_ == null)
        {
            return null;
        }
        else
        {
            return p_148017_1_.equals("minecraft:main") ? mainFramebuffer : mapFramebuffers.get(p_148017_1_);
        }
    }
}
