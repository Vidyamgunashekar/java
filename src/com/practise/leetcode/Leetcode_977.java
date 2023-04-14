package com.practise.leetcode;

public class Leetcode_977 {

	public static void main(String args[]) {
		int nums[] = { -1, -1, 0, 3, 10 };

		int ans[];
		ans = sortedSquares(nums);
	}

	private static int[] sortedSquares(int[] nums) {

		int p = 0, q = 0;
		int ans[] = new int[nums.length];
		while (nums[p] <= 0) {
			p++;
			q = p + 1;
		}
		if (q > nums.length)
			for (int i = 0; i < nums.length; i++) {
				ans[i] = nums[p] * nums[p];
				p--;

			}
		else if (p == 0) {
			for (int i = 0; i < nums.length; i++) {
				ans[i] = nums[i] * nums[i];

			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				if(p+q==nums.length)
				{
				if(Math.pow(p, 2)>Math.pow(q, 2))
				{
					ans[i]=(int) Math.pow(q, 2);
					q++;
				}
				else 
				{
					ans[i]=(int) Math.pow(p, 2);
					p++;
				}
				}
				else
				{
					
				}

			}

		}
		return ans;

	}
}
