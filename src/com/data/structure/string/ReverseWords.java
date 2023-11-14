package com.data.structure.string;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "i love programming very much";
		System.out.println("Original String: ".concat(s));
		System.out.println("Reversed String: ".concat(reverseWords(s)));
	}

	private static String reverseWords(String s) {
		
		String[] arr = s.split(" ");
		//Using stack
		Deque<String> stack = new ArrayDeque<>();
		
		for(String a:arr)
			stack.push(a);
		
		StringBuilder sb = new StringBuilder();
		
		while(!stack.isEmpty())
			sb.append(stack.pop()+" ");
	
		return sb.toString();
	}
	
}
