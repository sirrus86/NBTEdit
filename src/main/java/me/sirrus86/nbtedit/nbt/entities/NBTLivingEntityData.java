package me.sirrus86.nbtedit.nbt.entities;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.LivingEntity;

import me.sirrus86.nbtedit.nbt.NBTLeash;
import me.sirrus86.nbtedit.nbt.NBTPotionEffect;
import me.sirrus86.nbtedit.nbt.TagCompound;
import me.sirrus86.nbtedit.nbt.attributes.NBTAttribute;
import me.sirrus86.nbtedit.nbt.items.NBTItem;

public class NBTLivingEntityData extends NBTEntityData {

	public NBTLivingEntityData(LivingEntity entity) {
		super(entity);
	}
	
	/**
	 * Amount of extra health added by Absorption effect.
	 */
	public float getAbsorptionAmount() {
		return compound.getFloat("AbsorptionAmount");
	}
	
	/**
	 * The list of potion effects on this mob. May not exist.
	 */
	public List<NBTPotionEffect> getActiveEffects() {
		List<NBTPotionEffect> list = new ArrayList<NBTPotionEffect>();
		for (TagCompound tag : compound.getList("ActiveEffects", TagCompound.class)) {
			list.add(new NBTPotionEffect(tag));
		}
		return list;
	}
	
	/**
	 * List of float values representing the chance for a worn armor item to drop.
	 * 0 = Feet, 1 = Legs, 2 = Chest, 3 = Head
	 */
	public List<Float> getArmorDropChances() {
		return compound.getList("ArmorDropChances", Float.class);
	}
	
	/**
	 * The list of items the mob is wearing as armor.
	 * 0 = Feet, 1 = Legs, 2 = Chest, 3 = Head
	 */
	public List<NBTItem> getArmorItems() {
		List<NBTItem> list = new ArrayList<NBTItem>();
		for (TagCompound tag : compound.getList("ArmorItems", TagCompound.class)) {
			list.add(new NBTItem(tag));
		}
		return list;
	}
	
	/**
	 * A list of Attributes for this mob. These are used for many purposes in internal calculations,
	 * and can be considered a mob's "statistics".
	 */
	public List<NBTAttribute> getAttributes() {
		List<NBTAttribute> list = new ArrayList<NBTAttribute>();
		for (TagCompound tag : compound.getList("Attributes", TagCompound.class)) {
			list.add(new NBTAttribute(tag));
		}
		return list;
	}
	
	/**
	 * True if the mob can pick up loot (wear armor it picks up, use weapons it picks up).
	 */
	public boolean getCanPickUpLoot() {
		return compound.getByte("CanPickUpLoot") == 1;
	}
	
	/**
	 * Optional. Loot table to be used for the items that drop when the entity is killed.
	 */
	public String getDeathLootTable() {
		return compound.getString("DeathLootTable");
	}
	
	/**
	 * Optional. Seed for generating the loot table. 0 or omitted will use a random seed.
	 */
	public long getDeathLootTableSeed() {
		return compound.getLong("DeathLootTableSeed");
	}
	
	/**
	 * Number of ticks the mob has been dead for. Controls death animations. 0 when alive.
	 */
	public short getDeathTime() {
		return compound.getShort("DeathTime");
	}
	
	/**
	 * List of float values from 0 to 1 representing the chance for a carried item to drop.
	 * By default these are all 0.085, but they get set to 2 if the mob picks up an item.
	 * Items with durability held by a mob that have an associated DropChances greater than 1.0
	 * will retain the defined durability of the item. If the DropChances is 1.0 or lower, the
	 * durability is randomized. If the "Unbreakable" tag exists on the item, the durability will
	 * be assigned as defined, regardless of the DropChances value.
	 */
	@Deprecated
	public List<Float> getDropChances() {
		return compound.getList("DropChances", Float.class);
	}
	
	/**
	 * The list of compound tags of the equipment the mob has. Each compound tag in the list is
	 * an Item without the slot tag. All 5 entries will always exist, but may be empty compound tags to indicate no item.
	 * 0 = Hand, 1 = Feet, 2 = Legs, 3 = Chest, 4 = Head
	 */
	@Deprecated
	public List<NBTItem> getEquipment() {
		List<NBTItem> list = new ArrayList<NBTItem>();
		for (TagCompound tag : compound.getList("Equipment", TagCompound.class)) {
			list.add(new NBTItem(tag));
		}
		return list;
	}
	
	/**
	 * When set to 1 for non-player entities, will cause the entity to glide as long as they are
	 * wearing elytra in the chest slot. Can be used to detect when the player is gliding without using scoreboard statistics.
	 */
	public byte getFallFlying() {
		return compound.getByte("FallFlying");
	}
	
	/**
	 * List of float values representing the chance for a handheld item to drop.
	 * 0 = Main hand, 1 = Off hand
	 */
	public List<Float> getHandDropChances() {
		return compound.getList("HandDropChances", Float.class);
	}
	
	/**
	 * The list of items the mob is holding within its hands.
	 * 0 = Main hand, 1 = Off hand
	 */
	public List<NBTItem> getHandItems() {
		List<NBTItem> list = new ArrayList<NBTItem>();
		for (TagCompound tag : compound.getList("HandItems", TagCompound.class)) {
			list.add(new NBTItem(tag));
		}
		return list;
	}
	
	/**
	 * Amount of health the entity has, in floating point format. A value of 1 is half a heart.
	 * Used when more precise health values are needed, such as the health of entities being
	 * damaged by a player with the Weakness effect (if the player isn't holding an item that
	 * increases their attack damage, they deal 1/2 a health point, 1/4 a heart). If this tag exists,
	 * Health will be ignored.
	 */
	@Deprecated
	public float getHealF() {
		return compound.getFloat("HealF");
	}
	
	/**
	 * Amount of health the entity has. Used when whole-number health values are needed,
	 * such as displaying a player's health on their HUD. If the HealF tag exists, this tag will be ignored.
	 */
	public float getHealth() {
		return compound.getFloat("Health");
	}
	
	/**
	 * The last time the mob was damaged, measured in the number of ticks since the mob's creation.
	 * Updates to a new value whenever the mob is damaged, then updates again 101 ticks later for reasons unknown.
	 * Can be changed with the entitydata command, but the specified value does not affect natural updates in any way,
	 * and is overwritten if the mob receives damage.
	 */
	public int getHurtByTimestamp() {
		return compound.getInt("HurtByTimestamp");
	}
	
	/**
	 * Number of ticks the mob turns red for after being hit. 0 when not recently hit.
	 */
	public short getHurtTime() {
		return compound.getShort("HurtTime");
	}
	
	/**
	 * Either contains a UUID long pair, if this leash connects to another entity,
	 * or an X, Y, Z int trio if this leash connects to a fencepost.
	 */
	public NBTLeash getLeash() {
		return new NBTLeash(compound.getCompound("Leash"));
	}
	
	/**
	 * Whether the mob is leashed.
	 */
	public boolean getLeashed() {
		return compound.getByte("Leashed") == 1;
	}
	
	/**
	 * True if the mob renders the main hand as being left.
	 */
	public boolean getLeftHanded() {
		return compound.getByte("LeftHanded") == 1;
	}
	
	/**
	 *  If true, the mob's AI will be disabled. The mob will not attempt to move and
	 *  cannot move, to the extent of not falling when normally able.
	 */
	public boolean getNoAI() {
		return compound.getByte("NoAI") == 1;
	}
	
	/**
	 * True if the mob must not despawn naturally.
	 */
	public boolean getPersistenceRequired() {
		return compound.getByte("PersistenceRequired") == 1;
	}
	
	/**
	 * This tag is actually not part of the NBT data of a mob, but instead used when
	 * spawning it. It makes the mob instantly join the scoreboard team with that name.
	 */
	public String getTeam() {
		return compound.getString("Team");
	}
	
}
