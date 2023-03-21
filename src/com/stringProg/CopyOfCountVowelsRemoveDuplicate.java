package com.stringProg;
import java.util.LinkedHashSet;

public class CopyOfCountVowelsRemoveDuplicate {

	public static void main(String[] args) {
		String s = "India";
		String str= s.toLowerCase();
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		int count=0;
		for(Character ch : set)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				
			}
		}
		System.out.println(set+ " "+ count);
		}

}
