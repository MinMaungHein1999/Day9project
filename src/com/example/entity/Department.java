package com.example.entity;

public class Department {
	private int id;
	private String name;
	private Employee[] employees;
	private int employee_count = 0;
	private int max_employees = 100;
	
	
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
		this.employees = new Employee[max_employees];
	}
	
	public Department(int id, String name, int max_employees) {
		this.id = id;
		this.name = name;
		this.employees = new Employee[max_employees];
		this.max_employees = max_employees;
	}
	
	public void hireEmployee(Employee employee) {
		if (this.employee_count <= this.max_employees) {
			if (this.findEmployeeById(employee.getId())!=null) {
				System.out.println("Already Hire!!!");
			}else{
				this.employees[this.employee_count] = employee;
				this.employee_count++;
				System.out.println("Hire Success!!!");
			}
		}
		
	}
	
	public Employee findEmployeeById(int employee_id) {
		if (employee_count == 0) {
			return null;
		}
		
		for(int index = 0; index < employee_count; index++ ) {
			if(employees[index].getId() == employee_id){
				return employees[index];
			}
		}
		
		return null;
	}
	
	
	public void displayEmployees() {
		displayDepartment();
		for(int index = 0; index < this.employee_count; index++ ) {
			System.out.println(employees[index].toString());
		}
	}
	
	
	

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayDepartment() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		
		return "Department Id : "+this.id+"Department name : "+this.name +" Total Employees : "+ this.employee_count+ "\n";
	}
	
	
	
	

}
