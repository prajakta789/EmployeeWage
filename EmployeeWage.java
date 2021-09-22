package com.bridgelabz.Employee_wage;

import java.util.Random;

public class EmployeeWage {

        public static final int IS_FULL_TIME = 2;
        public static final int IS_PART_TIME = 1;
        public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		int empHours = 0;
		int empWage = 0;
		
		Random random = new Random();
		int empCheck = random.nextInt(3);
		switch (empCheck){
		case IS_FULL_TIME:
			empHours = 8;
			break;
		case IS_PART_TIME:
			empHours = 4;
			break;
		default:
			empHours = 0;
		}
		empWage = empHours * EMP_RATE_PER_HOUR;
		System.out.println("The daily wages of an employee is : " + empWage);
	}
}






