package me.sirrus86.nbtedit.nbt.entities.minecart;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Minecart;

import me.sirrus86.nbtedit.nbt.IMonsterSpawner;
import me.sirrus86.nbtedit.nbt.NBTSpawnPotential;
import me.sirrus86.nbtedit.nbt.TagCompound;
import me.sirrus86.nbtedit.nbt.entities.NBTEntityData;

public class NBTMinecartSpawnerData extends NBTMinecartData implements IMonsterSpawner {

	public NBTMinecartSpawnerData(Minecart entity) {
		super(entity);
	}

	public short getDelay() {
		return compound.getShort("Delay");
	}

	/**
	 * @deprecated Deprecated in 1.9
	 */
	public String getEntityID() {
		return compound.getString("EntityId");
	}

	public short getMaxNearbyEntities() {
		return compound.getShort("MaxNearbyEntities");
	}

	public short getMaxSpawnDelay() {
		return compound.getShort("MaxSpawnDelay");
	}

	public short getMinSpawnDelay() {
		return compound.getShort("MinSpawnDelay");
	}

	public short getRequiredPlayerRange() {
		return compound.getShort("RequiredPlayerRange");
	}

	public short getSpawnCount() {
		return compound.getShort("SpawnCount");
	}

	public NBTEntityData getSpawnData() {
		return new NBTEntityData(compound.getCompound("SpawnData"));
	}

	public List<NBTSpawnPotential> getSpawnPotentials() {
		List<NBTSpawnPotential> list = new ArrayList<NBTSpawnPotential>();
		for (TagCompound tag : compound.getList("SpawnPotentials", TagCompound.class)) {
			list.add(new NBTSpawnPotential(tag));
		}
		return list;
	}

	public short getSpawnRange() {
		return compound.getShort("SpawnRange");
	}

}
