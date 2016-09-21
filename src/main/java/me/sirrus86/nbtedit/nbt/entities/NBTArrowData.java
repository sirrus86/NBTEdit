package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Arrow;

public class NBTArrowData extends NBTProjectileData {

	public NBTArrowData(Arrow entity) {
		super(entity);
	}
	
	/**
	 * Damage dealt by the arrow, in half-hearts. May not be a whole number. 2.0 for normal arrows,
	 * and increased 0.5 per level of Power enchantment on the firing bow. If the Power enchantment
	 * is present, an additional 0.5 is added on (so Power I gives a bonus of 1.0, while Power II gives 1.5).
	 */
	public double getDamage() {
		return compound.getDouble("damage");
	}
	
	/**
	 * Metadata of tile arrow is in.
	 */
	public byte getInData() {
		return compound.getByte("inData");
	}
	
	/**
	 * 1 or 0 (true/false) - If the Projectile is in the ground or hit the ground already
	 * (For arrow pickup; you cannot pickup arrows in the air)
	 */
	public byte getInGround() {
		return compound.getByte("inGround");
	}
	
	/**
	 * Increments each tick when an arrow is not moving; resets to 0 if it moves.
	 * When it ticks to 1200, the arrow despawns.
	 */
	public short getLife() {
		return compound.getShort("life");
	}
	
	/**
	 * 0 = cannot be picked up by players. 1 = can be picked up by players in
	 * survival or creative. 2 = can only be picked up by players in creative.
	 */
	public byte getPickup() {
		return compound.getByte("pickup");
	}
	
	/**
	 * 1 or 0 (true/false) - If pickup is not used, and this is true, the arrow can be picked up by players.
	 */
	public byte getPlayer() {
		return compound.getByte("player");
	}
	
	/**
	 * The "shake" when arrows hit a block.
	 */
	public byte getShake() {
		return compound.getByte("shake");
	}

}
