package world.objects;

import java.util.ArrayList;

import world.actions.Lootable;
import world.items.Item;

public class LootCrate extends ItemContainer implements Lootable {	

	public ArrayList<Item> getLoot() {
		return super.getAll();
	}

}
