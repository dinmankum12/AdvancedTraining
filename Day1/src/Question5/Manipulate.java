package Question5;

import java.util.Scanner;

public class Manipulate {

	   public static void main(String args[]) {
		   
	      System.out.println("Enter a String: ");
	      Scanner scan = new Scanner(System.in);
	      String str = scan.nextLine();

	      
	      
	      str = str.toLowerCase();
	      System.out.println("Lower Case :"+str);
	      
	      str = str.toUpperCase();
	      System.out.println("Upper Case :"+str);
	       
	      String parts[] = str.split(" ");
	      for(String part:parts) {
	    	  System.out.println("Split : "+part);
	      }
	     char str1 = str.charAt(0);
	      System.out.println(str1);
	      
	      StringBuilder str2 = new StringBuilder("JAVA is Simple");
	      

      // print string
      System.out.println("String = "+ str.toString());

      // reverse the string
      StringBuilder reverseStr = str2.reverse();

      // print string
      System.out.println("Reverse String = "
                         + reverseStr.toString());
	      
	      System.out.println("length = " +str.length());
	   }
	}