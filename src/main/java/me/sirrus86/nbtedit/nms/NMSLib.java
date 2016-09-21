package me.sirrus86.nbtedit.nms;

import me.sirrus86.nbtedit.nbt.TagCompound;

public abstract class NMSLib {

	public abstract TagCompound getNBTTagCompound(Object object);
	public abstract void setNBTTagCompound(Object object, TagCompound compound);
	
}
