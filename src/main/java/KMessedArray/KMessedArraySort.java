package main.java.KMessedArray;

public class KMessedArraySort {

	
	public static void main(String[] args) {
		    int[] arr = {1, 4, 5, 200, 3, 7, 8, 6, 10, 9};
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

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	private static int[] sortKMessedArray(int[] arr, int k) {
	
		/*
		 * Insertion Sort. Naive approach. 
		 */
//		int prev = 0;
//		for(int i=1;i<arr.length;i++) {
//			prev = i-1;
//			if(arr[i] < arr[prev]) {
//				swap(arr,i,prev);
//				int dup_i = i-1;
//				for(int j=prev-1;j>=0;j--) {
//					if(arr[dup_i] < arr[j]) {
//						swap(arr,dup_i,j);
//					}
//					dup_i--;
//				}
//			}else {continue;}
//		}
		
		
		int prev = 0;
		for(int i=1;i<arr.length;i++) {
			prev = i-1;
			if(arr[i] < arr[prev]) {
				for(int j=prev;j>=0;j--) {
					if(arr[i] < arr[j]) {
						swap(arr,i,j);
					}
					i--;
				}
			}
		}
		
		return arr;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	  
}
