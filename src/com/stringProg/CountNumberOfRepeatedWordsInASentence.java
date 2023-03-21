package com.stringProg;

import java.util.LinkedHashSet;

public class CountNumberOfRepeatedWordsInASentence {

	public static void main(String[] args) {
		String str="Welcome to India and Welcome to Test Yantra";
		String[] s= str.split(" ");
		LinkedHashSet<String> set =new LinkedHashSet<String>();
		for(int i=0;i< s.length;i++)
		{
			set.add(s[i]);
			
		}
		for (String string : set)
		{
			int count=0;
			for (int i = 0; i < s.length; i++)
			{
				if(s[i].equals(string))
				{
					count++;
					
				}
			}
			System.out.println(string+ " is repeating " +count+ " times");
		}
			
		
	}

}
