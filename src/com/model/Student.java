package com.model;

public class Student {
private int stdid;
private String name;
private double marks;
public Student(int stdid,String name,double marks)
{
	this.stdid=stdid;
	this.name=name;
	this.marks=marks;
}
public void display()
{
	System.out.println("Id:"+stdid);
	System.out.println("Name:"+name);
	System.out.println("marks:"+marks);
		
}
}
