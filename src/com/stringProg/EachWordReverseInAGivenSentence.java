package com.stringProg;

public class EachWordReverseInAGivenSentence {

	public static void main(String[] args) {
		String str="this is test yantra";
		String[] s=str.split(" ");
		//String reverseString=" ";
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
			
		}
	}

}
