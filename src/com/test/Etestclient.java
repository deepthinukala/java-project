package com.test;

import com.model.Employee;

public class Etestclient {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpid(1099);
		e.setName("Deepthi");
		e.setSalary(45000);
		e.setSsn("e@232");
		System.out.println(e.getEmpid());
		System.out.println(e.getName());
		System.out.println(e.getSsn());
		System.out.println(e.getSalary());
		

	}

}
