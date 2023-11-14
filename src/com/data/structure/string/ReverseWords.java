package com.data.structure.string;

public class ReverseWords {

	public static void main(String[] args) {
		final String s = "i love programming very much";
		System.out.println("Original String: ".concat(s));
		System.out.println("Reversed String: ".concat(reverseWords(s)));
	}

	private static String reverseWords(String s) {
		
		final String[] arr = s.split(" ");
		String sb = "";
		
		for(final String a:arr) 
			sb = a.concat(" "+sb);
		
		return sb;
	}
	
}
