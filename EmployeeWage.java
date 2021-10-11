package com.bridgelabz.Employee_wage;

import java.util.Random;

import com.bridgelabz.Employee_wage.CompanyInfo.IEmployeeWage;



	 public class EmployeeWage implements IEmployeeWage{
		    // Declaring a constant
		    public static final int IS_FULLTIME = 1;
		    public static final int IS_PARTTIME = 2;
		    private int numOfCompany = 0;
		    private CompanyInfo[] companyInfoArray;

		    public EmployeeWage() {
		        companyInfoArray = new CompanyInfo[6];
		    }

		    public void addCompanyInfo(String companyName, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {
		        companyInfoArray[numOfCompany] = new CompanyInfo(companyName, empRatePerHour, noOfWorkingDays, maxHoursPerMonth);
		        numOfCompany++;
		    }

		    public void computeEmpWage() {
		        for (int i = 0; i < numOfCompany; i++) {
		            companyInfoArray[i].setTotalEmpWage(this.computeWage(companyInfoArray[i]));
		            System.out.println(companyInfoArray[i]);
		        }
		    }
		    /*
		       We have used static method here so that we can directly call it inside main
		     */
		    public static int computeWage(CompanyInfo companyInfo) {
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
		        
		        IEmployeeWage employeeWage = new EmployeeWage();
		        ((EmployeeWage) employeeWage).addCompanyInfo("Infosys", 150, 2, 10);
		        ((EmployeeWage) employeeWage).addCompanyInfo("TCS" , 200, 3, 10);
		        ((EmployeeWage) employeeWage).addCompanyInfo("Capgimini", 100, 4, 12);
		        ((EmployeeWage) employeeWage).addCompanyInfo("Jio", 180, 3, 15);
		        ((EmployeeWage) employeeWage).addCompanyInfo("Airtel", 160, 4, 14);
		        ((EmployeeWage) employeeWage).computeEmpWage();
		    }
		}
