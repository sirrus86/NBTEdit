package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Rabbit;

public class NBTRabbitData extends NBTBreedableData {

	public NBTRabbitData(Rabbit entity) {
		super(entity);
	}
	
	/**
	 * Set to 40 when a carrot crop is eaten, decreases by 0–2 every tick until it
	 * reaches 0. Has no effect in game.
	 */
	public int getMoreCarrotTicks() {
		return compound.getInt("MoreCarrotTicks");
	}
	
	/**
	 * Determines the skin of the rabbit. Also determines if rabbit should be hostile.
	 * 0 = Brown, 1 = White, 2 = Black, 3 = Black & White, 4 = Gold, 5 = Salt & Pepper,
	 * 99 = Killer Bunny.
	 */
	public int getRabbitType() {
		return compound.getInt("RabbitType");
	}

}
