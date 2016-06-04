package world.creators;

import static org.junit.Assert.*;

import org.junit.Test;

import world.creators.ItemNameTool;
import world.items.resources.Quality;
import world.items.resources.WeaponType;

public class TestItemNameTool {

	@Test
	public void testConstructRandomWeaponName() {
		ItemNameTool nameTool = new ItemNameTool();
		System.out.println(nameTool.constructRandomWeaponName(Quality.COMMON, WeaponType.AXE));
		System.out.println(nameTool.constructRandomWeaponName(Quality.UNCOMMON, WeaponType.BROADSWORD));
		System.out.println(nameTool.constructRandomWeaponName(Quality.RARE, WeaponType.BROADSWORD));
		System.out.println(nameTool.constructRandomWeaponName(Quality.EPIC, WeaponType.DAGGER));
		System.out.println(nameTool.constructRandomWeaponName(Quality.LEGENDARY, WeaponType.BOW));
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
