package com.arrays;

import java.util.Scanner;

public class FindtheMaximumAndTheMinimumValueInTheArray {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int a=sc.nextInt();
		
		int s[]=new int[a];
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter the number:");
			s[i]=sc.nextInt();
		}
		
		int max = s[0];
		int min = s[0];
		for(int i=0;i<a;i++)
		{
			if(s[i]>max)
			{
				max=s[i];
				
			}
		if(s[i]<min)
		{
			min=s[i];
		}
		}
		System.out.print("The maximum number is:" + max);
        System.out.println();
        System.out.print("The minimum number is: " + min);

	}

}
