package com.euler.problems;

import java.math.BigInteger;

public class Problem16
{
	public static void main(String args[])
	{
		int res = sumOfDigits(1000);
		System.out.println("Sum = "+res);
	}

	//function to find the sum of all digits of 2 power n. http://projecteuler.net/problem=16
	public static int sumOfDigits(int range)
	{
		BigInteger ans = power(2,range);
		char[] digits = ans.toString().toCharArray();
		int sum = 0,c;
		System.out.println(digits.length);
		for(int i=0;i<digits.length;i++)
		{
			c = Integer.parseInt(Character.toString(digits[i]));
			sum+=c;
		}
		return sum;
	}

	public static BigInteger power(int a, int range)
	{
		BigInteger tmp;
		if(range == 0)
			return new BigInteger("1");
		if(range == 1)
			return new BigInteger(Integer.toString(a));
		tmp = power(a,range/2);
		if(range % 2 == 0)
		{
			return tmp.multiply(tmp);
		}
		else
		{
			return tmp.multiply(tmp).multiply(new BigInteger(Integer.toString(a)));
		}

	}
}