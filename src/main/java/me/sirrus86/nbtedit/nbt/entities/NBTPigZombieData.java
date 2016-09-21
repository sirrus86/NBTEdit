package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.PigZombie;

public class NBTPigZombieData extends NBTZombieData {

	public NBTPigZombieData(PigZombie entity) {
		super(entity);
	}
	
	/**
	 *  Ticks until the zombie pigman becomes neutral. -32,768 to 0 for neutral zombie pigmen;
	 *  1 to 32,767 for angry zombie pigmen. Value depletes by one every tick if value is greater
	 *  than 0. When the value turns from 1 to 0, the zombie pigman does not stop tracking the
	 *  player until the player has exited the zombie pigman's detection radius. When hit by a
	 *  player or when another zombie pigman within 32 blocks is hit by a player, the value is set
	 *  to a random number between 400 and 800.
	 */
	public short getAnger() {
		return compound.getShort("Anger");
	}
	
	/**
	 * The UUID of the last player that attacked the zombie pigman.
	 */
	public String getHurtBy() {
		return compound.getString("HurtBy");
	}

}
