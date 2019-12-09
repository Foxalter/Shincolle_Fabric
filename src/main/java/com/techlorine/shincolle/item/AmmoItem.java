package com.techlorine.shincolle.item;

import net.minecraft.item.Item.Settings;

/** meta:
 *     0: ammo 
 *     1: ammo container
 *     2: heavy ammo
 *     3: heavy ammo container
 *
 */
public class AmmoItem extends BasicItem implements IShipFoodItem, IShipResourceItem {

	public AmmoItem(String ulname_1, int meta_1, Settings item$Settings_1) {
		super(ulname_1, meta_1, item$Settings_1);
	}


	@Override
	public int[] getResourceValue()
	{
		switch (this.getMeta())
		{
		case 0:
			return new int[] {0, 0, 1, 0};
		case 1:
			return new int[] {0, 0, 9, 0};
		case 2:
			return new int[] {0, 0, 4, 0};
		case 3:
			return new int[] {0, 0, 36, 0};
		default:
			return new int[] {0, 0, 0, 0};
		}
	}
	
	@Override
	public float getFoodValue()
	{
		return 5F;
	}

	@Override
	public float getSaturationValue()
	{
		return 0.3F;
	}

	@Override
	public int getSpecialEffect()
	{
		return 3;
	}
	

}
