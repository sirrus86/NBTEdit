package me.sirrus86.nbtedit.nbt.entities.horse;

import org.bukkit.entity.AbstractHorse;

import me.sirrus86.nbtedit.nbt.entities.NBTBreedableData;

public class NBTAbstractHorseData extends NBTBreedableData {

	public NBTAbstractHorseData(AbstractHorse entity) {
		super(entity);
	}
	
	/**
	 * 1 or 0 (true/false) - Unknown. Remains 0 after breeding.
	 * If true, causes it to stay near other horses with this flag set.
	 */
	public byte getBred() {
		return compound.getByte("Bred");
	}
	
	/**
	 * 1 or 0 (true/false) - true if the horse is grazing.
	 */
	public byte getEatingHaystack() {
		return compound.getByte("EatingHaystack");
	}
	
	/**
	 * Contains the UUID of the player that tamed the horse. Has no effect on behavior.
	 */
	public String getOwnerUUID() {
		return compound.getString("OwnerUUID");
	}
	
	/**
	 * 1 or 0 (true/false) - true if the horse is tamed.
	 * (Non players mobs will not be able to ride a tamed horse if it has no saddle)
	 */
	public byte getTame() {
		return compound.getByte("Tame");
	}
	
	/**
	 * Ranges from 0 to 100; increases with feeding. Higher values make a horse easier to tame.
	 */
	public int getTemper() {
		return compound.getInt("Temper");
	}

}
