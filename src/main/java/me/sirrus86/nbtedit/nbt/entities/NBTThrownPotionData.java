package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.ThrownPotion;

import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTThrownPotionData extends NBTThrowableData {

	public NBTThrownPotionData(ThrownPotion entity) {
		super(entity);
	}
	
	/**
	 * The item that was thrown. The ThrownPotion entity will render as this stored item, no matter the item.
	 */
	public NBTItem getPotion() {
		return new NBTItem(compound.getCompound("Potion"));
	}
	
	/**
	 * If the Potion tag does not exist, this value is used as the damage value of the thrown potion.
	 * @deprecated
	 */
	public int getPotionValue() {
		return compound.getInt("potionValue");
	}

}
