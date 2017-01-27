package sorting;

public class MergeSort {

	public static void sort(int[] a, int p, int q, int r){
		// the assumption is that the two sub arrays are sorted
		// sub array one goes from p to q
		int n1 = q - p + 1;
		int[] L = new int[n1];
		int i;
		for(i=0;i<n1;i++){
			L[i] = a[p+i];
		}
		
		// sub array two goes from q+1 to r
		int n2 = r - q;
		int[] R = new int[n2];
		int j;
		for(j=0;j<n2;j++){
			R[j] = a[q+j+1];
		}
		
		i=0;
		j=0;
		// sorting the sorted sub arrays into the main array
		for(int k=p;k<r;k++){
			if(i<n1 && (L[i]<R[j] || L[i]==R[j])){
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,4,5,6,8};
		for(int i:a)
			System.out.print(i);
		sort(a,0,5,9); // p,q and r don't necessarily have to be 0.
		System.out.print('\n');
		for(int i:a)
			System.out.print(i);
	}

}
