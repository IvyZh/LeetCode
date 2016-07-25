package com.ivy.leetcode;

public class AddDigits {

	/**
	 * 258.AddDigits
	 * 
	 * Given a non-negative integer num, repeatedly add all its digits until the
	 * result has only one digit.
	 * 
	 * For example:
	 * 
	 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has
	 * only one digit, return it.
	 */
	public static void main(String[] args) {
		Solution s = new Solution();

		int num = s.addDigits2(100);
		System.out.println(num);
	}

	public static class Solution {

		// Method 1
		public int addDigits(int num) {
			while (num >= 10) {
				num = num / 10 + num % 10;
			}

			return num;
		}

		// Method 2
		// Could you do it without any loop/recursion in O(1) runtime?
		public int addDigits2(int num) {
			return (num - 1) % 9 + 1;
		}
	}
}
