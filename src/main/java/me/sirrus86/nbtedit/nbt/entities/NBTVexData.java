package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Vex;

public class NBTVexData extends NBTLivingEntityData {

	public NBTVexData(Vex entity) {
		super(entity);
	}
	
	/**
	 * When a vex is idle, it wanders, selecting air blocks from within a 15×11×15 cuboid range centered at X,Y,Z = BoundX, BoundY, BoundZ. This central spot is the location of the evoker when it summoned the vex, or if an evoker was not involved, it is the location the vex first attempted to idly wander.
	 */
	public int getBoundX() {
		return compound.getInt("BoundX");
	}
	
	/**
	 * When a vex is idle, it wanders, selecting air blocks from within a 15×11×15 cuboid range centered at X,Y,Z = BoundX, BoundY, BoundZ. This central spot is the location of the evoker when it summoned the vex, or if an evoker was not involved, it is the location the vex first attempted to idly wander.
	 */
	public int getBoundY() {
		return compound.getInt("BoundY");
	}
	
	/**
	 * When a vex is idle, it wanders, selecting air blocks from within a 15×11×15 cuboid range centered at X,Y,Z = BoundX, BoundY, BoundZ. This central spot is the location of the evoker when it summoned the vex, or if an evoker was not involved, it is the location the vex first attempted to idly wander.
	 */
	public int getBoundZ() {
		return compound.getInt("BoundZ");
	}
	
	/**
	 * Ticks of life remaining, decreasing by 1 per tick. When it reaches zero, the vex will take damage and LifeTicks is set to 20.
	 */
	public int getLifeTicks() {
		return compound.getInt("LifeTicks");
	}

}
