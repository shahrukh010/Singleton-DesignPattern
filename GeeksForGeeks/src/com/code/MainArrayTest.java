package com.code;

import com.code.Array.Arrays;

public class MainArrayTest {

	public static void main(String... strings) {

		Arrays array = new Arrays();

//		int[] nums = {10,5,20,8,-25,110};
//		int result = array.largestArrayElementIndex.apply(nums);
//		System.out.println(nums[result]);

//		int[] nums = {10,5,8,20};
		int[] nums = { 20, 10, 20, 8, 12 };
		int result = array.secondLargestElementIndex.apply(nums);
		System.out.println(nums[result]);
	}

}
