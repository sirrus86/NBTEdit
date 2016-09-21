package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Ocelot;

public class NBTOcelotData extends NBTTameableData {

	public NBTOcelotData(Ocelot entity) {
		super(entity);
	}
	
	/**
	 * The ID of the skin the ocelot has. 0 = wild ocelot, 1 = tuxedo, 2 = tabby, 3 = siamese.
	 * Does not determine an ocelot's behavior: it will be wild unless its Owner string is
	 * not empty, meaning wild ocelots can look like cats and vice versa.
	 */
	public int getCatType() {
		return compound.getInt("CatType");
	}

}
