package Question1;

import java.util.*;
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      for(int i=1;i<=5;i++) {
    	  System.out.println("Enter length and breadth of rectangle");
    	  int len=sc.nextInt();
    	  int bre=sc.nextInt();
		Rectangle obj = new Rectangle(len,bre);
		obj.displayAreaOfTestRectangle();
      }
	}

}
