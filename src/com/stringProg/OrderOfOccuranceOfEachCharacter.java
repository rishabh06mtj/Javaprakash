package com.stringProg;

import java.util.LinkedHashSet;

public class OrderOfOccuranceOfEachCharacter {

	public static void main(String[] args) {
		String s="tester";
		//char[] s= s.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
			
		{
			set.add(s.charAt(i));
		}
		for(Character ch :set)
		{
			//for(int i=0;i<s.length();i++)// occurance of the character in normal way
				for(int i=s.length()-1;i>=0;i--)//occurance of the character in reverse order
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+ "="+(i+1));
					break;
				}
		}
		}
	}
}
	


