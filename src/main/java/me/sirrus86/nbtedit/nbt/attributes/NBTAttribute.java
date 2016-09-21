package me.sirrus86.nbtedit.nbt.attributes;

import java.util.ArrayList;
import java.util.List;

import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTAttribute extends NBTData {

	public NBTAttribute(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * The base value of this Attribute.
	 */
	public double getBase() {
		return compound.getDouble("Base");
	}
	
	/**
	 * A list of Modifiers acting on this Attribute. Modifiers alter the Base value
	 * in internal calculations, without changing the original copy. Note that a
	 * Modifier will never modify Base to be higher than its maximum or lower than
	 * its minimum for a given Attribute.
	 */
	public List<NBTAttributeModifier> getModifiers() {
		List<NBTAttributeModifier> list = new ArrayList<NBTAttributeModifier>();
		for (TagCompound tag : compound.getList("Modifiers", TagCompound.class)) {
			list.add(new NBTAttributeModifier(tag));
		}
		return list;
	}
	
	/**
	 * The name of this Attribute.
	 */
	public String getName() {
		return compound.getString("Name");
	}
	
}
