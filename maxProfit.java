package test_code;
/*
 * Always check if left value that is prev day is less than next day
 * If yes, get profit else move the left pointer to the min value which is in the right
 */

public class maxProfit {
	int l=0,r=1,maxpro;
	


public  int maxProfit(int[] prices) {
	while(r<prices.length)
	{
	int left = prices[l];
	int right = prices[r];
	
	if(left<right )
	{
		int profit = right-left;
		maxpro = profit>maxpro?profit:maxpro;
		
		
	}
	else
		l=r;
	r++;
	}
	
	return maxpro;
	
    }

	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		maxProfit ff = new maxProfit();
		System.out.println(ff.maxProfit(arr));
		
		
		
		// TODO Auto-generated method stub

	}

}
