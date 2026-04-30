
package com.mycompany.calculator.c251225;

import java.util.Scanner;

public class CalculatorC251225 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result = 0;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;

            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}