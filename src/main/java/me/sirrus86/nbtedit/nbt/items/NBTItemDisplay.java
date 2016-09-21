package me.sirrus86.nbtedit.nbt.items;

import java.util.List;

import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTItemDisplay extends NBTData {

	public NBTItemDisplay(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * The color of the leather armor. The tooltip will display "Dyed" if advanced
	 * tooltips are disabled or will otherwise display the hexadecimal color value.
	 * Color codes are calculated from the Red, Green and Blue components using this
	 * formula:<p>Red << 16 + Green << 8 + Blue
	 */
	public int getColor() {
		return compound.getInt("color");
	}
	
	/**
	 * List of strings to display as lore for the item.
	 */
	public List<String> getLore() {
		return compound.getList("Lore", String.class);
	}
	
	/**
	 * The name to display for an item.
	 */
	public String getName() {
		return compound.getString("Name");
	}

}
