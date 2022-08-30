package test_code;
/*
 * For example, 2 is written as II in Roman numeral, just two ones added together. 
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, 
the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.

Maintain a map/dictionary with Roman symbols and their corresponding integer equivalent.
Scan the string from right to left. Get the value corresponding to the current character from the map/dictionary and add it to the result.
The special case is where there is a character at left of current character whose value is less than the 
value corresponding to the current character. For e.g. X represents 10 but IX represents 9. 
In this case, we will subtract the value of the character in the left from the result.
 */
import java.util.HashMap;
import java.util.Map;

public class RomantoInt {
	
	    public static int romanToInt(String s) {
	    	int result = 0;
	    	Map<String, Integer> romans = new HashMap<>();
	    	  
	        // Inserting entries in the Map
	        // using put() method
	        romans.put("I", 1);
	        romans.put("V", 5);
	        romans.put("X", 10);
	        romans.put("L", 50);
	        romans.put("C", 100);
	        romans.put("D", 500);
	        romans.put("M", 1000);
	   char[] strarray = s.toCharArray();
	   int i=0;
	        for(;i<s.length();i++)
	        {if(i+1 < s.length()) {
	        	String prev=""+strarray[i];
	        	String nex = ""+strarray[i+1];
	        	if((romans.get(prev))<(romans.get(nex)))
	        			{
	        		result -= romans.get(prev);
	        			}
	        	else
	        		result += romans.get(prev);
	        }
	        
	        
	        }
	        if(i >0)
	        {
	        	System.out.println(i-1);
	        	result+= romans.get(""+strarray[i-1]);
	        }
	        return result;
	    }
	    public static void main(String args[])
	    {
	    	System.out.println(romanToInt("VII"));
	    }
	

}
