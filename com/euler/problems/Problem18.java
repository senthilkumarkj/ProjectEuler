package com.euler.problems;

import java.util.*;

public class Problem18
{
	private static Map<Integer,List<Integer>> triangle = new HashMap<Integer,List<Integer>>();

	public static void main(String args[])
	{
		_init();
		int res = maxSum(triangle);
		System.out.println("Sum = "+res);
	}

	//max sum from top to bottom of right angled triangle
	public static int maxSum(Map<Integer,List<Integer>> triangle)
	{
		int sum = 0;
		if(triangle == null || triangle.isEmpty())
			return 0;
		int size = triangle.size();
		if(size == 1)
			return triangle.get(0).get(0);
		int i=size-2,tmp,tmp_max,max_value;
		while(i>=0)
		{
			List<Integer> current_row = new ArrayList<Integer>();
			current_row = triangle.get(i);
			for(int index=0; index<current_row.size(); index++)
			{
				tmp = current_row.get(index);
				tmp_max = tmp+triangle.get(i+1).get(index);
				max_value = tmp+triangle.get(i+1).get(index+1);
				if(tmp_max > max_value)
					max_value = tmp_max;
				current_row.set(index,max_value);
			}
			triangle.put(i,current_row);
			current_row = null;
			i--;
			
		}
		return triangle.get(0).get(0);
	}

	private static void _init()
	{
		List<List<Integer>> tuples = new ArrayList<List<Integer>>();
		tuples.add(Arrays.asList(75));
		tuples.add(Arrays.asList(95,64));
		tuples.add(Arrays.asList(17,47,82));
		tuples.add(Arrays.asList(18,35,87,10));
		tuples.add(Arrays.asList(20,4,82,47,65));
		tuples.add(Arrays.asList(19,1,23,75,3,34));
		tuples.add(Arrays.asList(88,2,77,73,7,63,67));
		tuples.add(Arrays.asList(99,65,4,28,6,16,70,92));
		tuples.add(Arrays.asList(41,41,26,56,83,40,80,70,33));
		tuples.add(Arrays.asList(41,48,72,33,47,32,37,16,94,29));
		tuples.add(Arrays.asList(53,71,44,65,25,43,91,52,97,51,14));
		tuples.add(Arrays.asList(70,11,33,28,77,73,17,78,39,68,17,57));
		tuples.add(Arrays.asList(91,71,52,38,17,14,91,43,58,50,27,29,48));
		tuples.add(Arrays.asList(63,66,4,68,89,53,67,30,73,16,69,87,40,31));
		tuples.add(Arrays.asList(4,62,98,27,23,9,70,98,73,93,38,53,60,4,23));
		int i=0;
		for(List<Integer> tuple : tuples)
		{
			triangle.put(i++,tuple);
		}
		//print
		for(Integer key : triangle.keySet())
		{
			System.out.println(triangle.get(key));
		}
	}
}