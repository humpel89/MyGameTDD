package world.creators;

import java.util.ArrayList;

import world.items.Armor;
import world.items.Consumable;
import world.items.Item;
import world.items.Weapon;
import world.items.resources.ArmorType;
import world.items.resources.FoodType;
import world.items.resources.Quality;
import world.items.resources.WeaponType;

public class ItemCreator {

	//private ArrayList<Item> allItemsInGame;
	private ItemNameTool nameTool;
	public ItemCreator() {
		nameTool = new ItemNameTool();
	}
	
	public Item createWeapon(int level, Quality quality, WeaponType type) {
		return new Weapon(level, quality, type);
		
	}

	public Item createArmor(int level, Quality quality, ArmorType type) {
		return new Armor(level, quality, type);
		
	}

	public Item createFood(int level, Quality quality, FoodType type) {
		return new Consumable(level, quality, type);
	}

	public Item newRandom() {
		return null;
	}

}
