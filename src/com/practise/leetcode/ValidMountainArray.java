package com.practise.leetcode;

import java.util.Arrays;

public class ValidMountainArray {
	public static void main(String[] args) {
		int a[] = {1,7,9,5,4,1,2};

		LogicIsValidMountainArray ob = new LogicIsValidMountainArray();

		System.out.println(Arrays.toString(a));
		System.out.println(ob.isValidMountainArray(a));
	}
}

class LogicIsValidMountainArray {

	boolean isValidMountainArray(int nums[]) {

		if (nums.length < 3) {
			return false;
		}
		int big = nums[0];
		int bigIndex = 0;
		int i = 0;
		// find big number
		for (i = 0; i < nums.length; i++) {
			if (big < nums[i]) {
				big = nums[i];
				bigIndex = i;
			}
		}
		if(bigIndex==nums.length|| bigIndex==0)
		{
			return false;
		}
		int j = 0;
		for (j = 0; j < bigIndex; j++) {
			if (nums[j] != nums[j + 1] && nums[j] < nums[j+1]) {
				;
			} else {
				return false;
			}
		}
		int k = 0;
		for (k = nums.length - 1; k > bigIndex; k--) {
			if (nums[k] != nums[k - 1] && nums[k] < nums[k-1]) {
				;
			} else {
				return false;
			}
		}
		if (j + (nums.length - k) == nums.length) {
			return true;
		} else
			return false;

	}
	
	 public boolean validMountainArray(int[] arr) {

			if (arr.length < 3) {
				return false;
			}
			int i = 0;
			while (i+1 < arr.length && arr[i] < arr[i + 1]) {
				i++;
			}
			if(i==0 || i==arr.length-1)
			{
				return false;
			}
			i++;
			while (i < arr.length && arr[i] < arr[i - 1]) {
				i++;
			}
			return i == arr.length;
		}

}
