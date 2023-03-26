import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.io.BufferedReader;
import org.apache.commons.io.IOUtils;
import java.io.FileNotFoundException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.Reader;
import com.google.gson.JsonParser;
import com.google.common.io.Files;
import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import java.io.File;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bmy
{
    private static final Logger a;
    private final Map<String, File> b;
    
    public bmy(final File \u2603, final String \u2603) {
        this.b = (Map<String, File>)Maps.newHashMap();
        if (\u2603 == null) {
            return;
        }
        final File parent = new File(\u2603, "objects");
        final File obj = new File(\u2603, "indexes/" + \u2603 + ".json");
        BufferedReader reader = null;
        try {
            reader = Files.newReader(obj, Charsets.UTF_8);
            final JsonObject asJsonObject = new JsonParser().parse(reader).getAsJsonObject();
            final JsonObject a = ni.a(asJsonObject, "objects", (JsonObject)null);
            if (a != null) {
                for (final Map.Entry<String, JsonElement> entry : a.entrySet()) {
                    final JsonObject \u26032 = entry.getValue();
                    final String s = entry.getKey();
                    final String[] split = s.split("/", 2);
                    final String s2 = (split.length == 1) ? split[0] : (split[0] + ":" + split[1]);
                    final String h = ni.h(\u26032, "hash");
                    final File file = new File(parent, h.substring(0, 2) + "/" + h);
                    this.b.put(s2, file);
                }
            }
        }
        catch (JsonParseException ex) {
            bmy.a.error("Unable to parse resource index file: " + obj);
        }
        catch (FileNotFoundException ex2) {
            bmy.a.error("Can't find the resource index file: " + obj);
        }
        finally {
            IOUtils.closeQuietly(reader);
        }
    }
    
    public Map<String, File> a() {
        return this.b;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
