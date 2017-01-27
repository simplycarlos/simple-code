package sorting;

public class BubbleSort {
	
	public static void sort(int[] a){
		// like a bubble it rises to the top
		// compares it with all bigger indices
		for (int i=0;i<a.length;i++){
			int j=i;;
			while(j<(a.length-1)){
				if(a[j]>a[j+1]){
					int t = a[j+1];
					a[j+1] = a[j];
					a[j] = t;
				}
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] n = {0,4,6,2,4,6};
		for (int i:n)
			System.out.print(i);
		
		System.out.print("\n");
		sort(n);
		for (int i:n)
			System.out.print(i);
	}

}
