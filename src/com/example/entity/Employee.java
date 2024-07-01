package com.example.entity;

public class Employee {
	
	private int id;
	private String name;
	private String position;
	private String department;
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, String position, String department) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.department = department;	
	}
	
	public double calculateSalary() {
		// write implementation
		return 0.0;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String getDepartment() {
		return department;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		
		return " Id : "+this.id+"\n Name : "+this.name+"\n Position : "+this.position+"\n Department : "+ this.department;
	}
	
}
