package me.sirrus86.nbtedit.nbt.entities.horse;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.ChestedHorse;

import me.sirrus86.nbtedit.nbt.TagCompound;
import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTChestedHorseData extends NBTAbstractHorseData {

	public NBTChestedHorseData(ChestedHorse entity) {
		super(entity);
	}
	
	/**
	 * 1 or 0 (true/false) - true if the horse has chests.
	 * A chested horse that is not a donkey or a mule will crash the game.
	 */
	public byte getChestedHorse() {
		return compound.getByte("ChestedHorse");
	}
	
	/**
	 * List of items. Only exists if ChestedHorse is true.
	 */
	public List<NBTItem> getItems() {
		List<NBTItem> list = new ArrayList<NBTItem>();
		for (TagCompound tag : compound.getList("Items", TagCompound.class)) {
			list.add(new NBTItem(tag));
		}
		return list;
	}

}
