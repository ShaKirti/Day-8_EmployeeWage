package com.employee.wage;

import java.util.Random;

class WelcomeMessage{
    static int wagePerHour=20;
    static int fullDayWorkingHour=8;
    static void msg(){
        System.out.println("Welcome to Employee Wage Computation Program.");
    }
    public int attendance(){
        return new Random().nextInt(2);

    }
    public static int dailySalary(){
        return wagePerHour * fullDayWorkingHour;
    }
}
