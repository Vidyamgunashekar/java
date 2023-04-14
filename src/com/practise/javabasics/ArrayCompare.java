package com.practise.javabasics;

import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5 };

		int c[] = a.clone();
		System.out.println("Using ==");
		if (a == b) {
			System.out.println("Same");

		} else {
			System.out.println("Not Same");
		}
		System.out.println("Using == after clone");
		if (a == c) {
			System.out.println("Same");

		} else {
			System.out.println("Not Same");
		}
		System.out.println("d=a");
		int d[] = new int[a.length];
		d = a;
		
		
		System.out.println("Using comapre");
		if (Arrays.compare(a, d) == 0) {
			System.out.println("Same");

		} else {
			System.out.println("Not Same");
		}

		System.out.println("Using equals");
		if (Arrays.equals(a, d)) {
			System.out.println("Same");

		} else {
			System.out.println("Not Same");
		}
		
	}

}
