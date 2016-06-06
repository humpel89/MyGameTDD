package world.items;

import world.items.resources.ItemSlot;
import world.items.resources.Quality;

public interface EquipmentSetup {
	
	public ItemSlot getItemSlot();
	
	abstract void setItemSlot(ItemSlot slot);
	
	public Quality getQuality();
	
	void setQuality(Quality quality);

	public int getItemLevel();
	
	void setItemLevel(int itemLevel);
}
