package test_code;

import java.util.HashMap;
/*
 * Create a hashmap to store target-arr[i] as key and index as value
 * for Ex: [3,4,5] target:7
 * hashmap 7-3 not there in hashmap push , 3 as key and index 0 as value
 * 7-4 is there in hashmap, get the 7-4 value from hashmap and this value index from array
 * so the answer is 0,1
 * */

public class twoSum {
	 public static int[] gettwoSum(int[] nums, int target) {
	        int[] finalarr= new int[2];
	        int finallarrcount= 0;
	        HashMap values = new HashMap();
	        for(int i=0;i<nums.length;i++)
	        {
	        	int currvalue = nums[i];
	        	int check = target-currvalue;
	        	
	        	if (values.containsKey(Integer.valueOf(check)))
	        	{
	        		Integer firstkey = (Integer)values.get(Integer.valueOf(check));
	        		finalarr[finallarrcount++] = firstkey.intValue();
	        		finalarr[finallarrcount++] = i;
	        		break;
	        	}
	        	else
	        	{
	        		values.put(nums[i],i);
	        	}
	        			
	        	
	        }
    		return finalarr;

	        
	    }

	public static void main(String[] args) {
		int[] arr = {3,2,4};
		int target = 7;
		int result[] = gettwoSum(arr,target);
		for(int index=0;index<result.length;index++)
		System.out.println(result[index]);

	}

}
