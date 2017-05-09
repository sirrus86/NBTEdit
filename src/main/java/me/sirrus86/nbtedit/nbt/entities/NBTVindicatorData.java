package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Vindicator;

public class NBTVindicatorData extends NBTLivingEntityData {

	public NBTVindicatorData(Vindicator entity) {
		super(entity);
	}
	
	/**
	 * Optional. 1 or 0 (true/false) - Setting to true will cause the vindicator to exhibit Johnny behavior. Setting to false will prevent the vindicator exhibiting Johnny behavior, even if named Johnny.
	 */
	public byte getJohnny() {
		return compound.getByte("Johnny");
	}

}
