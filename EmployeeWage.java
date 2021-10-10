package com.bridgelabz.Employee_wage;

import java.util.Random;

public class EmployeeWage {


	public static final int IS_FULLTIME = 1;
	public static final int IS_PARTTIME = 2;



	public static int computeWage(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {

		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
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
		System.out.println("Total Wages of an employee in " +companyName + " company is : " + totalEmpWage + "\n");
		return totalEmpWage;
	}

	public static void main(String[] args) {

		computeWage("TCS" , 300, 3, 10) ;
		computeWage("Infosys", 200, 4, 12);
		computeWage("Capgemini", 155, 2, 10);
	}
}