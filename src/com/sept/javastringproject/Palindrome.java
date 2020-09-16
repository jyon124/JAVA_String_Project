package com.sept.javastringproject;
// Reverse a String and check if string in Palindrome.
// example input) tenet, level, pure


public class Palindrome {
	static String sentence = "level";
	
	public boolean checkPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i < j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		System.out.println(palindrome.checkPalindrome(sentence));
	}

}
