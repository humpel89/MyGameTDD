package world.items;

import world.items.resources.Quality;
import world.items.resources.WeaponType;
import world.stats.Stat;

public class Weapon extends Equipment implements SetAndGetEquipmentStats {

	private WeaponType type;
	private Stat mainStat;
	private double damage;
	
	public Weapon(WeaponType type, EquipmentStats stats){
		this.type = type;
		setStats(stats);
	}

	void setStats(EquipmentStats stats) {
		//setQuality(stats.getQuality());
		this.mainStat = type.getMainStat();
	}

	public double getWeaponDamage() {
		return damage;
	}

	private void setWeaponType(WeaponType type) {
		this.type = type;
	}

	@Override
	public void setQuality(Quality quality) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Quality getQuality() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEquipmentLevel(int level) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Quality getEquipmentLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}



}
