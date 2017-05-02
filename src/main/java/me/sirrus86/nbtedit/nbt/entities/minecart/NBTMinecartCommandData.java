package me.sirrus86.nbtedit.nbt.entities.minecart;

import org.bukkit.entity.minecart.CommandMinecart;

import me.sirrus86.nbtedit.nbt.ICommand;

public class NBTMinecartCommandData extends NBTMinecartData implements ICommand {

	public NBTMinecartCommandData(CommandMinecart entity) {
		super(entity);
	}

	public String getCommand() {
		return compound.getString("Command");
	}

	public String getLastOutput() {
		return compound.getString("LastOutput");
	}

	public int getSuccessCount() {
		return compound.getInt("SuccessCount");
	}

	public byte getTrackOutput() {
		return compound.getByte("TrackOutput");
	}

}
