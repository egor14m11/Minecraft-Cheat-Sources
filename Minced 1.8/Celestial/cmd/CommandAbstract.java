package Celestial.cmd;


import Celestial.utils.Helper;
import Celestial.utils.other.ChatUtils;


public abstract class CommandAbstract implements Command, Helper {


    private final String name;
    private final String description;
    private final String usage;
    private final String[] aliases;

    public CommandAbstract(String name, String description, String usage, String ... aliases) {
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        this.usage = usage;
    }

    public void usage() {
        ChatUtils.addChatMessage("§cInvalid usage, try: " + this.usage + " or .help");
    }

    public String getUsage() {
        return this.usage;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String[] getAliases() {
        return this.aliases;
    }
}

