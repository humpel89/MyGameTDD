package world.items;

import world.items.resources.FoodType;
import world.items.resources.Quality;

public class Consumable extends Item  {

	private int level;
	private Quality quality;
	private FoodType type;
	
	public Consumable(int level, Quality quality, FoodType type){
		this.level = level;
		this.quality = quality;
		this.type = type;
	}

	public Consumable() {
		// TODO Auto-generated constructor stub
	}
	
}
