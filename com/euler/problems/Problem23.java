package com.euler.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem23
{
	public static void main(String args[])
	{
		int res = sumOfAbundantNumbers();
		System.out.println("abundant numbers = "+res);
	}

	//to get the sum of all numbers that can not be written as sum of abundant numbers

	//function to get abundant numbers less than 28123
	public static List<Integer> getAbundantNmbers(int range)
	{
		List<Integer> abundant_numbers = new ArrayList<Integer>(range);
		int i=1,d,d_sum;
		while(i<=range)
		{
			d_sum=0;
			for(d=1;d<i;d++)
			{
				if(i%d==0) d_sum+=d;
			}
			if(d_sum>i)
				abundant_numbers.add(i);
			i++;
		}
		return abundant_numbers;
	}

	//sum of numbers which arent sum of two abundant numbers
	public static int sumOfAbundantNumbers()
	{
		//get abundant numbers
		List<Integer> abundant_numbers = getAbundantNmbers(28123);
		int tmp,sum=0;
		for(int i=1;i<=28123;i++)
		{
			for(Integer a:abundant_numbers)
			{
				tmp = i-a;
				if(tmp <= 0)
				{
					sum+=i;
					break;
				}
				else
				{
					if(abundant_numbers.contains(tmp))
					{
						break;
					}
				}
			}
			System.out.println("i="+i);
		}
		return sum;
	}
}