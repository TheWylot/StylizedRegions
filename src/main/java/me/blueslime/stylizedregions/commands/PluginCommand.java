package me.blueslime.stylizedregions.commands;

import dev.mruniverse.slimelib.commands.command.Command;
import dev.mruniverse.slimelib.commands.command.SlimeCommand;
import dev.mruniverse.slimelib.commands.sender.Sender;
import dev.mruniverse.slimelib.commands.sender.player.SlimePlayer;
import me.blueslime.stylizedregions.region.utils.RegionBuilder;
import org.bukkit.Location;
import org.bukkit.entity.Player;

@Command(
        description = "Main Command of the plugin",
        shortDescription = "Plugin Command",
        usage = "/region (arguments)"
)
public class PluginCommand implements SlimeCommand {
    @Override
    public String getCommand() {
        return "region";
    }

    @Override
    public void execute(Sender sender, String commandLabel, String[] args) {
        if (args.length == 0) {
            sender.sendColoredMessage("&aCreated by JustJustin with &lLove");
            return;
        }
        //TODO: ToDo
    }
}
