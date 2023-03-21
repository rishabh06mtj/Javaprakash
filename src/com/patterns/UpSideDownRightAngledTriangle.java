package com.patterns;

public class UpSideDownRightAngledTriangle {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <=n; i++) //rows
		{
			for (int j = 1; j <i; j++) //increasing space
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)//Decreasing stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}


	}


