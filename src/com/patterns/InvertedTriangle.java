package com.patterns;

public class InvertedTriangle {

	public static void main(String[] args) {
		int n = 5;
		int sp=0;
		int st=2*n-1;
		for (int i = 1; i <= n; i++) // rows
		{
			for (int j = 1; j<=sp;j++)// Increasing space

			{
				System.out.print(" ");
			}
			for (int j =1; j <=st; j++) // Decreasing stars
			{
				System.out.print("*");
			}
			sp=sp+1;
			st=st-2;
			
			System.out.println();
		}
	}

}
