package world.creators;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import world.items.Item;
import world.items.resources.WeaponType;
import world.items.Weapon;

public class TestItemCreator {
	
	ItemCreator ic;

	@Before
	public void setUp() throws Exception {
		ic = new ItemCreator();
	}
	
	@Test
	public void testCreateAxe() throws Exception {
		//ItemStats itemStats = Mockito.mock(ItemStats.class);
		Item axe = ic.createWeapon(WeaponType.AXE);
		
		assertEquals(Weapon.class, axe.getClass());
		assertEquals("Axe", axe.getItemName());
	}

}
