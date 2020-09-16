package com.sept.javastringproject;
// Count all Words in a String and display the count.

public class Words {
	static public String sentence = "count all words from this sentence.";
//	Expected count = 6;
	
	public int countWords(String s) {
		String[] splitted = s.split("\\s+");
		return splitted.length;
	}

	public static void main(String[] args) {
		Words words = new Words();
		System.out.println(words.countWords(sentence));
	}
}
