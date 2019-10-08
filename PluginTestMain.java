package fr.lthc.plugintest;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import fr.lthc.plugintest.commands.DistOfRandChest;
import fr.lthc.plugintest.commands.RandChestSummon;

public class PluginTestMain extends JavaPlugin {
	
	private static Logger log = Bukkit.getLogger();
	private static String logName = Bukkit.getLogger().getName();
	private static String bukkitIP = Bukkit.getIp();
	private static String logDataName = "";
	private static Logger logParent = Bukkit.getLogger().getParent();
	
	@Override
	public void onEnable() {
		log.setParent(logParent);
		logDataName = logName + " " + bukkitIP + "Spigot Plugin -PluginTest- by -LTHC-";
		System.out.println("[PluginTest:LTHC] " + logDataName + "\n          Le Plugin -PluginTest- de l'auteur -LTHC- a ete demarre");
		getCommand("randchest").setExecutor(new RandChestSummon(this));
		getCommand("dist").setExecutor(new DistOfRandChest(this));
		System.out.println("[PluginTest:Plugin] Le Plugin -PluginTest- de l'auteur -LTHC- est allume\n Le plugin vous dit 'bonne utilisation'");
	}
	

	@Override
	public void onDisable() {
		log.setParent(logParent);
		logDataName = logName + " " + bukkitIP + "Spigot Plugin -PluginTest- by -LTHC-";
		System.out.println("[PluginTest:Plugin] " + logDataName +"\n          Au revoir\n    Signe: -PluginTest- de -LTHC-");
	}
	
}
