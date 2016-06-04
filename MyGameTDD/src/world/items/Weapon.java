package world.items;

import world.items.resources.WeaponType;

public class Weapon extends Item {
	
	private WeaponType weaponType;
	
	public Weapon(WeaponType weaponType){
		this.weaponType = weaponType;
		setItemName(this.weaponType.toString());
		setItemLevel(1);
	}
	
	
	
}
