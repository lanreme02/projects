package algorithm;

import java.util.Stack;

public class Tree {

	private class Node{

		int data;
		Node l,r;

		Node(int d, Node left,Node right){
			data = d;
			l = left;r=right;
		}
	}

	private Node root;


	private Node insert(Node n, int d){

		if(n == null){
			n = new Node(d,null,null);
			return n;
		}
		else if(d < n.data){
			n.l = insert(n.l,d);
			return n;
		}
		else if(d > n.data){
			n.r = insert(n.r,d);
			return n;
		}
		else 
			return n;
	}

	public void insert(int data){

		root = insert(root,data);
	}

	public void printTree(){
		print(root);

	}
	private void print(Node n){

		if(n == null) return;
		print(n.l);
		System.out.print(n.data);
		print(n.r);

	}

	void iterativeInorderPrint(){
		iterativeInorderPrint(root);
	}
	void iterativeInorderPrint(Node n){

		if(n == null) return;
		Stack <Node> st = new Stack <Node>();
		st.push(n);
		Node c = n.l;
		do{ 
			//if(c != null){
			while(c != null){
				st.push(c);
				c = c.l;
			}
			//print node
			c = st.pop();
			System.out.print(c.data);
			if(c.r != null){
				st.push(c.r);
				c = c.r.l;
			}else c = null;
			//}
		}while(!st.isEmpty());
	}

	int treeHeight(Node n){

		if(n == null)
			return -1;

		int l =	treeHeight(n.l); int r = treeHeight(n.r);
		int m = l < r ? r : l;
		return m + 1;
	}
	void treeHeight(){

		System.out.print(treeHeight(root));
	}
	int numberofLevels(Node n){

		if(n == null)
			return 0;

		int l =	numberofLevels(n.l); int r = numberofLevels(n.r);
		int m = l < r ? r : l;
		return m + 1;
	}
	void numberofLevels(){

		System.out.print(numberofLevels(root));
	}

	int numberofLeaf(Node n){

		int l = 0 , r = 0;
		if(n.l != null)
			l = numberofLeaf(n.l);
		if(n.r != null)
			r = numberofLeaf(n.r);
		if(n.l == null && n.r == null)
			return 1;

		return l + r;		
	}
	void numberofLeaf(){

		System.out.print(numberofLeaf(root));
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree();
		t.insert(40);
		t.insert(50);
		t.insert(48);
		t.insert(10);
		//t.insert(25);
		t.insert(5);
		t.insert(11);
		t.insert(45);
		t.insert(60);
		t.insert(7);
		t.insert(6);
		t.insert(8);
		t.insert(9);
		t.iterativeInorderPrint();
		System.out.println("");

		//t.printTree();
	}

}
