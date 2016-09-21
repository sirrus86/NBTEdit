package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Ghast;

public class NBTGhastData extends NBTLivingEntityData {

	public NBTGhastData(Ghast entity) {
		super(entity);
	}
	
	/**
	 * The radius of the explosion created by the fireballs this ghast fires. Default value of 1.
	 */
	public int getExplosionPower() {
		return compound.getInt("ExplosionPower");
	}

}
