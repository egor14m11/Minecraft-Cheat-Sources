package ru.wendoxd.command.impl;

import java.io.File;
import java.nio.file.Files;

import com.mojang.realmsclient.gui.ChatFormatting;

import ru.wendoxd.command.Command;
import ru.wendoxd.command.CommandInfo;

@CommandInfo(name = "prefix", desc = "��������� ���������� �������� � �������� ����")
public class PrefixCommand extends Command {
	public static String prefix = ".";

	@Override
	public void execute(String[] args) throws Exception {
		File p = new File("prefix");
		Files.write(p.toPath(), args[1].getBytes());
		prefix = args[1];
		sendMessage(ChatFormatting.WHITE + "������� " + prefix + " ����������");
		new Exception().printStackTrace();
	}

	@Override
	public void error() {
		sendMessage(ChatFormatting.GRAY + "������ � �������������" + ChatFormatting.WHITE + ":");
		sendMessage(ChatFormatting.WHITE + prefix + "prefix " + ChatFormatting.GRAY + "<prefix>");
	}
}
