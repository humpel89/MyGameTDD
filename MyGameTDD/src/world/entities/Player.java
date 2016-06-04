package world.entities;

import world.entities.LivingEntity;
import world.objects.Backpack;
import world.items.Armor;
import world.items.Weapon;

public class Player extends LivingEntity {

	Backpack bag;
	Weapon weapon;
	Armor armor;
	
	
	//@Override
	public Player(String name) {
		super(name);
		bag = new Backpack();
	}

}
