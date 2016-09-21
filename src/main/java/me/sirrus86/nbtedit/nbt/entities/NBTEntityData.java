package me.sirrus86.nbtedit.nbt.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import me.sirrus86.nbtedit.nbt.NBTCommandStats;
import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.TagCompound;

public class NBTEntityData extends NBTData {

	private Entity entity;

	public NBTEntityData(Entity entity) {
		super(nms.getNBTTagCompound(entity));
		this.entity = entity;
	}

	public NBTEntityData(TagCompound compound) {
		super(compound);
		UUID uuid = new UUID(compound.getLong("UUIDMost"), compound.getLong("UUIDLeast"));
		for (World world : plugin.getServer().getWorlds()) {
			for (Entity entity : world.getEntities()) {
				if (entity.getUniqueId() == uuid) {
					this.entity = entity;
					return;
				}
			}
		}
	}

	/**
	 * TODO
	 */
	public void apply() {
		apply(compound);
	}

	/**
	 * TODO
	 */
	public void apply(TagCompound compound) {
		nms.setNBTTagCompound(entity, compound);
	}
	
	/**
	 * How much air the entity has, in ticks.
	 * Fills to a maximum of 300 in air, giving 15 seconds submerged before the entity starts to drown,
	 * and a total of up to 35 seconds before the entity dies (if it has 20 health).
	 * Decreases while underwater. If 0 while underwater, the entity loses 1 health per second.
	 */
	public short getAirTicks() {
		return compound.getShort("Air");
	}
	
	/**
	 * Information identifying scoreboard parameters to modify relative to the last command run
	 */
	public NBTCommandStats getCommandStats() {
		return new NBTCommandStats(compound.getCompound("CommandStats"));
	}
	
	/**
	 * The custom name of this entity. Appears in player death messages and villager trading interfaces,
	 * as well as above the entity when your cursor is over it. May not exist, or may exist and be empty.
	 */
	public String getCustomName() {
		return compound.getString("CustomName");
	}
	
	/**
	 * If true, and this entity has a custom name, it will always appear above them, 
	 * hether or not the cursor is pointing at it. If the entity hasn't a custom name, 
	 * a default name will be shown. May not exist.
	 */
	public boolean getCustomNameVisible() {
		return compound.getByte("CustomNameVisible") == 1;
	}
	
	/**
	 * Only known to be used in <player>.dat to store the players last known location along with Pos.
	 * All other entities are only saved in the region files for the dimension they are in.
	 * -1 for The Nether, 0 for The Overworld, and 1 for The End.
	 */
	public int getDimension() {
		return compound.getInt("Dimension");
	}

	/**
	 * TODO
	 */
	public Entity getEntity() {
		return entity;
	}
	
	/**
	 * Distance the entity has fallen. Larger values cause more damage when the entity lands.
	 */
	public float getFallDistance() {
		return compound.getFloat("FallDistance");
	}
	
	/**
	 * Number of ticks until the fire is put out.
	 * Negative values reflect how long the entity can stand in fire before burning.
	 * Default -20 when not on fire.
	 */
	public short getFireTicks() {
		return compound.getShort("Fire");
	}
	
	/**
	 * True if the entity has a glowing outline.
	 */
	public boolean getGlowing() {
		return compound.getByte("Glowing") == 1;
	}
	
	/**
	 * Entity ID. This tag does not exist for the Player entity.
	 */
	public String getID() {
		return compound.getString("id");
	}
	
	/**
	 * True if the entity should not take damage.
	 * This applies to living and nonliving entities alike:
	 * mobs will not take damage from any source (including potion effects),
	 * and cannot be moved by fishing rods, attacks, explosions, or projectiles,
	 * and objects such as vehicles and item frames cannot be destroyed unless
	 * their supports are removed. Note that these entities can be damaged by players in Creative mode.
	 */
	public boolean getInvulnerable() {
		return compound.getByte("Invulnerable") == 1;
	}

	/**
	 * TODO
	 */
	public double getMotionX() {
		return compound.getList("Motion", Double.class).get(0);
	}

	/**
	 * TODO
	 */
	public double getMotionY() {
		return compound.getList("Motion", Double.class).get(1);
	}

	/**
	 * TODO
	 */
	public double getMotionZ() {
		return compound.getList("Motion", Double.class).get(2);
	}
	
	/**
	 * If true, the entity will not fall if in the air.
	 */
	public boolean getNoGravity() {
		return compound.getByte("NoGravity") == 1;
	}
	
	/**
	 * True if the entity is touching the ground.
	 */
	public boolean getOnGround() {
		return compound.getByte("OnGround") == 1;
	}
	
	/**
	 *  The data of the entity riding. Note that both entities control movement
	 *  and the topmost entity controls spawning conditions when created by a mob spawner.
	 */
	public List<NBTEntityData> getPassengers() {
		List<NBTEntityData> list = new ArrayList<NBTEntityData>();
		for (TagCompound tag : compound.getList("Passengers", TagCompound.class)) {
			list.add(new NBTEntityData(tag));
		}
		return list;
	}
	
	/**
	 * The entity's declination from the horizon (called pitch). Horizontal is 0.
	 * Positive values look downward. Does not exceed positive or negative 90 degrees.
	 */
	public float getPitch() {
		return compound.getList("Rotation", Float.class).get(1);
	}
	
	/**
	 * The number of ticks before which the entity may be teleported back through a nether portal.
	 * Initially starts at 300 ticks (15 seconds) after teleportation and counts down to 0.
	 */
	public int getPortalCooldown() {
		return compound.getInt("PortalCooldown");
	}

	/**
	 * TODO
	 */
	public double getPositionX() {
		return compound.getList("Pos", Double.class).get(0);
	}

	/**
	 * TODO
	 */
	public double getPositionY() {
		return compound.getList("Pos", Double.class).get(1);
	}
	
	/**
	 * TODO
	 */
	public double getPositionZ() {
		return compound.getList("Pos", Double.class).get(2);
	}
	
	/**
	 * The data of the entity being ridden. Note that if an entity is being ridden,
	 * the topmost entity in the stack has the Pos tag, and the coordinates specify
	 * the location of the bottommost entity. Also note that the bottommost entity
	 * controls movement, while the topmost entity determines spawning conditions
	 * when created by a mob spawner.
	 */
	@Deprecated
	public NBTEntityData getRiding() {
		return new NBTEntityData(compound.getCompound("Riding"));
	}
	
	/**
	 * If true, this entity will not make sound. May not exist.
	 */
	public boolean getSilent() {
		return compound.getByte("Silent") == 1;
	}
	
	/**
	 * List of custom string data.
	 */
	public List<String> getTags() {
		return compound.getList("Tags", String.class);
	}
	
	/**
	 * The Universally Unique IDentifier of this entity.
	 * Converts a hexadecimal UUID (for example: 069a79f4-44e9-4726-a5be-fca90e38aaf5)
	 * into the UUIDLeast and UUIDMost tags. Will not apply new UUIDLeast and UUIDMost
	 * tags if both of these tags are already present. The "UUID" tag is removed once the entity is loaded.
	 */
	@Deprecated
	public String getUUID() {
		return compound.getString("UUID");
	}
	
	/**
	 * The least significant bits of this entity's Universally Unique IDentifier.
	 */
	public long getUUIDLeast() {
		return compound.getLong("UUIDLeast");
	}
	
	/**
	 *  The most significant bits of this entity's Universally Unique IDentifier.
	 *  This is joined with UUIDLeast to form this entity's unique ID.
	 */
	public long getUUIDMost() {
		return compound.getLong("UUIDMost");
	}
	
	/**
	 * The entity's rotation clockwise around the Y axis (called yaw). Due west is 0.
	 * Does not exceed 360 degrees.
	 */
	public float getYaw() {
		return compound.getList("Rotation", Float.class).get(0);
	}
	
}
