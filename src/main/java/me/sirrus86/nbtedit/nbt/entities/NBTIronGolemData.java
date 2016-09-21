package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.IronGolem;

public class NBTIronGolemData extends NBTLivingEntityData {

	public NBTIronGolemData(IronGolem entity) {
		super(entity);
	}
	
	/**
	 * 1 or 0 (true/false) - true if this golem was created by a player. If true, the golem will never attack the player.
	 */
	public byte getPlayerCreated() {
		return compound.getByte("PlayerCreated");
	}

}
