package world.creators;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import world.creators.ItemCreator;
import world.items.Item;
import world.items.resources.ArmorType;
import world.items.resources.FoodType;
import world.items.resources.Quality;
import world.items.resources.WeaponType;

public class TestItemCreator {
	
	ItemCreator creator = new ItemCreator();
	int level = 10;
	WeaponType weaponType;
	ArmorType armorType;
	FoodType foodType;
	
	@Before
	public void setUp() throws Exception {
		weaponType = WeaponType.AXE;
		armorType = ArmorType.LIGHTLEATHER;
		foodType = FoodType.FOOD;
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
//	@Test
//	public void testCreateItem(){
//		Item weapon = creator.createItem(level, Quality.EPIC, );
//		
//	}
	
//	@Test
//	public void testCreateWeapon(){
//		Item weapon = creator.createWeapon();
//	}
//	
//	@Test
//	public void testCreateArmor(){
//		Item armor = creator.createArmor(ArmorStats);
//	}
//	
//	@Test
//	public void testCreateFood(){
//		Item food = creator.createFood(FoodStats);
//	}
//	
//	@Test
//	public void testCreateKeyItem(){
//		Item keyItem = creator.createKeyItem(KeyItemStats);
//	}
	
	@Test
	public void testNewRandomItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testNewRandomFood() {
		fail("Not yet implemented");
	}

	@Test
	public void testNewRandomWeapon() {
		fail("Not yet implemented");
	}

	@Test
	public void testNewRandomArmor() {
		fail("Not yet implemented");
	}

}
