package com.stringProg;

import java.util.LinkedHashSet;

public class UniqueNumberCountInArray {

	public static void main(String[] args) {
		int count =0;
		int dupCount=0;
		
		int a[]= {4,1,1,2,0,0,2,2,4,4,4,9,5};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			}
		
		for(int n : set){
			for(int i=0;i<a.length;i++) {
				if ( n==a[i]) {
					count++;
				}
									
			}
			
			if (count==1){
				System.out.println("Unique number count "  +n+  " in an Array is " +count); 	}
			    count=0;
			
		}
		
		}
	

	}



