package test.java.execiseTest;
import main.java.exercise3.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixSumTest {

	@Test
	public void testAddMatrices() {
		
		int arr1[][] = {{2,3},{7,4}}, arr2[][] = {{5,1},{8,6}},expec[][]= {{7,4},{15,10}};
		int act[][] = MatrixSum.addMatrices(arr1,arr2);
		assertEquals(expec,act);
		int bad1[][] = {{1},{2,3}},bad2[][] = {{2,3}},check[][]=null;
		assertEquals(check,MatrixSum.addMatrices(bad1,bad2));
	}

}
