package main.java.sorting.HeapSort;

//Ascending HeapSort, Min-Heapify.

public class HeapSort {
	public int[] sort(int[] arr) {

		
		if(arr!=null) {
			int n = arr.length;
			for(int i: arr) {
				System.out.print(" " + i);
			}
			buildMaxHeap(arr);
			for(int i=n-1; i>= 0; i--){
		            swap(arr,i,0);
		            maxHeapify(arr,i,0);
		    }
			
			System.out.println("\n");
			for(int i: arr) {
				System.out.print(" " + i);
			}
		}

		return arr;
	}

	private void buildMaxHeap(int[] arr) {
		int n = arr.length;
		for(int i=n/2-1;i>=0;i--) {
			maxHeapify(arr,n, i);
		}
		
	}

	private void maxHeapify(int[] arr,int n,  int i) {
		int largest = i;
		int leftChildIndex = 2*i + 1;
		int rightChildIndex = 2*i + 2;
		
		//Check children if they are larger than `largest`
		if(leftChildIndex < n && arr[leftChildIndex] >= arr[largest]) {
			largest = leftChildIndex;
		}
		
		if(rightChildIndex < n && arr[rightChildIndex] > arr[largest]) {
			largest = rightChildIndex;
		}
		
		//You can change largest because you still know what is i
		//If largest is changed
		if(largest != i) {
			swap(arr, largest, i);
			maxHeapify(arr,n, i);
		}
	}

	private void swap(int[] arr, int largest, int i) {
		int temp = arr[largest];
		arr[largest] = arr[i];
		arr[i] = temp;
	}


}
