package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Ageable;
import org.bukkit.entity.Tameable;

public class NBTTameableData extends NBTBreedableData {

	public <E> NBTTameableData(Tameable entity) {
		super((Ageable) entity);
	}
	
	/**
	 * Name of the player that owns this mob. Empty string if no owner.
	 * @deprecated No longer used as of 1.8
	 */
	public String getOwner() {
		return compound.getString("Owner");
	}
	
	/**
	 * UUID of the player that owns this mob. Empty string if no owner.
	 */
	public String getOwnerUUID() {
		return compound.getString("OwnerUUID");
	}
	
	/**
	 * 1 or 0 (true/false) - true if the mob is sitting.
	 */
	public byte getSitting() {
		return compound.getByte("Sitting");
	}

}
