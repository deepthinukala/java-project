package com.test;

import com.model.Statistics2;

public class Varargs {

	public static void main(String[] args) {
	 Statistics2 s=new Statistics2();
	 System.out.println("avg of 2 numbers"+s.average(10,20));
	 System.out.println("avg of 3 numbers"+s.average(15,20,25));
	 System.out.println("avg of 4 numbers"+s.average(50,60,70,80));


	}

}
