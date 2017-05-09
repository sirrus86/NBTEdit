package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Zombie;

public class NBTZombieData extends NBTLivingEntityData {

	public NBTZombieData(Zombie entity) {
		super(entity);
	}
	
	/**
	 * 1 or 0 (true/false) - true if the zombie can break doors (default value is 0).
	 */
	public byte getCanBreakDoors() {
		return compound.getByte("CanBreakDoors");
	}
	
	/**
	 * 1 or 0 (true/false) - true if this zombie is a baby. May be absent.
	 */
	public byte getIsBaby() {
		return compound.getByte("IsBaby");
	}

}
