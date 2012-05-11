package com.euler.problems;

public class Problem1
{
	public static void main(String args[])
	{
		int res = sumOfMultiples(1000);
		System.out.println("Sum = "+res);
	}

	//function to find the sum of all multiples of 3 and 5 below the given range
	public static int sumOfMultiples(int range)
	{
		int i=1, sum=0;
		while(i<range)
		{
			if(i%3==0 && i%5==0)
				sum+=i;
			else if(i%3==0)
				sum+=i;
			else if(i%5==0)
				sum+=i;
			i++;
		}
		return sum;
	}
}