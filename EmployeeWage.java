package com.bridgelabz.Employee_wage;

import java.util.Random;
 public class EmployeeWage {


	public static final int IS_FULLTIME = 1;
    public static final int IS_PARTTIME = 2;
    private int numOfCompany = 0;
	private static CompanyInfo companyInfo;
    private CompanyInfo[] companyInfoArray;

    public EmployeeWage() {
        companyInfoArray = new CompanyInfo[6];
    }

    private void addCompanyInfo(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
        companyInfoArray[numOfCompany] = new CompanyInfo(companyName, empRatePerHour, noOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyInfoArray[i].setTotalEmpWage(this.computeWage(companyInfoArray[i]));
            System.out.println(companyInfoArray[i]);
        }
    }

    /*
       We have used static method here so that we can directly call it inside main
     */
    public static int computeWage(CompanyInfo companyInfo) {
        EmployeeWage.companyInfo = companyInfo;
		// Declaring the variables
        int empHrs = 0;
        int empWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;
        /*
         * Using random method to generate random numbers 0, 1 and 2
         */
        while (totalEmpHrs <= companyInfo.getMaxHoursPerMonth() && totalWorkingDays < companyInfo.getNoOfWorkingDays()) {
            totalWorkingDays++;
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case IS_FULLTIME: // FullTime Employee
                    empHrs = 8;
                    break;
                case IS_PARTTIME: // PartTime Employee
                    empHrs = 4;
                    break;
                default:  // Employee is absent
                    empHrs = 0;
            }
            empWage = companyInfo.getEmpRatePerHour() * empHrs;
            totalEmpHrs += empHrs;
        }
         totalWage = totalEmpHrs * companyInfo.getEmpRatePerHour();
         return totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyInfo("Infosys", 150, 2, 10);
        employeeWage.addCompanyInfo("TCS" , 200, 3, 10);
        employeeWage.addCompanyInfo("Capgemini", 100, 4, 12);
        employeeWage.addCompanyInfo("Jio", 180, 3, 15);
        employeeWage.addCompanyInfo("Airtel", 160, 4, 14);
        employeeWage.computeEmpWage();
    }
}