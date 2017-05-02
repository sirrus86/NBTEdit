package me.sirrus86.nbtedit.nbt.entities.minecart;

import org.bukkit.entity.minecart.PoweredMinecart;

public class NBTMinecartFurnaceData extends NBTMinecartData {

	public NBTMinecartFurnaceData(PoweredMinecart entity) {
		super(entity);
	}
	
	/**
	 * The number of ticks until the minecart runs out of fuel.
	 */
	public short getFuel() {
		return compound.getShort("Fuel");
	}
	
	/**
	 *  Force along X axis, used for smooth acceleration/deceleration.
	 */
	public double getPushX() {
		return compound.getDouble("PushX");
	}
	
	/**
	 * Force along Z axis, used for smooth acceleration/deceleration.
	 */
	public double getPushZ() {
		return compound.getDouble("PushZ");
	}

}
