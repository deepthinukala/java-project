package com.model;

public class Statistics2 {
	public float average(int...nums)
	{
		int sum=0;
		for(int x:nums)
		{
			sum=sum+x;
		}
		return ((float)sum/nums.length);
	}

}
