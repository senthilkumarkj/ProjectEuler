package com.euler.problems;

import java.util.*;

public class Problem21
{
	private static Map<Integer,Integer> divisors_sum_map = new HashMap<Integer,Integer>(10000);

	public static void main(String args[])
	{
		_init(10000);
		//System.out.println(divisors_sum_map);
		System.out.println(sumOfAmicablePairs());
	}

	//divisors - works for a limitied numbers which is fine for this prob http://projecteuler.net/problem=21

	//exclude n for this prob
	public static int sumOfDivisors(int n) 
	{
		int sum = 0,i=1;
		while(i < n)
		{
			if(n%i==0)
				sum+=i;
			i++;
		}
		return sum;
	}

	private static void _init(int limit)
	{
		int i=1;
		while(i<limit)
		{
			divisors_sum_map.put(i,sumOfDivisors(i++));
		}

		List<Integer> val = new LinkedList<Integer>();

		for(Integer index : divisors_sum_map.keySet())
		{
			val.add(divisors_sum_map.get(index));
		}
		for(Integer in : val)
		{
			if(!divisors_sum_map.containsKey(in))
				divisors_sum_map.put(in,sumOfDivisors(in));
		}
	}

	//find amicable pairs
	public static int sumOfAmicablePairs()
	{
		List<Integer> amicable_pairs = new LinkedList<Integer>();
		int val,sum=0;
		
		for(Integer i : divisors_sum_map.keySet())
		{
			int divisors_sum_i = divisors_sum_map.get(i);
			if(divisors_sum_i == i) continue;
			int divisors_sum_of_sum_i = 0;
			if(null != divisors_sum_map.get(divisors_sum_i))
				divisors_sum_of_sum_i = divisors_sum_map.get(divisors_sum_i);
			//System.out.println("val="+val+" i="+i);
			if(i == divisors_sum_of_sum_i)
			{
				//System.out.println("INSIDE---val="+val+" i="+i);
				if(!amicable_pairs.contains(divisors_sum_i)) 
					amicable_pairs.add(divisors_sum_i);
				if(!amicable_pairs.contains(divisors_sum_of_sum_i)) 
					amicable_pairs.add(divisors_sum_of_sum_i);
			}
		}
		System.out.println(amicable_pairs);
		System.out.println("6---"+divisors_sum_map.get(6));
		for(Integer in : amicable_pairs)
		{
				if(in<10000) sum+=in;
		}
		return sum;
	}
}