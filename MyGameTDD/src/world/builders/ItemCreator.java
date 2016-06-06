package world.builders;

import java.util.Random;

import exceptions.InvalidItemTypeException;
import world.items.Armor;
import world.items.Consumable;
import world.items.EquipmentStats;
import world.items.Item;
import world.items.KeyItem;
import world.items.Weapon;
import world.items.resources.ItemType;
import world.items.resources.Quality;
import world.items.resources.WeaponType;

public class ItemCreator {

	private ItemNameBuilder nameTool;
	private Random random;
	public ItemCreator() {
		nameTool = new ItemNameBuilder();
		random = new Random();
	}

	public Item createRandomLoot(int level) throws InvalidItemTypeException {
		Quality quality = getRandomQuality();
		ItemType itemType = getRandomItemType();
		Item item = itemFactory(getRandomItemType());
		return item;
	}
	
	private Quality getRandomQuality(){
		int numberOfQualities = Quality.values().length;
		return Quality.values()[random.nextInt(numberOfQualities)];
	}
	
	private ItemType getRandomItemType() {
		int numberOfTypes = ItemType.values().length;
		return ItemType.values()[random.nextInt(numberOfTypes)];
	}

	public Weapon createCustomWeapon(WeaponType axe, EquipmentStats stats) {
		return new Weapon(axe, stats);
	}
}
