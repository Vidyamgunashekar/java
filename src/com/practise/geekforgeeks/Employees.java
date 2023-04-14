package com.practise.geekforgeeks;

import java.util.Comparator;

public class Employees implements Comparable<Employees> {

	private String name;
	private int id;
	private float salary;

	Employees(String name, int id, float salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public float getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employees o) {
		int diffsalary = Float.compare(this.salary, o.salary);
		if (diffsalary != 0) {
			return diffsalary;

		}

		int diffId = Integer.compare(this.id, o.id);
		if (diffId != 0) {
			return diffId;
		}

		return this.name.compareTo(o.name);
	}

}



