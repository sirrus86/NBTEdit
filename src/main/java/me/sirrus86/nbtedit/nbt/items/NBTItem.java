package me.sirrus86.nbtedit.nbt.items;

import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTItem extends NBTData {

	public NBTItem(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * Number of items stacked in this inventory slot. Any item can be stacked, including tools,
	 * armor, and vehicles. Range is -128 to 127. Values of 1 are not displayed in-game.
	 * Values below 1 are displayed in red.
	 */
	public byte getCount() {
		return compound.getByte("Count");
	}
	
	/**
	 *  The data value for this item. The name "Damage" comes from when only tools used this value,
	 *  now many other items use this value for other purposes. For blocks, it is the 4-bit "block
	 *  data" tag that determines a variant of the block. Defaults to 0.
	 */
	public short getDamage() {
		return compound.getShort("Damage");
	}
	
	/**
	 * Item/Block ID. If not specified, Minecraft changes the item to stone (setting ID to 1 and
	 * Damage to 0, and ignoring any existing Damage value) when loading the chunk or summoning the item.
	 */
	public String getID() {
		return compound.getString("id");
	}
	
	/**
	 * May not exist. The inventory slot the item is in.
	 */
	public byte getSlot() {
		return compound.getByte("Slot");
	}
	
	/**
	 * Additional information about the item. This tag is optional for most items.
	 */
	public NBTItemTag getTag() {
		return new NBTItemTag(compound.getCompound("tag"));
	}

}
