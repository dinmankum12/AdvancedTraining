package com.dinesh;

import java.util.Scanner;

import java.util.Vector;

public class CoinChange
{

	static int deno[] = {1, 2, 5, 10, 20,
	50, 100, 500, 2000};
	static int n = deno.length;

	static void findMin(int V)
	{
		
		Vector<Integer> ans = new Vector<>();

		for (int i = n - 1; i >= 0; i--)
		{
			
			while (V >= deno[i])
			{
				V -= deno[i];
				ans.add(deno[i]);
			}
		}

		
		for (int i = 0; i < ans.size(); i++)
		{
			System.out.print(
				" " + ans.elementAt(i));
		}
	}

	
	public static void main(String[] args)
	{
//		int n = 93;
		System.out.println("Enter the value of n : ");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		System.out.print(
			"Following is minimal number "
			+"of change for " + n + ": ");
		findMin(n);
	}
}


