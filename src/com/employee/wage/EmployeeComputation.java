package com.employee.wage;
public class EmployeeComputation {
    public static void main(String[] args) {

        WelcomeMessage.msg();
        WelcomeMessage attendance = new WelcomeMessage();
        if (attendance.attendance()==0){
            System.out.println("Employee is absent.");
        }
        else
            System.out.println("Employee is present.");

    }
}
