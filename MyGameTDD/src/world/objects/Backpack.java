package world.objects;

import world.objects.ItemContainer;

public class Backpack extends ItemContainer {
	
	public void clearBackPack(){
		super.clear();
	}
	
	public void removeItemAtSlot(int slot) throws Exception{
		super.remove(slot);
	}
	
}
