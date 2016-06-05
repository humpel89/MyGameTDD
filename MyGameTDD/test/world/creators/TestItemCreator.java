package world.creators;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exceptions.InvalidItemTypeException;
import world.creators.ItemCreator;
import world.items.Item;
import world.items.resources.ItemType;

public class TestItemCreator {
	
	ItemCreator ic = new ItemCreator();
	Item item;
	int level = 1;
	
	@Before
	public void setUp() throws Exception {
		ic = new ItemCreator();
	}

	@After
	public void tearDown() throws Exception {
		item = null;
	}
	
	@Test
	public void testCreateRandomLoot() throws InvalidItemTypeException{
		item = ic.createLoot(level, ItemType.WEAPON);
		System.out.println(item.getItemName());
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
