package net.fabricmc.example.item;

/** ship food item
*
*/
public interface IShipFoodItem
{
	
	/** get resource value */
	public float getFoodValue();
	
	/** get saturation value */
	public float getSaturationValue();
	
	/** get special effect */
	public int getSpecialEffect();
	
	
}
