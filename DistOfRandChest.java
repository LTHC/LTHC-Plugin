package fr.lthc.plugintest.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.lthc.plugintest.PluginTestMain;

public class DistOfRandChest implements CommandExecutor {

	public DistOfRandChest(PluginTestMain pluginTestMain) {
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("dist"))
		{
			if(sender instanceof Player)
			{
				Player p = (Player) sender;
				if(RandChestSummon.isChest = true)
				{
					int xP = (int) p.getLocation().getX();
					int zP = (int) p.getLocation().getZ();
					int distXOfC = (int) Math.round(Math.abs(RandChestSummon.xC - xP));
					int distYOfC = (int) Math.round(Math.abs(RandChestSummon.zC - zP));
					p.sendMessage("[PluginTest:Plugin:Dist] Vous etes a une distance x: " + distXOfC + "; y: " + distYOfC + " du dernier rand chest summon");
					return true;
				}
				p.sendMessage("[PluginTest:Plugin:Dist] Aucun randchest n'a ete summon depuis le serveur");
				return true;
			}
			System.out.println("[PluginTest:Plugin:ErrorOfSender] Le 'sender' de cette commande n'est pas l'instance d'un joueur");
			return true;
		}
		
		return false;
	}

}
