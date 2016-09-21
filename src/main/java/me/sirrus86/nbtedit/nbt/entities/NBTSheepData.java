package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Sheep;

public class NBTSheepData extends NBTBreedableData {

	public NBTSheepData(Sheep entity) {
		super(entity);
	}
	
	/**
	 * 0 to 15 - see wool data values for a mapping to colors.
	 */
	public byte getColor() {
		return compound.getByte("Color");
	}
	
	/**
	 * 1 or 0 (true/false) - true if the sheep has been shorn.
	 */
	public byte getSheared() {
		return compound.getByte("Sheared");
	}

}
