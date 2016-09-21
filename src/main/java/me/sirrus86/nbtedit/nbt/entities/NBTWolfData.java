package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Wolf;

public class NBTWolfData extends NBTTameableData {

	public NBTWolfData(Wolf entity) {
		super(entity);
	}
	
	/**
	 * 1 or 0 (true/false) - true if the wolf is angry.
	 */
	public byte getAngry() {
		return compound.getByte("Angry");
	}
	
	/**
	 * The dye color of this wolf's collar. Present even for wild wolves
	 * (but does not render); default value is 14.
	 */
	public byte getCollarColor() {
		return compound.getByte("CollarColor");
	}

}
