package com.practise.geekforgeeks;

import java.util.Arrays;

public class Driver {

//	public static void main(String[] args) {
//		Employees e1=new Employees("Vidya",3,2000);
//		
//		List<Employees> list=new ArrayList<Employees>();
//		list.add(e1);
//		list.add(new Employees("Vish",3,1000));
//		
//		//Collections.sort(list,new EmployeeComparator());
//		Collections.sort(list);
//		
//		// loop over the list and print each employee
//		for (Employees employee : list) {
//		    System.out.println(employee.getName() + " (" + employee.getId() + "): $" + employee.getSalary());
//		}
//		
//
//	}
	
	public static void main(String[] args) {
		
		int[] num= {10,3,2,5,2,14,15};

		System.out.println(Arrays.toString(num));
		
//		BubbleSort b=new BubbleSort();
//		b.bubblesort(num, num.length);
		
		SelectionSort s=new SelectionSort();
		int pos=s.selectionSort(num, num.length,2);
		System.out.println(Arrays.toString(num));

	}

}
