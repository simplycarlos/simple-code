package sorting;

/**
 * Sort sorted subarrays a[p...q-1] and a[q+1...r]
 * @author carlospinto
 *
 */
public class QuickSort {
	
	/**
	 * Partitions array such that a[q] is bigger or equal to max(a[p..q-1]) and smaller or equal to min(a[q+1..r]).
	 * It does so by adjusting the index j at every loop run and the index i at every encounter of a[j]<x or a[j]==x.
	 * Such that j is the index of the second subarray which goes to r and i is the index of the first subarray that increases every time it finds an a[i] smaller than x.
	 * Once the loop is done going through all elements it swaps that last element with the i+1 indexed data.
	 * @param a: array.
	 * @param p: first index of array a.
	 * @param r: last index of array a.
	 * @return i+1: q
	 */
	public static int partition(int[] a,int p, int r){
		int x = a[r];
		int i = p-1;
		for(int j = p; j<r;j++){
			if(a[j]<x || a[j]==x){
				i++;
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[i+1];
		a[i+1] = a[r];
		a[r] = t;
		return ++i;
	}
	
	public static void quickSort(int[] a, int p, int r){
		if(p<r){
			int q = partition(a,p,r);
			quickSort(a,p,q-1);
			quickSort(a,q+1,r);
			
		}
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,4,5,6,8};
		for(int i:a)
			System.out.print(i);
		quickSort(a,0,9);
		System.out.print('\n');
		for(int i:a)
			System.out.print(i);
	}

}
