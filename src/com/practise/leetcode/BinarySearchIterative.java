package com.practise.leetcode;

public class BinarySearchIterative {

	public static void main(String args[]) {
		int arr[] = { 6, 5, 3, 2, 1 };
		int length = arr.length;

		int n = 0;

		// n=binarysearch_1(arr, length, 4);
		n = binarysearch_2(arr, length, 0);
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
			else if (num > arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;

	}

	public static int binarysearch_2(int[] arr, int len, int num) {
		int low = 0;
		int high = len - 1;
		int mid = 0;
		while (high - low > 1) {
			mid = (low + high) / 2;
			if (num < arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		if (num == arr[low]) {
			System.out.println("Found at" + low);
		} else if (num == arr[high]) {
			System.out.println("Found at " + high);
		} else {
			System.out.println("not found");
		}
		return -1;

	}
}