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
	 * Height of the head of the shulker.
	 */
	public byte getPeek() {
		return compound.getByte("Peek");
	}

}
