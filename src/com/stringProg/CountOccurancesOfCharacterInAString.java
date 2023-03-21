package com.stringProg;

public class CountOccurancesOfCharacterInAString {

	public static void main(String[] args) {
		 String str= "Welcome To Java Programming and selenium";
		 
		 int totalLengthOfTheString=str.length();
		 
		 int totalLengthOfTheString_afterremovingA= str.replace("m","").length();
		 
		 int count=totalLengthOfTheString-totalLengthOfTheString_afterremovingA;
		 
		 System.out.println("number of occurances of m is:"+count);
		 		
	}

}
