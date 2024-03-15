package com.data.structure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseStringUsingStack {

	public static void main(String[] args) {

		final String s = "Success";

		System.out.println("Original String: "+s);
		
		System.out.println("Reversed String: "+reverseStringUsingStack(s));
	}

	private static String reverseStringUsingStack(final String s) {
		final Deque<Character> stack = new ArrayDeque<>();

		final int n = s.length();

		for (int i = 0; i < n; i++) 
			stack.push(s.charAt(i));
		
		StringBuilder sb = new StringBuilder(stack.pop());
		
		for (int i = 0; i < n; i++) 
			if(!stack.isEmpty())
				sb.append(stack.pop());
		return sb.toString();
	}
}
