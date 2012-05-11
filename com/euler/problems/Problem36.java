package com.euler.problems;

public class Problem36
{
	public static void main(String args[])
	{
		int res = palindromeSum(1000000);
		System.out.println("Sum = "+res);
	}

	//sum of numbers which are palindrome in both decimal and binary
	public static int palindromeSum(int range)
	{
		int i=1,sum=0;
		while(i<range)
		{
			if(isPalindrome(i))
			{
				sum+=i;
				System.out.println(i);
			}
			i++;
		}
		return sum;
	}

	public static boolean isPalindrome(int n)
	{
		String decimal_n = Integer.toString(n);
		if(decimal_n.equals(new StringBuilder(decimal_n).reverse().toString()))
		{
			String binary_n = Integer.toBinaryString(n);
			if(binary_n.equals(new StringBuilder(binary_n).reverse().toString()))
			{
				return true;
			}
		}
		return false;
	}
}