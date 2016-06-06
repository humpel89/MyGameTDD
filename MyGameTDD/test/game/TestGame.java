package game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGame {
	GameMain game;
	
	@Before
	public void setUp() {
		game = new GameMain();
	}
	
	@Test
	public void testRun() {
		assertTrue(game.run());
	}

}
