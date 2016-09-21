package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Minecart;

public class NBTMinecartData extends NBTEntityData {

	public NBTMinecartData(Minecart entity) {
		super(entity);
	}
	
	/**
	 * Optional. 1 or 0 (true/false) - whether to display the custom tile in this minecart.
	 */
	public byte getCustomDisplayTile() {
		return compound.getByte("CustomDisplayTile");
	}
	
	/**
	 * Optional. The Data value of the custom block in the minecart.
	 */
	public int getisplayData() {
		return compound.getInt("DisplayData");
	}
	
	/**
	 * Optional. The offset of the block displayed in the Minecart in pixels. Positive values move
	 * the block upwards, while negative values move it downwards. A value of 16 will move the block
	 * up by exactly one multiple of its height.
	 */
	public int getisplayOffset() {
		return compound.getInt("DisplayOffset");
	}
	
	/**
	 * Optional. The ID of the custom block in the minecart.
	 */
	public String getisplayTile() {
		return compound.getString("DisplayTile");
	}

}
