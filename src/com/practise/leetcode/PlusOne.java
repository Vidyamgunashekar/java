package com.practise.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlusOne {


    public int[] plusOne(int[] digits) {
     List<Integer> num = Arrays.stream(digits).boxed().collect(Collectors.toList());
        int n=digits.length-1;
        int val=1;
        if(n==0&&num.get(0)==9)
        {
            
            num.set(0,0);
            num.add(0,1);
        }
           else if(n!=0 && num.get(n)<9)
            {
                num.set(n,num.get(n)+1);
            }
        
        else
        {
        for(int i=n;i>=0;i--)
        {
            if(val==1 && num.get(i)==9)
            {
                num.set(i,0);
                val=1;
            }
            else if(val==1 && num.get(i)<9)
            {
                num.set(i,num.get(i)+1);
                val=0;
            }
            else
            {
                val=0;
            }
            
            
        }
            if(val==1)
                num.add(0,1);
        }
        return num.stream().mapToInt(Integer::intValue).toArray();
        
    }
   
    public static void main(String[] args) {
		
	}
}
