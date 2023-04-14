package com.practise.javabasics;

public class CallByValueReference {

	private  int i;

	public CallByValueReference(int x) {
		i = x;
	}

	public CallByValueReference() {
		i = 0;
	}

	public static void main(String[] args) {

		CallByValueReference obj = new CallByValueReference(10);
		change(obj.i);
		System.out.println(obj.i);
		change(obj);
	}

	static void change(int y) {
		y = y + 1;

	}

	static void change(CallByValueReference wq) {
		wq.i = 1;
	}
}
