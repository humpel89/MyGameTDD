package world.creators;

import world.items.Item;
import world.items.Weapon;
import world.items.resources.WeaponType;

public class ItemCreator {
	
	public Item createWeapon(WeaponType type) {
		return new Weapon(type);
	}

}