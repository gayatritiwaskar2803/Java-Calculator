package com.internship.calculator;

import java.util.Scanner;

public class ConsoleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();

		Boolean keepRunning = true;

		System.err.println("---------JAVA CONSOLE CALCULATOR-------");

		while (keepRunning) {
			System.out.println("\nChoose an operation: ");
			System.out.println("1. Addition (+). ");
			System.out.println("2. Subtraction (-).");
			System.out.println("3. Multiplication (*).");
			System.out.println("4. Division (/).");
			System.out.println("5. Exit.");
			System.out.println("Enter your choice (1-5): ");
			int choice = sc.nextInt();

			// Condition for exit
			if (choice == 5) {
				keepRunning = false;
				System.out.println("Exiting Calculator..... Goodbye!");
				break;
			}

			System.out.println("Enter first number: ");
			double num1 = sc.nextDouble();

			System.out.println("Enter second number: ");
			double num2 = sc.nextDouble();

			double result = 0;

			switch (choice) {
			case 1:
				result = c.add(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 2:
				result = c.subtract(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 3:
				result = c.multiply(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 4:
				result = c.divide(num1, num2);
				System.out.println("Result: " + result);
				break;
			default:
				System.out.println("Invalid choice! Please enter a number between 1 and 5.");

			}

		}
		sc.close();
	}

}
