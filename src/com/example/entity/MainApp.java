package com.example.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static Employee getEmployeeInfo() throws IOException {
		
		System.out.println("*** Please Fill Employee Information ***");
		System.out.print("Enter id : ");
		int id = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Name : ");
		String name = br.readLine();
		
		System.out.print("Enter department : ");
		String department = br.readLine();
		
		System.out.print("Enter position : ");
		String position = br.readLine();
		
		Employee employee = new Employee(id, name, department, position);
		
		System.out.print("Enter Employee Type Part<<P>> or Full<<F>> Time Employee : ");
		String employee_type = br.readLine();
		
		
		
		if(employee_type.equals("P")) {
			
			employee = getPartTimeEmployeeInfo(employee);
			
		}else if(employee_type.equals("F")){
			employee = getFullTimeEmployeeInfo(employee);
		}
		
		return employee;
		
	}
	
	public static Employee getFullTimeEmployeeInfo(Employee employee) throws IOException {
		
		
		System.out.print("Enter leave Days for this month : ");
		int leave_days = Integer.parseInt(br.readLine());
		System.out.print("Enter Monthly Salary Rate for this month : ");
		Double salary_rate = Double.parseDouble(br.readLine());
		
		Employee fulltime_employee =new FullTimeEmployee(employee,leave_days, salary_rate );
		
		return fulltime_employee;
	}
	
	public static Employee getPartTimeEmployeeInfo(Employee employee) throws IOException {
		
		
		System.out.print("Enter Total Working Hour for this month : ");
		int working_hour = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Hourly Salary Rate for this month : ");
		float salary_rate = Float.parseFloat(br.readLine());
		
		Employee partTimeEmployee = new PartTimeEmployee(employee, working_hour, salary_rate);
		
		return partTimeEmployee;
		
	}
	
	public static void main(String[] args) throws IOException {
	
		do {
			Employee emp = getEmployeeInfo();
			System.out.println(emp);
			System.out.print("Do You Want To Continue Yes / No ? : ");
		}while(br.readLine().equals("Yes"));
			
	}

}
