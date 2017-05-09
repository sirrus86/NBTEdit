package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.ZombieVillager;

public class NBTZombieVillagerData extends NBTZombieData {

	public NBTZombieVillagerData(ZombieVillager entity) {
		super(entity);
	}
	
	/**
	 * -1 when not being converted back to a villager, positive for the number
	 * of ticks until conversion back into a villager. The regeneration effect will parallel this.
	 */
	public int getConversionTime() {
		return compound.getInt("ConversionTime");
	}
	
	/**
	 * 0: farmer, 1: librarian, 2: priest, 3: blacksmith, 4: butcher, 5: nitwit (default value is 0).
	 */
	public int getProfession() {
		return compound.getInt("Profession");
	}

}
