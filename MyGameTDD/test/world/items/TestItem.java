package world.items;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestItem {

	Item item;

	@Before
	public void setup() {
		item = Mockito.mock(Item.class, Mockito.CALLS_REAL_METHODS);
	}

	@Test
	public void testGetItemLevel() {
		assertEquals(1, item.getItemLevel());
	}

	@Test
	public void testSetItemLevel() {
		item.setItemLevel(4);
		assertEquals(4, item.getItemLevel());
	}
	
}

