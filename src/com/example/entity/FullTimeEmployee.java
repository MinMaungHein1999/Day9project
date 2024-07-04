package com.example.entity;

public class FullTimeEmployee extends Employee{

	private int leaveDays = 0;
	private double monthlySalaryRate = 1400;
	
	public FullTimeEmployee(int id, String name, String position, int leaveDays, double monthlySalary) {
		super(id, name, position);
		
		this.leaveDays = leaveDays;
		this.monthlySalaryRate = monthlySalary;
		this.setSalary(this.calculateSalary());
		
	}
	
	public int getLeaveDays() {
		return leaveDays;
	}

	public double getMonthlySalaryRate() {
		return monthlySalaryRate;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}

	public void setMonthlySalaryRate(double monthlySalaryRate) {
		this.monthlySalaryRate = monthlySalaryRate;
	}

	@Override
	public double calculateSalary() {
		double salary = monthlySalaryRate -(monthlySalaryRate / 30 * leaveDays);
		return salary;
	}



	@Override
	public String toString() {
		
		return super.toString() +"\n Leave Days : " + this.leaveDays 
								+ "\n Monthly Salary Rate : "
								+ this.monthlySalaryRate+" \n"
								+" Actual Salary : "+ this.getSalary() +"\n";
	}
	
	
}
	
	

