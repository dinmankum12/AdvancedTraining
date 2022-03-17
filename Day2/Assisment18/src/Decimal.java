

import java.util.HashMap;

public class Decimal {
	   static String fractionToDecimal(int numr, int denr)
	    {
	        // Initialize result
	        String res = "";
	 
	        
	        HashMap<Integer, Integer> mp = new HashMap<>();
	        mp.clear();
	 
	        // Find first remainder
	        int rem = numr % denr;
	 
	        // Keep finding remainder until
	        //  either remainder becomes 0 or repeats
	        while ((rem != 0) && (!mp.containsKey(rem)))
	        {
	            // Store this remainder
	            mp.put(rem, res.length());
	 
	            // Multiply remainder with 10
	            //rem = rem * 10;
	 
	            // Append rem / denr to result
	            int res_part = rem / denr;
	            res += String.valueOf(res_part);
	 
	            // Update remainder
	            rem = rem % denr;
	        }
	 
	        if (rem == 0)
	            return "";
	        else if (mp.containsKey(rem))
	            return res.substring(mp.get(rem));
	 
	        return "";
	    }
	 
	    // Driver code
	   
	      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int numr = 1, denr = 3;
	        String res = fractionToDecimal(numr, denr);
	        if (res == "")
	            System.out.print("No recurring sequence");
	        else
	            System.out.print("Recurring sequence is "
	                             + res);

	}

}
