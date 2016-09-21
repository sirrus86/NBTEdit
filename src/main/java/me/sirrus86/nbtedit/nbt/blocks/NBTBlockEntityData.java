package me.sirrus86.nbtedit.nbt.blocks;

import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTBlockEntityData extends NBTData {

	public NBTBlockEntityData(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * Tile entity ID
	 */
	public String getID() {
		return compound.getString("id");
	}
	
	/**
	 * X coordinate of the tile entity.
	 */
	public int getX() {
		return compound.getInt("x");
	}

	/**
	 * Y coordinate of the tile entity.
	 */
	public int getY() {
		return compound.getInt("y");
	}

	/**
	 * Z coordinate of the tile entity.
	 */
	public int getZ() {
		return compound.getInt("z");
	}

}
