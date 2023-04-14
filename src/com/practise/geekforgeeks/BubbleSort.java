package com.practise.geekforgeeks;

import java.util.Arrays;

public class BubbleSort {

	void bubblesort(int[] num, int n)
	{

		int counter = 0;
		boolean SWAP;

		int swap = 0;
		for (int i = 0; i < n - 1; i++) {
			counter++;
			SWAP = false;
			for (int j = 0; j < n - 1 - i; j++) {

				if (num[j] > num[j + 1]) {
					SWAP = true;
					swap = num[j + 1];
					num[j + 1] = num[j];
					num[j] = swap;

				}

			}
			if (SWAP == false)
				break;

		}
		System.out.println(Arrays.toString(num));
		System.out.println(counter);
	}

}
