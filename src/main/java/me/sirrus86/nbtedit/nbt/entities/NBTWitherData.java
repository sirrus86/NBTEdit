package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Wither;

public class NBTWitherData extends NBTLivingEntityData {

	public NBTWitherData(Wither entity) {
		super(entity);
	}
	
	/**
	 * The number of ticks of invulnerability left after being initially created. 0 once invulnerability has expired.
	 */
	public int getInvulnerabilityTicks() {
		return compound.getInt("Invul");
	}

}
