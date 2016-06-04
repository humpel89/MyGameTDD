package world.items;

import world.items.resources.Quality;
import world.items.resources.WeaponType;
import world.stats.Stat;
import world.creators.ItemNameTool;

public class Weapon extends Equipment {
	
	private String name;
	private int level;
	private Quality quality;
	private WeaponType type;
	private Stat mainStat;
	
	public Weapon(int level, Quality quality, WeaponType type){
		this.level = level;
		this.quality = quality;
		this.type = type;
		//this.name = generateWeaponName();
		//this.mainStat = type.getMainStat();
	}
	
	
	
//	private String generateWeaponName() { 
//		return itemNameTool.constructRandomWeaponName(quality, type);
//	}
	
	@Override
	public String toString(){
		return name;
	}
}
