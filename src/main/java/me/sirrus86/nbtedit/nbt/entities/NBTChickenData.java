package me.sirrus86.nbtedit.nbt.entities;

import org.bukkit.entity.Chicken;

public class NBTChickenData extends NBTBreedableData {

	public NBTChickenData(Chicken entity) {
		super(entity);
	}
	
	/**
	 * Number of ticks until the chicken lays its egg. Laying occurs at 0 and this
	 * timer gets reset to a new random value between 6000 and 12000.
	 */
	public int getEggLayTime() {
		return compound.getInt("EggLayTime");
	}
	
	/**
	 * Whether or not the chicken is a jockey for a baby zombie. If true, the chicken
	 * can naturally despawn and drops 10 experience upon death instead of 1-3. Baby
	 * zombies can still control a ridden chicken even if this is set false.
	 */
	public boolean getIsChickenJockey() {
		return compound.getByte("IsChickenJockey") == 1;
	}

}
