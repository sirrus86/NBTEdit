package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Guardian;

public class NBTGuardianData extends NBTLivingEntityData {

	public NBTGuardianData(Guardian entity) {
		super(entity);
	}
	
	/**
	 * 1 or 0 (true/false) - true if the guardian is an elder guardian.
	 * @deprecated Being removed in 1.11
	 */
	public byte getElder() {
		return compound.getByte("Elder");
	}

}
