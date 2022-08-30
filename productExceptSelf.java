package test_code;

import java.util.Arrays;

public class productExceptSelf {

	public int[] getProduct(int[] nums)
	{
		int[] result = new int[nums.length];
		int pre =1;
		int post = 1;
		result[0]=1;
		for (int i=0;i<nums.length-1;i++)
		{
			int value = pre*nums[i];
			
			result[i+1]= pre = value ;
		}
		for (int i=nums.length-1;i>=0;i--)
		{
			int value = post*result[i];
			
			result[i] = value ;
			post = post*nums[i];
		}
		return result;
		
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		productExceptSelf ff= new productExceptSelf();
		int nums[] = {-1,1,0,-3,3};
		int[] result = ff.getProduct(nums);
		System.out.println(Arrays.toString(result));
	}

}
