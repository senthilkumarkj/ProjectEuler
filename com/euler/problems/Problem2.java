package com.euler.problems;

public class Problem2
{
	public static void main(String args[])
	{
		int res = sumOfEvenFibSeq(4000000);
		System.out.println("Sum = "+res);
	}

	//function to find the sum of even numbers in fib seq under 4 million
	public static int sumOfEvenFibSeq(int range)
	{
		int x=1,y=2;
		int z = x+y,sum=2;
		while(z <= range)
		{
			if(z%2==0) sum+=z;
			//System.out.println(z);
			x = y;
			y = z;
			z = x+y;
		}
		return sum;
	}

}