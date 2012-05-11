package com.euler.problems;

import java.math.BigInteger;

public class Problem20
{
	public static void main(String args[])
	{
		int res = sumOfDigits(100);
		System.out.println("Sum = "+res);
	}

	//function to find the sum of even numbers in fib seq under 4 million
	public static int sumOfDigits(int number)
	{
		BigInteger fact = factorial(number);
		System.out.println(fact);
		char[] digits = fact.toString().toCharArray();
		int sum = 0;
		for(int i=0;i<digits.length;i++)
		{
			sum+=Integer.parseInt(Character.toString(digits[i]));
		}
		return sum;
	}

	public static BigInteger factorial(int n)
	{
		if(n==0 || n==1)
			return new BigInteger("1");
		else
			return new BigInteger(Integer.toString(n)).multiply(factorial(n-1));
	}

}