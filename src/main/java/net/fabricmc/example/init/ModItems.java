package net.fabricmc.example.init;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.fabricmc.example.item.AbyssMetalItem;
import net.fabricmc.example.item.AbyssNuggetItem;
import net.fabricmc.example.item.AmmoItem;
import net.fabricmc.example.item.BasicItem;
import net.fabricmc.example.item.GrudgeItem;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	public static final Item ABYSSIUM_INGOT;
	public static final Item POLYMETALLIC_NODULES;
	public static final Item ABYSS_NUGGET;
	public static final Item POLYMETALLIC_NUGGET;
	public static final Item AMMO;
	public static final Item HEAVY_AMMO;
	public static final Item AMMO_CONTAINER;
	public static final Item HEAVY_AMMO_CONTAINER;
	public static final Item GRUDGE;
	
	public static final ItemGroup EXAMPLE_MOD = FabricItemGroupBuilder.build(
			new Identifier("example", "general"),
			() -> new ItemStack(Items.BEACON));
//	
////	public static void Register() {
////	    Registry.register(Registry.ITEM, new Identifier("tutorial", "fabric_item"), FABRIC_ITEM);
////	}
	private static List<BasicItem> ListItems = new ArrayList<BasicItem>();
//
	private static Collection<ItemStack> ItemStackCollection = new ArrayList<ItemStack>();
//	
	static {

			ABYSSIUM_INGOT = new AbyssMetalItem("abyssium_ingot", 0, new Item.Settings()).initItem(ListItems);
			POLYMETALLIC_NODULES = new AbyssMetalItem("polymetallic_nodules", 1, new Item.Settings()).initItem(ListItems);
			ABYSS_NUGGET = new AbyssNuggetItem("abyss_nugget", 0, new Item.Settings()).initItem(ListItems);
			POLYMETALLIC_NUGGET = new AbyssNuggetItem("polymetalic_nugget", 1, new Item.Settings()).initItem(ListItems);
			AMMO = new AmmoItem("ammo", 0, new Item.Settings()).initItem(ListItems);
			AMMO_CONTAINER = new AmmoItem("ammo_container", 1, new Item.Settings()).initItem(ListItems);
			HEAVY_AMMO = new AmmoItem("heavy_ammo", 2, new Item.Settings()).initItem(ListItems);
			HEAVY_AMMO_CONTAINER = new AmmoItem("heavy_ammo_container", 3, new Item.Settings()).initItem(ListItems);
		    GRUDGE = new GrudgeItem("grudge", new Item.Settings()).initItem(ListItems);
	}
	
		public static void initItems() throws Exception
		{
			for(int i=0;i< ListItems.size();i++){ 
			try
			{
				BasicItem ITEM_1 =  ListItems.get(i);
				Registry.register(Registry.ITEM, new Identifier("shincolle", ITEM_1.getRegistryName()), ITEM_1);
				ItemStackCollection.add(new ItemStack(ITEM_1));
			}
			catch (Exception e)
			{
				//item建立instance失敗, 此例外必須丟出以強制中止遊戲
				//LogHelper.info("EXCEPTION: instancing fail: "+itemClass);
				e.printStackTrace();
				throw e;
			}
			}
			
			//Create Creative Tab
			@SuppressWarnings("unused")
			final ItemGroup SHINCOLLE_GROUP = FabricItemGroupBuilder.create(
					new Identifier("shincolle", "items"))
					.icon(() -> new ItemStack(GRUDGE))
					.appendItems(stacks ->
					{
						stacks.addAll(ItemStackCollection);
					})
					.build();
		}
 }
