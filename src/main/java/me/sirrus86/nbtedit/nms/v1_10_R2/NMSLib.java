package me.sirrus86.nbtedit.nms.v1_10_R2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.craftbukkit.v1_11_R1.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftLivingEntity;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

import me.sirrus86.nbtedit.nbt.TagCompound;
import net.minecraft.server.v1_11_R1.NBTTagByte;
import net.minecraft.server.v1_11_R1.NBTTagByteArray;
import net.minecraft.server.v1_11_R1.NBTTagCompound;
import net.minecraft.server.v1_11_R1.NBTTagDouble;
import net.minecraft.server.v1_11_R1.NBTTagFloat;
import net.minecraft.server.v1_11_R1.NBTTagInt;
import net.minecraft.server.v1_11_R1.NBTTagIntArray;
import net.minecraft.server.v1_11_R1.NBTTagList;
import net.minecraft.server.v1_11_R1.NBTTagLong;
import net.minecraft.server.v1_11_R1.NBTTagShort;
import net.minecraft.server.v1_11_R1.NBTTagString;

public class NMSLib extends me.sirrus86.nbtedit.nms.NMSLib {

	@Override
	public TagCompound getNBTTagCompound(Object object) {
		NBTTagCompound compound = new NBTTagCompound();
		if (object instanceof Entity) {
			((CraftEntity)object).getHandle().e(compound);
			if (object instanceof LivingEntity) {
				((CraftLivingEntity)object).getHandle().b(compound);
			}
		}
		else if (object instanceof NBTTagCompound) {
			compound = (NBTTagCompound) object;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		for (String string : compound.c()) {
			if (compound.get(string) instanceof NBTTagByte) map.put(string, compound.getByte(string));
			else if (compound.get(string) instanceof NBTTagByteArray) map.put(string, compound.getByteArray(string));
			else if (compound.get(string) instanceof NBTTagCompound) map.put(string, getNBTTagCompound(compound.getCompound(string)));
			else if (compound.get(string) instanceof NBTTagDouble) map.put(string, compound.getDouble(string));
			else if (compound.get(string) instanceof NBTTagFloat) map.put(string, compound.getFloat(string));
			else if (compound.get(string) instanceof NBTTagInt) map.put(string, compound.getInt(string));
			else if (compound.get(string) instanceof NBTTagIntArray) map.put(string, compound.getIntArray(string));
			else if (compound.get(string) instanceof NBTTagList) {
				NBTTagList tagList = (NBTTagList) compound.get(string);
				List<Object> list = new ArrayList<Object>(tagList.size());
				for (int i = 0; i < tagList.size(); i ++) {
					switch(tagList.g()) {
						case 1: list.set(i, ((NBTTagByte)tagList.h(i)).g());
						case 2: list.set(i, ((NBTTagShort)tagList.h(i)).f());
						case 3: list.set(i, ((NBTTagInt)tagList.h(i)).e());
						case 4: list.set(i, ((NBTTagLong)tagList.h(i)).d());
						case 5: list.set(i, ((NBTTagFloat)tagList.h(i)).i());
						case 6: list.set(i, ((NBTTagDouble)tagList.h(i)).asDouble());
						case 7: list.set(i, ((NBTTagByteArray)tagList.h(i)).c());
						case 8: list.set(i, ((NBTTagIntArray)tagList.h(i)).d());
						case 10: list.set(i, getNBTTagCompound(tagList.h(i)));
					}
				}
				map.put(string, list);
			}
			else if (compound.get(string) instanceof NBTTagLong) map.put(string, compound.getLong(string));
			else if (compound.get(string) instanceof NBTTagShort) map.put(string, compound.getShort(string));
			else if (compound.get(string) instanceof NBTTagString) map.put(string, compound.getString(string));
		}
		return new TagCompound(map);
	}

	@Override
	public void setNBTTagCompound(Object object, TagCompound compound) {
		// TODO Auto-generated method stub
		
	}
	
}
