package com.euler.problems;

public class Problem4
{
	public static void main(String args[])
	{
		int res = largestPalindrome();
		System.out.println("largest palindrome = "+res);
	}

	//largest palindrome of product of 2 3-digit numbers
	public static int largestPalindrome()
	{
		int largestPalin = 0;
		int prod;
		for(int i=999;i>=100;i--)
		{
			for(int j=999;j>=100;j--)
			{
				prod = i*j;
				if(checkPalin(prod) && prod > largestPalin)
					largestPalin = prod;
			}
		}
		return largestPalin;
	}

	public static boolean checkPalin(int num)
	{
		String orig = Integer.toString(num);
		String reverse = new StringBuilder(orig).reverse().toString();
		if(orig.equalsIgnoreCase(reverse))
			return true;
		else
			return false;
	}

}