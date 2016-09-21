package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.ExperienceOrb;

public class NBTExperienceOrbData extends NBTEntityData {

	public NBTExperienceOrbData(ExperienceOrb entity) {
		super(entity);
	}
	
	/**
	 * The number of ticks the XP orb has been "untouched". After 6000 ticks (5 minutes)
	 * the orb is destroyed. If set to -32768, the Age will not increase, thus the XP
	 * orb will not automatically despawn.
	 */
	public short getAge() {
		return compound.getShort("Age");
	}
	
	/**
	 * The health of XP orbs. XP orbs take damage from fire, lava, falling anvils, and
	 * explosions. The orb is destroyed when its health reaches 0. However, this value
	 * is stored as a byte in saved data, and read as a short but clipped to the range
	 * of a byte. As a result, its range is 0-255, always positive, and values exceeding
	 * 255 will overflow.
	 */
	public byte getHealth() {
		return compound.getByte("Health");
	}
	
	/**
	 * The amount of experience the orb gives when picked up.
	 */
	public short getValue() {
		return compound.getShort("Value");
	}

}
