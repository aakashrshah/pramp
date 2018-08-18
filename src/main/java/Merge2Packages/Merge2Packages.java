package main.java.Merge2Packages;

import java.util.HashMap;
import java.util.Map;

/*
Merging 2 Packages

Given a package with a weight limit limit and an array arr of item weights, implement a function getIndicesOfItemWeights that finds two items whose sum of weights equals the weight limit limit. Your function should return a pair [i, j] of the indices of the item weights, ordered such that i > j. If such a pair doesn’t exist, return an empty array.

Analyze the time and space complexities of your solution.

Example:

input:  arr = [4, 6, 10, 15, 16],  lim = 21

output: [3, 1] # since these are the indices of the
               # weights 6 and 15 whose sum equals to 21
Constraints:

[time limit] 5000ms

[input] array.integer arr

0 ≤ arr.length ≤ 100
[input] integer limit

[output] array.integer
*/

public class Merge2Packages {

	  public static void main(String args[]) {
		  getIndicesOfItemWeights(null, 0);
	  }
	
	  public static int[] getIndicesOfItemWeights(int[] arr, int limit) {

		  if(arr == null) {
			  return null;
		  }
		  
		  
		  //Question? Why is the next line wrong?
		  //		  HashMap<Integer, Integer> map = new Map<Integer, Integer>();
		  
		  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		  
		  for(int i=0; i<arr.length;i++) {
			  if(map.containsKey(arr[i])) {
				  int val = map.get(arr[i]);
				  return new int[] {i, val};
			  }
			  int diff = limit - arr[i];
			  map.put(diff, i);
		  }
		  
		  return new int[] {};
	  }
	  

}
