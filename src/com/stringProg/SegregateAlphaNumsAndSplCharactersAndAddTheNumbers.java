package com.stringProg;

public class SegregateAlphaNumsAndSplCharactersAndAddTheNumbers {

	public static void main(String[] args) {
		String s="a1b3d4";
		int sum=0;
		for (int i = 0; i < s.length(); i++)
			//i=0 0<6 t =a
			//i=1 1<6 t =1 come inside the if condition
			//i=2 2<6 t =b
			//i=3 3<6 t =3 come inside the if condition
			//i=4 4<6 t =d 
			//i=5 5<6 t =4
			//i=6 6<6 f terminate
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48; //1-48, 49-48=1 n=1
				                      //3-48 51-48=3 n-3
				                      //52-48=4  n=4
				sum=sum+n; //0+1=1 sum=1
				           //1+3=4 sum=4
				           //4+4=8 sum=8
			}
		}
		System.out.println(sum);//89 //ascii of 8

	}

}
