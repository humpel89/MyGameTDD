package world.creators;

import world.items.Consumable;
import world.items.Equipment;
import world.items.InvalidItemTypeException;
import world.items.Item;
import world.items.ItemType;
import world.items.KeyItem;
import world.items.Weapon;

public class ItemCreator {

	public Item createItem(ItemType itemType) throws Exception {
		switch (itemType) {
		case WEAPON: 		return new Weapon();
		case EQUIPMENT: 	return new Equipment();
		case CONSUMABLE: 	return new Consumable();
		case KEYITEM: 		return new KeyItem();
		default:  throw new InvalidItemTypeException("Not a valid itemType");
		}
	}

}
