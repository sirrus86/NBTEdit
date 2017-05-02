package me.sirrus86.nbtedit.nbt.entities.minecart;

import org.bukkit.entity.minecart.ExplosiveMinecart;

public class NBTMinecartTNTData extends NBTMinecartData {

	public NBTMinecartTNTData(ExplosiveMinecart entity) {
		super(entity);
	}
	
	/**
	 * Time until explosion or -1 if deactivated.
	 */
	public int getTNTFuse() {
		return compound.getInt("TNTFuse");
	}

}
