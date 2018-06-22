package test.java.execiseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercise3.Places;

public class PlacesTest {

	@Test
	public void testVowelDelete() {
		String[] arr = {"USA","Delhi","Italy"},expec = {"S","Dlh","tly"};
		String[] act = Places.vowelDelete(arr);
		assertEquals(expec,act);
		
	}

}
