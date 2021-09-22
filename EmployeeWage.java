package com.bridgelabz.Employee_wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {

		final int IS_FULL_TIME = 2;
		final int IS_PART_TIME = 1;
		final int EMP_RATE_PER_HOUR = 20;
		final int NO_OF_WORKING_DAYS = 20;
		final int MAX_HRS_IN_MONTH = 10;
		
		int empHours = 0;
		int empWage = 0;
		int totalEmployeeWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;


		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS){
			totalWorkingDays++;
			Random random = new Random();
			int empCheck = random.nextInt(3);
			switch (empCheck){
			case IS_FULL_TIME:
				empHours = 8;
				System.out.print("The wages of Full Time employee is : ");
				break;
			case IS_PART_TIME:
				empHours = 4;
				System.out.print("The wages of Part time employee is : ");
				break;
			default:
				empHours = 0;
				System.out.print("The wages of no work employee is : ");
			}
			empWage = empHours * EMP_RATE_PER_HOUR;
			totalEmployeeWage += empWage;
			totalEmpHrs += empHours;
			System.out.println(empWage);
		}
		System.out.println();
		System.out.print("The total wages of all the emplpoyee for 20 days or 10 hours is : " + totalEmployeeWage);
	}
}


