package com.euler.problems;

public class Problem6
{
	public static void main(String args[])
	{
		long res = diff_sum_sqaure_sum(100);
		System.out.println("difference between sum of squares and square of sum = "+res);
	}

	//difference between sum of squares and square of sum
	public static long diff_sum_sqaure_sum(int range)
	{
		long square_sum=0,sum=0;
		for(int i=1;i<=range;i++)
		{
			sum+=i;
			square_sum+=i*i;
		}
		return sum*sum-square_sum;
	}

}