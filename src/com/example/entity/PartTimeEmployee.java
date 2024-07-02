package com.example.entity;

public class PartTimeEmployee extends Employee {

	private float totalWorkingHour;
	private double hourlySalaryRate;
	
	public PartTimeEmployee(Employee employee, float totalWorkingHour, double hourlySalaryRate){
		super(employee.getId(), employee.getName(), employee.getPosition());
		this.hourlySalaryRate = hourlySalaryRate;
		this.totalWorkingHour = totalWorkingHour;
	}
	
	public float getTotalWorkingHour() {
		return totalWorkingHour;
	}

	public double getHourlySalaryRate() {
		return hourlySalaryRate;
	}

	public void setTotalWorkingHour(float totalWorkingHour) {
		this.totalWorkingHour = totalWorkingHour;
	}

	public void setHourlySalaryRate(double hourlySalaryRate) {
		this.hourlySalaryRate = hourlySalaryRate;
	}

	
	@Override
	public double calculateSalary() {
		double salary = totalWorkingHour * hourlySalaryRate;
		return salary;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"\n Total Working Hour : " + this.totalWorkingHour + "\n Hourly Salary Rate : "+ this.hourlySalaryRate +" \n \n ";
	}
	
	
		
}
