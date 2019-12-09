package com.techlorine.shincolle.item;

public class AbyssMetalItem extends BasicItem implements IShipResourceItem,IShipFoodItem {
/*meta:
	0 - abyssium ingot
	1 - polymetallic nodules
*/	

	public AbyssMetalItem(String ulname_1, int meta_1, Settings item$Settings_1) {
		super(ulname_1, meta_1, item$Settings_1);
	}

	@Override
	public float getFoodValue()
	{
		return 30F;
	}

	@Override
	public float getSaturationValue()
	{
		return 0.8F;
	}

	@Override
	public int getSpecialEffect() {
		if(this.getMeta() == 0)
			return 2;
		else
			return 4;
	}

	@Override
	public int[] getResourceValue()
	{
			if(this.getMeta() == 0)
				return new int[] {0, 1, 0, 0};
			else
				return new int[] {0, 0, 0, 1};
	}

    
}
