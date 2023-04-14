package com.practise.geekforgeeks;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employees> {



	@Override
	public int compare(Employees o1, Employees o2) {
		int diffsalary = Float.compare(o1.getSalary(),o2.getSalary());
		if (diffsalary != 0) {
			return diffsalary;

		}

		int diffId = Integer.compare(o1.getId(),o2.getId());
		if (diffId != 0) {
			return diffId;
		}

		return o1.getName().compareTo(o2.getName());
	}

	

}
