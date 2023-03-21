package com.stringProg;

public class CountVowelsInString {

	public static void main(String[] args) {
		String str="JavaProgramming";
		str=str.toLowerCase();
		char[] str1=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str1[i]=='a'|| str1[i]=='e'||str1[i]== 'i'|| str1[i]=='o'||str1[i]=='u')
			{
				count++;
				
			}
			
			
		}
		System.out.println("Total number of vowels:" +count);	
	}

}
