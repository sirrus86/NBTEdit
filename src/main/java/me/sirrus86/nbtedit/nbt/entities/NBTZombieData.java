package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Zombie;

public class NBTZombieData extends NBTLivingEntityData {

	public NBTZombieData(Zombie entity) {
		super(entity);
	}
	
	/**
	 * 1 or 0 (true/false) - true if the zombie can break doors (default value is 0).
	 */
	public byte getCanBreakDoors() {
		return compound.getByte("CanBreakDoors");
	}
	
	// TODO - Only applies to zombie villagers in 1.11
	/**
	 * -1 when not being converted back to a villager, positive for the number
	 * of ticks until conversion back into a villager. The regeneration effect will parallel this.
	 */
	public int getConversionTime() {
		return compound.getInt("ConversionTime");
	}
	
	/**
	 * 1 or 0 (true/false) - true if this zombie is a baby. May be absent.
	 */
	public byte getIsBaby() {
		return compound.getByte("IsBaby");
	}
	
	// TODO - Only applies to zombie villagers in 1.11
//	/**
//	 * 0: farmer, 1: librarian, 2: priest, 3: blacksmith, 4: butcher, 5: nitwit (default value is 0).
//	 */
//	public int getProfession() {
//		return compound.getInt("Profession");
//	}
	
	/**
	 * 0: original zombie, 1: zombie farmer villager, 2: zombie librarian villager, 3: zombie priest villager,
	 * 4: zombie blacksmith villager, 5: zombie butcher villager, 6: husk (default value is 0).
	 * @deprecated Being removed in 1.11
	 */
	public int getZombieType() {
		return compound.getInt("ZombieType");
	}

}
