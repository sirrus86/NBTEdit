package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Skeleton;

public class NBTSkeletonData extends NBTLivingEntityData {

	public NBTSkeletonData(Skeleton entity) {
		super(entity);
	}
	
	/**
	 * 0: normal skeleton, 1: wither skeleton, 2: stray skeleton
	 * @deprecated Being removed in 1.11
	 */
	public byte getSkeletonType() {
		return compound.getByte("SkeletonType");
	}

}
