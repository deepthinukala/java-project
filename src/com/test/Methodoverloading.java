package com.test;

import com.model.Statistics1;

public class Methodoverloading {
	public static void main(String args[])
	{
		Statistics1 s=new Statistics1();
		System.out.println("avg of 2 no's"+s.average(20,40));
		System.out.println("avg of 3 no's"+s.average(20,40,60));
		System.out.println("avg of 4 no's"+s.average(20,40,60,100));

		

	}

}
