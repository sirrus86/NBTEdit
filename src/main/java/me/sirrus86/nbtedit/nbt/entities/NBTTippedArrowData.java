package me.sirrus86.nbtedit.nbt.entities;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.TippedArrow;

import me.sirrus86.nbtedit.nbt.NBTPotionEffect;
import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTTippedArrowData extends NBTArrowData {

	public NBTTippedArrowData(TippedArrow entity) {
		super(entity);
	}
	
	/**
	 * The custom potion effects (status effects) this potion or tipped arrow has.
	 * A potion getting its effects from this tag will be named "Water Bottle".
	 * A tipped arrow will be named "Arrow of Splashing".
	 */
	public List<NBTPotionEffect> getCustomPotionEffects() {
		List<NBTPotionEffect> list = new ArrayList<NBTPotionEffect>();
		for (TagCompound tag : compound.getList("CustomPotionEffects", TagCompound.class)) {
			list.add(new NBTPotionEffect(tag));
		}
		return list;
	}
	
	/**
	 * The name of the default potion effect. This name differs from the status effect name.
	 * For example, the value for an "Instant Health II" potion is "minecraft:strong_healing".
	 * A potion or tipped arrow getting its effects from this tag will be named with the proper effect.
	 */
	public String getPotion() {
		return compound.getString("Potion");
	}

}
