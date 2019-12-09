package com.techlorine.shincolle.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleItemLoader {
	public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(16));
	
	public ExampleItemLoader() {}
	
    public static void Register() {
    	Registry.register(Registry.ITEM, new Identifier("tutorial", "fabric_item"), FABRIC_ITEM);
    }
}
