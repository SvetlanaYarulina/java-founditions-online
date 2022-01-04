package ru.itsjava.exceptions;

public class Calculator {
    public int division(int num, int divider) throws CalculatorException {
        try {
            return num / divider;
        } catch (ArithmeticException arithmeticException) {
            throw new CalculatorException(); // опрокинуть наверх, используют для того, чтобы реализовать свою ошибку
        }
    }
}
