package com.stringProg;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class CountTheNumberOfOccuranceOfTheWord {

	public static void main(String[] args) {
		String sentence="Welcome to Bengaluru Welcome to TestYantra";
		String[] sp=sentence.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for(int i=0;i<sp.length;i++)
		{
			set.add(sp[i]);
			
		}
		
		for(String word: set)
		{
			int count=0;
			for(int i=0;i<sp.length;i++)
			{
				if(word.equals(sp[i]))
				{
					count++;
				}
			}
			System.out.println(word+" "+count);
			
				}
			}
}
		

