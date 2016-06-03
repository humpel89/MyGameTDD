package View;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testTextUserInterface {
	
	TextUserInterface ui;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
		ui = new TextUserInterface();
	}
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	
	@Test
	public void testPrintText() {
		String testMessage = "Hello World!";
		ui.print(testMessage);
		assertEquals(testMessage, outContent.toString());
	}
	
	@Test
	public void testPrintTextWithMatches() {
		String testMessage = "Hello World!";
		ui.print(testMessage);
		assertTrue(testMessage.matches(outContent.toString()));
	}
	
	@Test
	public void out() {
	    System.out.print("hello");
	    assertEquals("hello", outContent.toString());
	}
	
	@Test
	public void testSysoWithMatches() {
	    System.out.print("hello");
	    assertTrue("hello".matches(outContent.toString()));
	    System.out.print("NEWHELLO");
	    assertEquals("helloNEWHELLO", outContent.toString());
	}

	@Test
	public void testSysoWithErr() {
	    System.err.print("hello again");
	    assertEquals("hello again", errContent.toString());
	    System.err.print("NEWHELLO");
	    assertEquals("hello againNEWHELLO", errContent.toString());
	}

}
