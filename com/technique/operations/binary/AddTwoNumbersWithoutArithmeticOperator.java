package com.technique.operations.binary;

public class AddTwoNumbersWithoutArithmeticOperator {

	public static void main(String[] args) {
		System.out.print(getSum(10, 20));
	}
	
	private static int getSum(int x, int y) {

		while (y != 0) {
			int carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}

		return x;
	}
}
