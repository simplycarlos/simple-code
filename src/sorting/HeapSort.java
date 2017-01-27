package sorting;

public class HeapSort {
	// a heap is an array represented as a binary tree
	
	//TODO create heap class
	static int heapSize=0;
	
	/**
	 * Returns the index of the parent of node at i.
	 * @param i
	 * @return
	 */
	public static int parent(int i){
		return (int)Math.floor(i/2);
	}
	
	/**
	 * Returns the index of the node to the left of parent at i.
	 * @param i
	 * @return
	 */
	public static int left(int i){
		return 2*i;
	}
	
	/**
	 * Returns the index of the node to the right of parent at i.
	 * @param i
	 * @return
	 */
	public static int right(int i){
		return 2*i + 1;
	}

	// in max-heap the parent node has the max
	/**
	 * Sorts the array such that the heap representation contains the maximum values at the parents.
	 * @param a. Array to heapify.
	 * @param i. Index of root to start the heapification.
	 */
	public static void maxHeapify(int[] a, int i){
		int l = left(i);
		int r = right(i);
		
		int largest=0;
		//TODO is it length?
		if( l<heapSize && l==a.length && a[l]>a[r]){
			largest=l;
		} else {
			largest=i;
		}
		if(r<heapSize && r == a.length && a[r]>a[largest]){
			largest=r;
		}
		if(largest != i){
			int t = a[i];
			a[i] = a[largest];
			a[largest]=t;
			maxHeapify(a,largest);
		}
	}
	
	/**
	 * Builds the heap.
	 * @param a
	 */
	public static void buildMaxHeap(int[] a){
		heapSize= a.length;
		for(int i= (int)Math.floor(a.length/2);i>-1;i--)
			maxHeapify(a,i);
	}
	
	public static void heapSort(int[] a){
		buildMaxHeap(a);
		
		for(int i=a.length-1;i>0;i--){
			int t = a[0];
			a[0] = a[i];
			a[i] = t;
			heapSize--; 
			maxHeapify(a,0);
		}
	}
	public static void main(String[] args) {
		int[] n = {1,5,4,7,2,4,5,7,9,12,15};
		for (int i:n)
			System.out.print(i);
		
		System.out.print("\n");
		heapSort(n);
		for (int i:n)
			System.out.print(i);
	}

}
