package com.euler.problems;

public class Problem5
{
	public static void main(String args[])
	{
		int res = evenlyDivisible(1,20);
		System.out.println("smallest evenly divisible number = "+res);
	}

	//smallest number evenly divisible by 1..20
	public static int evenlyDivisible(int from, int to)
	{
		int i=to,d;
		while(i<=Integer.MAX_VALUE)
		{
			for(d=to;d>=from;d--)
			{
				if(!(i%d ==0))
					break;
			}
			if(d<from)
				return i;
			else
				i++;
		}
		return 0;
	}

}