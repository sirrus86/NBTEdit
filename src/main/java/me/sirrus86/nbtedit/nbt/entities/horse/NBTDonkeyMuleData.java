package me.sirrus86.nbtedit.nbt.entities.horse;

import org.bukkit.entity.Donkey;
import org.bukkit.entity.Mule;

import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTDonkeyMuleData extends NBTChestedHorseData {

	public NBTDonkeyMuleData(Donkey entity) {
		super(entity);
	}
	
	public NBTDonkeyMuleData(Mule entity) {
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
