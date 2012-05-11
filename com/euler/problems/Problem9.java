package com.euler.problems;

public class Problem9
{
	public static void main(String args[])
	{
		int res = triplet(1000);
		System.out.println("prod of triplet = "+res);
	}

	//prod of pythagorean triplet http://projecteuler.net/problem=9
	public static int triplet(int sum)
	{
		int i,j=0,k=0;
		boolean stop = false;
		for(i=0;i<sum/3;i++)
		{
			for(j=0;j<sum/2;j++)
			{
				k = sum - i - j;
				if(k*k == i*i + j*j)
				{
					stop = true;
					break;
				}
			}
			if(stop) break;
		}
		return i*j*k;
	}
}