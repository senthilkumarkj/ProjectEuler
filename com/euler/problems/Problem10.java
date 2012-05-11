package com.euler.problems;

import java.util.Arrays;

public class Problem10
{
	static int size = 2*1000000;
	static Boolean[] primes = new Boolean[size];
	public static void main(String args[])
	{
		long res = sumOfPrimes(size);
		System.out.println("sum = "+res);
		//System.out.println(Arrays.toString(primes));
	}

	//sum of all primes http://projecteuler.net/problem=10
	public static long sumOfPrimes(long range)
	{
		long sum=0;
		for(int i=2;i<range;i++)
		{
			
			if(primes[i] == null && isPrime(i))
			{
				sum+=i;
				System.out.println(i);
				primes[i] = true;
				for(int j=i*2;j<size;j=j+i)
				{
					primes[j]=false;
				}
			}
		}
		return sum;
	}

	public static boolean isPrime(int n)
	{
		if(n<2) return false;
		if(n==2) return true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}