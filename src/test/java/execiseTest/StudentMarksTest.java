package test.java.execiseTest;
import main.java.exercise3.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentMarksTest {

	@Test
	public void testCheck() {
		
		
	assertEquals(StudentMarks.check(new int[]{12,34,56,98}),new String[]{"True","True","True","True"});
	assertEquals(StudentMarks.check(new int[]{-2,34,156,98}),new String[]{"False","True","False","True"});
	 
	}

}
