package ru.itsjava.statics;

public class StaticPractice {
    public static void main(String[] args) {
//        System.out.println("Salary.increaseCoeficient = " + Salary.increaseCoeficient);

        Salary cleanerSalary =  new Salary(5000.0);
        Salary targetSalary = new Salary(10000.0);
        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());

        Salary.setincreaseCoeficient(1.0); //  поменялся для всех
        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());

        System.out.println("Salary.CEO = " + Salary.CEO);

        Car car = new Car("Bentley", "red");
        Car car1 = new Car("Жигули","yellow");
        System.out.println("car.getPrice() = " + car.getPrice());
        System.out.println("car1.getPrice() = " + car1.getPrice());

        System.out.println("car.toString() = " + car);
        System.out.println("car1.toString() = " + car1);

        System.out.println("Circle.PI = " + Circle.PI);

    }
}

