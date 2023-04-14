package com.practise.designpatterns;

public class SingletonPatternEager {

	public static SingletonPatternEager obj = new SingletonPatternEager();

	private SingletonPatternEager() {
		System.out.println("Object Created");

	}

	public static SingletonPatternEager getInstance() {
		return obj;
	}
}
