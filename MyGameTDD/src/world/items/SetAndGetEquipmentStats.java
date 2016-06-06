package world.items;

import world.items.resources.Quality;

public interface SetAndGetEquipmentStats {

	abstract void setQuality(Quality quality);
	
	public Quality getQuality();
	
	abstract void setEquipmentLevel(int level);
	
	public int getEquipmentLevel();
	
	abstract void setName(String name);
	
	public String getName();
}
