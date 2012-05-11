package com.euler.problems;

import java.math.BigInteger;
import java.util.*;

public class Problem12
{
	public static void main(String args[])
	{
		int res = findDivisors(500);
		System.out.println("Divisors = "+res);
	}

	//function to find divisors http://projecteuler.net/problem=12
	public static int findDivisors(int range)
	{
		if(range <= 0)
			return 0;
		int count=1,n=2,max_count=0;
		BigInteger tri_num,divisor;
		while(count <= range)
		{
			tri_num = triangleNumber(n);
			Map<Integer,Integer> factors = primeFactors(tri_num.intValue());
			System.out.println("n="+n+" triangleNumber = "+tri_num.intValue()+" factors: "+factors);
			count=1;
			System.out.println(factors);
			for(Integer fac : factors.keySet())
			{
				count *= factors.get(fac)+1;
			}
			System.out.println(count);
			n++;
		}
		return n-1;
	}

	//function to get the triangle number value for n
	public static BigInteger triangleNumber(int n)
	{
		BigInteger tri_num = new BigInteger("0");
		if(n<=0)
			return tri_num;
		for(int i=1;i<=n;i++)
		{
			tri_num = tri_num.add(new BigInteger(Integer.toString(i)));
		}
		return tri_num;
	}

	public static Map<Integer,Integer> primeFactors(int n)
	{
		Map<Integer,Integer> factors = new HashMap<Integer,Integer>(250);
		if(n<=1)
			return factors;
		int sqrt = (int)Math.sqrt(n),i=2;
		while(i<=n)
		{
			if(n%i==0)
			{
				n=n/i;
				if(factors.containsKey(i))
				{
					int tmp = factors.get(i);
					factors.put(i,tmp+1);
				}
				else
					factors.put(i,1);
			}
			else
				i++;
		}

		return factors;
	}
}