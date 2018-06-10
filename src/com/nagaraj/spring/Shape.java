package com.nagaraj.spring;


public class Shape {
	
	private String name;
	private int size; //Spring container will do conversion from String to int
	private Dimension dimension;
	
	public Shape(Dimension d) {
		this.dimension = d;
	}
	
	public Shape(int size,String name,Dimension d) {
		System.out.println("Constructor is Playing Man !!");
		this.name = name;
		this.size = size;
		this.dimension = d;
	}
	

	public String getName() {
		return name;
	}

	public Dimension getDimension() {
		return dimension;
	}


	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	
	

}
