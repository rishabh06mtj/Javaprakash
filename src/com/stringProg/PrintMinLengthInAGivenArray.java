package com.stringProg;

public class PrintMinLengthInAGivenArray {

	public static void main(String[] args) {
		String[] s= {"12","1233","1344234","414"};
		String minLength=s[0];
		for (int i=1;i<s.length;i++)
		{
			if(minLength.length()>s[i].length())
			{
				minLength=s[i];
			
			}
				
		}
		for(int i=0;i<s.length;i++)
		{
			if(minLength.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
			
		}
	}

}
