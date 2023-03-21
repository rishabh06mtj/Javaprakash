package com.assignment;

public class StringIsPalindromeOrNot {
       
	public static void main(String[] args) {
		String s1="MADAM";
		String rev="";
		int n=s1.length();
		for(int i=n-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		if (s1.equals(rev)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not a palindrome");
		}
	}
}
