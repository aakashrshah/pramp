package test.java.sorting.HeapSort;

import org.junit.Assert;
import org.junit.Test;

import main.java.sorting.HeapSort.HeapSort;

public class HeapSortTest {
	
	HeapSort h = new HeapSort();
	
	@Test
	public void testNullArray() {
		int[] arr = null;
		int[] expectedArray = null;
		Assert.assertArrayEquals(expectedArray, h.sort(arr));
		System.out.println("\n");
	}
	
	@Test
	public void testOneArray() {
		int[] arr = {5};
		int[] expectedArray = {5};
		Assert.assertArrayEquals(expectedArray, h.sort(arr));
		System.out.println("\n");
	}
	
	@Test
	public void testTwoArray() {
		int[] arr = {6,5};
		int[] expectedArray = {5,6};
		Assert.assertArrayEquals(expectedArray, h.sort(arr));
		System.out.println("\n");
	}
	
	@Test
	public void testThreeArray() {
		int[] arr = {7,6,5};
		int[] expectedArray = {5,6,7};
		Assert.assertArrayEquals(expectedArray, h.sort(arr));
		System.out.println("\n");
	}
	
	@Test
	public void testFourArray() {
		int[] arr = {7,5,9,0};
		int[] expectedArray = {0,5,7,9};
		Assert.assertArrayEquals(expectedArray, h.sort(arr));
		System.out.println("\n");
	}
}
