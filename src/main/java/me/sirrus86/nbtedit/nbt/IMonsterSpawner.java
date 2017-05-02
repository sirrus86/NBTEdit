package me.sirrus86.nbtedit.nbt;

import java.util.List;

import me.sirrus86.nbtedit.nbt.entities.NBTEntityData;

public abstract interface IMonsterSpawner {

	/**
	 *  Ticks until next spawn. If 0, it will spawn immediately when a player enters
	 *  its range. If set to -1 (this state never occurs in a natural spawner; it seems
	 *  to be a feature accessed only via NBT editing), the spawner will reset its Delay,
	 *  and (if SpawnPotentials exist) EntityID and SpawnData as though it had just
	 *  completed a successful spawn cycle, immediately when a player enters its range.
	 *  Note that setting Delay to -1 can be useful if you want the game to properly
	 *  randomize the spawner's Delay, EntityID, and SpawnData, rather than starting
	 *  with pre-defined values.
	 */
	public short getDelay();
	
	/**
	 * The Entity ID of the next entity(s) to spawn. Both mob entity IDs and other
	 * entity IDs will work. Warning: If SpawnPotentials exists, this tag will get
	 * overwritten after the next spawning attempt.
	 * @deprecated Deprecated in 1.9
	 */
	public String getEntityID();

	/**
	 * Overrides the maximum number of nearby (within a box of spawnrange*2+1 x
	 * spawnrange*2+1 x 8 centered around the spawner block) entities whose IDs match
	 * this spawner's entity ID. Note that this is relative to a mob's hitbox, not their
	 * physical position. Also note that all entities within all chunk sections
	 * (16x16x16 cubes) overlapped by this box are tested for their ID and hitbox overlap,
	 * rather than just entities which are within the box, meaning a large amount of
	 * entities outside the box (or within it, of course) can cause substantial lag.
	 */
	public short getMaxNearbyEntities();

	/**
	 * The maximum random delay for the next spawn delay. Warning: Setting this value
	 * to 0 crashes Minecraft. Set to at least 1. Note: Requires the MinSpawnDelay
	 * property to also be set.
	 */
	public short getMaxSpawnDelay();
	
	/**
	 * The minimum random delay for the next spawn delay. May be equal to MaxSpawnDelay.
	 */
	public short getMinSpawnDelay();

	/**
	 * Overrides the block radius of the sphere of activation by players for this spawner.
	 * Note that for every gametick, a spawner will check all players in the current world
	 * to test whether a player is within this sphere. Note: Requires the MaxNearbyEntities
	 * property to also be set.
	 */
	public short getRequiredPlayerRange();
	
	/**
	 * How many mobs to attempt to spawn each time. Note: Requires the MinSpawnDelay
	 * property to also be set.
	 */
	public short getSpawnCount();
	
	/**
	 * Contains tags to copy to the next spawned entity(s) after spawning. Any of
	 * the entity or mob tags may be used. Note that if a spawner specifies any of
	 * these tags, almost all variable data such as mob equipment, villager profession,
	 * sheep wool color, etc., will not be automatically generated, and must also be
	 * manually specified (note that this does not apply to position data, which will
	 * be randomized as normal unless Pos is specified. Similarly, unless Size and Health
	 * are specified for a Slime or Magma Cube, these will still be randomized). This,
	 * together with EntityId, also determines the appearance of the miniature entity
	 * spinning in the spawner cage. Note: this tag is optional: if it does not exist,
	 * the next spawned entity will use the default vanilla spawning properties for this
	 * mob, including potentially randomized armor (this is true even if SpawnPotentials
	 * does exist). Warning: If SpawnPotentials exists, this tag will get overwritten
	 * after the next spawning attempt.
	 */
	public NBTEntityData getSpawnData();
	
	/**
	 * Optional. List of possible entities to spawn. If this tag does not exist,
	 * but SpawnData exists, Minecraft will generate it the next time the spawner
	 * tries to spawn an entity. The generated list will contain a single entry
	 * derived from the EntityId and SpawnData tags.
	 */
	public List<NBTSpawnPotential> getSpawnPotentials();
	
	/**
	 * The radius around which the spawner attempts to place mobs randomly. The spawn area
	 * is square, includes the block the spawner is in, and is centered around the spawner's
	 * x,z coordinates - not the spawner itself. It is 2 blocks high, centered around the
	 * spawner's y coordinate (its bottom), allowing mobs to spawn as high as its top surface
	 * and as low as 1 block below its bottom surface. Vertical spawn coordinates are integers,
	 * while horizontal coordinates are floating point and weighted towards values near the
	 * spawner itself. Default value is 4.
	 */
	public short getSpawnRange();

}
