package main.java.KMessedArray;

import java.util.PriorityQueue;

public class KMessedArraySort {

	
	public static void main(String[] args) {
		    int[] arr = {1, 4, 5, 2, 3, 7, 8, 6, 10, 9};
		    System.out.println(" ");

		    for(int i: arr){
		      System.out.print(i+ " ");
		    }
		    
		    int k = 2;
		    int[] result = sortKMessedArray(arr,k);
		    
			System.out.println(" ");

		    for(int i: result){
		      System.out.print(i+ " ");
		    }
	 }

//	private static int[] sortKMessedArray(int[] arr, int k) {
//		/*
//		 * Insertion Sort
//		 * Time complexity -> O(n.k)
//		 * Since each neighbor will only be k positions far away. The second loop will never exceed k iterations. Hence O(n.k)
//		 * Although we do not use the value of k.
//		 */
//		int prev = 0;
//		for(int i=1;i<arr.length;i++) {
//			prev = i-1;
//			if(arr[i] < arr[prev]) {
//				for(int j=prev;j>=0;j--) {
//					if(arr[i] < arr[j]) {
//						swap(arr,i,j);
//					}
//					i--;
//				}
//			}
//		}
//		return arr;
//	}
	
	
	private static int[] sortKMessedArray(int[] arr, int k) {
		
		int n = arr.length;
		/*
//		 * Using Min Heap
//		 * Time complexity -> O(n log(k))
//		 * Essentially linear. The one pass of the array and thr log(k) heap will extract_min() n times.
		 */
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		/*
		 * {1, 4, 5, 2, 3, 7, 8, 6, 10, 9} , k = 2;
		 * First k+1 elements in the heap.
		 * 0,1,2,3 <k+1> in heap.
		 */
		
		for(int i=0; i<=k; i++) {
			heap.add(arr[i]);
		}
		
		/*
		 * {1, 4, 5, 2, 3, 7, 8, 6, 10, 9} , k = 2, n = 10;
		 *  Traverse the rest of the elements 
		 *  i From k+1 to n-1     -> 3 4 5 6 7 8 9
		 *  Array Positions       -> 0 1 2 3 4 5 6
		 *  Formula for idx = i-k -> 1 2 3 4 5 6 7
		 *  Formula idx =   i-k-1 -> 0 1 2 3 4 5 6
		 *  
		 *  Extract minimum so far and add it to the arr. 
		 *  Pass the current element in the heap. 
		 *  
		 *  Thus the heap keeps taking one new number every pass
		 *  and extracting the minimum so far which we can put it in the array.
		*/
		
		for(int i=k+1; i<n ; i++) {
			arr[i-k-1] = heap.poll();
			heap.add(arr[i]);
		}
		
		/*
		 *  {1, 2, 3, 4, 5, 6, 7 | 6, 10, 9 } , k = 2, n = 10;
		 *  Traverse the rest of the elements 
		 *  i From 0 to k           -> 0,    1,    2
		 *  Array Positions         -> 7,    8,    9
		 *  Formula for idx n-(k+1) -> 7+0, 7+1, 7+2
		 *  
		 *  Add the remaining values from the heap. These are the k+1 values we missed above.
		*/
		
		for(int i=0; i<=k; i++) {
			arr[n-k-1 + i] = heap.poll();
		}
		
		return arr;
	}
	
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	  
}
