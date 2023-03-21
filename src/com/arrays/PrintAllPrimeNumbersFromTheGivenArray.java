package com.arrays;

public class PrintAllPrimeNumbersFromTheGivenArray {

	public static void main(String[] args) {
		int a[]= {3,4,5,6,7,8,9,10,11};
		
		for(int j=0;j<a.length;j++)
		{
			int n=a[j];
			boolean rs=checkprime(n);
			if(rs==true)
			{
				System.out.println(n);
			}
				}
		
		}
	public static boolean checkprime(int q)
	{
		for(int i=2;i<q/2;i++)
		{
		if (q%i==0) {
			return false;
			
		}
		
		}
		return true;
	}

}
