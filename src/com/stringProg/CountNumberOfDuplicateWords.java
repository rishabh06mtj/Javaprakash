package com.stringProg;

import java.util.LinkedHashSet;

public class CountNumberOfDuplicateWords {

	public static void main(String[] args) {
		String str = "Welcome to Bengaluru and welcome to test yantra";
		String[] s = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
		}
		for (String string : set) {
			for (int i = 0; i < s.length; i++) {
				if (s[i].equals(string)) {
					System.out.println(string + " is present at " + (i + 1) + " Position ");

				}

			}

		}
	}

}
