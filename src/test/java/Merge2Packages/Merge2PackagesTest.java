package test.java.Merge2Packages;

import org.junit.Assert;
import org.junit.Test;

import main.java.Merge2Packages.Merge2Packages;

public class Merge2PackagesTest {
		
	@Test
	public void getNullArrayTest() {
		int[] arr = null;
		Assert.assertArrayEquals( arr, Merge2Packages.getIndicesOfItemWeights(arr,2) );
	}
	
	@Test
	public void getForOneNumbers() {
		int[] arr = {3};
		int limit = 3;
		int[] expected = {};
		Assert.assertArrayEquals(expected,  Merge2Packages.getIndicesOfItemWeights(arr, limit));
	}
	
	
	@Test
	public void getForTwoNumbers() {
		int[] arr = {3,4};
		int limit = 7;
		int[] expected = {1, 0};
		Assert.assertArrayEquals(expected,  Merge2Packages.getIndicesOfItemWeights(arr, limit));
	}
	
	@Test
	public void getStandardExample() {
		int[] arr = {4, 6, 10, 15, 16};
		int limit = 21;
		int[] expected = {3, 1};
		Assert.assertArrayEquals(expected,  Merge2Packages.getIndicesOfItemWeights(arr, limit));
	}
	
	@Test
	public void testRepeatingNumbers() {
		int[] arr = {4, 4,1};
		int limit = 5;
		int[] expected = {2, 1};
		Assert.assertArrayEquals(expected,  Merge2Packages.getIndicesOfItemWeights(arr, limit));
	}
}
