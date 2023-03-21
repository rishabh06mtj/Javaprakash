package com.stringProg;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int a[]= {4,1,1,2,0,2};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			}
		System.out.println(set);
	}

}
