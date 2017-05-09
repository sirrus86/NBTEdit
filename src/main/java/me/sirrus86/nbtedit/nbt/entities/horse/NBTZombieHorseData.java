package me.sirrus86.nbtedit.nbt.entities.horse;

import org.bukkit.entity.ZombieHorse;

import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTZombieHorseData extends NBTAbstractHorseData {

	public NBTZombieHorseData(ZombieHorse entity) {
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

}
