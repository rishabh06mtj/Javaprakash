package com.stringProg;

public class FirstWordLastAndLastWordFirstInASentence {

	public static void main(String[] args) {
		String str="this is test yantra";
		String[] s=str.split(" ");
		String temp=s[0];
		s[0]=s[s.length-1];// its nothing but s[3]
		s[s.length-1]=temp;
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+" ");
		}

	}

}
