package com.model;

public class Product {
	private int id;
	private String name;
	private String description;
	private double price;
	public Product()
	{
		System.out.println("no argument constructor");
	}
	public Product(int i,String n,String description,double price)
	{
		this.id=i;
		this.name=n;
		this.description=description;
		this.price=price;
	
	}
	public void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Description:"+description);
		System.out.println("Price:"+price);
		

	}
	


}
