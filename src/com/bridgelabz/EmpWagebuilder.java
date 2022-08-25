package com.bridgelabz;

public class EmpWagebuilder {

	public static void main(String[] args) {
		totalEmpWage();
	}
	private static void totalEmpWage(){
		System.out.println("Welcome to Employee Wage Computation Program ");
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int WAGE_PER_HR = 20;
		final int FULL_TIME = 8;
		final int PART_TIME = 4;
		final int MAX_WORKING_DAYS = 20;
		final int MAX_HRS = 100;
		
		int wage_per_month = 0;
		int total_working_hrs = 0;
		int emp_hr = 0;
		int day = 0;
	
			double emp_check = Math.floor(Math.random() * 10) % 2;
			if (emp_check == IS_FULL_TIME)
				System.out.println("Employee is Present");
			else
				System.out.println("Employee is Absent");
		
		}
}