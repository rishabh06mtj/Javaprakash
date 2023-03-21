package com.arrays;

public class FindTheElementHavingMaxLengthValue {

	public static void main(String[] args)
	{
		String s[]= {"hi","hello","one","four","killer","Prajwal"};
		
		int max=s[0].length();
		
		String temp="";
		
		for(int i=0;i<s.length;i++)
		{
			if(max<s[i].length())
			{
				max=s[i].length();
				temp=s[i];
			}
			
		}
		/*for (int i = 0; i < s.length; i++) {
			
			if(s[i].length()==max)
			{
				System.out.println(s[i]);
			}
			
		} */
		System.out.println(temp);
	}

}
