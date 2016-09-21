package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Boat;

public class NBTBoatData extends NBTEntityData {

	public NBTBoatData(Boat entity) {
		super(entity);
	}
	
	/**
	 * The wood type of the boat. Valid types are oak, spruce, birch, jungle, acacia, dark_oak.
	 */
	public String getType() {
		return compound.getString("Type");
	}

}
