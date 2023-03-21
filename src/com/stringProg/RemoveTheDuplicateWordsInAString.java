package com.stringProg;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateWordsInAString {

	public static void main(String[] args) {
		String str="this this is test yantra";
		String[] s= str.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) 
		{
			set.add(s[i]);
			
		}
		for (String string : set)
		{
			System.out.println(string +" ");
		}
			
		}
		

	}


