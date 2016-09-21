package me.sirrus86.nbtedit.nbt.entities;

import java.util.List;

import org.bukkit.entity.Fireball;

public class NBTFireballData extends NBTProjectileData {

	public NBTFireballData(Fireball entity) {
		super(entity);
	}
	
	/**
	 * List of 3 doubles. Should be identical to Motion.
	 */
	public List<Double> getDirection() {
		return compound.getList("direction", Double.class);
	}
	
	/**
	 * Increments each tick when the projectile is not moving; resets to 0 if it moves.
	 * When it ticks to 600, the projectile despawns.
	 */
	public int getLife() {
		return compound.getInt("life");
	}
	
	/**
	 * List of 3 doubles that acts like direction but without resistance
	 */
	public List<Double> getPower() {
		return compound.getList("power", Double.class);
	}

}
