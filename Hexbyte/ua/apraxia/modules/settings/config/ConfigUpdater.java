package ua.apraxia.modules.settings.config;

import com.google.gson.JsonObject;

public interface ConfigUpdater {

    JsonObject save();

    void load(JsonObject object);

}