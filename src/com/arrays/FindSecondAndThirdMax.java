package com.arrays;

public class FindSecondAndThirdMax {

	public static void main(String[] args)
	{
	int a[]= {45,8,85,65,41,12,0,255,753};
	int max1=0;
	int max2=0;
	int max3=0;
	for (int i = 0;i<a.length; i++)
	{
		
		if(max1<a[i])
		{
			max3=max2;
			max2=max1;
			max1=a[i];
		}
		else if(max2<a[i])
		{
			max3=max2;
			max2=a[i];
		}
		else
		{
			max3=a[i];
		}
		
		}
	System.out.println(max1);
	System.out.println(max2);
	System.out.println(max3);
	
	
	}

}
