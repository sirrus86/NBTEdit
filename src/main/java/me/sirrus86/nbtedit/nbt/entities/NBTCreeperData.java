package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Creeper;

public class NBTCreeperData extends NBTLivingEntityData {

	public NBTCreeperData(Creeper entity) {
		super(entity);
	}
	
	/**
	 * The radius of the explosion itself, default 3.
	 */
	public byte getExplosionRadius() {
		return compound.getByte("ExplosionRadius");
	}
	
	/**
	 * States the initial value of the creeper's internal fuse timer (does not affect
	 * creepers that fall and explode upon impacting their victim). The internal fuse
	 * timer will return to this value if the creeper is no longer within attack range. Default 30.
	 */
	public short getFuse() {
		return compound.getShort("Fuse");
	}
	
	/**
	 * 1 or 0 (true/false) - Whether the creeper has been ignited by a Flint and Steel.
	 */
	public byte getIgnited() {
		return compound.getByte("ignited");
	}
	
	/**
	 * 1 or 0 (true/false) - May not exist. True if the creeper is charged from being struck by lightning.
	 */
	public byte getPowered() {
		return compound.getByte("powered");
	}

}
