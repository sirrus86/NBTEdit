package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.SpectralArrow;

public class NBTSpectralArrowData extends NBTArrowData {

	public NBTSpectralArrowData(SpectralArrow entity) {
		super(entity);
	}
	
	/**
	 * The time in ticks that the Glowing effect will last.
	 */
	public int getDuration() {
		return compound.getInt("Duration");
	}

}
