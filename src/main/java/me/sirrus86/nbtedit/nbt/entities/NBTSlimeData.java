package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Slime;

public class NBTSlimeData extends NBTLivingEntityData {

	public NBTSlimeData(Slime entity) {
		super(entity);
	}
	
	/**
	 * The size of the slime. Note that this value is zero-based,
	 * so 0 is the smallest slime, 1 is the next larger, etc. The
	 * sizes that spawn naturally are 0, 1, and 3.
	 */
	public int getSize() {
		return compound.getInt("Size");
	}
	
	/**
	 * 1 or 0 (true/false) - true if slime is touching the ground.
	 */
	public byte getWasOnGround() {
		return compound.getByte("wasOnGround");
	}

}
