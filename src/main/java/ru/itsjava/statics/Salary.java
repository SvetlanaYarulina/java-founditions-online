package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Salary {
    private final double baseSalary;
    private static double increaseCoeficient = 2.5;
    public final static double CEO = 500000.0; // неизменяемое и определено на уровне класса, это константа



    public double getFullSalary(){
        return baseSalary * increaseCoeficient;

    }
     public static void setincreaseCoeficient(double increaseCoeficient1){
        increaseCoeficient = increaseCoeficient1;

     }
}
