package algorithm;

public class LinkedQueue {
	
	static class Node {
		public Node(int v){
			d = v;
		}
		int d;
		Node next;
	}
	
	 Node head, tail, Null = new Node(-1);

	private void putBack(int d){
		
		if (head == null){
			head = tail = new Node(d);
		}
		else{
			Node n = new Node(d);
			head.next = n;
			head = n;
		}
	}
	 
	 private int getfront(){
		 
		 if(tail  == null) return -1;
		 
		 Node n = tail;
		 if(tail.next == null)
			 tail =  head = null;
		 else
			 tail = tail.next;
		 return n.d;
	 }
		private void push(int d){
			
			if (head == null)
				head = tail = new Node(d);
			else{
				Node n = new Node(d);
				n.next = head;
				head = n;
			}
		}
		 
		 private int pop(){
			 
			 if(head  == null) return -1;
			 
			 Node n = head;
			 if(head.next != null)
				 head = head.next;
			 else head = null;
				
			 return n.d;
		 }
	public static void main(String[] args) {

		LinkedQueue q = new LinkedQueue();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
	}

}
