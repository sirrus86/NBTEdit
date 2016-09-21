package me.sirrus86.nbtedit.nbt;

public class NBTLeash extends NBTData {

	public NBTLeash(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * The least significant bits of the Universally Unique IDentifier of the entity this leash connects to.
	 */
	public long getUUIDLeast() {
		return compound.getLong("UUIDLeast");
	}
	
	/**
	 * The most significant bits of the Universally Unique IDentifier of the entity this leash connects to.
	 */
	public long getUUIDMost() {
		return compound.getLong("UUIDMost");
	}
	
	/**
	 * The X coordinate of the fencepost this leash connects to.
	 */
	public int getX() {
		return compound.getInt("X");
	}
	
	/**
	 * The Y coordinate of the fencepost this leash connects to.
	 */
	public int getY() {
		return compound.getInt("Y");
	}
	
	/**
	 * The Z coordinate of the fencepost this leash connects to.
	 */
	public int getZ() {
		return compound.getInt("Z");
	}

}
