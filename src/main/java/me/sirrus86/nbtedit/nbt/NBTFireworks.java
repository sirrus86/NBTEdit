package me.sirrus86.nbtedit.nbt;

import java.util.ArrayList;
import java.util.List;

public class NBTFireworks extends NBTData {

	public NBTFireworks(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * List of compounds representing each explosion this firework will cause.
	 */
	public List<NBTFireworksExplosion> getExplosions() {
		List<NBTFireworksExplosion> list = new ArrayList<NBTFireworksExplosion>();
		for (TagCompound tag : compound.getList("Explosions", TagCompound.class)) {
			list.add(new NBTFireworksExplosion(tag));
		}
		return list;
	}
	
	/**
	 * Indicates the flight duration of the firework (equals the amount of gunpowder
	 * used in crafting the rocket). While this value can be anything from -128 to 127,
	 * values of -2 and under almost never detonate at all.
	 */
	public byte getFlight() {
		return compound.getByte("Flight");
	}

}
