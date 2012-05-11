package com.euler.problems;

import java.util.Map;
import java.util.HashMap;

public class Problem17
{
	private static Map<Integer,String> words = new HashMap<Integer,String>();
	private static final String AND = "AND";

	public static void main(String args[])
	{
		_init();
		int res = count_letters(1,1000);
		System.out.println("Sum = "+res);
	}

	public static void _init()
	{
		words.put(1,"ONE");
		words.put(2,"TWO");
		words.put(3,"THREE");
		words.put(4,"FOUR");
		words.put(5,"FIVE");
		words.put(6,"SIX");
		words.put(7,"SEVEN");
		words.put(8,"EIGHT");
		words.put(9,"NINE");
		words.put(10,"TEN");
		words.put(11,"ELEVEN");
		words.put(12,"TWELVE");
		words.put(13,"THIRTEEN");
		words.put(14,"FOURTEEN");
		words.put(15,"FIFTEEN");
		words.put(16,"SIXTEEN");
		words.put(17,"SEVENTEEN");
		words.put(18,"EIGHTEEN");
		words.put(19,"NINETEEN");
		words.put(20,"TWENTY");
		words.put(30,"THIRTY");
		words.put(40,"FORTY");
		words.put(50,"FIFTY");
		words.put(60,"SIXTY");
		words.put(70,"SEVENTY");
		words.put(80,"EIGHTY");
		words.put(90,"NINETY");
		words.put(100,"HUNDRED");
		words.put(1000,"THOUSAND");
	}

	public static int count_letters(int start, int end)
	{
		int count = 0;
		for(int i=start;i<=end;i++)
		{
			count+=wordItOut(i);
		}
		return count;
	}
	//numbers to words 
	public static int wordItOut(int n)
	{
		int no_of_letters = 0,tmp,rem;
		System.out.print("n = "+n+" ");
		//base case
		if(words.containsKey(n))
		{
			System.out.print(words.get(n));
			no_of_letters+=words.get(n).length();
		}
		else if(n>=20 && n<100)
		{
			rem = n%10;
			no_of_letters+=wordItOut(rem);
			tmp = n-rem;
			no_of_letters+=wordItOut(tmp);
		}
		else if(n>100 && n<1000)
		{
			rem = n%100;
			if(rem != 0)
				no_of_letters+=wordItOut(rem);
			n = n-rem;
			n = n/100;
			if(rem != 0)
			{
				no_of_letters+=wordItOut(n)+wordItOut(100)+AND.length();
				System.out.print("AND");
			}
			else
				no_of_letters+=wordItOut(n)+wordItOut(100);
		}
		else
			no_of_letters = 0;
		System.out.println("");
		return no_of_letters;
	}
}