package me.sirrus86.nbtedit.nbt.entities.horse;

import org.bukkit.entity.SkeletonHorse;

import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTSkeletonHorseData extends NBTAbstractHorseData {

	public NBTSkeletonHorseData(SkeletonHorse entity) {
		super(entity);
	}
	
	/**
	 * The armor item worn by this horse. May not exist.
	 */
	public NBTItem getArmorItem() {
		return new NBTItem(compound.getCompound("ArmorItem"));
	}
	
	/**
	 * The saddle item worn by this horse. May not exist.
	 */
	public NBTItem getSaddleItem() {
		return new NBTItem(compound.getCompound("SaddleItem"));
	}
	
	/**
	 * 1 or 0 (true/false) - true if the horse is a trapped skeleton horse. Does not affect horse type.
	 */
	public byte getSkeletonTrap() {
		return compound.getByte("SkeletonTrap");
	}

	/**
	 * Incremented each tick when SkeletonTrap is set to 1. The horse automatically despawns when it reaches 18000 (15 minutes).
	 */
	public int getSkeletonTrapTime() {
		return compound.getInt("SkeletonTrapTime");
	}

}
