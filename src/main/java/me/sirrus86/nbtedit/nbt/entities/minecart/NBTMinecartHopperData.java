package me.sirrus86.nbtedit.nbt.entities.minecart;

import org.bukkit.entity.minecart.HopperMinecart;

public class NBTMinecartHopperData extends NBTMinecartChestData {

	public NBTMinecartHopperData(HopperMinecart entity) {
		super(entity);
	}
	
	/**
	 * Determines whether or not the minecart hopper will pick up items into its inventory.
	 */
	public byte getEnabled() {
		return compound.getByte("Enabled");
	}
	
	/**
	 * Time until the next transfer in game ticks, between 1 and 8, or 0 if there is no transfer.
	 */
	public int getTransferCooldown() {
		return compound.getInt("TransferCooldown");
	}

}
