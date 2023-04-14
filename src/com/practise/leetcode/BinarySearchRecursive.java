package com.practise.leetcode;

public class BinarySearchRecursive {

	public static void main(String args[]) {
		int arr[] = { 6, 5, 4, 3, 2, 1 };
		int length = arr.length;

		binarySearch(arr, 1, 0, length - 1);

		// System.out.println("number found at " + n);

	}

	public static int binarySearch(int[] nums, int target, int low, int high) {
		int mids = 0;
		if (low < high) {
			mids = (low + (high - low) >> 1);
			if (target == nums[mids]) {
				System.out.printf("%d exists in nums and its index is %d", target, mids);
				return mids;
			} else if (target > nums[mids])
				return binarySearch(nums, target, low, mids - 1);
			else
				return binarySearch(nums, target, mids + 1, high);

		} else {

			System.out.printf("%d does not exist in nums so return -1", target);
			return -1;
		}
	}

}