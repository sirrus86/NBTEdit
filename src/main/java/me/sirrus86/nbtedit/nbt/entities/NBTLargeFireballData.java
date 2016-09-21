package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.LargeFireball;

public class NBTLargeFireballData extends NBTFireballData {

	public NBTLargeFireballData(LargeFireball entity) {
		super(entity);
	}
	
	/**
	 * The power and size of the explosion created by the fireball upon impact. Default value 1.
	 */
	public int getExplosionPower() {
		return compound.getInt("ExplosionPower");
	}

}
