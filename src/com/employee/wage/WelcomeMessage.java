package com.employee.wage;

import java.util.Random;

class WelcomeMessage{
    int wagePerHour, fullDayWorkingHour;
    static void msg(){
        System.out.println("Welcome to Employee Wage Computation Program.");
    }
    public int attendance(){
        return new Random().nextInt(2);

    }
    public int salary(){
        return wagePerHour * fullDayWorkingHour;
    }
}
