package world.items;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testItem {

	Item item;
	
	@Before
	public void setup() {
		item = new Item();
	}
	
	@Test
	public void testGetItemLevel() {
		int expectedLevel = 1;
		assertEquals(expectedLevel , item.getItemLevel());
	}
	
	@Test
	public void testSetItemLevel() {
		int expectedLevel = 6;
		item.setItemLevel(expectedLevel);
		assertEquals(expectedLevel , item.getItemLevel());
	}
	
}
