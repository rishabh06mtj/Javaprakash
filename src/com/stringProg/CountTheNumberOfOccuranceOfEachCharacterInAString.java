package com.stringProg;

import java.util.LinkedHashSet;

public class CountTheNumberOfOccuranceOfEachCharacterInAString {

	public static void main(String[] args) 
	{
		String s="javaprogramming";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch :set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==ch)
				{
					count++;
				}
			}
			System.out.println(ch+" "+count);
		}
		
	}

}
