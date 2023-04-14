package com.practise.leetcode;

class DuplicateZeros {
	public void duplicateZeros(int[] arr) {

		int al = arr.length;
		int count = 0;
		int k = 0;
		while (count < al) {
			if (arr[k] == 0) {
				count = count + 2;
			} else {
				count += 1;
			}
			k++;
		}
		int l = arr.length - 1;
		if (count > arr.length) {
			arr[l] = 0;
			l--;
			for (int i = k - 2; i >= 0; i--) {
				if (arr[i] == 0) {
					arr[l] = 0;
					l--;
					arr[l] = 0;
					l--;

				} else {
					arr[l] = arr[i];
					l--;
				}

			}
		} else {
			l = arr.length - 1;

			for (int i = k - 1; i >= 0; i--) {
				if (arr[i] == 0) {
					arr[l] = 0;
					l--;
					arr[l] = 0;
					l--;

				} else {
					arr[l] = arr[i];
					l--;
				}

			}
		}
	}

	public static void main(String[] args) {
		DuplicateZeros abc = new DuplicateZeros();

		int arr[] = { 0, 0, 0, 0, 0, 0, 0 };

		abc.duplicateZeros(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}