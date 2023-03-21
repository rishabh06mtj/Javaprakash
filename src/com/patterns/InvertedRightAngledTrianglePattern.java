package com.patterns;

import java.util.List;

public class InvertedRightAngledTrianglePattern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) //rows
		{
			
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
//