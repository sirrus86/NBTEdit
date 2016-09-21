package me.sirrus86.nbtedit.nbt.enchantments;

import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTEnchantment extends NBTData {

	public NBTEnchantment(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * ID of the enchantment.
	 */
	public short getID() {
		return compound.getShort("id");
	}
	
	/**
	 * Level of the enchantment, where 1 is level 1.
	 */
	public short getLevel() {
		return compound.getShort("lvl");
	}

}
