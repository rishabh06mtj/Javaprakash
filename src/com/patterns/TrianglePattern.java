package com.patterns;

public class TrianglePattern {

	public static void main(String[] args) {
		int n = 5;
		int sp=n-1;
		int st=1;
		for (int i = 1; i <= n; i++) // rows
		{
			for (int j = 1; j <=sp; j++)// Decreasing space

			{
				System.out.print(" ");
			}
			for (int j = 1; j <=st; j++) // increasing stars
			{
				System.out.print("*");
			}
			st=st+2;
			sp=sp-1;
		
			System.out.println();
		}
	}

}

