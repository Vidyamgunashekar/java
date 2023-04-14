package com.practise.leetcode;

public class Rough {

	public static void main(String args[]) {

		int nums[] = { -4, -1, 0, 3, 10 };

		int arr[] = sortedSquares(nums);
		System.out.println(arr);

	}

	public static int[] sortedSquares(int[] nums) {
		int q = 0;
		int p = 0;
		int arr[] = new int[nums.length];
		// first negative then positive
		if (nums[0] < 0 && nums[nums.length - 1] > 0) {
			while (nums[p] < 0) {
				p++;
			}
			q = p + 1;
			for (int i = 0; i < nums.length - 1; i++) {

				if (p >= 0 && q < nums.length - 1 && (nums[p] * nums[p]) < (nums[q] * nums[q])) {
					arr[i] = nums[p] * nums[p];
					p--;
				} else if (p >= 0 && q < nums.length - 1 && (nums[p] * nums[p]) > (nums[q] * nums[q])) {
					arr[i] = nums[q] * nums[q];
					q++;
				} else {
					if (p != 0) {
						while (p <= 0) {
							arr[i++] = nums[p] * nums[p];
							p--;
						}
					}
					if (q != nums.length - 1) {
						while (q > nums.length - 1) {
							arr[i++] = nums[q] * nums[q];
							q++;
						}
					}

				}
			}

		} else if (nums[nums.length - 1] < 0) {
			p = nums.length - 1;
			for (int i = nums.length - 1; i > 0; i++) {
				arr[i] = nums[p] * nums[p];
				p--;

			}
		} else {
			p = 0;
			for (int i = 0; i < nums.length; i++) {
				arr[i] = nums[p] * nums[p];
				p++;

			}
		}

		return arr;
	}
}
