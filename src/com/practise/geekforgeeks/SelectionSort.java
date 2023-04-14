package com.practise.geekforgeeks;

import java.util.Arrays;

public class SelectionSort {

//	void selectionSort(int[] num, int n) {
//		
//		int swap=0;
//		int m_i=0;
//		boolean SWAP;
//		for(int j=0;j<n-1;j++)
//		{
//			SWAP=false;
//			m_i=j;
//			for(int i=j+1;i<n;i++)
//			{
//				if(num[m_i]>num[i])
//				{
//					SWAP=true;
//					m_i=i;
//				}
//			}
//			if(SWAP)
//			{
//			swap=num[m_i];
//			num[m_i]=num[j];
//			num[j]=swap;
//			}
//		}
//		
//		
//	}

	int selectionSort(int[] num, int n, int k) {

		int swap = 0;
		int m_i = 0;
		int sec = 0;
		for (int j = 0; j < n - 1; j++) {

			m_i = j;
			for (int i = j + 1; i < n; i++) {
				if (num[m_i] < num[i]) {

					m_i = i;
				}
			}

			swap = num[m_i];
			num[m_i] = num[j];
			num[j] = swap;

			if (j == k-1) {
				sec = m_i;

				return sec;
			}
		}
		return sec;

	}
}
