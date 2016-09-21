package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Enderman;

public class NBTEndermanData extends NBTLivingEntityData {

	public NBTEndermanData(Enderman entity) {
		super(entity);
	}
	
	/**
	 * ID of the block carried by the enderman. When not carrying anything, 0. When loading, may also be a string block name.
	 */
	public short getCarried() {
		return compound.getShort("carried");
	}
	
	/**
	 * Additional data about the block carried by the enderman. 0 when not carrying anything.
	 */
	public short getCarriedData() {
		return compound.getShort("carriedData");
	}

}
