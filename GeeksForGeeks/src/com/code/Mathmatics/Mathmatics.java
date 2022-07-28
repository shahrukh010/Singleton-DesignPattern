package com.code.Mathmatics;

import java.util.ArrayList;
import java.util.List;

public class Mathmatics {

	public java.util.function.Function<Integer, Integer> countDigit = (n) -> {

		int result = 0;
		// here i assuming 0 is not consider as digit if n==0 then return 0 only
		while (n != 0) {

			n = n / 10;
			result++;
		}
		return result;
	};

	public java.util.function.Predicate<Integer> isPalindrome = (n) -> {

		int result = 0;
		int tmp = n;
		while (tmp != 0) {

			result = result * 10 + tmp % 10;
			tmp = tmp / 10;
		}
		return n == result;
	};

	public java.util.function.Function<Integer, Integer> factorial = (n) -> {

		int result = 1;
		for (int i = 1; i <= n; i++)
			result *= i;
		return result;
	};

	public java.util.function.Function<Integer, Integer> countTrailingZero = (n) -> {

		int factorial = this.factorial.apply(n);
		int result = 0;
		while (factorial % 10 == 0) {

			result++;
			factorial = factorial / 10;
		}
		return result;

	};

	public java.util.function.Function<Integer, Integer> countZero = (factorial) -> {

		int result = 0;
		for (int i = 5; i <= factorial; i = i * 5) {

			result += factorial / i;
		}
		return result;
	};

	public java.util.function.BiFunction<Integer, Integer, Integer> gcd = (a, b) -> {

		int nth = Math.max(a, b);
		int result = 0;

		for (int i = 1; i <= nth; i++) {

			if (a % i == 0 && b % i == 0)
				result = Math.max(i, result);
		}
		return result;
	};

	public java.util.function.BiFunction<Integer, Integer, Integer> greatedCommonDiv = (a, b) -> {

//		int res = Math.min(a, b);
//		while(res>0) {
//			
//			if(a%res==0 && b%res==0) {
//				
//				return res;
//			}
//			res--;
//		}
//		return res;

		while (a != b) {

			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	};

	public java.util.function.Consumer<Integer> primeFactor = (n) -> {

		for (int i = 2; i * i <= n; i++) {

			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
		}
		if (n > 1)
			System.out.println(n);
	};

	public java.util.function.Consumer<Integer> allDivisor = (n) -> {

		int i = 0;
		for (i = 1; i * i < n; i++) {

			if (n % i == 0)
				System.out.println(i);
		}
		for (; i >= 1; i--)
			if (n % i == 0)
				System.out.println(n / i);
	};

	public java.util.function.Predicate<Integer> isPrime = (n) -> {

		if (n <= 1)
			return false;

		if (n == 2 || n == 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6) {

			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	};

	public java.util.function.Function<Integer, List> printAllPrime = (n) -> {

		List<Integer> res = new ArrayList<>();
		boolean[] flag = new boolean[n+1];

		for (int i = 2; i * i <= n; i++) {

			if (isPrime.test(i))
				for (int j = 2 * i; j <= n; j = j + i)
					flag[j] = true;
		}
//		System.out.println(java.util.Arrays.toString(flag));
		for (int i = 2; i < flag.length; i++)
			if (!flag[i])
				res.add(i);
		return res;
	};

}
