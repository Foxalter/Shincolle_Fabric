

package com.techlorine.shincolle;

import com.techlorine.shincolle.init.ModItems;
import com.techlorine.shincolle.item.ExampleItemLoader;

import net.fabricmc.api.ModInitializer;

public class Shincolle implements ModInitializer {
	//public ExampleItemLoader expil = new ExampleItemLoader();
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ExampleItemLoader.Register();
		try {
			ModItems.initItems();
		} catch (Exception e) {
			e.printStackTrace();
		}
		   //
		   //load item
		   //load block(block, itemblock)
		   //load tile entity
		   //load sounds
		
		
		System.out.println("Hello Fabric world!");
	}
}
