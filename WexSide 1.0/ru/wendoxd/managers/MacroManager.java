package ru.wendoxd.managers;

import net.minecraft.client.Minecraft;
import ru.wendoxd.macro.Macro;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class MacroManager {

    public List<Macro> macros = new ArrayList<>();
    private static final File macroFile = new File(System.getenv("appdata") + "\\.antiautistleak\\game\\macro.wex");

    public List<Macro> getMacros() {
        return macros;
    }

    public void init() throws Exception {
        if (!macroFile.exists()) {
            macroFile.createNewFile();
        } else {
            readMacro();
        }
    }

    public void addMacros(Macro macro) {
        macros.add(macro);
        updateFile();
    }

    public void deleteMacro(int key) {
        macros.removeIf(macro -> macro.getKey() == key);
        updateFile();
    }

    public void onKeyPressed(int key) {
        macros.stream().filter(macro -> macro.getKey() == key).forEach(macro -> Minecraft.getMinecraft().player.sendChatMessage(macro.getMessage()));
    }

    public void updateFile() {
        try {
            StringBuilder builder = new StringBuilder();
            macros.forEach(macro -> builder.append(macro.getMessage()).append(":").append(String.valueOf(macro.getKey()).toUpperCase()).append("\n"));
            Files.write(macroFile.toPath(), builder.toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readMacro() {
        try {
            FileInputStream fileInputStream = new FileInputStream(macroFile.getAbsolutePath());
            BufferedReader reader = new BufferedReader(new InputStreamReader(new DataInputStream(fileInputStream)));
            String line;
            while ((line = reader.readLine()) != null) {
                String curLine = line.trim();
                String command = curLine.split(":")[0];
                String key = curLine.split(":")[1];
                macros.add(new Macro(command, Integer.parseInt(key)));
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}