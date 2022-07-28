package com.code.Array;

public class Arrays {

	public java.util.function.Function<int[], Integer> largestArrayElementIndex = (input) -> {

		int result = 0;

		// (n2)
//		for (int i = 0; i < input.length ; i++) {
//
//			for (int j = i + 1; j < input.length; j++)
//				if (input[result] < input[j])
//					result = j;
//		}

		// n
		for (int i = 1; i < input.length; i++) {

			if (input[i] > input[result])
				result = i;
		}

		return input[result];
	};

	public java.util.function.Function<int[], Integer> secondLargestElementIndex = (input) -> {

		int max = largestArrayElementIndex.apply(input);

		int result = 0;
		for (int i = 0; i < input.length; i++) {

			if (input[i] < max && input[i]>input[result]) {

				result = i;
			}
		}
		return result;
	};
}
