package me.sirrus86.nbtedit.nbt.entities;

import java.util.ArrayList;
import java.util.List;

import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTVillagerOffers extends NBTData {

	public NBTVillagerOffers(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * List of trade options.
	 */
	public List<NBTVillagerTradeOption> getRecipes() {
		List<NBTVillagerTradeOption> list = new ArrayList<NBTVillagerTradeOption>();
		for (TagCompound tag : compound.getList("Recipes", TagCompound.class)) {
			list.add(new NBTVillagerTradeOption(tag));
		}
		return list;
	}

}
