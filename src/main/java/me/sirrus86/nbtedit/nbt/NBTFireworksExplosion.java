package me.sirrus86.nbtedit.nbt;

public class NBTFireworksExplosion extends NBTData {

	public NBTFireworksExplosion(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * Array of integer values corresponding to the primary colors of this firework's explosion.
	 * If custom color codes are used, the game will render it as "Custom" in the tooltip,
	 * but the proper color will be used in the explosion.
	 */
	public int[] getColors() {
		return compound.getIntArray("Colors");
	}
	
	/**
	 * Array of integer values corresponding to the fading colors of this firework's explosion.
	 * Same handling of custom colors as Colors. May be absent.
	 */
	public int[] getFadeColors() {
		return compound.getIntArray("FadeColors");
	}
	
	/**
	 * True if this explosion will have the Twinkle effect (glowstone dust). May be absent.
	 */
	public boolean getFlicker() {
		return compound.getByte("Flicker") == 1;
	}
	
	/**
	 * True if this explosion will have the Trail effect (diamond). May be absent.
	 */
	public boolean getTrail() {
		return compound.getByte("Trail") == 1;
	}
	
	/**
	 * The shape of this firework's explosion. 0 = Small Ball, 1 = Large Ball, 2 = Star-shaped,
	 * 3 = Creeper-shaped, 4 = Burst. Other values will be named "Unknown Shape" and render as Small Ball.
	 */
	public byte getType() {
		return compound.getByte("Type");
	}

}
