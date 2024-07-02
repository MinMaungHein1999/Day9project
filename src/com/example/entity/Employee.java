package com.example.entity;

public class Employee {
	
	private int id;
	private String name;
	private String position;
	private Department department;
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, String position) {
		this.id = id;
		this.name = name;
		this.position = position;
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
		
		return " Id : "+this.id+"\n Name : "+this.name+"\n Position : "+this.position+"\n\n";
	}
	
}
