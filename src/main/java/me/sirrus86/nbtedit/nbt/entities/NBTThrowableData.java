package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Egg;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.entity.ThrownPotion;

public class NBTThrowableData extends NBTProjectileData {

	public NBTThrowableData(Egg entity) {
		super(entity);
	}
	
	public NBTThrowableData(EnderPearl entity) {
		super(entity);
	}
	
	public NBTThrowableData(Snowball entity) {
		super(entity);
	}
	
	public NBTThrowableData(ThrownExpBottle entity) {
		super(entity);
	}
	
	protected NBTThrowableData(ThrownPotion entity) {
		super(entity);
	}
	
	/**
	 * The name of the player this projectile was thrown by.
	 */
	public String getOwnerName() {
		return compound.getString("ownerName");
	}
	
	/**
	 * The "shake" when arrows hit a block.
	 */
	public byte getShake() {
		return compound.getByte("shake");
	}

}
