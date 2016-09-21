package me.sirrus86.nbtedit.nbt.items;

import java.util.ArrayList;
import java.util.List;

import me.sirrus86.nbtedit.nbt.NBTData;
import me.sirrus86.nbtedit.nbt.NBTFireworks;
import me.sirrus86.nbtedit.nbt.NBTFireworksExplosion;
import me.sirrus86.nbtedit.nbt.NBTPotionEffect;
import me.sirrus86.nbtedit.nbt.TagCompound;
import me.sirrus86.nbtedit.nbt.attributes.NBTItemAttributeModifier;
import me.sirrus86.nbtedit.nbt.blocks.NBTBlockEntityData;
import me.sirrus86.nbtedit.nbt.enchantments.NBTEnchantment;
import me.sirrus86.nbtedit.nbt.entities.NBTEntityData;

public class NBTItemTag extends NBTData {

	public NBTItemTag(TagCompound compound) {
		super(compound);
	}
	
	/**
	 * Contains Attribute Modifiers on this item which modify Attributes of the wearer or holder
	 * (if the item is not in the hand or armor slots, it will have no effect).
	 */
	public List<NBTItemAttributeModifier> getAttributeModifiers() {
		List<NBTItemAttributeModifier> list = new ArrayList<NBTItemAttributeModifier>();
		for (TagCompound tag : compound.getList("AttributeModifiers", TagCompound.class)) {
			list.add(new NBTItemAttributeModifier(tag));
		}
		return list;
	}
	
	/**
	 * The author of the written book.
	 */
	public String getAuthor() {
		return compound.getString("author");
	}
	
	/**
	 * Block entity NBT tags which are applied when this block is placed.
	 * Used to store data on banners and shields or on blocks obtained in creative
	 * by holding ctrl (or Cmd on mac) and pressing pick block on a block containing a block entity.
	 */
	public NBTBlockEntityData getBlockEntityTag() {
		return new NBTBlockEntityData(compound.getCompound("BlockEntityTag"));
	}
	
	/**
	 * The only blocks this item may break when used by a player in adventure mode.
	 */
	public List<String> getCanDestroy() {
		return compound.getList("CanDestroy", String.class);
	}
	
	/**
	 * Determines which blocks that blocks with this tag can be placed against in adventure mode.
	 */
	public List<String> getCanPlaceOn() {
		return compound.getList("CanPlaceOn", String.class);
	}
	
	/**
	 * The custom Potion effects this potion has.
	 */
	public List<NBTPotionEffect> getCustomPotionEffects() {
		List<NBTPotionEffect> list = new ArrayList<NBTPotionEffect>();
		for (TagCompound tag : compound.getList("CustomPotionEffects", TagCompound.class)) {
			list.add(new NBTPotionEffect(tag));
		}
		return list;
	}
	
	/**
	 * A list of optional decorations. It will display defined symbols on the map
	 */
	public List<NBTMapDecoration> getDecorations() {
		List<NBTMapDecoration> list = new ArrayList<NBTMapDecoration>();
		for (TagCompound tag : compound.getList("Decorations", TagCompound.class)) {
			list.add(new NBTMapDecoration(tag));
		}
		return list;
	}
	
	/**
	 * Display properties.
	 */
	public NBTItemDisplay getDisplay() {
		return new NBTItemDisplay(compound.getCompound("display"));
	}
	
	/**
	 * Contains enchantments on this item that affect the way the item works.
	 */
	public List<NBTEnchantment> getEnchantments() {
		List<NBTEnchantment> list = new ArrayList<NBTEnchantment>();
		for (TagCompound tag : compound.getList("ench", TagCompound.class)) {
			list.add(new NBTEnchantment(tag));
		}
		return list;
	}
	
	/**
	 * Stores entity data that is applied to the armor stand when placed or entity when spawned.
	 */
	public NBTEntityData getEntityTag() {
		return new NBTEntityData(compound.getCompound("EntityTag"));
	}
	
	/**
	 * One of these may appear on a firework star.
	 */
	public NBTFireworksExplosion getExplosion() {
		return new NBTFireworksExplosion(compound.getCompound("Explosion"));
	}
	
	/**
	 * One of these may appear on a firework rocket.
	 */
	public NBTFireworks getFireworks() {
		return new NBTFireworks(compound.getCompound("Fireworks"));
	}
	
	/**
	 * The copy tier of the book. 0 = original, 1 = copy of original, 2 = copy of copy,
	 * 3 = tattered. If the value is greater than 1, the book cannot be copied. Does not
	 * exist for original books. If this tag is missing, it is assumed the book is an original.
	 */
	public int getGeneration() {
		return compound.getInt("generation");
	}
	
	/**
	 * Bit field determining which parts of the tooltip to hide on an item. 1 for "ench",
	 * 2 for "AttributeModifiers", 4 for "Unbreakable", 8 for "CanDestroy", 16 for "CanPlaceOn",
	 * and 32 for various other information (including potion effects, "StoredEnchantments",
	 * written book "generation" and "author", "Explosion", "Fireworks", and map tooltips). For
	 * example, setting to 3 would hide both "ench" and "AttributeModifiers" tags, and setting to
	 * 63 would hide everything.
	 */
	public int getHideFlags() {
		return compound.getInt("HideFlags");
	}
	
	/**
	 * Only internally used when scaling a map, after that directly removed:
	 * The amount to increase the current map scale by when crafting. Always 1.
	 */
	public int getMapScaleDirection() {
		return compound.getInt("map_scale_direction");
	}
	
	/**
	 * Only internally used when scaling a map, after that directly removed:
	 * 1 or 0 (true/false) - whether or not player markers should be added and updated. Currently unused.
	 */
	public byte getMapTrackingPosition() {
		return compound.getByte("map_tracking_position");
	}
	
	/**
	 * The list of pages in the book. If generated by writing in a book and quill in-game, each
	 * page is a string in double quotes and uses the escape sequences \" for a double quote, \n
	 * for a line break and \\ for a backslash. If created by commands or external tools, a page
	 * can be a serialized JSON object or an array of strings and/or objects or an unescaped string.
	 */
	public List<String> getPages() {
		return compound.getList("pages", String.class);
	}
	
	/**
	 * The name of the default potion effect. This name differs from the potion effect name.
	 * For example, the value for an "Instant Health II" potion is "minecraft:strong_healing"
	 */
	public String getPotion() {
		return compound.getString("Potion");
	}
	
	/**
	 * Number of enchantment levels to add to the base level cost when repairing,
	 * combining, or renaming this item with an Anvil.
	 */
	public int getRepairCost() {
		return compound.getInt("RepairCost");
	}
	
	/**
	 * Optional. Created and set to 1 when the book (or a book from the stack) is opened
	 * for the first time after signing. Used to determine whether to parse target
	 * selectors (including which player is selected by {score:{name:"*", ...}}) within
	 * JSON, because their selections become fixed at that point.
	 */
	public boolean getResolved() {
		return compound.getByte("resolved") == 1;
	}
	
	/**
	 * Definition for the skull's owner.
	 */
	public NBTItemSkullOwner getSkullOwner() {
		return new NBTItemSkullOwner(compound.getCompound("SkullOwner"));
	}
	
	/**
	 * Contains enchantments for enchanted books. StoredEnchantments tooltips will
	 * not be displayed if edited onto an item other than an enchanted book.
	 * Enchantments stored in ench, however, will always be displayed in the tooltip
	 * and will cause the item to glow, even if they cannot have any effect.
	 */
	public List<NBTEnchantment> getStoredEnchantments() {
		List<NBTEnchantment> list = new ArrayList<NBTEnchantment>();
		for (TagCompound tag : compound.getList("StoredEnchantments", TagCompound.class)) {
			list.add(new NBTEnchantment(tag));
		}
		return list;
	}
	
	/**
	 * The title of the written book.
	 */
	public String getTitle() {
		return compound.getString("title");
	}
	
	/**
	 * If true, the item doesn't lose durability when used.
	 */
	public boolean getUnbreakable() {
		return compound.getByte("Unbreakable") == 1;
	}

}
