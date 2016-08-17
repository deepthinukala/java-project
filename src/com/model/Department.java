package com.model;

public class Department extends Student{
	private String deptName;
	public Department(int stdid,String name,double marks, String deptName)
	{
	super(stdid,name,marks);
	this.deptName=deptName;
	}
	public void show()
	{
		System.out.println("Department:"+deptName);
	}
	
	
}
