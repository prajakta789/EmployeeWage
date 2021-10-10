package com.bridgelabz.Employee_wage;

import java.util.Random;

public class EmployeeWage {


	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;
	public static final int Emp_Rate_PerHr = 20;
	public static final int NO_WORKINGDAYS = 20;
	public static final int MAX_HRS_MONTH = 100;

	public static int computeWage() {
		
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= MAX_HRS_MONTH && totalWorkingDays < NO_WORKINGDAYS) {
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
			empWage = Emp_Rate_PerHr * empHrs;
			totalEmpHrs += empHrs;
			System.out.println("Day : " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours " +
					", Employee Wage : " + empWage);
		}
		totalEmpWage = totalEmpHrs * Emp_Rate_PerHr;
		System.out.println("Total Wages is : " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Program");
		computeWage();
	}
}