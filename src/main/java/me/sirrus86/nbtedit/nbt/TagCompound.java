package me.sirrus86.nbtedit.nbt;

import java.util.List;
import java.util.Map;

public class TagCompound {
	private final Map<String, Object> map;
	
	public TagCompound(Map<String, Object> map) {
		this.map = map;
	}
	
	public byte getByte(String tag) {
		return (byte) map.get(tag);
	}
	
	public byte[] getByteArray(String tag) {
		return (byte[]) map.get(tag);
	}
	
	public TagCompound getCompound(String tag) {
		return (TagCompound) map.get(tag);
	}
	
	public double getDouble(String tag) {
		return (double) map.get(tag);
	}
	
	public float getFloat(String tag) {
		return (float) map.get(tag);
	}
	
	public int getInt(String tag) {
		return (int) map.get(tag);
	}
	
	public int[] getIntArray(String tag) {
		return (int[]) map.get(tag);
	}
	
	@SuppressWarnings("unchecked")
	public <O> List<O> getList(String tag, Class<O> clazz) {
		return (List<O>) map.get(tag);
	}
	
	public long getLong(String tag) {
		return (long) map.get(tag);
	}
	
	public short getShort(String tag) {
		return (short) map.get(tag);
	}
	
	public String getString(String tag) {
		return (String) map.get(tag);
	}
	
	public void set(String tag, Object value) {
		map.put(tag, value);
	}
	
}
