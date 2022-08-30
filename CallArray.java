package test_code;

public class CallArray {
	public static void main(String[] args)
	{
		Arraytest arr = new Arraytest(3);
		arr.insert(3);
		arr.insert(4);
		arr.insert(1);
		
		arr.insert(5);
		arr.print();
	}

}
