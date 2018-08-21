package test.java.ArrayOfArrayProducts;

import org.junit.Assert;
import org.junit.Test;

import main.java.ArrayOfArrayProducts.ArrayProducts;

public class ArrayProductsTest {

	ArrayProducts ap = new ArrayProducts();
	
	@Test
	public void testNullArray() {
		int[] arr = null;
		Assert.assertNull(ap.arrayOfArrayProducts(arr));
	}
	
	@Test
	public void testOneElement() {
		int[] arr = {0};
		int[] expecteds = new int[] {1};
		Assert.assertArrayEquals(expecteds, ap.arrayOfArrayProducts(arr));
	}
	
	@Test
	public void testTwoElement() {
		int[] arr = {1,2};
		int[] expecteds = new int[] {2,1};
		Assert.assertArrayEquals(expecteds, ap.arrayOfArrayProducts(arr));
	}
	
	@Test
	public void testFourElement() {
		int[] arr = {1,2,3,4};
		int[] expecteds = new int[] {24,12,8,6};
		Assert.assertArrayEquals(expecteds, ap.arrayOfArrayProducts(arr));
	}
	
	@Test
	public void testFourLargerElement() {
		int[] arr = {2,3,4,5};
		int[] expecteds = new int[] {60,40,30,24};
		Assert.assertArrayEquals(expecteds, ap.arrayOfArrayProducts(arr));
	}
	
	@Test
	public void testRandomElement() {
		int[] arr = {2,1,1,3};
		int[] expecteds = new int[] {3,6,6,2};
		Assert.assertArrayEquals(expecteds, ap.arrayOfArrayProducts(arr));
	}
}
