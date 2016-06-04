package world.items;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestWeapon {

	Weapon weapon;
	
	@Before
	public void setUp() throws Exception {
		//TODO
		//weapon = new Weapon(WeaponType.AXE);
	}

	@Test
	public void testGetItemLevel() {
		assertEquals(1, weapon.getItemLevel());
	}

}
