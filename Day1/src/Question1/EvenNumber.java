package Question1;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		int n,i;
		System.out.println("Enter a value of n : ");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		
		for(i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.println("the even number is :"+i);
			}
		
		}
	}

}
