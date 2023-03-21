package com.patterns;
public class DiamondPattern {
public static void main(String[] args) {
		int n =7;
		int sp=n-1;
		int st=1;
		for (int i = 1; i <=n; i++) {

			for (int j = 1; j<=sp; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k<=st; k++) 
			{
				System.out.print("*");
			}
			System.out.println();

			if(i<=n/2) 
			{
				st=st+2;
				sp--;
			}
			else
			{ 
				st=st-2;
				sp++;
			}


		}

	}
}


