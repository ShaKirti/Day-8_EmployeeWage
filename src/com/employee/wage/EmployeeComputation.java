package com.employee.wage;
public class EmployeeComputation {
    public static void main(String[] args) {

        int wagePerHour=20;
        int fullDayWorkingHour=8;
        int salary=0;
        WelcomeMessage.msg();
        WelcomeMessage attendance = new WelcomeMessage();
        if (attendance.attendance()==0){
            System.out.println("Employee is absent.");
        }
        else {
            System.out.println("Employee is present.");
            salary = wagePerHour * fullDayWorkingHour;
        }
        System.out.println("Employee Salary is: "+salary);

    }
}
