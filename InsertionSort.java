package algorithm;

public class InsertionSort {
	
	static void insertionSort(int [] A){
		
		for(int i = 1; i < A.length; i++){
			
			int j = i; int key = A[i];
			
			while(j-1 >= 0 && A[j-1] > key){
				
				A[j] = A[j-1];
				j--;
			}
			A[j] = key;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = new int []{3,54,2,756,45,7,01,50};
		insertionSort(A);
		for(int k:A)
		System.out.print(k+"\t");

	}

}
