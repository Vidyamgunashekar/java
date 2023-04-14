package com.practise.javabasics;

public class HelloWorld {

	public static void main(String[] args) {
		int nums[]= {-4,-3,-1,0,3,10};

        //pointers for left and right
        int left=0;
        int right=0;
        int finalAr[]=new int[nums.length];
        //find the numbers less than 0
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]<0)
           {
               nums[i]=nums[i]*nums[i];
               left=i;
           }
       }
        int j=0;
        
        for(int i=left+1;i<nums.length;i++)
        {
            int sq=nums[i]*nums[i];
            if(sq<nums[i--])
            {
                finalAr[j]=sq;
                j++;
                
            }
            else
            {
                finalAr[j]=nums[i--];
                i--;
                j++;
            }
        
        
	        }

	}

}
