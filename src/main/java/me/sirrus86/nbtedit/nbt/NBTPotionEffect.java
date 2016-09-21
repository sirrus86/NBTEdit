package me.sirrus86.nbtedit.nbt;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NBTPotionEffect extends NBTData {

	public NBTPotionEffect(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * True if this effect is provided by a Beacon and therefore should be less intrusive on screen.
	 */
	public boolean getAmbient() {
		return compound.getByte("Ambient") == 1;
	}
	
	/**
	 * The potion effect level. 0 is level 1.
	 */
	public byte getAmplifier() {
		return compound.getByte("Amplifier");
	}
	
	/**
	 * The number of ticks before the effect wears off.
	 */
	public int getDuration() {
		return compound.getInt("Duration");
	}
	
	/**
	 * The effect ID.
	 */
	public byte getID() {
		return compound.getByte("Id");
	}
	
	/**
	 * TODO
	 */
	@SuppressWarnings("deprecation")
	public PotionEffect getPotionEffect() {
		return new PotionEffect(PotionEffectType.getById(getID()), getDuration(), getAmplifier(),
				getAmbient(), getShowParticles());
	}
	
	/**
	 * True if particles are shown (affected by "Ambient"). false if no particles are shown.
	 */
	public boolean getShowParticles() {
		return compound.getByte("ShowParticles") == 1;
	}

}
