package com.practise.converstions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayElementsToIntegerNumber {

	
	public int[] convertArrayToInteger( int [] arr)
	{
		int n=arr.length-1;
		long sum=0;
		
		for(int i=0;i<=n;i++)
		{
			sum+=arr[i]*Math.pow(10, n-i);
		}
		sum=sum+1;
		List<Long> list=new ArrayList<Long>();
        int i=0;
        long rem=0;
        while( sum !=0)
        {
            rem=sum % 10;
            sum=sum/10;
            list.add(i,rem);
            i++;
        }
        
        //reverse list
       Collections.reverse(list);
        
        return list.stream().mapToInt(Long::intValue).toArray();
	}
}
