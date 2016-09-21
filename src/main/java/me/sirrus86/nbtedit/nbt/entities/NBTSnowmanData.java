package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Snowman;

public class NBTSnowmanData extends NBTLivingEntityData {

	public NBTSnowmanData(Snowman entity) {
		super(entity);
	}
	
	// TODO - Coming in 1.11
//	/**
//	 * 1 or 0 (true/false) - whether it has a pumpkin on its head or not.
//	 */
//	public byte getPumpkin() {
//		return compound.getByte("Pumpkin");
//	}

}
