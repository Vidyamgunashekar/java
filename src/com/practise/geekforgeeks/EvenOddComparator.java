package com.practise.geekforgeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EvenOddComparator {
	private int num;
	
	
	public EvenOddComparator(int num) {
		this.num=num;
		
	}
	
	public int getNum()
	{
		return this.num;
	}
	
	public static void main(String args[])
	{
		List<EvenOddComparator> list=new ArrayList<EvenOddComparator>();
		list.add(new EvenOddComparator(2));
		list.add(new EvenOddComparator(1));
		list.add(new EvenOddComparator(3));
		list.add(new EvenOddComparator(4));
		list.add(new EvenOddComparator(5));
		list.add(new EvenOddComparator(6));
		
		for(EvenOddComparator number:list)
		{
			System.out.print(number.getNum()+" ");
		}
		
		System.out.println();
		Collections.sort(list,new NumberComparator());
		for(EvenOddComparator number:list)
		{
			System.out.print(number.getNum()+" ");
		}
		
	}

}

 class NumberComparator implements Comparator<EvenOddComparator>
{

//	@Override
//	public int compare(EvenOddComparator o1, EvenOddComparator o2) {
//		if (o1.getNum() % 2 ==0 && o2.getNum() %2 !=0)
//			return -1;
//		else if (o1.getNum() % 2 !=0 && o2.getNum() %2 ==0)
//			return 1;
//		
//		return 0;
//	}
	
	@Override
	public int compare(EvenOddComparator o1, EvenOddComparator o2) {
		return o1.getNum() % 2 - o2.getNum()%2;
	}
}
