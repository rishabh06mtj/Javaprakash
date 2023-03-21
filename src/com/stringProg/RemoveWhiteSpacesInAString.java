package com.stringProg;

public class RemoveWhiteSpacesInAString {

	public static void main(String[] args) {
		
		String str="Welcome to Java Programming  Selenium  automation";
		System.out.println("Before removing white spaces:"+str);
		String newStr=str.replaceAll("\\s", "");
		
		System.out.println("After removing white spaces:"+newStr);

	}

}
