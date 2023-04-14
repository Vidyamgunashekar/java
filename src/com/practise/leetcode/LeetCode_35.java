package com.practise.leetcode;

public class LeetCode_35 {

	public static void main(String[] args) {
		int arr[] = { -3,-1,2,5,8};
		int length = arr.length;

		int n = 0;

		// n=binarysearch_1(arr, length, 4);
		n = binarysearch_1(arr, length, -2);
		System.out.println("number found at " + n);

	}

	public static int binarysearch_1(int[] arr, int len, int num) {
		int low = 0;
		int high = len - 1;
		int mid = 0;
		int i = 0;
		while (low <= high) {
			System.out.println("Iteration" + i++);
			mid = (low + high) / 2;
			if (arr[mid] == num)
				return mid;
			else if (num < arr[mid]) {
				
				
					high = mid - 1;
				}
			 else {
				
				
					low = mid + 1;
				
			}

		}
		return low;

	}

}
