package com.employee.wage;

import java.util.Random;

public class EmployeeComputation {
    public static void main(String[] args) {

        int workingDayPerMonth = 20;
        int monthlySalary=0;
        int salary=0;
        WelcomeMessage.msg();
        WelcomeMessage attendance = new WelcomeMessage();
        for (int i=0; i<=workingDayPerMonth; i++) {
            switch (new Random().nextInt(3)) {
                case 0:
                    System.out.println("Employee is absent.");
                    break;
                case 1:
                    System.out.println("Employee is present half day.");
                    salary = WelcomeMessage.halfSalary();
                    break;
                case 2:
                    System.out.println("Employee is present full day.");
                    salary = WelcomeMessage.dailySalary();
                    break;
            }
            monthlySalary += salary;
        }

        System.out.println("Employee Monthly Salary is: "+monthlySalary);
    }
}
