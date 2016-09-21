package me.sirrus86.nbtedit.nbt.entities;

import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.TagCompound;
import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTVillagerTradeOption extends NBTData {

	public NBTVillagerTradeOption(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * The first 'cost' item, without the Slot tag.
	 */
	public NBTItem getBuy() {
		return new NBTItem(compound.getCompound("buy"));
	}
	
	/**
	 * May not exist. The second 'cost' item, without the Slot tag.
	 */
	public NBTItem getBuyB() {
		return new NBTItem(compound.getCompound("buyB"));
	}
	
	/**
	 * The maximum number of times this trade can be used before it is disabled.
	 * Increases by a random amount from 2 to 12 when offers are refreshed.
	 */
	public int getMaxUses() {
		return compound.getInt("maxUses");
	}
	
	/**
	 * 1 or 0 (true/false) - true if this trade will provide XP orb drops.
	 */
	public byte getRewardExp() {
		return compound.getByte("rewardExp");
	}
	
	/**
	 * The item being sold for each set of cost items, without the Slot tag.
	 */
	public NBTItem getSell() {
		return new NBTItem(compound.getCompound("sell"));
	}
	
	/**
	 * The number of times this trade has been used. The trade becomes disabled
	 * when this is greater or equal to maxUses.
	 */
	public int getUses() {
		return compound.getInt("uses");
	}

}
