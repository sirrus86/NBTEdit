package me.sirrus86.nbtedit;

import org.bukkit.plugin.java.JavaPlugin;

import me.sirrus86.nbtedit.nms.NMSLib;

public class NBTEdit extends JavaPlugin {

	private NMSLib nms;
	
	@Override
	public void onEnable() {
		nms = null; //TODO
	}
	
	public NMSLib getNMSLib() {
		return nms;
	}
	
}
