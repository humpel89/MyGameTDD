package world.items;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import world.items.resources.WeaponType;

public class TestWeapon {

	Weapon weapon;
	
	@Before
	public void setUp() throws Exception {
		weapon = new Weapon(WeaponType type, EquipmentStats stats);
	}

	@Test
	public void testGetItemLevel() {
		assertEquals(1, weapon.getItemLevel());
	}

}
