package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.FallingBlock;

import me.sirrus86.nbtedit.nbt.blocks.NBTBlockEntityData;

public class NBTFallingBlockData extends NBTEntityData {

	public NBTFallingBlockData(FallingBlock entity) {
		super(entity);
	}
	
	/**
	 * The Block ID using the alphabetical ID format: minecraft:stone. Only in and after 1.8.
	 */
	public String getBlock() {
		return compound.getString("Block");
	}
	
	/**
	 * The data value for the block.
	 */
	public byte getData() {
		return compound.getByte("Data");
	}
	
	/**
	 * 1 or 0 (true/false) - true if the block should drop as an item when it breaks.
	 * Any block that doesn't have an item form with the same ID as the block won't
	 * drop even if this is set.
	 */
	public byte getDropItem() {
		return compound.getByte("DropItem");
	}
	
	/**
	 * Multiplied by the FallDistance to calculate the amount of damage to inflict.
	 * For vanilla FallingBlock, always 2.
	 */
	public float getFallHurtAmount() {
		return compound.getFloat("FallHurtAmount");
	}
	
	/**
	 * The maximum number of hitpoints of damage to inflict on entities that intersect this FallingBlock.
	 * For vanilla FallingBlock, always 40.
	 */
	public int getFallHurtMax() {
		return compound.getInt("FallHurtMax");
	}
	
	/**
	 * 1 or 0 (true/false) - true if the block should hurt entities it falls on.
	 */
	public byte getHurtEntities() {
		return compound.getByte("HurtEntities");
	}
	
	/**
	 * The Block ID. Not limited to only sand, gravel, dragon eggs, or anvils. Although
	 * deprecated, this value is always present.
	 * @deprecated
	 */
	public byte getTile() {
		return compound.getByte("Tile");
	}
	
	/**
	 * Optional. The tags of the block entity for this block.
	 */
	public NBTBlockEntityData getTileEntityData() {
		return new NBTBlockEntityData(compound.getCompound("TileEntityData"));
	}
	
	/**
	 * The Block ID, but now supporting the 1-4095 range.
	 * @deprecated Removed in 1.8
	 */
	public int getTileID() {
		return compound.getInt("TileId");
	}
	
	/**
	 * The number of ticks the entity has existed. If set to 0, the moment it ticks to 1,
	 * it will vanish if the block at its location has a different ID than the entity's
	 * TileID. If the block at its location has the same ID as its TileID when Time ticks
	 * from 0 to 1, the block will instead be deleted, and the entity will continue to fall,
	 * having overwritten it. When Time goes above 600, or above 100 while the block is below
	 * Y=0, the entity is deleted.
	 */
	public int getTime() {
		return compound.getInt("Time");
	}

}
