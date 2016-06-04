package world.entities;

import world.entities.LivingEntity;
import world.objects.LootCrate;

public class Enemy extends LivingEntity {
	
	LootCrate enemyLoot;
	
	public Enemy(String name) {
		super(name);
		enemyLoot = new LootCrate();
	}

//	public void generateRandomLootCrate(ItemCreator creator){
//		//TODO
//	}
	
}
