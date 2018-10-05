package algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RadixSort {
	
	static int r = 256;
	
	static int [] cntSort(int a[]){
		
		int cnt[] = new int[r];
		
		for(int k = 0; k < cnt.length;k++)
			cnt[k] = 0;
		
		for(int k = 0; k < a.length;k++)
			cnt[a[k]]++;
		

		for(int k = 1; k < cnt.length;k++)
			cnt[k] += cnt[k-1];
		
		int b [] = new int[a.length+1];
		
		for(int k = 0; k < a.length;k++){
			b[(cnt[a[k]])]  = a[k];
			cnt[a[k]]--;
		}
		
		
		return b;
	}

static String [] radixSort(String a[], int i){
		
		
		char cnt[] = new char[r];
		
		for(int k = 0; k < cnt.length;k++)
			cnt[k] = 0;
		
		for(int k = 0; k < a.length;k++)
			cnt[a[k].charAt(i)]++;
		

		for(int k = 1; k < cnt.length;k++)
			cnt[k] += cnt[k-1];
		
		String b [] = new String[a.length];
		
		for(int k = a.length - 1; k >= 0 ;k--){
			b[(cnt[a[k].charAt(i)] - 1)]  = a[k];
			cnt[a[k].charAt(i)]--;
		}
		
		
		return b;
	}
	public static void main(String[] args) {
		int a[]= {6,0,2,0,1,3,4,6,1,3,2};
		a = cntSort(a);
		String h[] = {"ahkd", "ahoe","bbbb","baaa","2ref"}; 
		
		for(int v = 3; v >= 0; v--)
			h = radixSort(h,v);
			
		for(String v : h)
			System.out.println(v);
		
		
		
	}

}
