package com.example.demo;

public class DuplicateCharacters {
	
	public static void main(String[] args) {
		DuplicateCharacters demo1 = new DuplicateCharacters();
		demo1.runMethod("jimmy yks i");
	}
	
	public void runMethod(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			for(int j=i+1; j < str.length();j++) {
				if(ch == str.charAt(j)) {
					System.out.print(ch + " ");
					break;
				}
			}
		}
	}
}
