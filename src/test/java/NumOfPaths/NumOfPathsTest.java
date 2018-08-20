package test.java.NumOfPaths;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.NumOfPaths.NumOfPaths;

public class NumOfPathsTest {
	  
	
	NumOfPaths solution = new NumOfPaths();
	
	@Test
	public void testCenter() {
		int n = 0;
		int expectedNumOfPath = 0;
		assertEquals(expectedNumOfPath, solution.numOfPathsToDest(n));
	}
	
	@Test
	public void testOneBlock() {
		int n = 1;
		System.out.println("TestBlock " + n);
		int expectedNumOfPath = 1;
		assertEquals(expectedNumOfPath, solution.numOfPathsToDest(n));
	}
	
	@Test
	public void testTwoBlock() {
		int n = 2;
		System.out.println("TestBlock " + n);

		int expectedNumOfPath = 1;
		assertEquals(expectedNumOfPath, solution.numOfPathsToDest(n));
	}
	
	@Test
	public void testThreeBlock() {
		int n = 3;
		System.out.println("TestBlock " + n);

		int expectedNumOfPath = 2;
		assertEquals(expectedNumOfPath, solution.numOfPathsToDest(n));
	}
	
	@Test
	public void testFourBlock() {
		int n = 4;
		System.out.println("TestBlock " + n);

		int expectedNumOfPath = 5;
		assertEquals(expectedNumOfPath, solution.numOfPathsToDest(n));
	}
	
	@Test
	public void testSixBlock() {
		int n = 6;
		System.out.println("TestBlock " + n);

		int expectedNumOfPath = 42;
		assertEquals(expectedNumOfPath, solution.numOfPathsToDest(n));
	}
	
}
