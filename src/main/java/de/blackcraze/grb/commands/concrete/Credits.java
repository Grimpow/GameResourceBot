package de.blackcraze.grb.commands.concrete;

import de.blackcraze.grb.commands.BaseCommand;
import de.blackcraze.grb.core.Speaker;
import de.blackcraze.grb.i18n.Resource;
import net.dv8tion.jda.core.entities.Message;

import java.util.Scanner;

import static de.blackcraze.grb.util.CommandUtils.getResponseLocale;

public class Credits implements BaseCommand {
    public void run(Scanner scanner, Message message) {
        Speaker.say(message.getChannel(), Resource.getString("CDS", getResponseLocale(message)));
    }

    @Override
    public String help() {
        return "The bot is an open source project - this will show the source code location and a invitation link to the dev channel\n" +
                "`bot credits`";
    }
}