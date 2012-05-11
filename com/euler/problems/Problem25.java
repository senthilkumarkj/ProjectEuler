package com.euler.problems;

import java.math.BigInteger;

public class Problem25
{
	public static void main(String args[])
	{
		int res = _1000DigitFibSeq();
		System.out.println("first number with 1000 digits in fib seq = "+res);
	}

	//to find the first number with 1000 digits in fib seq
	public static int _1000DigitFibSeq()
	{
		BigInteger x=new BigInteger("1");
		BigInteger y=new BigInteger("1");
		BigInteger z = x.add(y);
		int count = 3;
		while(true)
		{
			x = y;
			y = z;
			z = x.add(y);
			count++;
			if(z.toString().length() == 1000)
				return count;
		}
	}

}