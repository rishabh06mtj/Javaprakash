package com.arrays;

public class SecondMaxWithoutBubbleSort {

	public static void main(String[] args) {
		int a[]= {100,70,20,30,10,50,40,90};
		int fmax=0;
		int smax=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(smax<a[i]&&a[i]!=fmax)
			{
				smax=a[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}


	}


