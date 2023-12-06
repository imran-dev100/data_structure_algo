package com.data.structure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeleteConsecutiveSameWords {
	
	public static void main(String[] args) {
		String s = "ab aa aa bcd ab";
		System.out.println(deleteConsecutiveWords(s));
		s = "cn tom jerry jerry tom cn";
		System.out.println(deleteConsecutiveWords(s));
	}

	private static int deleteConsecutiveWords(String s) {
		final String[] ar = s.split(" ");
		final Deque<String> stack = new ArrayDeque<>();

		for (final String a : ar) 
			if (!stack.isEmpty() && stack.peek().equals(a))
				stack.pop();
			else
				stack.push(a);
		return stack.size();
	}
}
