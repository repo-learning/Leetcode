package test_code;

public class Arraytest {
	static int[] mainarr;
	private int count=0;
	
	public Arraytest(int index)
	{
		mainarr = new int[index];
		
		
	}
	public void insert(int item)
	{
		if(count < mainarr.length)
		mainarr[count++] = item;
		else
		{
			 int[] newarray = new int[count*2];
			 for(int i=0;i<count;i++)
				 newarray[i] = mainarr[i];
			 newarray[count++] = item;
			 
			 mainarr = newarray;
		}
		
		
	}
	public void print()
	{
		for(int i=0;i<count;i++)
			System.out.println(mainarr[i]);
	}

}
