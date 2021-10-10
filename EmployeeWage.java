package com.bridgelabz.Employee_wage;

import java.util.Random;

public class EmployeeWage {


	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;

	private final String companyName;
	private final int empRatePerHour;
	private final int noOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;



	public EmployeeWage(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
		this.companyName = companyName;
		this.empRatePerHour = empRatePerHour;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}



	public void computeWage() {

		int empHrs = 0;
		int empWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < noOfWorkingDays) {
			totalWorkingDays++;
			Random random = new Random();
			int empCheck = random.nextInt(3);
			switch (empCheck) {
			case IS_FULLTIME: 
				empHrs = 8;
				break;
			case IS_PARTTIME: 
				empHrs = 4;
				break;
			default:  
				empHrs = 0;
			}
			empWage = empRatePerHour * empHrs;
			totalEmpHrs += empHrs;
			System.out.println("Day " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours " +
					", Employee Wage : " + empWage );
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	@Override
	public String toString(){
		return "Total Wages of an employee in " +companyName + " company is : " + totalEmpWage + "\n";
	}

	public static void main(String[] args) {

		EmployeeWage infosys = new EmployeeWage("Infosys", 200, 2, 10);
		EmployeeWage tcs = new EmployeeWage("TCS" , 300, 3, 10);
		EmployeeWage capgemini = new EmployeeWage("Capgemini", 155, 4, 12);
		infosys.computeWage();
		System.out.println(infosys);
		tcs.computeWage();
		System.out.println(tcs);
		capgemini.computeWage();
		System.out.println(capgemini);
	}
}