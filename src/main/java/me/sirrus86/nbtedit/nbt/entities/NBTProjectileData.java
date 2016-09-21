package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Projectile;

public class NBTProjectileData extends NBTEntityData {

	public NBTProjectileData(Projectile entity) {
		super(entity);
	}
	
	/**
	 * ID of tile projectile is in.
	 */
	public String getInTile() {
		return compound.getString("inTile");
	}
	
	/**
	 * X coordinate of the item's position in the chunk.
	 */
	public short getXTile() {
		return compound.getShort("xTile");
	}
	
	/**
	 * Y coordinate of the item's position in the chunk.
	 */
	public short getYTile() {
		return compound.getShort("yTile");
	}
	
	/**
	 * Z coordinate of the item's position in the chunk.
	 */
	public short getZTile() {
		return compound.getShort("zTile");
	}

}
