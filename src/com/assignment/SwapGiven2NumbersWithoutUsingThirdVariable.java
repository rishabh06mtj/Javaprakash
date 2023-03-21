package com.assignment;

public class SwapGiven2NumbersWithoutUsingThirdVariable 
{
               public static void main(String[] args) {
				int x=10;
				int y=20;
				System.out.println("before swapping number: "+x+" "+y);
				x=x+y;
				y=x-y;
				x=x-y;
				System.out.println("after swapping number: "+x+" "+y);

			}

	

}

