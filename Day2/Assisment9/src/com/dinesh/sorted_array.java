package com.dinesh;

//Java program to count number
//of occurrences of each
//element in the array
import java.io.*;
import java.util.*;
public class sorted_array
{

//It prints number of
//occurrences of each
//element in the array.
static void findFrequency(int [] arr,
							int n)
{
	Map<Integer, Integer> mp
	= new HashMap<Integer, Integer>();

	// traverse the array
	for (int i = 0; i < n; i++)
	{

	// update the frequency
	if (!mp.containsKey(arr[i]))
		mp.put(arr[i],0);

	mp.put(arr[i],mp.get(arr[i])+1);
	}

	// traverse the hashmap
	for (Map.Entry<Integer, Integer> kvp : mp.entrySet())
	{
	System.out.println("Element " + kvp.getKey() +
						" occurs " + kvp.getValue() +
						" times");
	}
}

//Driver function
public static void main (String[] args) {


	int [] arr = {2,2,2,4,4,4,5,5,6,8,8,9};
	int n = arr.length;
	findFrequency(arr, n);
}
}

//This code is contributed by avanitrachhadiya2155
