package com.streams;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class General {
	private static final PrintStream OUT = System.out;
	private static final String ORIGINAL_LIST = "Original List";

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(8, 6, 7, 4, 5, 9, 3, 1, 2);
		OUT.println(ORIGINAL_LIST);
		OUT.println(printListUsingStreams(list));
		OUT.println("Average of the numbers: " + calculateAverage(list));

		list = Arrays.asList(8, 9, 6, 7, 3, 4, 5, 8, 9, 3, 1, 6, 2, 4);
		OUT.println(ORIGINAL_LIST);
		OUT.println(printListUsingStreams(list));
		OUT.println("Distinct numbers of the list: \n" + getDistinctAndSortedInDescending(list));
		
		list = Arrays.asList(8, 6, 7, 4, 5, 9, 3, 1, 2);
		OUT.println(ORIGINAL_LIST);
		OUT.println(printListUsingStreams(list));
		OUT.println("Fourth largest number of the list: \n" + getFourthLargestNumber(list));

		
		list = Arrays.asList(8, 6, 7, 4, 5, 9, 3, 1, 2);
		OUT.println(ORIGINAL_LIST);
		OUT.println(printListUsingStreams(list));
		OUT.println("Fourth largest number of the list: \n" + getFourthLargestNumber(list));
	}

	private static String printListUsingStreams(final List<Integer> list) {
		return list.stream().map(String::valueOf).reduce((int1, int2) -> int1 + " " + int2).orElse(Collections.emptyList().toString());
	}

	private static Integer getFourthLargestNumber(final List<Integer> list) {
		return list.stream().sorted(Comparator.reverseOrder()).skip(3L).findFirst().orElse(null);
	}

	private static List<Integer> getDistinctAndSortedInDescending(final List<Integer> list) {
//		return list.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).toList();
//		OR
		return list.stream().distinct().sorted(Comparator.reverseOrder()).toList();
	}

	private static double calculateAverage(final List<Integer> list) {
		return list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
	}
}
