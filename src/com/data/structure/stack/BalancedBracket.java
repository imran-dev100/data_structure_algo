package com.data.structure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBracket {

	public static void main(String[] args) {

		System.out.println(isBalanced("{({[]})}"));
		System.out.println(isBalanced("{()[]}"));
		System.out.println(isBalanced("[()]{}{[()()]()}"));
		System.out.println(isBalanced("[(])"));

	}

	private static boolean isBalanced(String s) {

		final int n = s.length();
		final Deque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {

			final char c = s.charAt(i);

			if (c == '{' || c == '[' || c == '(')
				stack.push(c);
			
			else {
				switch (c) {
				case '}':
					if (stack.peek() == '[' || stack.peek() == '(')
						return false;
					break;
				case ')':
					if (stack.peek() == '[' || stack.peek() == '{')
						return false;
					break;
				case ']':
					if (stack.peek() == '(' || stack.peek() == '{')
						return false;
					break;
				default:
					break;
				}
				stack.pop();
			}
		}

		return stack.isEmpty();
	}
}
