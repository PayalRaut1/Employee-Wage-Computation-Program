package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee wage  computation Program");
        int IS_FULL_TIME = 1;
        // Computation
        //double empCheck = Math.floor(Math.random() * 10) % 2;
        //if (empCheck == IS_FULL_TIME)
          //  System.out.println("Employee is Present");
        //else
       //     System.out.println("Employee is Absent");
        //int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;

        int empHrs = 0;
        int empWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " +empWage);


    }
}
