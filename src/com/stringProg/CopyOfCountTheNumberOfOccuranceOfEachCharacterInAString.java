package com.stringProg;

import java.util.LinkedHashSet;

public class CopyOfCountTheNumberOfOccuranceOfEachCharacterInAString {

	public static void main(String[] args) {
		String s="testyantra";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();//tesyanr
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));//t
		}
		for(Character ch : set)//t
		{
			int count=0;
			for(int i = 0;i<s.length();i++)
			{
				if(s.charAt(i)==ch)//t==t e==t s==t t==t
				{
					count++;//1
				}
			}
			System.out.println(ch+" "+count);
		}
		

	}

	}


