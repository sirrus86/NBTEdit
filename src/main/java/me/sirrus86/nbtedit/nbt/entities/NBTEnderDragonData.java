package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.EnderDragon;

public class NBTEnderDragonData extends NBTLivingEntityData {

	public NBTEnderDragonData(EnderDragon entity) {
		super(entity);
	}
	
	/**
	 * A number indicating the dragon's current state. Valid values are:
	 * 0=circling, 1=strafing (preparing to shoot a fireball), 2=flying
	 * to the portal to land (part of transition to landed state), 3=landing
	 * on the portal (part of transition to landed state), 4=taking off from
	 * the portal (part of transition out of landed state), 5=landed, performing
	 * breath attack, 6=landed, looking for a player for breath attack, 7=landed,
	 * roar before beginning breath attack, 8=charging player, 9=flying to portal
	 * to die, 10=hovering with no AI (default when using the /summon command).
	 */
	public int getDragonPhase() {
		return compound.getInt("DragonPhase");
	}

}
