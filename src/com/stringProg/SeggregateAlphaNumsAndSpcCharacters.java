package com.stringProg;

public class SeggregateAlphaNumsAndSpcCharacters {

	public static void main(String[] args) {
		String s="a1&b2?";
		String alpha=" ";
		String num=" ";
		String spc=" ";
		for(int i=0;i<s.length();i++)
			//i=0 0<6t =a
			//i=1 1<6t =1
			//i=2 2<6t =&
			//i=3 3<6t =b
			//i=4 4<6t =2
			//i=5 5<6t =?
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				alpha=alpha+s.charAt(i);//alpha=ab
				
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);//num=12
			}
			else
			{
			   spc=spc+s.charAt(i);	//spc=&?
			}
		}
         System.out.println(alpha+num+spc);//ab 12 &?
         
         
	}

}
