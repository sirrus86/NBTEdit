package me.sirrus86.nbtedit.nbt;

import me.sirrus86.nbtedit.nbt.entities.NBTEntityData;

public class NBTSpawnPotential extends NBTData {

	public NBTSpawnPotential(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * Overwrites the contents of SpawnData when preparing the next spawn.
	 * Not optional; an empty one will be created if it does not exist.
	 */
	public NBTEntityData getProperties() {
		return new NBTEntityData(compound.getCompound("Properties"));
	}
	
	/**
	 * Overwrites EntityId when preparing the next spawn.
	 */
	public String getType() {
		return compound.getString("Type");
	}
	
	/**
	 * The chance that this spawn will be picked as compared to other spawn weights.
	 * Must be non-negative and at least 1.
	 */
	public int getWeight() {
		return compound.getInt("Weight");
	}

}
