package test.java.execiseTest;

import static org.junit.Assert.*;
import main.java.exercise3.*;

import org.junit.Test;

public class ExceptionsTest {

	@Test
	public void testNegativeArraySizeChecker() {
		assertEquals("Negative array size exception",Exceptions.NegativeArraySizeChecker());
	}

	@Test
	public void testIndexOutOfBoundsChecker() {
		assertEquals("Index out of bounds exception",Exceptions.IndexOutOfBoundsChecker());
	}

	@Test
	public void testNullPointerExceptionChecker() {
		assertEquals("Null pointer exception",Exceptions.NullPointerExceptionChecker());
	}

}
