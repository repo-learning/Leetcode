package test_code;
/*
 * Add array values to a hashset which doesn't allow duplicates
 */
import java.util.HashSet;

public class containsDuplicate {
	
public boolean containsDuplicate(int[] nums) {
	HashSet ss = new HashSet();
	for(int index = 0;index<nums.length;index++)
	{
		int value = nums[index];
		if (ss.contains(Integer.valueOf(value)))
		return true;
		else
			ss.add(Integer.valueOf(value));
		
	}
	
	
	return false;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,1,1,3,3,4,3,2,4,2};
		containsDuplicate ff = new containsDuplicate();
		System.out.println(ff.containsDuplicate(nums));

	}

}
