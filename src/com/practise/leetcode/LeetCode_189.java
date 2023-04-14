
//rotate array k times
package com.practise.leetcode;

public class LeetCode_189 {
	
	public void rotate1(int[] nums, int k) {
        int t=0;
        int i=0;
        for(int j=0;j<k%nums.length;j++)
        {
        	System.out.println("inside for loop"+j);
            i=nums.length-1;
            t=nums[i];
           
            while(i!=0 && i>=0)
            {
            	System.out.println("inside while loop"+j);

                nums[i]=nums[i-1];
                i--;
            }
            nums[0]=t;
        }
      
        
    }
	
	

}
