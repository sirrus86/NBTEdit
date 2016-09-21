package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Endermite;

public class NBTEndermiteData extends NBTLivingEntityData {

	public NBTEndermiteData(Endermite entity) {
		super(entity);
	}
	
	/**
	 * How long the endermite has existed in ticks. Disappears when this reaches around 2400.
	 */
	public int getLifetime() {
		return compound.getInt("Lifetime");
	}
	
	/**
	 * Endermen will attack the endermite if this value is 1.
	 */
	public byte getPlayerSpawned() {
		return compound.getByte("PlayerSpawned");
	}

}
