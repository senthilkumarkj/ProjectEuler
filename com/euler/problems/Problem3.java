package com.euler.problems;

public class Problem3
{
	public static void main(String args[])
	{
		long res = largestPrimeFactor(600851475143L);
		System.out.println("Prime factor = "+res);
	}

	//largest prime factor for n
	public static long largestPrimeFactor(long number)
	{
		long i = 2;
		while(i*i < number)
		{
			if(number%i==0)
				number = number/i;
			else
				i++;
		}
		return number;
	}

}