package me.sirrus86.nbtedit.nbt.entities.horse;

import org.bukkit.entity.Llama;

import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTLlamaData extends NBTChestedHorseData {

	public NBTLlamaData(Llama entity) {
		super(entity);
	}
	
	/**
	 * The item the llama is wearing, without the Slot tag. Typically a carpet.
	 */
	public NBTItem getDecorItem() {
		return new NBTItem(compound.getCompound("DecorItem"));
	}
	
	/**
	 * The variant of the llama. 0 = Creamy, 1 = White, 2 = Brown, 3 = Gray.
	 */
	public int getVariant() {
		return compound.getInt("Variant");
	}

}
