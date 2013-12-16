package mariculture.magic.jewelry.parts;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class JewelryPart {
	public static ArrayList<JewelryPart> materialList = new ArrayList();
	
	public JewelryPart() {
		materialList.add(this);
	}
	
	//Whether or not this part is valid for 0 - Ring, 1 - Bracelet, 2 - Necklace
	public boolean isValid(int type) {
		return true;
	}
	
	//Whether this is 'visible' as in whether to show/register a image
	public boolean isVisible(int type) {
		return true;
	}

	//The name of this part
	public String getPartName() {
		return "blank";
	}
	
	//The language Entry to use
	public String getPartLang() {
		return "";
	}

	//The type of Jewelry Part this is
	public String getPartType(int type) {
		return "blank";
	}

	//The 'Enchantability' that this part provides
	public int getEnchantability() {
		return 1;
	}

	//return the color code you want this material to make the jewelry pieces' name
	public String getColor() {
		return "\u00a7f";
	}
	
	//return the ItemStack for this item for crafting
	public ItemStack getItemStack() {
		return new ItemStack(Item.ingotGold);
	}
	
	//Add Any Enchantments by default
	public ItemStack addEnchantments(ItemStack stack) {
		return stack;
	}

	//Return true if you should only add once instance of this item
	public boolean addOnce() {
		return false;
	}

	//Return true if this a 'special' part like for example the one ring
	public boolean isSingle() {
		return false;
	}
}