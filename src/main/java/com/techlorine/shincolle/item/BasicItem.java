package com.techlorine.shincolle.item;

import java.util.List;

import net.minecraft.item.Item;

abstract public class BasicItem extends Item{
	private final int meta;
    private final String registryName;
	public BasicItem(String ulname_1, Settings item$Settings_1) {
		this(ulname_1, 0, item$Settings_1);
	}
	
	public BasicItem(String ulname_1, int meta_1 , Settings item$Settings_1) {
		super(item$Settings_1);
		this.registryName = ulname_1;
		this.meta = meta_1;
	}
	
//	public int getTypes()
//	{
//		return 1;
//	}
	
	public int getMeta() {
		return this.meta;
	}
	
	public String getRegistryName() {
		return this.registryName;
	}
	
	public BasicItem initItem(List<BasicItem> ListItems_1) {
	   	ListItems_1.add(this);
	   	return this;
	}
	
}
