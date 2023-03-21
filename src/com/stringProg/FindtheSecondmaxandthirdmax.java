package com.stringProg;
public class FindtheSecondmaxandthirdmax {
	public static void getMax( double ar[] )
	{
		double max1 = ar[0]; // Assume the first
		double max2 = ar[0]; // element in the array
		double max3 = ar[0]; // is the maximum element.
		int zero = 0; 
		// Variable to store inside it the index of the max value to set it to zero.

		for( int i = 0; i < ar.length; i++ )
		{
			if( ar[i] >= max1)
			{
				max1 = ar[i];
				zero = i;
			}
		}

		ar[zero] = 0; // Set the index contains the 1st max to ZERO.

		for( int j = 0; j < ar.length; j++ )
		{
			if( ar[j] >= max2 )
			{
				max2 = ar[j];
				zero = j;
			}
		}

		ar[zero] = 0; // Set the index contains the 2st max to ZERO.

		for( int k = 0; k < ar.length; k++ )
		{
			if( ar[k] >= max3 )
			{
				max3 = ar[k];
				zero = k;
			}
		}

		System.out.println("1st max:" + max1 + ", 2nd: " +max2 + ",3rd: "+ max3);                              
	}

	public static void main(String[] args)
	{
		// Creating an object from the class Array to be able to use its methods.

		// Creating an array of type double.
		double a[] = {2.2, 3.4, 5.5, 5.5, 6.6, 5.6};

		getMax( a ); // Calling the method that'll find the 1st max, 2nd max, and      and 3rd max.
	}


}
