package me.sirrus86.nbtedit.nbt.attributes;

import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTItemAttributeModifier extends NBTAttributeModifier {

	public NBTItemAttributeModifier(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * The name of the Attribute this Modifier is to act upon.
	 */
	public String getAttributeName() {
		return compound.getString("AttributeModifier");
	}
	
	/**
	 * Slot the item must be in for the modifier to take effect. "mainhand",
	 * "offhand", "feet", "legs", "chest", or "head".
	 */
	public String getSlot() {
		return compound.getString("Slot");
	}

}
