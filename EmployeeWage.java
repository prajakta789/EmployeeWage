package com.bridgelabz.Employee_wage;

import java.util.Random;

public class EmployeeWage {
	
    public static void main(String[] args) {
        int IS_FULL_TIME = 2;
        int IS_PART_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;
        
        Random random = new Random();
        int empCheck = random.nextInt(3);
        
        if (empCheck == IS_FULL_TIME){
            empHours = 8;
        }
        else if (empCheck == IS_PART_TIME){
            empHours = 4;
        }
        else {
            empHours = 0;
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("The daily wages of an employee is : " + empWage);
    }
}






