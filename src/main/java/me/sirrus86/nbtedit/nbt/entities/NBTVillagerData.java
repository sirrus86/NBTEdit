package me.sirrus86.nbtedit.nbt.entities;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Villager;

import me.sirrus86.nbtedit.nbt.TagCompound;
import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTVillagerData extends NBTBreedableData {

	public NBTVillagerData(Villager entity) {
		super(entity);
	}
	
	/**
	 * The ID of this villager's career. This also influences trading options and the villager's
	 * name in the GUI (if it does not have a CustomName). If 0, the next time offers are refreshed,
	 * the game will assign a new Career and reset CareerLevel to 1.
	 */
	public int getCareer() {
		return compound.getInt("Career");
	}
	
	/**
	 * The current level of this villager's trading options. Influences the trading options generated
	 * by the villager; if it is greater than their career's maximum level, no new offers are generated.
	 * Increments when a trade causes offers to be refreshed. If 0, the next trade to do this will assign
	 * a new Career and set CareerLevel to 1. Set to a high enough level and there will be no new trades
	 * to release (Career must be set to 1 or above).
	 */
	public int getCareerLevel() {
		return compound.getInt("CareerLevel");
	}
	
	/**
	 * Each compound tag in this list is an item in the villager's inventory, up to a maximum of 8 slots.
	 * Items in two or more slots that can be stacked together will automatically be condensed into one slot.
	 * If there are more than 8 slots, the last slot will be removed until the total is 8. If there are 9 slots
	 * but two previous slots can be condensed, the last slot will be present after the two other slots are
	 * combined.
	 */
	public List<NBTItem> getInventory() {
		List<NBTItem> list = new ArrayList<NBTItem>();
		for (TagCompound tag : compound.getList("Inventory", TagCompound.class)) {
			list.add(new NBTItem(tag));
		}
		return list;
	}
	
	/**
	 * Is generated when the trading menu is opened for the first time.
	 */
	public NBTVillagerOffers getOffers() {
		return new NBTVillagerOffers(compound.getCompound("Offers"));
	}
	
	/**
	 * The ID of the texture used for this villager. This also influences trading options.
	 */
	public int getProfession() {
		return compound.getInt("Profession");
	}
	
	/**
	 * Currently unused. Increases by the number of emeralds traded to a villager any time they are traded.
	 */
	public int getRiches() {
		return compound.getInt("Riches");
	}
	
	/**
	 * 1 or 0 (true/false) - true if the villager is willing to mate. Becomes true after certain trades
	 * (those which would cause offers to be refreshed), and false after mating.
	 */
	public byte getWilling() {
		return compound.getByte("Willing");
	}

}
