package me.sirrus86.nbtedit.nbt.items;

import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTMapDecoration extends NBTData {

	public NBTMapDecoration(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * Identifier of the symbols
	 */
	public String getID() {
		return compound.getString("id");
	}
	
	/**
	 * Rotation of the symbol, value from 0.0 to 360.0. The value 0 rotates the symbol
	 * to the bottom end of the map. The symbol is rotated clock-wise.
	 */
	public double getRotation() {
		return compound.getDouble("rot");
	}
	
	/**
	 * Type of the symbol
	 */
	public byte getType() {
		return compound.getByte("type");
	}
	
	/**
	 * X position
	 */
	public double getX() {
		return compound.getDouble("x");
	}
	
	/**
	 * Z position
	 */
	public double getZ() {
		return compound.getDouble("z");
	}

}
