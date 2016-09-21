package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Bat;

public class NBTBatData extends NBTLivingEntityData {

	public NBTBatData(Bat entity) {
		super(entity);
	}
	
	/**
	 * 1 when hanging upside-down from a block, 0 when flying.
	 */
	public byte getBatFlags() {
		return compound.getByte("BatFlags");
	}

}
