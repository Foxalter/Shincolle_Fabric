package com.techlorine.shincolle.item;

import net.minecraft.item.Item.Settings;

public class GrudgeItem extends BasicItem implements IShipResourceItem, IShipFoodItem{

	public GrudgeItem(String ulname_1, Settings item$Settings_1) {
		super(ulname_1, item$Settings_1);
	}

	@Override
	public int[] getResourceValue()
	{
		return new int[] {1, 0, 0, 0};
	}
	
	@Override
	public float getFoodValue()
	{
		return 10F;
	}

	@Override
	public float getSaturationValue()
	{
		return 0.5F;
	}

	@Override
	public int getSpecialEffect()
	{
		return 1;
	}

}
