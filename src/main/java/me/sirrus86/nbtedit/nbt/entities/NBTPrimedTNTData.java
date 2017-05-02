package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.TNTPrimed;

public class NBTPrimedTNTData extends NBTEntityData {

	public NBTPrimedTNTData(TNTPrimed entity) {
		super(entity);
	}
	
	/**
	 * Ticks until explosion. Default is 0. If activated from a TNT block, fuse value will be 80 (4 seconds).
	 */
	public short getFuse() {
		return compound.getShort("Fuse");
	}

}
