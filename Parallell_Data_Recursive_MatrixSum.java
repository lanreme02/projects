package algorithm;

public class Parallell_Data_Recursive_MatrixSum {

	static int RecursiveMatrixSum(final int a[][],final int r1,final int r2){
       final int rst[] = {0,0};
		
		if(r1 <= r2){
			final int q = (r1+r2) / 2;
			System.out.println("q = :" + q);
			int k = VectorSum(a,q);
			
			Thread t = new Thread(){
				public void run(){
		     int l = RecursiveMatrixSum(a,r1,q-1);
		     rst[0] = l;
				}
			};
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			Thread t1 = new Thread(){
				public void run(){
					int    r =	RecursiveMatrixSum(a,q+1,r2);
					rst[1] = r;
				}
			};
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
		   
			return k+rst[0]+rst[1];
		}
		
		return 0;

	}
	static int VectorSum(int a[][],int q){
		
		int result = 0;
		for(int j = 0; j < a[0].length; j++){

			result  += a[q][j];
		}
		return result;
	}
	
	static int[][] buildMatrix(int a[][]){

		int l = 1;
		for(int k = 0; k < a.length; k++){
			System.out.print(k + "\t");

			for(int j = 0; j < a[0].length; j++){
				System.out.print(j+1 + "\t"); 
				a[k][j] = j+1;
			}

			System.out.print("\n"); 
		}

		return a;
	}

	public static void main(String[] args) {

		int a[][] = new int [1000][1000];
		buildMatrix(a);
		
		// total run time in milliseconds
		long t1 = System.currentTimeMillis();
		
		System.out.print(RecursiveMatrixSum(a, 0, a.length-1));
		
		long t2 = System.currentTimeMillis();
		System.out.println("");
		
		System.out.println("time taken " + (t2 - t1));
	
	}

}
