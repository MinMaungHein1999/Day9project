package com.example.entity;

public abstract class Employee {
	
	private int id;
	private String name;
	private String position;
	private Department department;
	private double salary;
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public Employee(int id, String name, String position) {
		this.id = id;
		this.name = name;
		this.position = position;
		
	}
	
	public abstract double calculateSalary();

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
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

	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		
		return " Id : "+this.id+"\n Name : "+this.name+"\n Position : "+this.position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
