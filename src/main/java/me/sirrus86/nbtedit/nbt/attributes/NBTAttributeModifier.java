package me.sirrus86.nbtedit.nbt.attributes;

import java.util.UUID;

import org.bukkit.attribute.AttributeModifier;

import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTAttributeModifier extends NBTData {

	public NBTAttributeModifier(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * The amount by which this Modifier modifies the Base value in calculations.
	 */
	public double getAmount() {
		return compound.getDouble("Amount");
	}
	
	/**
	 * TODO
	 */
	public AttributeModifier getAttributeModifier() {
		return new AttributeModifier(new UUID(getUUIDMost(),getUUIDLeast()), getName(), getAmount(),
				getOperation() == 0 ? AttributeModifier.Operation.ADD_NUMBER :
					getOperation() == 1 ? AttributeModifier.Operation.ADD_SCALAR : AttributeModifier.Operation.MULTIPLY_SCALAR_1);
	}
	
	/**
	 * The Modifier's name.
	 */
	public String getName() {
		return compound.getString("Name");
	}
	
	/**
	 * 0, 1, or 2. Defines the operation this Modifier executes on the Attribute's Base value.
	 * 0: Increment X by Amount, 1: Increment Y by X * Amount, 2: Y = Y * (1 + Amount)
	 * (equivalent to Increment Y by Y * Amount). The game first sets X = Base, then executes
	 * all Operation 0 modifiers, then sets Y = X, then executes all Operation 1 modifiers,
	 * and finally executes all Operation 2 modifiers.
	 */
	public int getOperation() {
		return compound.getInt("Operation");
	}
	
	/**
	 * The least significant bits of this Modifier's Universally Unique IDentifier.
	 */
	public long getUUIDLeast() {
		return compound.getLong("UUIDLeast");
	}
	
	/**
	 * The most significant bits of this Modifier's Universally Unique IDentifier.
	 * Used to reference modifiers in memory and ensure duplicates are not applied.
	 */
	public long getUUIDMost() {
		return compound.getLong("UUIDMost");
	}
	
}
