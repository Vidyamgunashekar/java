package com.practise.javabasics;

import java.util.Arrays;

public class ArraysCopy {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4};
		
		int [] b=new int[a.length];
		
		//b=a;
		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
		
		
		// 1. iterating one element 
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		b[0]++;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		//2. Array clone
		
		int c[]=new int [a.length];
		c=a.clone();
		
		a[0]++;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		
		
		// 3. System.arraycopy
		
		int d[]=new int [a.length];
	
		System.arraycopy(a, 0, d, 0, 0);
	
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(d));
		
		// 4. Arrays.copyof
		
		int e[]=new int [a.length];
			
		e=Arrays.copyOf(a, 2);
			
				
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(e));
		
		// 5. Arrays.copyofrange
		
				int f[]=new int [a.length];
					
				f=Arrays.copyOfRange(a, 2, 3);
					
						
				System.out.println(Arrays.toString(a));
				System.out.println(Arrays.toString(f));
		

	}
	
	

}
