package me.sirrus86.nbtedit.nbt.items;

import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTItemSkullOwner extends NBTData {

	public NBTItemSkullOwner(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * UUID of owner. Optional. Used to update the other tags when the chunk
	 * loads or the holder logs in, in case the owner's name has changed.
	 */
	public String getID() {
		return compound.getString("Id");
	}
	
	/**
	 * Username of owner. If missing or empty, the head will appear as a Steve head.
	 * Otherwise, used to store or retrieve the downloaded skin in the cache. Need
	 * not be a valid player name, but must not be all spaces.
	 */
	public String getName() {
		return compound.getString("Name");
	}

}
