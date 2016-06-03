package world.creators;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import world.items.Consumable;
import world.items.Equipment;
import world.items.InvalidItemTypeException;
import world.items.Item;
import world.items.ItemType;
import world.items.KeyItem;
import world.items.Weapon;

public class testItemCreator {
	
	ItemCreator ic;

	@Before
	public void setUp() throws Exception {
		ic = new ItemCreator();
	}
	
	@Test
	public void testCreateWeapon() throws Exception {
		assertTrue(createItemAndValidate(new Weapon(), ItemType.WEAPON));
	}
	
	@Test
	public void testCreateEquipment() throws Exception {
		assertTrue(createItemAndValidate(new Equipment(), ItemType.EQUIPMENT));
	}
	
	@Test
	public void testCreateConsumable() throws Exception {
		assertTrue(createItemAndValidate(new Consumable(), ItemType.CONSUMABLE));
	}
	
	@Test
	public void testCreateKeyItem() throws Exception {
		assertTrue(createItemAndValidate(new KeyItem(), ItemType.KEYITEM));
	}
	
	@Test (expected = NullPointerException.class)
	public void testCreateInvalidItemType() throws Exception {
		ItemType itemType = null;
		Item item = ic.createItem(itemType);
	}
	
	private boolean createItemAndValidate(Item item, ItemType itemType) throws Exception {
		Item createdItem = ic.createItem(itemType);
		return(item.getClass().equals(createdItem.getClass()));
	}
	


}
