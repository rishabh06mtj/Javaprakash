package com.assignment;

public class FibonacciNumber {

	public static void main(String[] args) {
//		
//		int a[]= {0,1,1,2,3,5,8,13,21,35,55};
//		int n =10;
//		a[0]= 0;
//	    a[1]=1;
//		for(int i=2;i<=n;i++)
//		{
//			a[i]=a[i-1] + a[i-2];
//		}
//           System.out.println("Fibonacci series" + n);
//           for(int i=0;i<=n;i++)
//           {
//        	   System.out.print(a[i] + " ");
//           }
//	}
//
//}
		
		int fib1=0;
		int fib2=4;
		int fib3;
		System.out.print(fib1+" ");
		System.out.print(fib2+" ");
		for(int i=4;i<=10;i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3+" ");
		}
	}
}
