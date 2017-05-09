package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Evoker;

public class NBTEvokerData extends NBTLivingEntityData {

	public NBTEvokerData(Evoker entity) {
		super(entity);
	}
	
	/**
	 * Number of ticks until a spell can be cast. Set to a positive value when a spell is cast, and decreases by 1 per tick.
	 */
	public int getSpellTicks() {
		return compound.getInt("SpellTicks");
	}

}
