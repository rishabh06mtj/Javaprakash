package com.patterns;

public class Pattern {

	public static void main(String[] args) {
	int a=5;
	for (int i=0;i<5;i++) 
	{
		
//		for (int j = i; j <a; j++) {
//			System.out.print(" ");
//		}
		
		for (int j =i; j>=0; j--)
		{
			System.out.print((char)(65+j));
		}
		
		System.out.println();
	}
	
	}
	
	}


