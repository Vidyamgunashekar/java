package com.practise.leetcode;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		Integer[] num= {10,30,20,13,23,3};
		
		System.out.println(Arrays.toString(num));
		
		int i=0;
		int j=num.length-1;
		int swap=0;
		while(i<j)
		{
			swap=num[i];
			num[i]=num[j];
			num[j]=swap;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(num));
	}

}
