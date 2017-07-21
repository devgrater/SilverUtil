package io.github.Alligrater;

import org.bukkit.plugin.java.JavaPlugin;

public class SilverUtil extends JavaPlugin{
	
	@Override
	public void onEnable() {
		this.getCommand("suname").setExecutor(new SetName());
		this.getCommand("sulore").setExecutor(new SetLore());
		this.getCommand("suench").setExecutor(new SetEnchant());
		this.getCommand("bling").setExecutor(new PingCommand());
		this.getCommand("spam").setExecutor(new SpamCommand());
		this.getCommand("mute").setExecutor(new MuteChat());
		this.getCommand("gift").setExecutor(new CommandGift());
		this.getCommand("loca").setExecutor(new CommandLoca());
		this.getCommand("viewonline").setExecutor(new CommandOnline());
		getServer().getPluginManager().registerEvents(new MentionListener(), this);
		getServer().getPluginManager().registerEvents(new ChatBling(), this);
		getServer().getPluginManager().registerEvents(new JoinColor(), this);
		getServer().getPluginManager().registerEvents(new AttackBlood(), this);
		getServer().getPluginManager().registerEvents(new DeathDrop(), this);
	}
	
	
	@Override
	public void onDisable() {
		
	}
}
