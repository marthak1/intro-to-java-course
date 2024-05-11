package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        double result1 = add(5.5, 3.2);
        double result2 = subtract(10.0, 4.7);
        double result3 = multiply(2.5, 6.0);

        System.out.println("Addition result: " + result1);
        System.out.println("Subtraction result: " + result2);
        System.out.println("Multiplication result: " + result3);

        boolean equalResult = areEqual(5.5, 5.5);
        boolean lessThanResult = isLessThan(3.2, 5.5);
        boolean moreThanResult = isMoreThan(7.0, 4.7);

        System.out.println("Are equal? " + equalResult);
        System.out.println("Is less than? " + lessThanResult);
        System.out.println("Is more than? " + moreThanResult);
    }

    public static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static Boolean areEqual(double operand1, double operand2) {
        return operand1 == operand2;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        return operand1 < operand2;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        return operand1 > operand2;
    }
}
