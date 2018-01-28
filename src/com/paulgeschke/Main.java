package com.paulgeschke;

public class Main {

    public static void main(String[] args) {
        int value1 = 23;
        int value2 = 5;

        int result1 = value1 + value2;
        System.out.println("Addition: " + value1 + " + " + value2 + " = " + result1);

        int result2 = value1 - value2;
        System.out.println("Subtraction: " + value1 + " - " + value2 + " = " + result2);

        int result3 = value1 * value2;
        System.out.println("Multiplication: " + value1 + " * " + value2 + " = " + result3);

        int result4 = value1 / value2;
        System.out.println("Division: " + value1 + " / " + value2 + " = " + result4);
        
        int result5 = value1 % value2;
        System.out.println("Remainder: " + value1 + " % " + value2 + " = " + result5);
    }
}
