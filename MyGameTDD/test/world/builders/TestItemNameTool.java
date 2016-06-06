package world.builders;

import static org.junit.Assert.*;

import org.junit.Test;

import world.builders.ItemNameBuilder;
import world.items.resources.Quality;
import world.items.resources.WeaponType;

public class TestItemNameTool {

	@Test
	public void testConstructRandomWeaponName() {
		System.out.println(ItemNameBuilder.constructRandomWeaponName(Quality.COMMON, WeaponType.AXE));
		System.out.println(ItemNameBuilder.constructRandomWeaponName(Quality.UNCOMMON, WeaponType.BROADSWORD));
		System.out.println(ItemNameBuilder.constructRandomWeaponName(Quality.RARE, WeaponType.BROADSWORD));
		System.out.println(ItemNameBuilder.constructRandomWeaponName(Quality.EPIC, WeaponType.DAGGER));
		System.out.println(ItemNameBuilder.constructRandomWeaponName(Quality.LEGENDARY, WeaponType.BOW));
	}

	@Test
	public void testConstructRandomArmorName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRandomFoodName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRandomBeverageName() {
		fail("Not yet implemented");
	}

	@Test
	public void testTrimToStartWithCapital() {
		fail("Not yet implemented");
	}

}
