package world.creators;

import java.util.ArrayList;
import java.util.Random;

import exceptions.InvalidItemTypeException;
import world.items.Armor;
import world.items.Consumable;
import world.items.Item;
import world.items.KeyItem;
import world.items.Weapon;
import world.items.resources.ArmorType;
import world.items.resources.FoodType;
import world.items.resources.ItemType;
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

	public Item createLoot(int level, ItemType type) throws InvalidItemTypeException {
		return itemFactory(level, type);
	}

	private Item itemFactory(int level, ItemType itemType) throws InvalidItemTypeException {
		switch (itemType) {
		case WEAPON: 		return new Weapon(); 
		case ARMOR:  		return new Armor(level, null, null); 
		case CONSUMABLE:  	return new Consumable(level, null, null); 
		case KEYITEM: 		return new KeyItem();
		case RANDOM: 		return itemFactory(level, createRandomItemType());	
		default: throw new InvalidItemTypeException("Error in itemFactory");
		}
	}

	private ItemType createRandomItemType() {
		Random rand = new Random();
		return ItemType.values()[rand.nextInt(4)];
	}

}
