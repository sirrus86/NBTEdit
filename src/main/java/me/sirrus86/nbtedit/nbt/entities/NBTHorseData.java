package me.sirrus86.nbtedit.nbt.entities;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Horse;

import me.sirrus86.nbtedit.nbt.TagCompound;
import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTHorseData extends NBTBreedableData {

	public NBTHorseData(Horse entity) {
		super(entity);
	}
	
	/**
	 * The armor item worn by this horse. May not exist.
	 */
	public NBTItem getArmorItem() {
		return new NBTItem(compound.getCompound("AmorItem"));
	}
	
	/**
	 * 1 or 0 (true/false) - Unknown. Remains 0 after breeding.
	 * If true, causes it to stay near other horses with this flag set.
	 */
	public byte getBred() {
		return compound.getByte("Bred");
	}
	
	// TODO - Only applies to donkey and mule as of 1.11
	/**
	 * 1 or 0 (true/false) - true if the horse has chests.
	 * A chested horse that is not a donkey or a mule will crash the game.
	 */
	public byte getChestedHorse() {
		return compound.getByte("ChestedHorse");
	}
	
	/**
	 * 1 or 0 (true/false) - true if the horse is grazing.
	 */
	public byte getEatingHaystack() {
		return compound.getByte("EatingHaystack");
	}
	
	/**
	 * 1 or 0 (true/false) - currently unused. Always 0.
	 * @deprecated Being removed in 1.11
	 */
	public byte getHasReproduced() {
		return compound.getByte("HasReproduced");
	}
	
	// TODO - Only applies to donkey and mule as of 1.11
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
	
	/**
	 * Contains the name of the player that tamed the horse. Has no effect on behavior.
	 * @deprecated
	 */
	public String getOwnerName() {
		return compound.getString("OwnerName");
	}
	
	/**
	 * Contains the UUID of the player that tamed the horse. Has no effect on behavior.
	 */
	public String getOwnerUUID() {
		return compound.getString("OwnerUUID");
	}
	
	/**
	 * 1 or 0 (true/false) - When loading, if SaddleItem is omitted and this is true
	 * then the horse will be wearing a default saddle.
	 * @deprecated Being removed in 1.11
	 */
	public byte getSaddle() {
		return compound.getByte("Saddle");
	}
	
	/**
	 * The saddle item worn by this horse. May not exist.
	 */
	public NBTItem getSaddleItem() {
		return new NBTItem(compound.getCompound("SaddleItem"));
	}
	
	// TODO - Only applies to skeleton horse as of 1.11
	/**
	 * 1 or 0 (true/false) - true if the horse is a trapped skeleton horse. Does not affect horse type.
	 */
	public byte getSkeletonTrap() {
		return compound.getByte("SkeletonTrap");
	}

	// TODO - Only applies to skeleton horse as of 1.11
	/**
	 * Incremented each tick when SkeletonTrap is set to 1. The horse automatically despawns when it reaches 18000 (15 minutes).
	 */
	public int getSkeletonTrapTime() {
		return compound.getInt("SkeletonTrapTime");
	}
	
	/**
	 * 1 or 0 (true/false) - true if the horse is tamed.
	 * (Non players mobs will not be able to ride a tamed horse if it has no saddle)
	 */
	public byte getTame() {
		return compound.getByte("Tame");
	}
	
	/**
	 * Ranges from 0 to 100; increases with feeding. Higher values make a horse easier to tame.
	 */
	public int getTemper() {
		return compound.getInt("Temper");
	}
	
	/**
	 * The type of the horse. 0 = Horse, 1 = Donkey, 2 = Mule, 3 = Zombie, 4 = Skeleton.
	 * @deprecated Being removed in 1.11
	 */
	public int getType() {
		return compound.getInt("Type");
	}
	
	// TODO - Only applies to horse as of 1.11
	/**
	 * The variant of the horse. Determines colors. Stored as baseColor | markings << 8.
	 * Unused values lead to invisible horses.
	 */
	public int getVariant() {
		return compound.getInt("Variant");
	}

}
