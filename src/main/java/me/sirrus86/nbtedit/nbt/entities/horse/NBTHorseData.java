package me.sirrus86.nbtedit.nbt.entities.horse;

import org.bukkit.entity.Horse;

import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTHorseData extends NBTAbstractHorseData {

	public NBTHorseData(Horse entity) {
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
	 * The variant of the horse. Determines colors. Stored as baseColor | markings << 8.
	 * Unused values lead to invisible horses.
	 */
	public int getVariant() {
		return compound.getInt("Variant");
	}
	
}
