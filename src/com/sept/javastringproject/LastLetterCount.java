package com.sept.javastringproject;
// Count all words that ends in 's' in a String and words that ends in 'y' in a String
// Switch the first instance of word that end with 's' and 'y'
// Display the new sentence where words are switched

public class LastLetterCount {
	public static String sentence = "Display the new sentence where words are switched.";
	public static int ycount = 0;
	public static int scount = 0;
	
	public String countAllwords(String s) {
		int firstFound = -1;
		boolean isSwitched = false;
		String[] words = s.split("\\s+");
		
		for(int i = 0; i < words.length; i++) {
			char lastChar = words[i].charAt(words[i].length()-1);
			if(lastChar == ',' || lastChar == '.') {
				lastChar = words[i].charAt(words[i].length()-2);
			}
			if(firstFound == -1 && lastChar == 's' || lastChar == 'y') {
				checkSorY(lastChar);
				firstFound = i;
			} else if(isSwitched == false && firstFound != -1 && lastChar == 's' || lastChar == 'y') {
				checkSorY(lastChar);
				isSwitched = true;
				String temp = words[firstFound];
				words[firstFound] = words[i];
				words[i] = temp;
			} else if(lastChar == 's' || lastChar == 'y') {
				checkSorY(lastChar);
			}
		}
		System.out.println(String.join(" ", words));
		return "S count: " + scount + ", Y count: " + ycount;
	}
	
	public static void checkSorY(char lastChar) {
		if(lastChar == 'y') {
			ycount++;
		}
		if(lastChar == 's') {
			scount++;
		}
	}

	public static void main(String[] args) {
		LastLetterCount llc = new LastLetterCount();
		System.out.println(llc.countAllwords(sentence));
	}

}
