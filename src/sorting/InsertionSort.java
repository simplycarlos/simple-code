package sorting;

public class InsertionSort {
	
	public static void sort(int[] n){
		for(int i=1;i<n.length;i++){
			int key = n[i]; // stores the current data
			int j = i-1; // reads the previous data in the array
			while(j>-1 && n[j]>key){
				n[j+1] = n[j]; // set current "i" to the previous data in array
				j--; // go to previous in order to compare
			}
			// once sorting is done store key into the current pointer
			n[j+1] = key;
		}
	}

	public static void main(String[] args) {
		int[] n = {1,5,4,7,2,4,5};
		
		for (int i:n)
			System.out.print(i);
		
		System.out.print("\n");
		sort(n);
		for (int i:n)
			System.out.print(i);

	}

}
