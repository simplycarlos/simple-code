package sorting;

public class CountingSort {

	public static void sort(int[] a, int[] b, int k){
		// count all numbers into the array and then print based on the array b
		
		// set all to zeroes
		for(int i=0;i<b.length;i++)
			b[i]=0;
		
		//count
		for(int i:a){
			b[i]++;
		}

		// sorting
		int j=0;
		for(int i=0;i<b.length;i++){
			while(b[i]>0){	// going through each counted number
				a[j] = i;	
				j++;	
				b[i]--; 
			}
		}
	}
	
	//FIXME
	public static void sortOptimized(int[] a, int[] b, int k){
		// count all numbers into the array and then print based on the array b
		
		// set all to zeroes
		for(int i=0;i<b.length;i++)
			b[i]=0;
		
		//count
		for(int i:a){
			b[i]++;
		}

		// counting the numbers left before the current one.
		for(int i=1;i<k;i++){
			b[i] = b[i] + b[i-1];
		}
		
		int[] c = new int[a.length];
		// sorting
		for(int i=a.length;i>1;i--){
			c[b[a[i]]] = a[i];
			b[a[i]] = b[a[i]] - 1;
		}
	}
	
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,4,5,6,8};
		for (int i:n)
			System.out.print(i);
		
		System.out.print("\n");
		int k=9; // largest number in array n
		int[] b = new int[k];
		sort(n,b,k);
		for (int i:n)
			System.out.print(i);

	}

}
