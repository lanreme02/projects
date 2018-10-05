package algorithm;

public class ArrayQueue {
	
	int size = 0 ;int  head = 0; int tail = 0;
	int A[];

	public ArrayQueue(int i){
		A = new int[i];
	}
	
		
	int put(int v){

		if(size == A.length)
			return -1;
		
		A[tail] = v;
		tail =  (tail + 1) % A.length;
		size++;
		return v;
	}
	int get(){

		if(size == 0)
			return -1;
		int r = A[head];;
		head =  (head + 1) % A.length;
		size--;
		return	r;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		ArrayQueue q = new ArrayQueue(n);
		
		q.put(1);
		q.put(2);
		System.out.println(q.get());
		System.out.println(q.get());
		q.put(4);
		System.out.println(q.get());
		
	}

}
