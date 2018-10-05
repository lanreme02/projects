package algorithm;

import java.util.Stack;

public class IterativePostOderPrint {

	
	static class Dat{
		 int l, h;
		 
		 public Dat(int l, int h){
			 this.l=l; this.h=h;
		 }
	}
	
static  void postOrderPrintArray(int a[],int l, int h){
		
	Stack<Dat> st = new Stack<Dat> ();
	st.push(new Dat(l,h));
	
	boolean visit[] = new boolean[a.length];
	while(!st.isEmpty()){
		
		boolean lt = false, rt = false;
		
		Dat d = st.peek();
		
		int q = (d.l + d.h) / 2;
			
		if(q+1 <= d.h && !visit[((q+1) + d.h)/2]){
			rt = true;
			st.push(new Dat(q+1,d.h));
		}
		
		if(d.l <= q-1 && !visit[(d.l + (q-1))/2]){
			lt = true;
			st.push(new Dat(d.l,q-1));
		}
		
		if(lt || rt) continue;
		else{
			
			System.out.println(a[q]);
			visit[q] = true;
			st.pop();
		}
		
		//}
	}
	
	}
	public static void main(String[] args) {
		int a[]= {4,1,0,2,8,6,4,9,6,5};
		postOrderPrintArray(a,0,a.length-1);
	}

}
