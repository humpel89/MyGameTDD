package world.items;

import world.items.resources.ItemSlot;
import world.items.resources.Quality;

public abstract class Equipment extends Item {

	private int itemLevel;
	private ItemSlot slot;
	private Quality quality;
	
	abstract void setStats(EquipmentStats stats);

}
