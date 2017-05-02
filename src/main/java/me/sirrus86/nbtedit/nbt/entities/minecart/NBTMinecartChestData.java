package me.sirrus86.nbtedit.nbt.entities.minecart;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.minecart.HopperMinecart;
import org.bukkit.entity.minecart.StorageMinecart;

import me.sirrus86.nbtedit.nbt.TagCompound;
import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTMinecartChestData extends NBTMinecartData {

	protected NBTMinecartChestData(HopperMinecart entity) {
		super(entity);
	}
	
	public NBTMinecartChestData(StorageMinecart entity) {
		super(entity);
	}
	
	/**
	 * List of items.
	 */
	public List<NBTItem> getItems() {
		List<NBTItem> list = new ArrayList<NBTItem>();
		for (TagCompound tag : compound.getList("Items", TagCompound.class)) {
			list.add(new NBTItem(tag));
		}
		return list;
	}
	
	/**
	 * Optional. Loot table to be used to fill the chest/hopper when it is next opened, or the items are otherwise interacted with.
	 */
	public String getLootTable() {
		return compound.getString("LootTable");
	}
	
	/**
	 * Optional. Seed for generating the loot table. 0 or omitted will use a random seed.
	 */
	public long getLootTableSeed() {
		return compound.getLong("LootTableSeed");
	}

}
