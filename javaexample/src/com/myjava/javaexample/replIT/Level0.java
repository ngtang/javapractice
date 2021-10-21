package com.myjava.javaexample.replIT;

public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "Mxn et";
		 String str2 = "iigtx practice";
		 
		 
		 //Solution 1
		 int max = str1.length() > str2.length() ? str1.length() : str2.length();
		 String mixing = "";
		 for (int i = 0; i < max; i++) {
		 char c1 = i < str1.length() ? str1.charAt(i) : '\0';
		 char c2 = i < str2.length() ? str2.charAt(i) : '\0';
		 mixing = mixing + c1 + c2;
		 }
		 System.out.println(mixing);
		
		 //Solution 2
		int min = str1.length() > str2.length() ? str2.length() : str1.length();
		 mixing = "";
		for (int i = 0; i < min; i++) {
			mixing = mixing + str1.charAt(i) + str2.charAt(i);
		}
		mixing = mixing + str1.substring(min) +str2.substring(min);
		System.out.println(mixing);
	}

}
