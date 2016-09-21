package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Pig;

public class NBTPigData extends NBTBreedableData {

	public NBTPigData(Pig entity) {
		super(entity);
	}
	
	/**
	 * 1 or 0 (true/false) - true if there is a saddle on the pig.
	 */
	public byte getSaddle() {
		return compound.getByte("Saddle");
	}

}
