package me.sirrus86.nbtedit.nbt;

import org.bukkit.plugin.java.JavaPlugin;

import me.sirrus86.nbtedit.NBTEdit;
import me.sirrus86.nbtedit.nms.NMSLib;

public abstract class NBTData {

	protected static NBTEdit plugin = JavaPlugin.getPlugin(NBTEdit.class);
	protected static NMSLib nms = plugin.getNMSLib();
	
	protected TagCompound compound;
	
	public NBTData(TagCompound compound) {
		this.compound = compound;
	}
	
	public TagCompound getNBTTagCompound() {
		return compound;
	}
	
}
