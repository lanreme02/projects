package algorithm;

public class BinarySearch {

	static int Bsearch(int A[], int key){
		
		int l = A.length-1;
		int b = 0; 
		int j = 0;
		
		while(b <= l){
			
			j = (b+l) / 2;
			if (A[j] < key)
				 b = j + 1;
			else if(A[j] > key)
				l = j - 1;
			else if(A[j] == key)
				return A[j];	
		}
		
		return -j;
	}
	
	public static void main(String[] args) {
		
		int A[] = new int []{1,2,3,4,5,7,8,9,10,12};
		System.out.print(Bsearch(A,12));
		
	}

}
