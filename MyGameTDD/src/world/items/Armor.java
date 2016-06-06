package world.items;

import world.builders.ItemNameBuilder;
import world.items.resources.ArmorType;
import world.items.resources.Quality;

public class Armor extends Equipment {
	
	
	private int level;
	private Quality quality;
	private ArmorType type;
	private String name;
	
	public Armor(int level, Quality quality, ArmorType type){
		//super.slot = slot;
		this.level = level;
		this.quality = quality;
		this.type = type;
		this.name = generateArmorName();
	}
	
	public Armor() {
		// TODO Auto-generated constructor stub
	}

	public int getItemLevel(){
		return level;
	}
	
	private String generateArmorName() { 
		return ItemNameBuilder.constructRandomArmorName(quality, type);
	}
	
	@Override
	public String toString(){
		return name;
	}

}
