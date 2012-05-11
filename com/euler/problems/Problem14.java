package com.euler.problems;

import java.util.Map;
import java.util.HashMap;
import java.math.BigInteger;

public class Problem14
{
	private static Map<BigInteger,Integer> chain = new HashMap<BigInteger,Integer>(10000);
	
	public static void main(String args[])
	{
		int res = longestChain(1000000);
		System.out.println("ans = "+res);
	}

	//iterative seq http://projecteuler.net/problem=14
	
	//this will return the chain count for a given number
	public static int iterSequence(int start)
	{
		BigInteger i= new BigInteger(Integer.toString(start));
		int count=1;
		BigInteger TWO = new BigInteger("2");
		BigInteger THREE = new BigInteger("3");
		while(i.intValue() != 1)
		{
			count++;
			if(i.mod(TWO) != BigInteger.ZERO)
			{
				i = i.multiply(THREE).add(BigInteger.ONE);
			}
			else
			{
				i = i.divide(TWO);
			}
			if(chain.containsKey(i))
					return count+(chain.get(i));
			if(BigInteger.ZERO.compareTo(i) >= 0)
				System.out.println("error");
		}
		if(!chain.containsKey(i))
			chain.put(i,count);
		return count;
	}

	public static int longestChain(int range)
	{
		int i=1,number=0,current=0,max=0;
		while(i<range)
		{
			current = iterSequence(i);
			if(current > max)
			{
				max = current;
				number = i;
				System.out.println(i);
			}
			i++;
		}
		return number;
	}
}