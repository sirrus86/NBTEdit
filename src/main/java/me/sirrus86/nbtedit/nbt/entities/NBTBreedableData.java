package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Ageable;

public class NBTBreedableData extends NBTLivingEntityData {

	public NBTBreedableData(Ageable entity) {
		super(entity);
	}
	
	/**
	 * Represents the age of the mob in ticks; when negative, the mob is
	 * a baby. When 0 or above, the mob is an adult. When above 0, represents
	 * the number of ticks before this mob can breed again.
	 */
	public int getAge() {
		return compound.getInt("Age");
	}
	
	/**
	 * A value of age which will be assigned to this mob when it grows up.
	 * Incremented when a baby mob is fed.
	 */
	public int getForcedAge() {
		return compound.getInt("ForcedAge");
	}
	
	/**
	 * Number of ticks until the mob loses its breeding hearts and stops
	 * searching for a mate. 0 when not searching for a mate.
	 */
	public int getInLove() {
		return compound.getInt("InLove");
	}

}
