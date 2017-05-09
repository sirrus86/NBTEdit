package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Tameable;

public class NBTParrotData extends NBTTameableData {

	// TODO - Make work with Parrot only
	public NBTParrotData(Tameable entity) {
		super(entity);
	}
	
	/**
	 * Specifies which color variant the parrot is. 0 = red, 1 = blue, 2 = green, 3 = cyan, 4 = silver.
	 */
	public int getVariant() {
		return compound.getInt("Variant");
	}

}
