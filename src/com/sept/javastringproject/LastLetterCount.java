package com.sept.javastringproject;
// Count all words that ends in 's' in a String and words that ends in 'y' in a String
// Switch the first instance of word that end with 's' and 'y'
// Display the new sentence where words are switched

public class LastLetterCount {
	public static String sentence = "Display the new sentence where words are switched";
	
	public int countAllwords(String s) {
		int count = 0;
		int firstFound = -1;
		boolean isSwitched = false;
		String[] words = s.split("\\s+");
		
		for(int i = 0; i < words.length; i++) {
			char lastChar = words[i].charAt(words[i].length()-1);
			if(firstFound == -1 && lastChar == 's' || lastChar == 'y') {
				count++;
				firstFound = i;
			} else if(isSwitched == false && firstFound != -1 && lastChar == 's' || lastChar == 'y') {
				count++;
				isSwitched = true;
				String temp = words[firstFound];
				words[firstFound] = words[i];
				words[i] = temp;
			} else if(lastChar == 's' || lastChar == 'y') {
				count++;
			}
		}
		System.out.println(String.join(" ", words));
		return count;
	}

	public static void main(String[] args) {
		LastLetterCount llc = new LastLetterCount();
		System.out.println(llc.countAllwords(sentence));
	}

}
