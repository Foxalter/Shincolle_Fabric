package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.init.ModItems;
import net.fabricmc.example.item.ExampleItemLoader;

public class ExampleMod implements ModInitializer {
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
