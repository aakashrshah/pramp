package main.java.ArrayOfArrayProducts;

public class ArrayProducts {
/*	Array of Array Products

	Given an array of integers arr, you’re asked to calculate for each index i the product of all integers except the integer at that index (i.e. except arr[i]). Implement a function arrayOfArrayProducts that takes an array of integers and returns an array of the products.

	Solve without using division and analyze your solution’s time and space complexities.
*/
	
	  public int[] arrayOfArrayProducts(int[] arr) {
		  
		  if(arr == null) {
			  return null;
		  }
		  int pre = 1;
		  int post = 1;
		  int[] result = new int[arr.length];
		  
		  for(int i=0;i<arr.length;i++) {
			  result[i] = pre;
			  pre *= arr[i];
		  }
		  
		  for(int i=arr.length-1;i>=0;i--) {
			  result[i] *= post;
			  post *= arr[i];
			 
		  }
		  
//		  for(int i:result) {
//			  System.out.println(i);
//		  }
		  return result;
	  }
	  
	  

}
