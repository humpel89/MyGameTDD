package world.builders;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import world.builders.ItemCreator;
import world.items.EquipmentStats;
import world.items.Item;
import world.items.resources.Quality;
import world.items.resources.WeaponType;

public class TestItemCreator {
	
	ItemCreator ic;
	EquipmentStats stats;
	Item item;
	int level;
	String itemName;
	Quality quality;
	
	@Before
	public void setUp() throws Exception {
		level = 15;
		itemName = "Foe Slayer";
		quality = Quality.EPIC;
		
		ic = new ItemCreator();
		
		stats = Mockito.mock(new EquipmentStats().getClass());
		Mockito.when(stats.getEquipmentLevel()).thenReturn(level);
		Mockito.when(stats.getQuality()).thenReturn(quality);
		Mockito.when(stats.getName()).thenReturn(itemName);
	}

	@After
	public void tearDown() throws Exception {
		item = null;
	}
	
	@Test
	public void testCreateCustomLootWeapon(){
		
		item = ic.createCustomWeapon(WeaponType.AXE, stats);
		assertEquals(itemName,item.getItemName());
	}
	
}
