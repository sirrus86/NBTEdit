package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Shulker;

public class NBTShulkerData extends NBTLivingEntityData {

	public NBTShulkerData(Shulker entity) {
		super(entity);
	}
	
	/**
	 * Approximate X coordinate.
	 */
	public int getApproximateX() {
		return compound.getInt("APX");
	}
	
	/**
	 * Approximate Y coordinate.
	 */
	public int getApproximateY() {
		return compound.getInt("APY");
	}
	
	/**
	 * Approximate Z coordinate.
	 */
	public int getApproximateZ() {
		return compound.getInt("APZ");
	}
	
	/**
	 * Direction of the block the shulker is attached to.
	 */
	public byte getAttachFace() {
		return compound.getByte("AttachFace");
	}
	
	/**
	 * Data value of the color of the shulker. Default is 0 (white). Shulkers spawned by eggs or as part of End cities have value 10 (purple).
	 */
	public byte getColor() {
		return compound.getByte("Color");
	}
	
	/**
	 * Height of the head of the shulker.
	 */
	public byte getPeek() {
		return compound.getByte("Peek");
	}

}
