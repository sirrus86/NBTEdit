package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Item;

import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTDroppedItemData extends NBTEntityData {

	public NBTDroppedItemData(Item entity) {
		super(entity);
	}
	
	/**
	 * The number of ticks the item has been "untouched". After 6000 ticks (5 minutes)
	 * the item is destroyed. If set to -32768, the Age will not increase, thus the item
	 * will not automatically despawn.
	 */
	public short getAge() {
		return compound.getShort("Age");
	}
	
	/**
	 * The health of the item, which starts at 5. Items take damage from fire, lava,
	 * falling anvils, and explosions. The item is destroyed when its health reaches 0.
	 */
	public short getHealth() {
		return compound.getShort("Health");
	}
	
	/**
	 * The inventory item, without the Slot tag.
	 */
	public NBTItem getItem() {
		return new NBTItem(compound.getCompound("Item"));
	}
	
	/**
	 * If not an empty string, only the named player will be able to pick up this item, until
	 * it is within 10 seconds of despawning. Used by the give command (and can be set in a
	 * summon command) to prevent the wrong player from picking up the spawned item entity.
	 */
	public String getOwner() {
		return compound.getString("Owner");
	}
	
	/**
	 * The number of ticks the item cannot be picked up. Decreases by 1 per tick. If set to
	 * 32767, the PickupDelay will not decrease, thus the item can never be picked up.
	 */
	public short getPickupDelay() {
		return compound.getShort("PickupDelay");
	}
	
	/**
	 * Set to the name of the player who dropped the item, if dropped by a player. Used by
	 * the "Diamonds to you!" achievement.
	 */
	public String getThrower() {
		return compound.getString("Thrower");
	}

}
